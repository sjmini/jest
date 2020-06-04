package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList3ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = Func("""ElementList3ArrayAccumulation1""", List(Id("""this"""), Id("""ElementList"""), Id("""Elision"""), Id("""SpreadElement"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ElementList"""))), EStr("""ArrayAccumulation""")).setId(13986), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""nextIndex"""))))).setId(13987), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(13988), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13989)).setId(13990), ISeq(List()).setId(13991)).setId(13992), ILet(Id("""postIndex"""), ERef(RefId(Id("""__x1__""")))).setId(13993), IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""padding"""), EINum(0L)).setId(13996), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(13995), ILet(Id("""padding"""), ERef(RefId(Id("""__x2__""")))).setId(13998))).setId(13999)).setId(14000), IAccess(Id("""__x3__"""), ERef(RefId(Id("""SpreadElement"""))), EStr("""ArrayAccumulation""")).setId(14002), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""array"""))), EBOp(OPlus, ERef(RefId(Id("""postIndex"""))), ERef(RefId(Id("""padding""")))))).setId(14003), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(14004), IReturn(ERef(RefId(Id("""__x5__""")))).setId(14005))).setId(-1))
  /* Beautified form:
  "ElementList3ArrayAccumulation1" (this, ElementList, Elision, SpreadElement, array, nextIndex) => {
    access __x0__ = (ElementList "ArrayAccumulation")
    app __x1__ = (__x0__ array nextIndex)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let postIndex = __x1__
    if (= Elision absent) let padding = 0i else {
      access __x2__ = (Elision "ElisionWidth")
      let padding = __x2__
    }
    access __x3__ = (SpreadElement "ArrayAccumulation")
    app __x4__ = (__x3__ array (+ postIndex padding))
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
