package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTof {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.of""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""len"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(75708), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(75710), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(75712), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(75714), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""len"""))))))).setId(75715), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(75716), IReturn(ERef(RefId(Id("""__x1__""")))).setId(75717)).setId(75718), ISeq(List()).setId(75776)).setId(75720), ILet(Id("""A"""), ERef(RefId(Id("""__x1__""")))).setId(75721))).setId(75779), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""len"""))))).setId(75724), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(75725), IReturn(ERef(RefId(Id("""__x2__""")))).setId(75726)).setId(75727), ISeq(List()).setId(75784)).setId(75728), ILet(Id("""A"""), ERef(RefId(Id("""__x2__""")))).setId(75729))).setId(75787)).setId(75732), ILet(Id("""k"""), EINum(0L)).setId(75734), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(ILet(Id("""kValue"""), ERef(RefProp(RefId(Id("""items""")), ERef(RefId(Id("""k""")))))).setId(75736), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(75738), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(75739), IReturn(ERef(RefId(Id("""__x3__""")))).setId(75740)).setId(75741), ISeq(List()).setId(75795)).setId(75742), ILet(Id("""Pk"""), ERef(RefId(Id("""__x3__""")))).setId(75743), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""kValue"""))))).setId(75745), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(75746), IReturn(ERef(RefId(Id("""__x4__""")))).setId(75747)).setId(75748), ISeq(List()).setId(75802)).setId(75749), IExpr(ERef(RefId(Id("""__x4__""")))).setId(75750), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(75752))).setId(75806)).setId(75755), IApp(Id("""__x5__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""len"""))), EBool(true))).setId(75757), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(75758), IReturn(ERef(RefId(Id("""__x5__""")))).setId(75759)).setId(75760), ISeq(List()).setId(75812)).setId(75761), IExpr(ERef(RefId(Id("""__x5__""")))).setId(75762), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(75764), IReturn(ERef(RefId(Id("""__x6__""")))).setId(75765))).setId(75817))
  val instToStepMap: Map[Int, Int] = HashMap(75737 -> 16, 75757 -> 17, 75745 -> 16, 75734 -> 9, 75753 -> 16, 75721 -> 5, 75712 -> 2, 75715 -> 5, 75751 -> 16, 75761 -> 17, 75756 -> 16, 75742 -> 16, 75735 -> 9, 75749 -> 16, 75713 -> 2, 75710 -> 1, 75738 -> 16, 75766 -> 18, 75711 -> 1, 75763 -> 17, 75720 -> 5, 75752 -> 16, 75731 -> 8, 75733 -> 8, 75765 -> 18, 75743 -> 16, 75732 -> 8, 75764 -> 18, 75708 -> 0, 75754 -> 16, 75744 -> 16, 75722 -> 5, 75736 -> 16, 75730 -> 8, 75762 -> 17, 75755 -> 16, 75723 -> 5, 75728 -> 8, 75714 -> 8, 75709 -> 0, 75750 -> 16, 75729 -> 8, 75724 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(75708, 75709), 5 -> HashSet(75721, 75720, 75722, 75715, 75723), 14 -> HashSet(75742, 75738, 75743, 75744), 1 -> HashSet(75710, 75711), 9 -> HashSet(75735, 75734), 13 -> HashSet(75737, 75736), 2 -> HashSet(75713, 75712), 17 -> HashSet(75757, 75763, 75762, 75761), 18 -> HashSet(75766, 75765, 75764), 16 -> HashSet(75737, 75742, 75745, 75749, 75753, 75738, 75752, 75743, 75754, 75744, 75736, 75755, 75751, 75756, 75750), 8 -> HashSet(75732, 75730, 75728, 75714, 75731, 75733, 75729, 75724), 15 -> HashSet(75745, 75749, 75751, 75750))
  /* Beautified form:
  "GLOBAL.Array.of" (this, argumentsList, NewTarget) => {
    let len = argumentsList["length"]
    let items = argumentsList
    let C = this
    app __x0__ = (IsConstructor C)
    if (= __x0__ true) {
      app __x1__ = (Construct C (new [len]))
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let A = __x1__
    } else {
      app __x2__ = (ArrayCreate len)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let A = __x2__
    }
    let k = 0i
    while (< k len) {
      let kValue = items[k]
      app __x3__ = (ToString k)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let Pk = __x3__
      app __x4__ = (CreateDataPropertyOrThrow A Pk kValue)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      k = (+ k 1i)
    }
    app __x5__ = (Set A "length" len true)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion A)
    return __x6__
  }
  */
}
