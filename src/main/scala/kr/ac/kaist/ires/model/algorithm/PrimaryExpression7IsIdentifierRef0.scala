package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression7IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression7IsIdentifierRef0""", List(Id("""this"""), Id("""GeneratorExpression""")), None, IReturn(EBool(false)).setId(13569))
  val instToStepMap: Map[Int, Int] = Map(13569 -> 0, 13570 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13569, 13570))
  /* Beautified form:
  "PrimaryExpression7IsIdentifierRef0" (this, GeneratorExpression) => return false
  */
}
