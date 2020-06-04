package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock0CaseBlockEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0CaseBlockEvaluation1""", List(Id("""this"""), Id("""CaseClauses"""), Id("""input""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(35444), ILet(Id("""A"""), EGetElems(ERef(RefId(Id("""CaseClauses"""))), """CaseClause""")).setId(35447), ILet(Id("""found"""), EBool(false)).setId(35449), ILet(Id("""__x0__"""), ERef(RefId(Id("""A""")))).setId(35482), ILet(Id("""__x1__"""), EINum(0L)).setId(35483), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(35484), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CaseClauseIsSelected"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""input"""))))).setId(35451), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(35452), IReturn(ERef(RefId(Id("""__x2__""")))).setId(35453)).setId(35454), ISeq(List()).setId(35455)).setId(35456), IAssign(RefId(Id("""found""")), ERef(RefId(Id("""__x2__""")))).setId(35457))).setId(35459), ISeq(List()).setId(35455)).setId(35460), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35463), ILet(Id("""R"""), ERef(RefId(Id("""__x3__""")))).setId(35464), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35466), ISeq(List()).setId(35455)).setId(35468), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35470), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35471), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(35472), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(35473), IReturn(ERef(RefId(Id("""__x7__""")))).setId(35474))).setId(35475), ISeq(List()).setId(35455)).setId(35476))).setId(35478), ISeq(List()).setId(35455)).setId(35479), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(35485))).setId(35486)).setId(35487), IApp(Id("""__x8__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(35490), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(35491), IReturn(ERef(RefId(Id("""__x9__""")))).setId(35492))).setId(-1))
  /* Beautified form:
  "CaseBlock0CaseBlockEvaluation1" (this, CaseClauses, input) => {
    let V = undefined
    let A = (get-elems CaseClauses CaseClause)
    let found = false
    let __x0__ = A
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let C = __x0__[__x1__]
      if (= found false) {
        app __x2__ = (CaseClauseIsSelected C input)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        found = __x2__
      } else {}
      if (= found true) {
        access __x3__ = (C "Evaluation")
        let R = __x3__
        if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
        app __x4__ = (IsAbruptCompletion R)
        if __x4__ {
          app __x5__ = (UpdateEmpty R V)
          app __x6__ = (Completion __x5__)
          app __x7__ = (WrapCompletion __x6__)
          return __x7__
        } else {}
      } else {}
      __x1__ = (+ __x1__ 1i)
    }
    app __x8__ = (NormalCompletion V)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
