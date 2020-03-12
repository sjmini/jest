package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedExoticObject.DefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(56720), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(56721), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(56722), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56723)).setId(56724), ISeq(List()).setId(56808)).setId(56725), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x1__""")))).setId(56726), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""numericIndex"""))))).setId(56728), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56729), IReturn(ERef(RefId(Id("""__x3__""")))).setId(56730))).setId(56814), ISeq(List()).setId(56815)).setId(56732), IIf(EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56734), IReturn(ERef(RefId(Id("""__x4__""")))).setId(56735))).setId(56819), ISeq(List()).setId(56820)).setId(56737), IIf(EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), EINum(0L)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56739), IReturn(ERef(RefId(Id("""__x5__""")))).setId(56740))).setId(56824), ISeq(List()).setId(56825)).setId(56742), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(56744), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), ERef(RefId(Id("""length"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56746), IReturn(ERef(RefId(Id("""__x6__""")))).setId(56747))).setId(56830), ISeq(List()).setId(56831)).setId(56749), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(56751), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56752), IReturn(ERef(RefId(Id("""__x8__""")))).setId(56753))).setId(56836), ISeq(List()).setId(56837)).setId(56755), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(true))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56757), IReturn(ERef(RefId(Id("""__x9__""")))).setId(56758))).setId(56841), ISeq(List()).setId(56842)).setId(56760), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EBool(false))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56762), IReturn(ERef(RefId(Id("""__x10__""")))).setId(56763))).setId(56846), ISeq(List()).setId(56847)).setId(56765), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56767), IReturn(ERef(RefId(Id("""__x11__""")))).setId(56768))).setId(56851), ISeq(List()).setId(56852)).setId(56770), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))).setId(56772), IApp(Id("""__x12__"""), ERef(RefId(Id("""IntegerIndexedElementSet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""numericIndex"""))), ERef(RefId(Id("""value"""))))).setId(56774), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(56775), IReturn(ERef(RefId(Id("""__x12__""")))).setId(56776)).setId(56777), ISeq(List()).setId(56859)).setId(56778), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(56779), IReturn(ERef(RefId(Id("""__x13__""")))).setId(56780))).setId(56863), ISeq(List()).setId(56864)).setId(56783), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(56785), IReturn(ERef(RefId(Id("""__x14__""")))).setId(56786))).setId(56868), ISeq(List()).setId(56869)).setId(56789))).setId(56871), ISeq(List()).setId(56872)).setId(56792), IApp(Id("""__x15__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(56794), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(56795), IReturn(ERef(RefId(Id("""__x15__""")))).setId(56796)).setId(56797), ISeq(List()).setId(56878)).setId(56798), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(56799), IReturn(ERef(RefId(Id("""__x16__""")))).setId(56800))).setId(56882))
  val instToStepMap: Map[Int, Int] = HashMap(56739 -> 11, 56734 -> 9, 56726 -> 29, 56740 -> 11, 56728 -> 29, 56745 -> 29, 56771 -> 29, 56798 -> 31, 56766 -> 29, 56790 -> 29, 56779 -> 27, 56758 -> 18, 56754 -> 16, 56786 -> 29, 56747 -> 14, 56765 -> 29, 56772 -> 27, 56743 -> 29, 56787 -> 29, 56730 -> 7, 56755 -> 29, 56782 -> 27, 56733 -> 29, 56794 -> 31, 56750 -> 29, 56720 -> 30, 56762 -> 20, 56744 -> 29, 56752 -> 16, 56727 -> 29, 56784 -> 29, 56729 -> 7, 56801 -> 31, 56746 -> 14, 56769 -> 22, 56788 -> 29, 56768 -> 22, 56736 -> 9, 56761 -> 29, 56791 -> 29, 56781 -> 27, 56749 -> 29, 56778 -> 27, 56793 -> 30, 56759 -> 18, 56756 -> 29, 56732 -> 29, 56719 -> 1, 56773 -> 27, 56737 -> 29, 56760 -> 29, 56800 -> 31, 56783 -> 29, 56751 -> 29, 56741 -> 11, 56764 -> 20, 56735 -> 9, 56792 -> 30, 56721 -> 29, 56780 -> 27, 56738 -> 29, 56757 -> 18, 56731 -> 7, 56774 -> 27, 56763 -> 20, 56789 -> 29, 56725 -> 29, 56799 -> 31, 56753 -> 16, 56742 -> 29, 56767 -> 22, 56770 -> 29, 56748 -> 14, 56785 -> 29)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56719), 10 -> HashSet(56737, 56738), 14 -> HashSet(56747, 56746, 56748), 1 -> HashSet(56719), 9 -> HashSet(56734, 56736, 56735), 13 -> HashSet(56744, 56745), 17 -> HashSet(56755, 56756, 56751), 12 -> HashSet(56743, 56742), 7 -> HashSet(56730, 56729, 56731), 18 -> HashSet(56758, 56759, 56757), 11 -> HashSet(56739, 56740, 56741), 8 -> HashSet(56733, 56732, 56728), 4 -> HashSet(56726, 56727, 56721, 56725), 15 -> HashSet(56750, 56749), 20 -> HashSet(56762, 56764, 56763), 29 -> HashSet(56790, 56786, 56726, 56755, 56744, 56788, 56732, 56728, 56745, 56789, 56725, 56771, 56766, 56765, 56743, 56787, 56733, 56750, 56727, 56784, 56761, 56791, 56756, 56749, 56737, 56760, 56783, 56751, 56721, 56738, 56742, 56770, 56785), 28 -> HashSet(56784, 56783), 21 -> HashSet(56766, 56765), 22 -> HashSet(56767, 56769, 56768), 27 -> HashSet(56779, 56772, 56782, 56773, 56780, 56774, 56781, 56778), 16 -> HashSet(56754, 56752, 56753), 31 -> HashSet(56798, 56794, 56801, 56800, 56799), 26 -> HashSet(56772, 56773), 23 -> HashSet(56771, 56770), 30 -> HashSet(56720, 56793, 56792), 19 -> HashSet(56761, 56760))
  /* Beautified form:
  "IntegerIndexedExoticObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (Type P)
    if (= __x0__ String) {
      app __x1__ = (CanonicalNumericIndexString P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numericIndex = __x1__
      if (! (= numericIndex undefined)) {
        app __x2__ = (IsInteger numericIndex)
        if (= __x2__ false) {
          app __x3__ = (WrapCompletion false)
          return __x3__
        } else {}
        if (= numericIndex -0.0) {
          app __x4__ = (WrapCompletion false)
          return __x4__
        } else {}
        if (< numericIndex 0i) {
          app __x5__ = (WrapCompletion false)
          return __x5__
        } else {}
        let length = O["ArrayLength"]
        if (! (< numericIndex length)) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        app __x7__ = (IsAccessorDescriptor Desc)
        if (= __x7__ true) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        if (&& (! (= Desc["Configurable"] absent)) (= Desc["Configurable"] true)) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (&& (! (= Desc["Enumerable"] absent)) (= Desc["Enumerable"] false)) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] false)) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
        if (! (= Desc["Value"] absent)) {
          let value = Desc["Value"]
          app __x12__ = (IntegerIndexedElementSet O numericIndex value)
          if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          app __x13__ = (WrapCompletion __x12__)
          return __x13__
        } else {}
        app __x14__ = (WrapCompletion true)
        return __x14__
      } else {}
    } else {}
    app __x15__ = (OrdinaryDefineOwnProperty O P Desc)
    if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
