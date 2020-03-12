package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ContinueStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ContinueStatement1Evaluation0""", List(Id("""this"""), Id("""LabelIdentifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(33957), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))).setId(33958), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_continue""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""label""")))))))).setId(33960), IReturn(ERef(RefId(Id("""__x1__""")))).setId(33961))).setId(33968))
  val instToStepMap: Map[Int, Int] = HashMap(33962 -> 1, 33961 -> 1, 33957 -> 0, 33959 -> 0, 33958 -> 0, 33960 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33957, 33959, 33958), 1 -> HashSet(33962, 33961, 33960))
  /* Beautified form:
  "ContinueStatement1Evaluation0" (this, LabelIdentifier) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    app __x1__ = (WrapCompletion (new Completion("Type" -> CONST_continue, "Value" -> CONST_empty, "Target" -> label)))
    return __x1__
  }
  */
}
