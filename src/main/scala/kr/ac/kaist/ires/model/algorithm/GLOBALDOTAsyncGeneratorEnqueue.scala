package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorEnqueue {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncGeneratorEnqueue""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90386), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(90387), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(90389), ILet(Id("""completion"""), ERef(RefId(Id("""__x1__""")))).setId(90390), IApp(Id("""__x2__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(90393), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(90394), IReturn(ERef(RefId(Id("""__x2__""")))).setId(90395)).setId(90396), ISeq(List()).setId(90392)).setId(90397), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x2__""")))).setId(90398), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""generator"""))))).setId(90400), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EAbsent)), ISeq(List(ILet(Id("""badGeneratorError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(90401), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""badGeneratorError"""))))))).setId(90403), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(90404), IReturn(ERef(RefId(Id("""__x4__""")))).setId(90405)).setId(90406), ISeq(List()).setId(90392)).setId(90407), IExpr(ERef(RefId(Id("""__x4__""")))).setId(90408), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(90410), IReturn(ERef(RefId(Id("""__x5__""")))).setId(90411))).setId(90413), ISeq(List()).setId(90392)).setId(90414), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(90416), ILet(Id("""request"""), EMap(Ty("""AsyncGeneratorRequest"""), List((EStr("""Completion"""), ERef(RefId(Id("""completion""")))), (EStr("""Capability"""), ERef(RefId(Id("""promiseCapability"""))))))).setId(90418), IAppend(ERef(RefId(Id("""request"""))), ERef(RefId(Id("""queue""")))).setId(90420), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))).setId(90422), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""executing"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(90424), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(90425), IReturn(ERef(RefId(Id("""__x6__""")))).setId(90426)).setId(90427), ISeq(List()).setId(90392)).setId(90428), IExpr(ERef(RefId(Id("""__x6__""")))).setId(90429))).setId(90431), ISeq(List()).setId(90392)).setId(90432), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(90434), IReturn(ERef(RefId(Id("""__x7__""")))).setId(90435))).setId(-1))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorEnqueue" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let completion = __x1__
    app __x2__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let promiseCapability = __x2__
    app __x3__ = (Type generator)
    if (|| (! (= __x3__ Object)) (= generator["AsyncGeneratorState"] absent)) {
      let badGeneratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [badGeneratorError]))
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      app __x5__ = (WrapCompletion promiseCapability["Promise"])
      return __x5__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    let request = (new AsyncGeneratorRequest("Completion" -> completion, "Capability" -> promiseCapability))
    append request -> queue
    let state = generator["AsyncGeneratorState"]
    if (! (= state "executing")) {
      app __x6__ = (AsyncGeneratorResumeNext generator)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
    } else {}
    app __x7__ = (WrapCompletion promiseCapability["Promise"])
    return __x7__
  }
  */
}
