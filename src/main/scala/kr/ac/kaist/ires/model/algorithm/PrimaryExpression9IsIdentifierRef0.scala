package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression9IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression9IsIdentifierRef0""", List(Id("""this"""), Id("""AsyncGeneratorExpression""")), None, IReturn(EBool(false)).setId(13579))
  val instToStepMap: Map[Int, Int] = Map(13579 -> 0, 13580 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13580, 13579))
  /* Beautified form:
  "PrimaryExpression9IsIdentifierRef0" (this, AsyncGeneratorExpression) => return false
  */
}
