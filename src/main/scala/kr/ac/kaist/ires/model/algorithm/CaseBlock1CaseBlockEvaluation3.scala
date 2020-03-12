package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1CaseBlockEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1CaseBlockEvaluation3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""input""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(35573), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ILet(Id("""A"""), EGetElems(ERef(RefId(Id("""CaseClauses0"""))), """CaseClause""")).setId(35576), ILet(Id("""A"""), EList(List())).setId(35579)).setId(35582), ILet(Id("""found"""), EBool(false)).setId(35584), ILet(Id("""__x0__"""), ERef(RefId(Id("""A""")))).setId(35617), ILet(Id("""__x1__"""), EINum(0L)).setId(35618), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(35619), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CaseClauseIsSelected"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""input"""))))).setId(35586), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(35587), IReturn(ERef(RefId(Id("""__x2__""")))).setId(35588)).setId(35589), ISeq(List()).setId(35741)).setId(35591), IAssign(RefId(Id("""found""")), ERef(RefId(Id("""__x2__""")))).setId(35592))).setId(35744), ISeq(List()).setId(35745)).setId(35595), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35598), ILet(Id("""R"""), ERef(RefId(Id("""__x3__""")))).setId(35599), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35601), ISeq(List()).setId(35750)).setId(35603), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35605), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35606), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(35607), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(35608), IReturn(ERef(RefId(Id("""__x7__""")))).setId(35609))).setId(35757), ISeq(List()).setId(35758)).setId(35611))).setId(35760), ISeq(List()).setId(35761)).setId(35614), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(35620))).setId(35764)).setId(35622), ILet(Id("""foundInB"""), EBool(false)).setId(35625), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent)), ILet(Id("""B"""), EGetElems(ERef(RefId(Id("""CaseClauses1"""))), """CaseClause""")).setId(35628), ILet(Id("""B"""), EList(List())).setId(35631)).setId(35634), IIf(EBOp(OEq, ERef(RefId(Id("""found"""))), EBool(false)), ISeq(List(ILet(Id("""__x8__"""), ERef(RefId(Id("""B""")))).setId(35666), ILet(Id("""__x9__"""), EINum(0L)).setId(35667), IWhile(EBOp(OLt, ERef(RefId(Id("""__x9__"""))), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x8__""")), ERef(RefId(Id("""__x9__""")))))).setId(35668), IIf(EBOp(OEq, ERef(RefId(Id("""foundInB"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""CaseClauseIsSelected"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""input"""))))).setId(35636), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(35637), IReturn(ERef(RefId(Id("""__x10__""")))).setId(35638)).setId(35639), ISeq(List()).setId(35777)).setId(35640), IAssign(RefId(Id("""foundInB""")), ERef(RefId(Id("""__x10__""")))).setId(35641))).setId(35780), ISeq(List()).setId(35781)).setId(35644), IIf(EBOp(OEq, ERef(RefId(Id("""foundInB"""))), EBool(true)), ISeq(List(IAccess(Id("""__x11__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35647), ILet(Id("""R"""), ERef(RefId(Id("""__x11__""")))).setId(35648), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35650), ISeq(List()).setId(35786)).setId(35652), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35654), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35655), IApp(Id("""__x14__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(35656), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x14__"""))))).setId(35657), IReturn(ERef(RefId(Id("""__x15__""")))).setId(35658))).setId(35793), ISeq(List()).setId(35794)).setId(35660))).setId(35796), ISeq(List()).setId(35797)).setId(35663), IAssign(RefId(Id("""__x9__""")), EBOp(OPlus, ERef(RefId(Id("""__x9__"""))), EINum(1L))).setId(35669))).setId(35800)).setId(35671))).setId(35802), ISeq(List()).setId(35803)).setId(35675), IIf(EBOp(OEq, ERef(RefId(Id("""foundInB"""))), EBool(true)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(35677), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))).setId(35678), IReturn(ERef(RefId(Id("""__x17__""")))).setId(35679))).setId(35808), ISeq(List()).setId(35809)).setId(35681), IAccess(Id("""__x18__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""Evaluation""")).setId(35684), ILet(Id("""R"""), ERef(RefId(Id("""__x18__""")))).setId(35685), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35687), ISeq(List()).setId(35814)).setId(35689), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35691), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35692), IApp(Id("""__x21__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x20__"""))))).setId(35693), IApp(Id("""__x22__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x21__"""))))).setId(35694), IReturn(ERef(RefId(Id("""__x22__""")))).setId(35695))).setId(35821), ISeq(List()).setId(35822)).setId(35697), ILet(Id("""__x23__"""), ERef(RefId(Id("""B""")))).setId(35716), ILet(Id("""__x24__"""), EINum(0L)).setId(35717), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))).setId(35718), IAccess(Id("""__x25__"""), ERef(RefId(Id("""C"""))), EStr("""Evaluation""")).setId(35700), ILet(Id("""R"""), ERef(RefId(Id("""__x25__""")))).setId(35701), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""R""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""R""")), EStr("""Value""")))).setId(35703), ISeq(List()).setId(35830)).setId(35705), IApp(Id("""__x26__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(35707), IIf(ERef(RefId(Id("""__x26__"""))), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""R"""))), ERef(RefId(Id("""V"""))))).setId(35708), IApp(Id("""__x28__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x27__"""))))).setId(35709), IApp(Id("""__x29__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x28__"""))))).setId(35710), IReturn(ERef(RefId(Id("""__x29__""")))).setId(35711))).setId(35837), ISeq(List()).setId(35838)).setId(35713), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L))).setId(35719))).setId(35841)).setId(35721), IApp(Id("""__x30__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(35724), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x30__"""))))).setId(35725), IReturn(ERef(RefId(Id("""__x31__""")))).setId(35726))).setId(35846))
  val instToStepMap: Map[Int, Int] = HashMap(35696 -> 47, 35651 -> 38, 35681 -> 43, 35606 -> 19, 35679 -> 42, 35649 -> 40, 35600 -> 19, 35634 -> 26, 35711 -> 54, 35574 -> 0, 35632 -> 26, 35647 -> 40, 35706 -> 54, 35674 -> 40, 35691 -> 48, 35602 -> 17, 35659 -> 40, 35688 -> 45, 35656 -> 40, 35713 -> 54, 35723 -> 54, 35591 -> 12, 35671 -> 40, 35584 -> 7, 35682 -> 43, 35703 -> 52, 35727 -> 55, 35623 -> 19, 35717 -> 54, 35611 -> 19, 35667 -> 40, 35596 -> 19, 35601 -> 17, 35653 -> 40, 35628 -> 23, 35643 -> 33, 35633 -> 26, 35635 -> 26, 35692 -> 47, 35680 -> 42, 35579 -> 6, 35618 -> 19, 35660 -> 40, 35603 -> 19, 35631 -> 26, 35586 -> 12, 35685 -> 44, 35675 -> 41, 35707 -> 54, 35650 -> 38, 35716 -> 54, 35614 -> 19, 35607 -> 19, 35687 -> 45, 35655 -> 40, 35642 -> 33, 35724 -> 55, 35592 -> 12, 35624 -> 19, 35595 -> 19, 35585 -> 7, 35698 -> 48, 35666 -> 40, 35610 -> 19, 35583 -> 6, 35664 -> 40, 35615 -> 19, 35617 -> 19, 35702 -> 54, 35576 -> 3, 35645 -> 40, 35708 -> 54, 35613 -> 19, 35725 -> 55, 35630 -> 23, 35609 -> 19, 35662 -> 40, 35641 -> 33, 35676 -> 41, 35604 -> 19, 35598 -> 19, 35657 -> 40, 35636 -> 33, 35701 -> 54, 35578 -> 3, 35694 -> 47, 35721 -> 54, 35626 -> 20, 35577 -> 3, 35689 -> 46, 35608 -> 19, 35594 -> 12, 35684 -> 44, 35582 -> 6, 35661 -> 40, 35640 -> 33, 35654 -> 40, 35712 -> 54, 35697 -> 48, 35665 -> 40, 35693 -> 47, 35599 -> 19, 35686 -> 44, 35695 -> 47, 35658 -> 40, 35714 -> 54, 35629 -> 23, 35663 -> 40, 35648 -> 40, 35616 -> 19, 35690 -> 46, 35705 -> 54, 35593 -> 12, 35573 -> 0, 35625 -> 20, 35704 -> 52, 35652 -> 40, 35672 -> 40, 35673 -> 40, 35710 -> 54, 35678 -> 42, 35709 -> 54, 35715 -> 54, 35700 -> 54, 35605 -> 19, 35677 -> 42, 35726 -> 55, 35581 -> 6, 35622 -> 19, 35580 -> 6, 35612 -> 19, 35722 -> 54, 35644 -> 40)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(35574, 35573), 52 -> HashSet(35703, 35704), 6 -> HashSet(35579, 35583, 35582, 35581, 35580), 53 -> HashSet(35706, 35705), 44 -> HashSet(35685, 35684, 35686), 3 -> HashSet(35576, 35578, 35577), 16 -> HashSet(35600, 35598, 35599), 43 -> HashSet(35681, 35682), 47 -> HashSet(35692, 35696, 35694, 35693, 35695), 42 -> HashSet(35679, 35680, 35678, 35677), 37 -> HashSet(35649, 35647, 35648), 20 -> HashSet(35626, 35625), 46 -> HashSet(35689, 35690), 38 -> HashSet(35650, 35651), 33 -> HashSet(35643, 35642, 35641, 35636, 35640), 13 -> HashSet(35596, 35595), 41 -> HashSet(35675, 35676), 34 -> HashSet(35645, 35644), 45 -> HashSet(35688, 35687), 17 -> HashSet(35602, 35601), 12 -> HashSet(35591, 35586, 35592, 35594, 35593), 54 -> HashSet(35717, 35702, 35708, 35701, 35721, 35712, 35714, 35705, 35710, 35722, 35711, 35706, 35713, 35723, 35707, 35716, 35709, 35715, 35700), 7 -> HashSet(35584, 35585), 39 -> HashSet(35653, 35652), 48 -> HashSet(35691, 35698, 35697), 18 -> HashSet(35603, 35604), 40 -> HashSet(35649, 35659, 35656, 35671, 35660, 35655, 35666, 35664, 35645, 35662, 35657, 35661, 35654, 35665, 35648, 35652, 35644, 35647, 35674, 35667, 35653, 35658, 35663, 35672, 35673), 26 -> HashSet(35634, 35632, 35633, 35635, 35631), 55 -> HashSet(35727, 35724, 35725, 35726), 23 -> HashSet(35628, 35630, 35629), 51 -> HashSet(35702, 35701, 35700), 19 -> HashSet(35596, 35613, 35609, 35608, 35599, 35616, 35605, 35606, 35600, 35611, 35623, 35618, 35603, 35614, 35607, 35624, 35595, 35610, 35617, 35615, 35604, 35598, 35622, 35612))
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
