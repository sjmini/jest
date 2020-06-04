package kr.ac.kaist.ires.model

import scala.io.Source
import scala.collection.mutable.{ Map, Set }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import kr.ac.kaist.ires.MODEL_DIR
import spray.json._
import kr.ac.kaist.ires.util.StepTracerJsonProtocol._

object StepTracer {
  val stepLength: Map[String, Int] = Source.fromFile(s"$MODEL_DIR/stepLength.json").mkString.parseJson.convertTo[Map[String, Int]]
  val stepMap: Map[String, Map[Int, Int]] = Source.fromFile(s"$MODEL_DIR/stepMap.json").mkString.parseJson.convertTo[Map[String, Map[Int, Int]]]
  val instToAlgo: Map[Int, String] = Source.fromFile(s"$MODEL_DIR/instToAlgo.json").mkString.parseJson.convertTo[Map[Int, String]]
}
