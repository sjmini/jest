package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorEnqueue {
  val length: Int = 2
  val func: Func = Func("""AsyncGeneratorEnqueue""", List(Id("""generator"""), Id("""completion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(11551), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11552), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11553)).setId(11554), ISeq(List()).setId(11550)).setId(11555), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(11556), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""generator"""))))).setId(11558), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EAbsent)), ISeq(List(ILet(Id("""badGeneratorError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(11559), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""badGeneratorError"""))))))).setId(11561), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(11562), IReturn(ERef(RefId(Id("""__x2__""")))).setId(11563)).setId(11564), ISeq(List()).setId(11550)).setId(11565), IExpr(ERef(RefId(Id("""__x2__""")))).setId(11566), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(11568), IReturn(ERef(RefId(Id("""__x3__""")))).setId(11569))).setId(11571), ISeq(List()).setId(11550)).setId(11572), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(11574), ILet(Id("""request"""), EMap(Ty("""AsyncGeneratorRequest"""), List((EStr("""Completion"""), ERef(RefId(Id("""completion""")))), (EStr("""Capability"""), ERef(RefId(Id("""promiseCapability"""))))))).setId(11576), IAppend(ERef(RefId(Id("""request"""))), ERef(RefId(Id("""queue""")))).setId(11578), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))).setId(11580), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""executing"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(11582), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(11583), IReturn(ERef(RefId(Id("""__x4__""")))).setId(11584)).setId(11585), ISeq(List()).setId(11550)).setId(11586), IExpr(ERef(RefId(Id("""__x4__""")))).setId(11587))).setId(11589), ISeq(List()).setId(11550)).setId(11590), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(11592), IReturn(ERef(RefId(Id("""__x5__""")))).setId(11593))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorEnqueue" (generator, completion) => {
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (Type generator)
    if (|| (! (= __x1__ Object)) (= generator["AsyncGeneratorState"] absent)) {
      let badGeneratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [badGeneratorError]))
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion promiseCapability["Promise"])
      return __x3__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    let request = (new AsyncGeneratorRequest("Completion" -> completion, "Capability" -> promiseCapability))
    append request -> queue
    let state = generator["AsyncGeneratorState"]
    if (! (= state "executing")) {
      app __x4__ = (AsyncGeneratorResumeNext generator)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    } else {}
    app __x5__ = (WrapCompletion promiseCapability["Promise"])
    return __x5__
  }
  */
}
