package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsExtensible {
  val length: Int = 1
  val func: Func = Func("""IsExtensible""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IsExtensible"""))), List(ERef(RefId(Id("""O"""))))).setId(3515), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(3516), IReturn(ERef(RefId(Id("""__x0__""")))).setId(3517)).setId(3518), ISeq(List()).setId(3514)).setId(3519), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(3520), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3521))).setId(-1))
  /* Beautified form:
  "IsExtensible" (O) => {
    app __x0__ = (O["IsExtensible"] O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
