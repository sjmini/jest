package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakSetDOTprototypeDOThas {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakSet.prototype.has""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87635), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(87636), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(87638), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""WeakSetData"""))).setId(87640), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87641), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87642)).setId(87643), ISeq(List()).setId(87688)).setId(87645), IExpr(ERef(RefId(Id("""__x1__""")))).setId(87646), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""WeakSetData""")))).setId(87648), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(87650), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(87651), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87652))).setId(87695), ISeq(List()).setId(87696)).setId(87654), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(87669), ILet(Id("""__x5__"""), EINum(0L)).setId(87670), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(87671), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(87661), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(87656), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(87659))).setId(87704), ISeq(List()).setId(87705)).setId(87662), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(87663), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87664))).setId(87709), ISeq(List()).setId(87710)).setId(87666), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(87672))).setId(87713)).setId(87674), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(87677), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87678))).setId(87717))
  val instToStepMap: Map[Int, Int] = HashMap(87675 -> 8, 87647 -> 2, 87635 -> 0, 87667 -> 8, 87646 -> 2, 87645 -> 2, 87668 -> 8, 87663 -> 8, 87648 -> 3, 87654 -> 5, 87676 -> 8, 87670 -> 8, 87655 -> 5, 87638 -> 1, 87678 -> 9, 87661 -> 8, 87652 -> 4, 87674 -> 8, 87639 -> 1, 87649 -> 3, 87636 -> 0, 87664 -> 8, 87677 -> 9, 87640 -> 2, 87665 -> 8, 87650 -> 5, 87653 -> 4, 87637 -> 0, 87662 -> 8, 87666 -> 8, 87651 -> 4, 87679 -> 9, 87669 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87635, 87636, 87637), 5 -> HashSet(87655, 87650, 87654), 1 -> HashSet(87638, 87639), 9 -> HashSet(87678, 87677, 87679), 2 -> HashSet(87647, 87646, 87645, 87640), 3 -> HashSet(87649, 87648), 8 -> HashSet(87670, 87675, 87667, 87668, 87664, 87665, 87663, 87662, 87676, 87666, 87669, 87661, 87674), 4 -> HashSet(87652, 87653, 87651))
  /* Beautified form:
  "GLOBAL.WeakSet.prototype.has" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "WeakSetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = S["WeakSetData"]
    app __x2__ = (Type value)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    let __x4__ = entries
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let e = __x4__[__x5__]
      let __x6__ = (! (= e CONST_empty))
      if __x6__ {
        app __x7__ = (SameValue e value)
        __x6__ = (= __x7__ true)
      } else {}
      if __x6__ {
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion false)
    return __x9__
  }
  */
}
