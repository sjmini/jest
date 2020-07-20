package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.RESOURCE_DIR
import kr.ac.kaist.ires.util.Useful._
import spray.json._

case class RHSElem(rhsName: String, k: Int)

object RHSElem extends DefaultJsonProtocol {
  implicit val RHSElemFormat: JsonFormat[RHSElem] = jsonFormat2(RHSElem.apply)
  implicit def ordering[E <: RHSElem]: Ordering[E] = new Ordering[E] {
    override def compare(x: E, y: E): Int = x.toString.compareTo(y.toString)
  }
  lazy val total: Set[RHSElem] =
    readJson[Set[RHSElem]](s"$RESOURCE_DIR/TargetRHS.json")
}
