package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingRestElement1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement1IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(29724), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(29725), IReturn(ERef(RefId(Id("""__x0__""")))).setId(29726)).setId(29727), ISeq(List()).setId(29794)).setId(29729), ILet(Id("""A"""), ERef(RefId(Id("""__x0__""")))).setId(29730), ILet(Id("""n"""), EINum(0L)).setId(29732), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(29734), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))).setId(29735), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(29737), IIf(ERef(RefId(Id("""__x2__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29738), ISeq(List()).setId(29802)).setId(29740), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(29742), IReturn(ERef(RefId(Id("""next""")))).setId(29743)).setId(29744), ISeq(List()).setId(29807)).setId(29745), IExpr(ERef(RefId(Id("""next""")))).setId(29746), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29748), ISeq(List()).setId(29811)).setId(29750))).setId(29813), ISeq(List()).setId(29814)).setId(29753), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")).setId(29755), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""environment"""))))).setId(29756), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(29757), IReturn(ERef(RefId(Id("""__x5__""")))).setId(29758))).setId(29820), ISeq(List()).setId(29821)).setId(29761), IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(29763), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x6__""")))).setId(29764), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(29766), IIf(ERef(RefId(Id("""__x7__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29767), ISeq(List()).setId(29827)).setId(29769), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(29771), IReturn(ERef(RefId(Id("""nextValue""")))).setId(29772)).setId(29773), ISeq(List()).setId(29832)).setId(29774), IExpr(ERef(RefId(Id("""nextValue""")))).setId(29775), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(29777), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(29778), IReturn(ERef(RefId(Id("""__x8__""")))).setId(29779)).setId(29780), ISeq(List()).setId(29839)).setId(29781), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""nextValue"""))))).setId(29782), ILet(Id("""status"""), ERef(RefId(Id("""__x9__""")))).setId(29783), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(29785))).setId(29844)).setId(29788))).setId(29846))
  val instToStepMap: Map[Int, Int] = HashMap(29760 -> 14, 29745 -> 10, 29767 -> 17, 29757 -> 14, 29733 -> 1, 29729 -> 0, 29730 -> 0, 29765 -> 22, 29776 -> 22, 29728 -> 22, 29759 -> 14, 29753 -> 22, 29736 -> 10, 29770 -> 22, 29763 -> 22, 29749 -> 10, 29740 -> 10, 29788 -> 22, 29756 -> 14, 29784 -> 22, 29732 -> 1, 29739 -> 7, 29774 -> 22, 29750 -> 10, 29762 -> 22, 29746 -> 10, 29766 -> 22, 29783 -> 22, 29785 -> 22, 29758 -> 14, 29751 -> 10, 29738 -> 7, 29761 -> 22, 29775 -> 22, 29734 -> 10, 29782 -> 22, 29747 -> 10, 29764 -> 22, 29737 -> 10, 29769 -> 22, 29752 -> 10, 29735 -> 10, 29786 -> 22, 29724 -> 0, 29754 -> 22, 29787 -> 22, 29777 -> 22, 29768 -> 17, 29741 -> 10, 29748 -> 10, 29781 -> 22, 29731 -> 0, 29755 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(29729, 29730, 29724, 29731), 10 -> HashSet(29736, 29745, 29750, 29746, 29751, 29734, 29747, 29735, 29749, 29740, 29737, 29752, 29741, 29748), 14 -> HashSet(29760, 29756, 29757, 29758, 29759, 29755), 20 -> HashSet(29784, 29783, 29782, 29777, 29781), 1 -> HashSet(29732, 29733), 6 -> HashSet(29736, 29734, 29735), 21 -> HashSet(29728), 9 -> HashSet(29745, 29746, 29747), 17 -> HashSet(29767, 29768), 22 -> HashSet(29753, 29788, 29784, 29774, 29762, 29785, 29765, 29782, 29776, 29728, 29781, 29770, 29763, 29766, 29783, 29761, 29775, 29764, 29769, 29786, 29754, 29787, 29777), 7 -> HashSet(29739, 29738), 18 -> HashSet(29770, 29766, 29769), 16 -> HashSet(29763, 29765, 29764), 11 -> HashSet(29753, 29754), 8 -> HashSet(29740, 29737, 29741), 19 -> HashSet(29774, 29775, 29776), 15 -> HashSet(29762, 29761))
  /* Beautified form:
  "BindingRestElement1IteratorBindingInitialization0" (this, BindingPattern, iteratorRecord, environment) => {
    app __x0__ = (ArrayCreate 0i)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let A = __x0__
    let n = 0i
    while true {
      if (= iteratorRecord["Done"] false) {
        app __x1__ = (IteratorStep iteratorRecord)
        let next = __x1__
        app __x2__ = (IsAbruptCompletion next)
        if __x2__ iteratorRecord["Done"] = true else {}
        if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
        next
        if (= next false) iteratorRecord["Done"] = true else {}
      } else {}
      if (= iteratorRecord["Done"] true) {
        access __x3__ = (BindingPattern "BindingInitialization")
        app __x4__ = (__x3__ A environment)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      let nextValue = __x6__
      app __x7__ = (IsAbruptCompletion nextValue)
      if __x7__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x8__ = (ToString n)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (CreateDataProperty A __x8__ nextValue)
      let status = __x9__
      n = (+ n 1i)
    }
  }
  */
}
