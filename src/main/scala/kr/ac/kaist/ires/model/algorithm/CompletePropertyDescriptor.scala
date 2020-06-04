package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CompletePropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""CompletePropertyDescriptor""", List(Id("""Desc""")), None, ISeq(List(ILet(Id("""like"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(false)), (EStr("""Get"""), EUndef), (EStr("""Set"""), EUndef), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false))))).setId(1860), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1862), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))).setId(1868), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List()).setId(1859), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1863), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))).setId(1866))).setId(1867)).setId(1869), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Value""")))).setId(1870), ISeq(List()).setId(1859)).setId(1872), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Writable""")))).setId(1874), ISeq(List()).setId(1859)).setId(1876))).setId(1878), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Get""")))).setId(1879), ISeq(List()).setId(1859)).setId(1881), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Set""")))).setId(1883), ISeq(List()).setId(1859)).setId(1885))).setId(1887)).setId(1888), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Enumerable""")))).setId(1890), ISeq(List()).setId(1859)).setId(1892), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Configurable""")))).setId(1894), ISeq(List()).setId(1859)).setId(1896), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1898), IReturn(ERef(RefId(Id("""__x3__""")))).setId(1899))).setId(-1))
  /* Beautified form:
  "CompletePropertyDescriptor" (Desc) => {
    let like = (new Record("Value" -> undefined, "Writable" -> false, "Get" -> undefined, "Set" -> undefined, "Enumerable" -> false, "Configurable" -> false))
    app __x0__ = (IsGenericDescriptor Desc)
    let __x1__ = (= __x0__ true)
    if __x1__ {} else {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    }
    if __x1__ {
      if (= Desc["Value"] absent) Desc["Value"] = like["Value"] else {}
      if (= Desc["Writable"] absent) Desc["Writable"] = like["Writable"] else {}
    } else {
      if (= Desc["Get"] absent) Desc["Get"] = like["Get"] else {}
      if (= Desc["Set"] absent) Desc["Set"] = like["Set"] else {}
    }
    if (= Desc["Enumerable"] absent) Desc["Enumerable"] = like["Enumerable"] else {}
    if (= Desc["Configurable"] absent) Desc["Configurable"] = like["Configurable"] else {}
    app __x3__ = (WrapCompletion Desc)
    return __x3__
  }
  */
}
