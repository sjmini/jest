package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTInitializeBinding {
  val length: Int = 2
  val func: Func = Func("""ObjectEnvironmentRecord.InitializeBinding""", List(Id("""this"""), Id("""N"""), Id("""V""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47586), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N"""))))), EAbsent)), IAssign(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized""")), EBool(true)).setId(47589), ISeq(List()).setId(47590)).setId(47591), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))), EBool(false))).setId(47592), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(47593), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47594)).setId(47595), ISeq(List()).setId(47588)).setId(47596), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(47597), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47598))).setId(-1))
  /* Beautified form:
  "ObjectEnvironmentRecord.InitializeBinding" (this, N, V) => {
    let envRec = this
    if (! (= envRec["SubMap"][N] absent)) envRec["SubMap"][N]["initialized"] = true else {}
    app __x0__ = (envRec["SetMutableBinding"] envRec N V false)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
