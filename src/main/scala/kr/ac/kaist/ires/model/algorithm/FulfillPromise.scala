package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FulfillPromise {
  val length: Int = 2
  val func: Func = Func("""FulfillPromise""", List(Id("""promise"""), Id("""value""")), None, ISeq(List(ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(12144), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""value""")))).setId(12146), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef).setId(12148), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef).setId(12150), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""fulfilled""")).setId(12152), IApp(Id("""__x0__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""value"""))))).setId(12154), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(12155), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12156))).setId(12167))
  val instToStepMap: Map[Int, Int] = HashMap(12148 -> 3, 12154 -> 6, 12147 -> 2, 12151 -> 4, 12155 -> 6, 12143 -> 0, 12146 -> 2, 12156 -> 6, 12150 -> 4, 12145 -> 1, 12157 -> 6, 12152 -> 5, 12153 -> 5, 12144 -> 1, 12149 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12143), 5 -> HashSet(12152, 12153), 1 -> HashSet(12145, 12144), 6 -> HashSet(12154, 12155, 12156, 12157), 2 -> HashSet(12147, 12146), 3 -> HashSet(12148, 12149), 4 -> HashSet(12151, 12150))
  /* Beautified form:
  "FulfillPromise" (promise, value) => {
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x0__ = (TriggerPromiseReactions reactions value)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
