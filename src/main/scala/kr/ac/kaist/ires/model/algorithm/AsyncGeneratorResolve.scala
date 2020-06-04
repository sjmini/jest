package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorResolve {
  val length: Int = 3
  val func: Func = Func("""AsyncGeneratorResolve""", List(Id("""generator"""), Id("""value"""), Id("""done""")), None, ISeq(List(ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(11009), ILet(Id("""next"""), EPop(ERef(RefId(Id("""queue"""))), EINum(0L))).setId(11011), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Capability""")))).setId(11012), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""done"""))))).setId(11014), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11015), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11016)).setId(11017), ISeq(List()).setId(11008)).setId(11018), ILet(Id("""iteratorResult"""), ERef(RefId(Id("""__x0__""")))).setId(11019), IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iteratorResult"""))))))).setId(11021), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(11022), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11023)).setId(11024), ISeq(List()).setId(11008)).setId(11025), IExpr(ERef(RefId(Id("""__x1__""")))).setId(11026), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(11028), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(11029), IReturn(ERef(RefId(Id("""__x2__""")))).setId(11030)).setId(11031), ISeq(List()).setId(11008)).setId(11032), IExpr(ERef(RefId(Id("""__x2__""")))).setId(11033), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11035), IReturn(ERef(RefId(Id("""__x3__""")))).setId(11036))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorResolve" (generator, value, done) => {
    let queue = generator["AsyncGeneratorQueue"]
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x0__ = (CreateIterResultObject value done)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorResult = __x0__
    app __x1__ = (Call promiseCapability["Resolve"] undefined (new [iteratorResult]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (AsyncGeneratorResumeNext generator)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
