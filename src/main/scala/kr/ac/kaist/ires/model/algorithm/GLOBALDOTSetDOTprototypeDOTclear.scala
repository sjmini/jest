package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSetDOTprototypeDOTclear {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Set.prototype.clear""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(85787), IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""SetData"""))).setId(85789), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(85790), IReturn(ERef(RefId(Id("""__x0__""")))).setId(85791)).setId(85792), ISeq(List()).setId(85818)).setId(85794), IExpr(ERef(RefId(Id("""__x0__""")))).setId(85795), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""SetData""")))).setId(85797), ILet(Id("""__x1__"""), ERef(RefId(Id("""entries""")))).setId(85801), ILet(Id("""__x2__"""), EINum(0L)).setId(85802), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(85803), IExpr(ENotSupported("""Etc""")).setId(85799), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(85804))).setId(85827)).setId(85806), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(85809), IReturn(ERef(RefId(Id("""__x3__""")))).setId(85810))).setId(85831))
  val instToStepMap: Map[Int, Int] = HashMap(85809 -> 6, 85788 -> 0, 85799 -> 5, 85807 -> 5, 85794 -> 1, 85789 -> 1, 85811 -> 6, 85808 -> 5, 85797 -> 2, 85801 -> 5, 85806 -> 5, 85787 -> 0, 85802 -> 5, 85795 -> 1, 85800 -> 5, 85798 -> 2, 85796 -> 1, 85810 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(85788, 85787), 5 -> HashSet(85800, 85799, 85807, 85808, 85801, 85806, 85802), 1 -> HashSet(85794, 85789, 85796, 85795), 6 -> HashSet(85809, 85811, 85810), 2 -> HashSet(85798, 85797))
  /* Beautified form:
  "GLOBAL.Set.prototype.clear" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (RequireInternalSlot S "SetData")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let entries = S["SetData"]
    let __x1__ = entries
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let e = __x1__[__x2__]
      !!! "Etc"
      __x2__ = (+ __x2__ 1i)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
