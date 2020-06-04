package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTCanDeclareGlobalFunction {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.CanDeclareGlobalFunction""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48742), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48744), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48746), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""globalObject""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48748), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(48749), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48750)).setId(48751), ISeq(List()).setId(48752)).setId(48753), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x0__""")))).setId(48754), IIf(EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""globalObject"""))))).setId(48756), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(48757), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48758)).setId(48759), ISeq(List()).setId(48752)).setId(48760), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(48761), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48762))).setId(48763), ISeq(List()).setId(48752)).setId(48764), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""existingProp""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48766), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48767))).setId(48768), ISeq(List()).setId(48752)).setId(48769), IExpr(ENotSupported("""Etc""")).setId(48771), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48772), IReturn(ERef(RefId(Id("""__x4__""")))).setId(48773))).setId(-1))
  /* Beautified form:
  "GlobalEnvironmentRecord.CanDeclareGlobalFunction" (this, N) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (globalObject["GetOwnProperty"] globalObject N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let existingProp = __x0__
    if (= existingProp undefined) {
      app __x1__ = (IsExtensible globalObject)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (= existingProp["Configurable"] true) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    !!! "Etc"
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
