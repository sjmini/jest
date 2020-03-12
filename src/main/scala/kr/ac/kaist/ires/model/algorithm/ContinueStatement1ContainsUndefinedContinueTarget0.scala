package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ContinueStatement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""ContinueStatement1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(33926), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""iterationSet"""))), ERef(RefId(Id("""__x0__"""))))), IReturn(EBool(true)).setId(33927), ISeq(List()).setId(33937)).setId(33930), IReturn(EBool(false)).setId(33932))).setId(33940))
  val instToStepMap: Map[Int, Int] = HashMap(33930 -> 1, 33933 -> 2, 33927 -> 0, 33932 -> 2, 33926 -> 1, 33928 -> 0, 33931 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33927, 33928), 1 -> HashSet(33930, 33926, 33931), 2 -> HashSet(33933, 33932))
  /* Beautified form:
  "ContinueStatement1ContainsUndefinedContinueTarget0" (this, LabelIdentifier, iterationSet, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains iterationSet __x0__)) return true else {}
    return false
  }
  */
}
