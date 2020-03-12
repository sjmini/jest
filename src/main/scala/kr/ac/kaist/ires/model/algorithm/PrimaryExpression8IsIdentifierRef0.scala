package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression8IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression8IsIdentifierRef0""", List(Id("""this"""), Id("""AsyncFunctionExpression""")), None, IReturn(EBool(false)).setId(13574))
  val instToStepMap: Map[Int, Int] = Map(13574 -> 0, 13575 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13575, 13574))
  /* Beautified form:
  "PrimaryExpression8IsIdentifierRef0" (this, AsyncFunctionExpression) => return false
  */
}
