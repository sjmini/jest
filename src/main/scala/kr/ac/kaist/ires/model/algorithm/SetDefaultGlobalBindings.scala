package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetDefaultGlobalBindings {
  val length: Int = 1
  val func: Func = Func("""SetDefaultGlobalBindings""", List(Id("""realmRec""")), None, ISeq(List(ILet(Id("""global"""), ERef(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")))).setId(8330), ILet(Id("""__x0__"""), EKeys(ERef(RefId(Id("""GLOBAL"""))))).setId(8341), ILet(Id("""__x1__"""), EINum(0L)).setId(8342), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(8343), ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""GLOBAL""")), ERef(RefId(Id("""name""")))))).setId(8332), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""global"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""desc"""))))).setId(8333), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(8334), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8335)).setId(8336), ISeq(List()).setId(8338)).setId(8339), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(8344))).setId(8345)).setId(8346), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""global"""))))).setId(8348), IReturn(ERef(RefId(Id("""__x3__""")))).setId(8349))).setId(-1))
  /* Beautified form:
  "SetDefaultGlobalBindings" (realmRec) => {
    let global = realmRec["GlobalObject"]
    let __x0__ = (map-keys GLOBAL)
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let name = __x0__[__x1__]
      let desc = GLOBAL[name]
      app __x2__ = (DefinePropertyOrThrow global name desc)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x1__ = (+ __x1__ 1i)
    }
    app __x3__ = (WrapCompletion global)
    return __x3__
  }
  */
}
