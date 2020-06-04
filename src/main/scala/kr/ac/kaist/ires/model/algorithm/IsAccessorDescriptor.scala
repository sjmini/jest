package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAccessorDescriptor {
  val length: Int = 1
  val func: Func = Func("""IsAccessorDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1129), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1130))).setId(1131), ISeq(List()).setId(1132)).setId(1133), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1135), IReturn(ERef(RefId(Id("""__x1__""")))).setId(1136))).setId(1137), ISeq(List()).setId(1132)).setId(1138), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(1140), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1141))).setId(-1))
  /* Beautified form:
  "IsAccessorDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (&& (= Desc["Get"] absent) (= Desc["Set"] absent)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion true)
    return __x2__
  }
  */
}
