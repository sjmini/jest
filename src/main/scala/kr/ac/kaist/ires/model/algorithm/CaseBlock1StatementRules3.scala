package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1StatementRules3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1StatementRules3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(ILet(Id("""has"""), EBool(false)).setId(45127), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""HasCallInTailPosition""")).setId(45129), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45130), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(45131))).setId(45164), ISeq(List()).setId(45165)).setId(45134), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(45136), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45137))).setId(45169), ISeq(List()).setId(45170)).setId(45139), IAccess(Id("""__x3__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""HasCallInTailPosition""")).setId(45141), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(45142), ILet(Id("""has"""), ERef(RefId(Id("""__x4__""")))).setId(45143), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(45145), IReturn(ERef(RefId(Id("""__x5__""")))).setId(45146))).setId(45177), ISeq(List()).setId(45178)).setId(45148), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent)), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""HasCallInTailPosition""")).setId(45150), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""call"""))))).setId(45151), ILet(Id("""has"""), ERef(RefId(Id("""__x7__""")))).setId(45152))).setId(45183), ISeq(List()).setId(45184)).setId(45154), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""has"""))))).setId(45156), IReturn(ERef(RefId(Id("""__x8__""")))).setId(45157))).setId(45188))
  val instToStepMap: Map[Int, Int] = HashMap(45154 -> 9, 45129 -> 1, 45158 -> 10, 45155 -> 9, 45156 -> 10, 45131 -> 1, 45147 -> 6, 45128 -> 0, 45143 -> 5, 45132 -> 1, 45138 -> 3, 45127 -> 0, 45137 -> 3, 45149 -> 7, 45145 -> 6, 45141 -> 5, 45140 -> 4, 45152 -> 8, 45134 -> 2, 45144 -> 5, 45139 -> 4, 45148 -> 7, 45130 -> 1, 45151 -> 8, 45135 -> 2, 45153 -> 8, 45136 -> 3, 45157 -> 10, 45146 -> 6, 45142 -> 5, 45150 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(45128, 45127), 5 -> HashSet(45141, 45144, 45143, 45142), 10 -> HashSet(45158, 45156, 45157), 1 -> HashSet(45129, 45130, 45131, 45132), 6 -> HashSet(45145, 45147, 45146), 9 -> HashSet(45154, 45155), 2 -> HashSet(45134, 45135), 7 -> HashSet(45149, 45148), 3 -> HashSet(45137, 45138, 45136), 8 -> HashSet(45152, 45151, 45153, 45150), 4 -> HashSet(45140, 45139))
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
