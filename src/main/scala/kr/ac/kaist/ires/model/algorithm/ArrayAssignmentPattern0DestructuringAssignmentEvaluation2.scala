package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayAssignmentPattern0DestructuringAssignmentEvaluation2 {
  val length: Int = 0
  val func: Func = Func("""ArrayAssignmentPattern0DestructuringAssignmentEvaluation2""", List(Id("""this"""), Id("""Elision"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))).setId(23702), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23703), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23704)).setId(23705), ISeq(List()).setId(23732)).setId(23707), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(23708), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(23710), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(23711), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(23712), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(23714), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(23715), IReturn(ERef(RefId(Id("""__x3__""")))).setId(23716)).setId(23717), ISeq(List()).setId(23742)).setId(23718), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(23719), IReturn(ERef(RefId(Id("""__x4__""")))).setId(23720))).setId(23746), ISeq(List()).setId(23747)).setId(23722), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(23724), IReturn(ERef(RefId(Id("""__x5__""")))).setId(23725))).setId(23751))
  val instToStepMap: Map[Int, Int] = HashMap(23708 -> 0, 23712 -> 1, 23725 -> 4, 23702 -> 0, 23709 -> 0, 23726 -> 4, 23710 -> 1, 23714 -> 2, 23724 -> 4, 23707 -> 0, 23711 -> 1, 23713 -> 1, 23720 -> 2, 23721 -> 2, 23722 -> 3, 23719 -> 2, 23718 -> 2, 23723 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(23707, 23708, 23702, 23709), 1 -> HashSet(23712, 23710, 23711, 23713), 2 -> HashSet(23719, 23718, 23714, 23720, 23721), 3 -> HashSet(23722, 23723), 4 -> HashSet(23724, 23725, 23726))
  /* Beautified form:
  "ArrayAssignmentPattern0DestructuringAssignmentEvaluation2" (this, Elision, value) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ iteratorRecord)
    let result = __x2__
    if (= iteratorRecord["Done"] false) {
      app __x3__ = (IteratorClose iteratorRecord result)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion result)
    return __x5__
  }
  */
}
