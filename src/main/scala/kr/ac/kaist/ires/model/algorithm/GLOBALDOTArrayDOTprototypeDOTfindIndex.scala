package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTfindIndex {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.findIndex""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(77724), ILet(Id("""predicate"""), ERef(RefId(Id("""__x0__""")))).setId(77725), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(77727), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(77728), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(77730), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(77731), IReturn(ERef(RefId(Id("""__x2__""")))).setId(77732)).setId(77733), ISeq(List()).setId(77807)).setId(77735), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(77736), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(77738), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(77739), IReturn(ERef(RefId(Id("""__x3__""")))).setId(77740)).setId(77741), ISeq(List()).setId(77814)).setId(77742), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(77743), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""predicate"""))))).setId(77745), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(77746), IReturn(ERef(RefId(Id("""__x5__""")))).setId(77747))).setId(77820), ISeq(List()).setId(77821)).setId(77749), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(77751), ILet(Id("""T"""), EUndef).setId(77753)).setId(77755), ILet(Id("""k"""), EINum(0L)).setId(77757), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(77759), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(77760), IReturn(ERef(RefId(Id("""__x6__""")))).setId(77761)).setId(77762), ISeq(List()).setId(77831)).setId(77763), ILet(Id("""Pk"""), ERef(RefId(Id("""__x6__""")))).setId(77764), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(77766), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(77767), IReturn(ERef(RefId(Id("""__x7__""")))).setId(77768)).setId(77769), ISeq(List()).setId(77838)).setId(77770), ILet(Id("""kValue"""), ERef(RefId(Id("""__x7__""")))).setId(77771), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""predicate"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(77773), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(77774), IReturn(ERef(RefId(Id("""__x8__""")))).setId(77775)).setId(77776), ISeq(List()).setId(77845)).setId(77777), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(77778), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(77779), IReturn(ERef(RefId(Id("""__x9__""")))).setId(77780)).setId(77781), ISeq(List()).setId(77851)).setId(77782), ILet(Id("""testResult"""), ERef(RefId(Id("""__x9__""")))).setId(77783), IIf(EBOp(OEq, ERef(RefId(Id("""testResult"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""k"""))))).setId(77785), IReturn(ERef(RefId(Id("""__x10__""")))).setId(77786))).setId(77856), ISeq(List()).setId(77857)).setId(77788), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(77790))).setId(77860)).setId(77793), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(77795), IReturn(ERef(RefId(Id("""__x11__""")))).setId(77796))).setId(77864))
  val instToStepMap: Map[Int, Int] = HashMap(77772 -> 16, 77748 -> 4, 77725 -> 0, 77737 -> 2, 77747 -> 4, 77758 -> 7, 77791 -> 16, 77766 -> 16, 77788 -> 16, 77745 -> 5, 77743 -> 3, 77753 -> 6, 77793 -> 16, 77765 -> 16, 77797 -> 17, 77729 -> 1, 77786 -> 14, 77754 -> 6, 77789 -> 16, 77757 -> 7, 77783 -> 16, 77751 -> 6, 77764 -> 16, 77755 -> 6, 77790 -> 16, 77738 -> 3, 77736 -> 2, 77787 -> 14, 77770 -> 16, 77796 -> 17, 77773 -> 16, 77726 -> 0, 77750 -> 5, 77763 -> 16, 77782 -> 16, 77792 -> 16, 77746 -> 4, 77728 -> 1, 77795 -> 17, 77778 -> 16, 77735 -> 2, 77784 -> 16, 77771 -> 16, 77752 -> 6, 77759 -> 16, 77727 -> 1, 77742 -> 3, 77756 -> 6, 77794 -> 16, 77724 -> 0, 77777 -> 16, 77744 -> 3, 77749 -> 5, 77730 -> 2, 77785 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(77725, 77726, 77724), 5 -> HashSet(77750, 77749, 77745), 14 -> HashSet(77786, 77787, 77785), 1 -> HashSet(77729, 77728, 77727), 6 -> HashSet(77753, 77754, 77751, 77755, 77752, 77756), 13 -> HashSet(77783, 77773, 77782, 77778, 77784, 77777), 2 -> HashSet(77737, 77736, 77735, 77730), 17 -> HashSet(77797, 77796, 77795), 12 -> HashSet(77772, 77770, 77771, 77766), 7 -> HashSet(77757, 77758), 3 -> HashSet(77738, 77742, 77744, 77743), 16 -> HashSet(77772, 77793, 77765, 77789, 77783, 77764, 77790, 77763, 77778, 77791, 77759, 77794, 77766, 77777, 77788, 77770, 77773, 77782, 77792, 77784, 77771), 11 -> HashSet(77765, 77764, 77763, 77759), 4 -> HashSet(77748, 77747, 77746), 15 -> HashSet(77789, 77788))
  /* Beautified form:
  "GLOBAL.Array.prototype.findIndex" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let predicate = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable predicate)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    let k = 0i
    while (< k len) {
      app __x6__ = (ToString k)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let Pk = __x6__
      app __x7__ = (Get O Pk)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let kValue = __x7__
      app __x8__ = (Call predicate T (new [kValue, k, O]))
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (ToBoolean __x8__)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let testResult = __x9__
      if (= testResult true) {
        app __x10__ = (WrapCompletion k)
        return __x10__
      } else {}
      k = (+ k 1i)
    }
    app __x11__ = (WrapCompletion (- 1i))
    return __x11__
  }
  */
}
