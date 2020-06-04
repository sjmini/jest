package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasRestrictedGlobalProperty {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasRestrictedGlobalProperty""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48592), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48594), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48596), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""globalObject""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48598), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(48599), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48600)).setId(48601), ISeq(List()).setId(48602)).setId(48603), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x0__""")))).setId(48604), IIf(EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48606), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48607))).setId(48608), ISeq(List()).setId(48602)).setId(48609), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""existingProp""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48611), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48612))).setId(48613), ISeq(List()).setId(48602)).setId(48614), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48616), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48617))).setId(-1))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasRestrictedGlobalProperty" (this, N) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (globalObject["GetOwnProperty"] globalObject N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let existingProp = __x0__
    if (= existingProp undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= existingProp["Configurable"] true) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion true)
    return __x3__
  }
  */
}
