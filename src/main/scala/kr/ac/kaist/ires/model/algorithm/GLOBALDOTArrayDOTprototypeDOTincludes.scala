package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTincludes {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.includes""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78749), ILet(Id("""searchElement"""), ERef(RefId(Id("""__x0__""")))).setId(78750), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78752), ILet(Id("""fromIndex"""), ERef(RefId(Id("""__x1__""")))).setId(78753), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(78755), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(78756), IReturn(ERef(RefId(Id("""__x2__""")))).setId(78757)).setId(78758), ISeq(List()).setId(78833)).setId(78760), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(78761), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(78763), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(78764), IReturn(ERef(RefId(Id("""__x3__""")))).setId(78765)).setId(78766), ISeq(List()).setId(78840)).setId(78767), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(78768), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(78770), IReturn(ERef(RefId(Id("""__x4__""")))).setId(78771))).setId(78845), ISeq(List()).setId(78846)).setId(78773), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fromIndex"""))))).setId(78775), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(78776), IReturn(ERef(RefId(Id("""__x5__""")))).setId(78777)).setId(78778), ISeq(List()).setId(78852)).setId(78779), ILet(Id("""n"""), ERef(RefId(Id("""__x5__""")))).setId(78780), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), EINum(0L))), ILet(Id("""k"""), ERef(RefId(Id("""n""")))).setId(78782), ISeq(List(ILet(Id("""k"""), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""n"""))))).setId(78785), IIf(EBOp(OLt, ERef(RefId(Id("""k"""))), EINum(0L)), IAssign(RefId(Id("""k""")), EINum(0L)).setId(78787), ISeq(List()).setId(78858)).setId(78789))).setId(78860)).setId(78792), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(78794), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(78795), IReturn(ERef(RefId(Id("""__x6__""")))).setId(78796)).setId(78797), ISeq(List()).setId(78866)).setId(78798), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x6__"""))))).setId(78799), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(78804), IReturn(ERef(RefId(Id("""__x7__""")))).setId(78805)).setId(78806), ISeq(List()).setId(78872)).setId(78807), ILet(Id("""elementK"""), ERef(RefId(Id("""__x7__""")))).setId(78808), IApp(Id("""__x8__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefId(Id("""searchElement"""))), ERef(RefId(Id("""elementK"""))))).setId(78810), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(78811), IReturn(ERef(RefId(Id("""__x9__""")))).setId(78812))).setId(78878), ISeq(List()).setId(78879)).setId(78814), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(78816))).setId(78882)).setId(78819), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(78821), IReturn(ERef(RefId(Id("""__x10__""")))).setId(78822))).setId(78886))
  val instToStepMap: Map[Int, Int] = HashMap(78773 -> 5, 78769 -> 3, 78799 -> 21, 78751 -> 0, 78775 -> 6, 78784 -> 10, 78774 -> 5, 78787 -> 14, 78752 -> 1, 78823 -> 22, 78767 -> 3, 78759 -> 7, 78816 -> 21, 78809 -> 21, 78770 -> 4, 78791 -> 14, 78819 -> 21, 78755 -> 2, 78798 -> 21, 78812 -> 19, 78815 -> 21, 78780 -> 6, 78763 -> 3, 78818 -> 21, 78749 -> 0, 78768 -> 3, 78790 -> 14, 78781 -> 6, 78822 -> 22, 78817 -> 21, 78786 -> 14, 78754 -> 1, 78813 -> 19, 78772 -> 4, 78750 -> 0, 78789 -> 14, 78821 -> 22, 78808 -> 21, 78810 -> 21, 78785 -> 14, 78753 -> 1, 78783 -> 10, 78788 -> 14, 78792 -> 14, 78793 -> 14, 78761 -> 2, 78820 -> 21, 78771 -> 4, 78807 -> 21, 78782 -> 10, 78760 -> 2, 78794 -> 21, 78779 -> 6, 78811 -> 19, 78762 -> 2, 78814 -> 21)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(78749, 78750, 78751), 5 -> HashSet(78774, 78773), 10 -> HashSet(78784, 78783, 78782), 14 -> HashSet(78787, 78791, 78790, 78786, 78789, 78785, 78788, 78792, 78793), 20 -> HashSet(78815, 78810, 78814), 1 -> HashSet(78752, 78754, 78753), 6 -> HashSet(78780, 78781, 78775, 78779), 21 -> HashSet(78819, 78818, 78817, 78799, 78794, 78814, 78816, 78809, 78798, 78815, 78808, 78810, 78820, 78807), 13 -> HashSet(78786, 78785), 2 -> HashSet(78755, 78761, 78760, 78762), 22 -> HashSet(78823, 78822, 78821), 7 -> HashSet(78759), 3 -> HashSet(78767, 78763, 78768, 78769), 18 -> HashSet(78809, 78798, 78799, 78808, 78807, 78794), 19 -> HashSet(78812, 78813, 78811), 4 -> HashSet(78770, 78772, 78771))
  /* Beautified form:
  "GLOBAL.Array.prototype.includes" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchElement = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fromIndex = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    if (= len 0i) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (ToInteger fromIndex)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let n = __x5__
    if (! (< n 0i)) let k = n else {
      let k = (+ len n)
      if (< k 0i) k = 0i else {}
    }
    while (< k len) {
      app __x6__ = (ToString k)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (Get O __x6__)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let elementK = __x7__
      app __x8__ = (SameValueZero searchElement elementK)
      if (= __x8__ true) {
        app __x9__ = (WrapCompletion true)
        return __x9__
      } else {}
      k = (+ k 1i)
    }
    app __x10__ = (WrapCompletion false)
    return __x10__
  }
  */
}
