package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1StatementRules3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1StatementRules3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(ILet(Id("""has"""), EBool(false)).setId(45127), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""HasCallInTailPosition""")).setId(45129), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45130), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(45131))).setId(45132), ISeq(List()).setId(45133)).setId(45134), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(45136), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45137))).setId(45138), ISeq(List()).setId(45133)).setId(45139), IAccess(Id("""__x3__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""HasCallInTailPosition""")).setId(45141), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(45142), ILet(Id("""has"""), ERef(RefId(Id("""__x4__""")))).setId(45143), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(45145), IReturn(ERef(RefId(Id("""__x5__""")))).setId(45146))).setId(45147), ISeq(List()).setId(45133)).setId(45148), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent)), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""HasCallInTailPosition""")).setId(45150), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""call"""))))).setId(45151), ILet(Id("""has"""), ERef(RefId(Id("""__x7__""")))).setId(45152))).setId(45153), ISeq(List()).setId(45133)).setId(45154), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""has"""))))).setId(45156), IReturn(ERef(RefId(Id("""__x8__""")))).setId(45157))).setId(-1))
  /* Beautified form:
  "CaseBlock1StatementRules3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    let has = false
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "HasCallInTailPosition")
      app __x1__ = (__x0__ call)
      let has = __x1__
    } else {}
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (DefaultClause "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    let has = __x4__
    if (= has true) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (! (= CaseClauses1 absent)) {
      access __x6__ = (CaseClauses1 "HasCallInTailPosition")
      app __x7__ = (__x6__ call)
      let has = __x7__
    } else {}
    app __x8__ = (WrapCompletion has)
    return __x8__
  }
  */
}
