package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorResumeNextReturnProcessorRejectedFunctions {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorResumeNextReturnProcessorRejectedFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(11514), IAssign(RefProp(RefProp(RefId(Id("""F""")), EStr("""Generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(11516), IApp(Id("""__x0__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefProp(RefId(Id("""F""")), EStr("""Generator"""))), ERef(RefId(Id("""reason"""))))).setId(11518), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11519), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11520)).setId(11521), ISeq(List()).setId(11534)).setId(11523), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(11524), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11525))).setId(11538))
  val instToStepMap: Map[Int, Int] = HashMap(11517 -> 1, 11523 -> 2, 11524 -> 2, 11516 -> 1, 11518 -> 2, 11514 -> 0, 11526 -> 2, 11515 -> 0, 11525 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(11515, 11514), 1 -> HashSet(11517, 11516), 2 -> HashSet(11523, 11524, 11525, 11518, 11526))
  /* Beautified form:
  "AsyncGeneratorResumeNextReturnProcessorRejectedFunctions" () => {
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = "completed"
    app __x0__ = (AsyncGeneratorReject F["Generator"] reason)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
