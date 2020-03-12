package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakMapDOTprototypeDOTdelete {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakMap.prototype.delete""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(86636), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(86637), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(86639), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""WeakMapData"""))).setId(86641), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(86642), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86643)).setId(86644), ISeq(List()).setId(86694)).setId(86646), IExpr(ERef(RefId(Id("""__x1__""")))).setId(86647), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""WeakMapData""")))).setId(86649), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(86651), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86652), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86653))).setId(86701), ISeq(List()).setId(86702)).setId(86655), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(86675), ILet(Id("""__x5__"""), EINum(0L)).setId(86676), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(86677), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(86662), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(86657), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(86660))).setId(86710), ISeq(List()).setId(86711)).setId(86663), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Key""")), ERef(RefId(Id("""CONST_empty""")))).setId(86664), IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""CONST_empty""")))).setId(86666), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(86668), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86669))).setId(86717), ISeq(List()).setId(86718)).setId(86672), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(86678))).setId(86721)).setId(86680), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86683), IReturn(ERef(RefId(Id("""__x9__""")))).setId(86684))).setId(86725))
  val instToStepMap: Map[Int, Int] = HashMap(86681 -> 12, 86671 -> 12, 86648 -> 2, 86665 -> 12, 86638 -> 0, 86646 -> 2, 86651 -> 5, 86664 -> 12, 86675 -> 12, 86640 -> 1, 86684 -> 13, 86667 -> 12, 86649 -> 3, 86680 -> 12, 86653 -> 4, 86641 -> 2, 86676 -> 12, 86673 -> 12, 86662 -> 12, 86683 -> 13, 86666 -> 12, 86656 -> 5, 86639 -> 1, 86670 -> 12, 86652 -> 4, 86682 -> 12, 86655 -> 5, 86663 -> 12, 86674 -> 12, 86669 -> 12, 86668 -> 12, 86654 -> 4, 86637 -> 0, 86636 -> 0, 86672 -> 12, 86650 -> 3, 86685 -> 13, 86647 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86638, 86637, 86636), 5 -> HashSet(86656, 86655, 86651), 10 -> HashSet(86665, 86664), 1 -> HashSet(86640, 86639), 13 -> HashSet(86684, 86683, 86685), 2 -> HashSet(86641, 86648, 86646, 86647), 12 -> HashSet(86667, 86680, 86676, 86681, 86671, 86666, 86665, 86670, 86668, 86664, 86675, 86672, 86673, 86662, 86682, 86663, 86674, 86669), 3 -> HashSet(86649, 86650), 11 -> HashSet(86667, 86666), 4 -> HashSet(86653, 86652, 86654))
  /* Beautified form:
  "GLOBAL.WeakMap.prototype.delete" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (RequireInternalSlot M "WeakMapData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = M["WeakMapData"]
    app __x2__ = (Type key)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    let __x4__ = entries
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let p = __x4__[__x5__]
      let __x6__ = (! (= p["Key"] CONST_empty))
      if __x6__ {
        app __x7__ = (SameValue p["Key"] key)
        __x6__ = (= __x7__ true)
      } else {}
      if __x6__ {
        p["Key"] = CONST_empty
        p["Value"] = CONST_empty
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
