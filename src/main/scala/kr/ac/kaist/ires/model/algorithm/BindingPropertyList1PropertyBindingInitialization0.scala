package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingPropertyList1PropertyBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingPropertyList1PropertyBindingInitialization0""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""BindingProperty"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""PropertyBindingInitialization""")).setId(28461), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(28462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28463), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28464)).setId(28465), ISeq(List()).setId(28466)).setId(28467), ILet(Id("""boundNames"""), ERef(RefId(Id("""__x1__""")))).setId(28468), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingProperty"""))), EStr("""PropertyBindingInitialization""")).setId(28470), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(28471), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(28472), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28473)).setId(28474), ISeq(List()).setId(28466)).setId(28475), ILet(Id("""nextNames"""), ERef(RefId(Id("""__x3__""")))).setId(28476), ILet(Id("""__x4__"""), ERef(RefId(Id("""nextNames""")))).setId(28479), ILet(Id("""__x5__"""), EINum(0L)).setId(28480), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x6__"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(28481), IAppend(ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""boundNames""")))).setId(28478), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(28482))).setId(28483)).setId(28484), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""boundNames"""))))).setId(28487), IReturn(ERef(RefId(Id("""__x7__""")))).setId(28488))).setId(-1))
  /* Beautified form:
  "BindingPropertyList1PropertyBindingInitialization0" (this, BindingPropertyList, BindingProperty, value, environment) => {
    access __x0__ = (BindingPropertyList "PropertyBindingInitialization")
    app __x1__ = (__x0__ value environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let boundNames = __x1__
    access __x2__ = (BindingProperty "PropertyBindingInitialization")
    app __x3__ = (__x2__ value environment)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let nextNames = __x3__
    let __x4__ = nextNames
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let __x6__ = __x4__[__x5__]
      append __x6__ -> boundNames
      __x5__ = (+ __x5__ 1i)
    }
    app __x7__ = (WrapCompletion boundNames)
    return __x7__
  }
  */
}
