package kr.ac.kaist.ires.util

import kr.ac.kaist.ires.MODEL_DIR
import scala.collection.mutable.{ Map => MMap, Set => MSet }
import kr.ac.kaist.ires.model.StepTracer
import kr.ac.kaist.ires.util.Useful._
import spray.json._
import kr.ac.kaist.ires.util.StepTracerJsonProtocol._

object CoverageCheck {
  var testContext = ""

  var totalSteps = 0
  var totalCoveredSteps = 0

  val coveredSteps: MMap[String, MSet[Int]] = MMap()
  val coveredInsts: MMap[String, MSet[Int]] = MMap()

  def updateContext(testName: String): Unit = {
    testContext = testName
    coveredInsts += testName -> MSet()
  }

  def apply(instId: Int): Unit = {
    if (instId == -1) return
    StepTracer.instToAlgo.get(instId) match {
      case Some(algoName) => {
        if (!coveredSteps.contains(algoName)) {
          coveredInsts += algoName -> MSet[Int]()
        }
        coveredInsts(algoName) += instId
        if (!coveredSteps.contains(algoName)) {
          coveredSteps += algoName -> MSet[Int]()
        }
        coveredSteps(algoName) += StepTracer.stepMap(algoName)(instId)
      }
      case None => ()
    }
  }

  def fini() = {
    totalSteps = 0
    totalCoveredSteps = 0
    StepTracer.stepLength.foreach({
      case (algoName, stepLength) => {
        totalSteps += stepLength
        val covered = coveredSteps.getOrElse(algoName, MSet())
        totalCoveredSteps += covered.size
      }
    })
  }

  def getResult = {
    var totalSteps = 0
    var totalCoveredSteps = 0

    val coveredSteps = readFile("coveredSteps.json").parseJson.convertTo[MMap[String, MSet[Int]]]
    val coveredInsts = readFile("coveredInsts.json").parseJson.convertTo[MMap[String, MSet[Int]]]
    val total = readFile(s"${MODEL_DIR}/stepLength.json").parseJson.convertTo[MMap[String, Int]]
    val duplicateList = List("GLOBAL.AddEntriesFromIterable", "GLOBAL.AsyncFromSyncIteratorContinuation", "GLOBAL.AsyncFunctionStart", "GLOBAL.AsyncGeneratorEnqueue", "GLOBAL.AsyncGeneratorReject", "GLOBAL.AsyncGeneratorResolve", "GLOBAL.AsyncGeneratorResumeNext", "GLOBAL.AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions", "GLOBAL.AsyncGeneratorResumeNextReturnProcessorRejectedFunctions", "GLOBAL.AsyncGeneratorStart", "GLOBAL.AsyncGeneratorYield", "GLOBAL.Await", "GLOBAL.AwaitFulfilledFunctions", "GLOBAL.AwaitRejectedFunctions", "GLOBAL.CreateAsyncFromSyncIterator", "GLOBAL.CreateResolvingFunctions", "GLOBAL.FlattenIntoArray", "GLOBAL.FulfillPromise", "GLOBAL.GeneratorResume", "GLOBAL.GeneratorResumeAbrupt", "GLOBAL.GeneratorStart", "GLOBAL.GeneratorValidate", "GLOBAL.GeneratorYield", "GLOBAL.GetCapabilitiesExecutorFunctions", "GLOBAL.GetGeneratorKind", "GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.next", "GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return", "GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.throw", "GLOBAL.IsPromise", "GLOBAL.NewPromiseCapability", "GLOBAL.PerformPromiseThen", "GLOBAL.PromiseReactionJob", "GLOBAL.PromiseRejectFunctions", "GLOBAL.PromiseResolve", "GLOBAL.PromiseResolveFunctions", "GLOBAL.PromiseResolveThenableJob", "GLOBAL.RejectPromise", "GLOBAL.TriggerPromiseReactions")

    // duplicateList.foreach(name => {
    //   val alternative = name.substring(7)
    //   println("-----------------------")
    //   println(s"$alternative")
    //   println("Covered Steps")
    //   println(coveredSteps.get(alternative))
    //   println()
    //   println(coveredSteps.get(name))
    //   println()
    //   println("Covered Insts")
    //   println(coveredInsts.get(alternative))
    //   println()
    //   println(coveredInsts.get(name))
    // })

    val exceptionList = duplicateList.foldLeft(List[String]())({
      case (res, name) => {
        val alternative = name.substring(7)
        (coveredSteps.get(alternative), coveredSteps.get(name)) match {
          case (Some(_), Some(_)) => {
            println(s"$alternative")
            println("Covered Steps")
            println(coveredSteps.get(alternative))
            println(coveredSteps.get(name))
            println()
            println("Covered Insts")
            println(coveredInsts.get(alternative))
            println(coveredInsts.get(name))
            throw new Exception("Duplicate algorithm covered")
          }
          case (Some(_), None) => {
            coveredSteps.remove(name)
            coveredInsts.remove(name)
            name +: res
          }
          case (None, _) => {
            coveredSteps.remove(alternative)
            coveredInsts.remove(alternative)
            alternative +: res
          }
        }
      }
    })

    total.foldLeft(Map[String, Int]())({
      case (res, (algoName, stepLength)) => {
        if (!exceptionList.contains(algoName)) {
          totalSteps += stepLength
          val covered = coveredSteps.getOrElse(algoName, MSet())
          covered.maxOption match {
            case Some(value) => {
              totalCoveredSteps += value + 1
              res + (algoName -> (value + 1))
            }
            case None => res + (algoName -> 0)
          }
          // totalCoveredSteps += covered.size
          // res + (algoName -> covered.size)
        } else {
          res
        }
      }
    })

    println(s"Total covered steps: ${totalCoveredSteps} / ${totalSteps} (${totalCoveredSteps.toFloat / totalSteps})")

    val all = readFile(s"${MODEL_DIR}/stepMap.json").parseJson.convertTo[MMap[String, MMap[Int, Int]]]
    val uncovered = coveredInsts.foldLeft(MMap[String, MSet[Int]]())({
      case (res, (algoName, coverSet)) => {
        if (!exceptionList.contains(algoName)) {
          res + (algoName -> all(algoName).keySet.to(MSet).diff(coverSet))
        } else {
          res
        }
      }
    })

    val ws = getPrintWriter("uncovered.json")
    ws.println(uncovered.toJson.toString)
    ws.close()
  }
}