package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorResumeNextReturnProcessorRejectedFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorResumeNextReturnProcessorRejectedFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90343), ILet(Id("""reason"""), ERef(RefId(Id("""__x0__""")))).setId(90344), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90346), IAssign(RefProp(RefProp(RefId(Id("""F""")), EStr("""Generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(90348), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefProp(RefId(Id("""F""")), EStr("""Generator"""))), ERef(RefId(Id("""reason"""))))).setId(90350), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(90351), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90352)).setId(90353), ISeq(List()).setId(90368)).setId(90355), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(90356), IReturn(ERef(RefId(Id("""__x2__""")))).setId(90357))).setId(90372))
  val instToStepMap: Map[Int, Int] = HashMap(90344 -> 0, 90347 -> 1, 90355 -> 3, 90358 -> 3, 90343 -> 0, 90348 -> 2, 90345 -> 0, 90357 -> 3, 90349 -> 2, 90346 -> 1, 90356 -> 3, 90350 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(90344, 90343, 90345), 1 -> HashSet(90347, 90346), 2 -> HashSet(90348, 90349), 3 -> HashSet(90355, 90358, 90357, 90356, 90350))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorResumeNextReturnProcessorRejectedFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reason = __x0__
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = "completed"
    app __x1__ = (AsyncGeneratorReject F["Generator"] reason)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
