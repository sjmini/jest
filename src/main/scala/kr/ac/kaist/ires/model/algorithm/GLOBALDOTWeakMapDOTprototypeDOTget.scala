package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakMapDOTprototypeDOTget {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakMap.prototype.get""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(86765), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(86766), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(86768), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""WeakMapData"""))).setId(86770), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(86771), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86772)).setId(86773), ISeq(List()).setId(86818)).setId(86775), IExpr(ERef(RefId(Id("""__x1__""")))).setId(86776), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""WeakMapData""")))).setId(86778), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(86780), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(86781), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86782))).setId(86825), ISeq(List()).setId(86826)).setId(86784), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(86799), ILet(Id("""__x5__"""), EINum(0L)).setId(86800), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(86801), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(86791), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(86786), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(86789))).setId(86834), ISeq(List()).setId(86835)).setId(86792), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Value"""))))).setId(86793), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86794))).setId(86839), ISeq(List()).setId(86840)).setId(86796), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(86802))).setId(86843)).setId(86804), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(86807), IReturn(ERef(RefId(Id("""__x9__""")))).setId(86808))).setId(86847))
  val instToStepMap: Map[Int, Int] = HashMap(86781 -> 4, 86775 -> 2, 86765 -> 0, 86807 -> 9, 86766 -> 0, 86805 -> 8, 86809 -> 9, 86799 -> 8, 86791 -> 8, 86800 -> 8, 86780 -> 5, 86768 -> 1, 86797 -> 8, 86808 -> 9, 86782 -> 4, 86785 -> 5, 86770 -> 2, 86794 -> 8, 86798 -> 8, 86793 -> 8, 86783 -> 4, 86792 -> 8, 86778 -> 3, 86767 -> 0, 86795 -> 8, 86806 -> 8, 86779 -> 3, 86784 -> 5, 86796 -> 8, 86769 -> 1, 86776 -> 2, 86777 -> 2, 86804 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86765, 86766, 86767), 5 -> HashSet(86785, 86784, 86780), 1 -> HashSet(86769, 86768), 9 -> HashSet(86808, 86807, 86809), 2 -> HashSet(86775, 86770, 86776, 86777), 3 -> HashSet(86778, 86779), 8 -> HashSet(86797, 86794, 86792, 86805, 86799, 86795, 86791, 86806, 86800, 86796, 86804, 86798, 86793), 4 -> HashSet(86781, 86782, 86783))
  /* Beautified form:
  "GLOBAL.WeakMap.prototype.get" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (RequireInternalSlot M "WeakMapData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = M["WeakMapData"]
    app __x2__ = (Type key)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion undefined)
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
        app __x8__ = (WrapCompletion p["Value"])
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion undefined)
    return __x9__
  }
  */
}
