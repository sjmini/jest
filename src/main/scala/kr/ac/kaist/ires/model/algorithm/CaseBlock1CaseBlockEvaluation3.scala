package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1CaseBlockEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1CaseBlockEvaluation3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""input""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(35573), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ILet(Id("""A"""), EGetElems(ERef(RefId(Id("""CaseClauses0"""))), """CaseClause""")).setId(35576), ILet(Id("""A"""), EList(List())).setId(35579)).setId(35582), ILet(Id("""found"""), EBool(false)).setId(35584), ILet(Id("""__x0__"""), ERef(RefId(Id("""A""")))).setId(35617), ILet(Id("""__x1__"""), EINum(0L)).setId(35618), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(35619), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CaseClauseIsSelected"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""input"""))))).setId(35586), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(35587), IReturn(ERef(RefId(Id("""__x2__""")))).setId(35588)).setId(35589), ISeq(List()).setId(35590)).setId(35591), IAssign(RefId(Id("""found""")), ERef(RefId(Id("""__x2__""")))).setId(35592))).setId(35594), ISeq(List()).setId(35590)).setId(35595), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35598), ILet(Id("""R"""), ERef(RefId(Id("""__x3__""")))).setId(35599), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35601), ISeq(List()).setId(35590)).setId(35603), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35605), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35606), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(35607), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(35608), IReturn(ERef(RefId(Id("""__x7__""")))).setId(35609))).setId(35610), ISeq(List()).setId(35590)).setId(35611))).setId(35613), ISeq(List()).setId(35590)).setId(35614), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(35620))).setId(35621)).setId(35622), ILet(Id("""foundInB"""), EBool(false)).setId(35625), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent)), ILet(Id("""B"""), EGetElems(ERef(RefId(Id("""CaseClauses1"""))), """CaseClause""")).setId(35628), ILet(Id("""B"""), EList(List())).setId(35631)).setId(35634), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(false)), ISeq(List(ILet(Id("""__x8__"""), ERef(RefId(Id("""B""")))).setId(35666), ILet(Id("""__x9__"""), EINum(0L)).setId(35667), IWhile(EBOp(OLt, ERef(RefId(Id("""__x9__"""))), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x8__""")), ERef(RefId(Id("""__x9__""")))))).setId(35668), IIf(EBOp(OEq, ERef(RefId(Id("""foundInB"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""CaseClauseIsSelected"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""input"""))))).setId(35636), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(35637), IReturn(ERef(RefId(Id("""__x10__""")))).setId(35638)).setId(35639), ISeq(List()).setId(35590)).setId(35640), IAssign(RefId(Id("""foundInB""")), ERef(RefId(Id("""__x10__""")))).setId(35641))).setId(35643), ISeq(List()).setId(35590)).setId(35644), IIf(EBOp(OEq, ERef(RefId(Id("""foundInB"""))), EBool(true)), ISeq(List(IAccess(Id("""__x11__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35647), ILet(Id("""R"""), ERef(RefId(Id("""__x11__""")))).setId(35648), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35650), ISeq(List()).setId(35590)).setId(35652), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35654), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35655), IApp(Id("""__x14__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(35656), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x14__"""))))).setId(35657), IReturn(ERef(RefId(Id("""__x15__""")))).setId(35658))).setId(35659), ISeq(List()).setId(35590)).setId(35660))).setId(35662), ISeq(List()).setId(35590)).setId(35663), IAssign(RefId(Id("""__x9__""")), EBOp(OPlus, ERef(RefId(Id("""__x9__"""))), EINum(1L))).setId(35669))).setId(35670)).setId(35671))).setId(35674), ISeq(List()).setId(35590)).setId(35675), IIf(EBOp(OEq, ERef(RefId(Id("""foundInB"""))), EBool(true)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(35677), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))).setId(35678), IReturn(ERef(RefId(Id("""__x17__""")))).setId(35679))).setId(35680), ISeq(List()).setId(35590)).setId(35681), IAccess(Id("""__x18__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""Evaluation""")).setId(35684), ILet(Id("""R"""), ERef(RefId(Id("""__x18__""")))).setId(35685), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35687), ISeq(List()).setId(35590)).setId(35689), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35691), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35692), IApp(Id("""__x21__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x20__"""))))).setId(35693), IApp(Id("""__x22__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x21__"""))))).setId(35694), IReturn(ERef(RefId(Id("""__x22__""")))).setId(35695))).setId(35696), ISeq(List()).setId(35590)).setId(35697), ILet(Id("""__x23__"""), ERef(RefId(Id("""B""")))).setId(35716), ILet(Id("""__x24__"""), EINum(0L)).setId(35717), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))).setId(35718), IAccess(Id("""__x25__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35700), ILet(Id("""R"""), ERef(RefId(Id("""__x25__""")))).setId(35701), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35703), ISeq(List()).setId(35590)).setId(35705), IApp(Id("""__x26__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35707), IIf(ERef(RefId(Id("""__x26__"""))), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35708), IApp(Id("""__x28__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x27__"""))))).setId(35709), IApp(Id("""__x29__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x28__"""))))).setId(35710), IReturn(ERef(RefId(Id("""__x29__""")))).setId(35711))).setId(35712), ISeq(List()).setId(35590)).setId(35713), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L))).setId(35719))).setId(35720)).setId(35721), IApp(Id("""__x30__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(35724), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x30__"""))))).setId(35725), IReturn(ERef(RefId(Id("""__x31__""")))).setId(35726))).setId(-1))
  /* Beautified form:
  "CaseBlock1CaseBlockEvaluation3" (this, CaseClauses0, DefaultClause, CaseClauses1, input) => {
    let V = undefined
    if (! (= CaseClauses0 absent)) let A = (get-elems CaseClauses0 CaseClause) else let A = (new [])
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
    let foundInB = false
    if (! (= CaseClauses1 absent)) let B = (get-elems CaseClauses1 CaseClause) else let B = (new [])
    if (= found false) {
      let __x8__ = B
      let __x9__ = 0i
      while (< __x9__ __x8__["length"]) {
        let C = __x8__[__x9__]
        if (= foundInB false) {
          app __x10__ = (CaseClauseIsSelected C input)
          if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          foundInB = __x10__
        } else {}
        if (= foundInB true) {
          access __x11__ = (C "Evaluation")
          let R = __x11__
          if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
          app __x12__ = (IsAbruptCompletion R)
          if __x12__ {
            app __x13__ = (UpdateEmpty R V)
            app __x14__ = (Completion __x13__)
            app __x15__ = (WrapCompletion __x14__)
            return __x15__
          } else {}
        } else {}
        __x9__ = (+ __x9__ 1i)
      }
    } else {}
    if (= foundInB true) {
      app __x16__ = (NormalCompletion V)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    access __x18__ = (DefaultClause "Evaluation")
    let R = __x18__
    if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
    app __x19__ = (IsAbruptCompletion R)
    if __x19__ {
      app __x20__ = (UpdateEmpty R V)
      app __x21__ = (Completion __x20__)
      app __x22__ = (WrapCompletion __x21__)
      return __x22__
    } else {}
    let __x23__ = B
    let __x24__ = 0i
    while (< __x24__ __x23__["length"]) {
      let C = __x23__[__x24__]
      access __x25__ = (C "Evaluation")
      let R = __x25__
      if (! (= R["Value"] CONST_empty)) V = R["Value"] else {}
      app __x26__ = (IsAbruptCompletion R)
      if __x26__ {
        app __x27__ = (UpdateEmpty R V)
        app __x28__ = (Completion __x27__)
        app __x29__ = (WrapCompletion __x28__)
        return __x29__
      } else {}
      __x24__ = (+ __x24__ 1i)
    }
    app __x30__ = (NormalCompletion V)
    app __x31__ = (WrapCompletion __x30__)
    return __x31__
  }
  */
}
