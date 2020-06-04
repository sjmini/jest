package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList1ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = Func("""ElementList1ArrayAccumulation1""", List(Id("""this"""), Id("""Elision"""), Id("""SpreadElement"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""padding"""), EINum(0L)).setId(13860), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(13859), ILet(Id("""padding"""), ERef(RefId(Id("""__x0__""")))).setId(13862))).setId(13863)).setId(13864), IAccess(Id("""__x1__"""), ERef(RefId(Id("""SpreadElement"""))), EStr("""ArrayAccumulation""")).setId(13866), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""array"""))), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""padding""")))))).setId(13867), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(13868), IReturn(ERef(RefId(Id("""__x3__""")))).setId(13869))).setId(-1))
  /* Beautified form:
  "ElementList1ArrayAccumulation1" (this, Elision, SpreadElement, array, nextIndex) => {
    if (= Elision absent) let padding = 0i else {
      access __x0__ = (Elision "ElisionWidth")
      let padding = __x0__
    }
    access __x1__ = (SpreadElement "ArrayAccumulation")
    app __x2__ = (__x1__ array (+ nextIndex padding))
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
