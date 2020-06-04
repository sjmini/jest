package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsDataDescriptor {
  val length: Int = 1
  val func: Func = Func("""IsDataDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1170), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1171))).setId(1172), ISeq(List()).setId(1173)).setId(1174), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1176), IReturn(ERef(RefId(Id("""__x1__""")))).setId(1177))).setId(1178), ISeq(List()).setId(1173)).setId(1179), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(1181), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1182))).setId(-1))
  /* Beautified form:
  "IsDataDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (&& (= Desc["Value"] absent) (= Desc["Writable"] absent)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion true)
    return __x2__
  }
  */
}
