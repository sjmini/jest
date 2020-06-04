package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorResumeAbrupt {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GeneratorResumeAbrupt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89175), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89176), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(89178), ILet(Id("""abruptCompletion"""), ERef(RefId(Id("""__x1__""")))).setId(89179), IApp(Id("""__x2__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))).setId(89181), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(89182), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89183)).setId(89184), ISeq(List()).setId(89185)).setId(89186), ILet(Id("""state"""), ERef(RefId(Id("""__x2__""")))).setId(89187), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")).setId(89189), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(89191))).setId(89193), ISeq(List()).setId(89185)).setId(89194), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Value"""))), EBool(true))).setId(89196), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(89197), IReturn(ERef(RefId(Id("""__x4__""")))).setId(89198))).setId(89200), ISeq(List()).setId(89185)).setId(89201), IApp(Id("""__x5__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""abruptCompletion"""))))).setId(89203), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(89204), IReturn(ERef(RefId(Id("""__x6__""")))).setId(89205))).setId(89207), ISeq(List()).setId(89185)).setId(89208), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))).setId(89210), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(89212), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(89214), IAssign(RefId(Id("""methodContext""")), ENull).setId(89215), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")).setId(89217), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(89219), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(89220), IWithCont(Id("""__x7__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(89222), ISeq(List()).setId(89224)).setId(89225), IAppend(ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(89226), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""abruptCompletion"""))))).setId(89227))).setId(89228)).setId(89229), IApp(Id("""__x9__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(89231), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(89232), IReturn(ERef(RefId(Id("""__x10__""")))).setId(89233))).setId(-1))
  /* Beautified form:
  "GLOBAL.GeneratorResumeAbrupt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let abruptCompletion = __x1__
    app __x2__ = (GeneratorValidate generator)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let state = __x2__
    if (= state "suspendedStart") {
      generator["GeneratorState"] = "completed"
      state = "completed"
    } else {}
    if (= state "completed") {
      if (= abruptCompletion["Type"] CONST_return) {
        app __x3__ = (CreateIterResultObject abruptCompletion["Value"] true)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (Completion abruptCompletion)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x7__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x7__ -> genContext["ReturnCont"]
      app __x8__ = (genContext["ResumeCont"] abruptCompletion)
    }
    app __x9__ = (Completion result)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
