package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""IdentifierReference""")), None, IReturn(EBool(false)).setId(13487))
  val instToStepMap: Map[Int, Int] = Map(13488 -> 0, 13487 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13488, 13487))
  /* Beautified form:
  "PrimaryExpression1IsFunctionDefinition0" (this, IdentifierReference) => return false
  */
}
