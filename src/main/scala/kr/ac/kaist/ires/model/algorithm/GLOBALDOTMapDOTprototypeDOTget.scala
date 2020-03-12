package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMapDOTprototypeDOTget {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Map.prototype.get""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(84736), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(84737), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84739), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(84741), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(84742), IReturn(ERef(RefId(Id("""__x1__""")))).setId(84743)).setId(84744), ISeq(List()).setId(84783)).setId(84746), IExpr(ERef(RefId(Id("""__x1__""")))).setId(84747), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(84749), ILet(Id("""__x2__"""), ERef(RefId(Id("""entries""")))).setId(84764), ILet(Id("""__x3__"""), EINum(0L)).setId(84765), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(84766), ILet(Id("""__x4__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(84756), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(84751), IAssign(RefId(Id("""__x4__""")), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true))).setId(84754))).setId(84793), ISeq(List()).setId(84794)).setId(84757), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Value"""))))).setId(84758), IReturn(ERef(RefId(Id("""__x6__""")))).setId(84759))).setId(84798), ISeq(List()).setId(84799)).setId(84761), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(84767))).setId(84802)).setId(84769), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(84772), IReturn(ERef(RefId(Id("""__x7__""")))).setId(84773))).setId(84806))
  val instToStepMap: Map[Int, Int] = HashMap(84774 -> 7, 84749 -> 3, 84772 -> 7, 84758 -> 6, 84763 -> 6, 84746 -> 2, 84739 -> 1, 84764 -> 6, 84747 -> 2, 84761 -> 6, 84737 -> 0, 84740 -> 1, 84741 -> 2, 84762 -> 6, 84759 -> 6, 84773 -> 7, 84771 -> 6, 84750 -> 3, 84757 -> 6, 84748 -> 2, 84770 -> 6, 84738 -> 0, 84765 -> 6, 84769 -> 6, 84760 -> 6, 84736 -> 0, 84756 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(84738, 84737, 84736), 1 -> HashSet(84740, 84739), 6 -> HashSet(84762, 84759, 84758, 84763, 84764, 84761, 84756, 84771, 84757, 84770, 84765, 84769, 84760), 2 -> HashSet(84741, 84746, 84747, 84748), 7 -> HashSet(84774, 84773, 84772), 3 -> HashSet(84749, 84750))
  /* Beautified form:
  "GLOBAL.Map.prototype.get" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = M["MapData"]
    let __x2__ = entries
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let p = __x2__[__x3__]
      let __x4__ = (! (= p["Key"] CONST_empty))
      if __x4__ {
        app __x5__ = (SameValueZero p["Key"] key)
        __x4__ = (= __x5__ true)
      } else {}
      if __x4__ {
        app __x6__ = (WrapCompletion p["Value"])
        return __x6__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x7__ = (WrapCompletion undefined)
    return __x7__
  }
  */
}
