package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName0PropName0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName0PropName0""", List(Id("""this"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")).setId(14485), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14486))).setId(14491))
  val instToStepMap: Map[Int, Int] = Map(14485 -> 0, 14486 -> 0, 14487 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14487, 14485, 14486))
  /* Beautified form:
  "LiteralPropertyName0PropName0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    return __x0__
  }
  */
}
