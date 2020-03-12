package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""BreakStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(33979), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""__x0__"""))))), IReturn(EBool(true)).setId(33980), ISeq(List()).setId(33990)).setId(33983), IReturn(EBool(false)).setId(33985))).setId(33993))
  val instToStepMap: Map[Int, Int] = HashMap(33981 -> 0, 33986 -> 2, 33980 -> 0, 33984 -> 1, 33979 -> 1, 33983 -> 1, 33985 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33981, 33980), 1 -> HashSet(33984, 33979, 33983), 2 -> HashSet(33986, 33985))
  /* Beautified form:
  "BreakStatement1ContainsUndefinedBreakTarget0" (this, LabelIdentifier, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains labelSet __x0__)) return true else {}
    return false
  }
  */
}
