package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName0Evaluation0""", List(Id("""this"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")).setId(14698), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(14699), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14700))).setId(14706))
  val instToStepMap: Map[Int, Int] = Map(14698 -> 0, 14699 -> 0, 14700 -> 0, 14701 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14701, 14698, 14699, 14700))
  /* Beautified form:
  "LiteralPropertyName0Evaluation0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
