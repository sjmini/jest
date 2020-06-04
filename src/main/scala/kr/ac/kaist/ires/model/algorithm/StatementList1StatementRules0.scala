package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1StatementRules0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""HasCallInTailPosition""")).setId(44723), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44724), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(44725), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(44727), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44728))).setId(44729), ISeq(List()).setId(44730)).setId(44731), IAccess(Id("""__x3__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""HasCallInTailPosition""")).setId(44733), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(44734), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(44735), IReturn(ERef(RefId(Id("""__x5__""")))).setId(44736))).setId(-1))
  /* Beautified form:
  "StatementList1StatementRules0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (StatementListItem "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
