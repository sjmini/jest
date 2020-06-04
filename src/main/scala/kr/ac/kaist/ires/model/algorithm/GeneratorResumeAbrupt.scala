package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorResumeAbrupt {
  val length: Int = 2
  val func: Func = Func("""GeneratorResumeAbrupt""", List(Id("""generator"""), Id("""abruptCompletion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))).setId(10575), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(10576), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10577)).setId(10578), ISeq(List()).setId(10579)).setId(10580), ILet(Id("""state"""), ERef(RefId(Id("""__x0__""")))).setId(10581), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")).setId(10583), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(10585))).setId(10587), ISeq(List()).setId(10579)).setId(10588), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Value"""))), EBool(true))).setId(10590), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(10591), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10592))).setId(10594), ISeq(List()).setId(10579)).setId(10595), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""abruptCompletion"""))))).setId(10597), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(10598), IReturn(ERef(RefId(Id("""__x4__""")))).setId(10599))).setId(10601), ISeq(List()).setId(10579)).setId(10602), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))).setId(10604), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10606), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(10608), IAssign(RefId(Id("""methodContext""")), ENull).setId(10609), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")).setId(10611), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(10613), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(10614), IWithCont(Id("""__x5__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(10616), ISeq(List()).setId(10618)).setId(10619), IAppend(ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(10620), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""abruptCompletion"""))))).setId(10621))).setId(10622)).setId(10623), IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(10625), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(10626), IReturn(ERef(RefId(Id("""__x8__""")))).setId(10627))).setId(-1))
  /* Beautified form:
  "GeneratorResumeAbrupt" (generator, abruptCompletion) => {
    app __x0__ = (GeneratorValidate generator)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state "suspendedStart") {
      generator["GeneratorState"] = "completed"
      state = "completed"
    } else {}
    if (= state "completed") {
      if (= abruptCompletion["Type"] CONST_return) {
        app __x1__ = (CreateIterResultObject abruptCompletion["Value"] true)
        app __x2__ = (WrapCompletion __x1__)
        return __x2__
      } else {}
      app __x3__ = (Completion abruptCompletion)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x5__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x5__ -> genContext["ReturnCont"]
      app __x6__ = (genContext["ResumeCont"] abruptCompletion)
    }
    app __x7__ = (Completion result)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
