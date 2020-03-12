package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetSetDOTprototypeDOTsize {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getSet.prototype.size""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(86226), IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""SetData"""))).setId(86228), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(86229), IReturn(ERef(RefId(Id("""__x0__""")))).setId(86230)).setId(86231), ISeq(List()).setId(86262)).setId(86233), IExpr(ERef(RefId(Id("""__x0__""")))).setId(86234), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""SetData""")))).setId(86236), ILet(Id("""count"""), EINum(0L)).setId(86238), ILet(Id("""__x1__"""), ERef(RefId(Id("""entries""")))).setId(86245), ILet(Id("""__x2__"""), EINum(0L)).setId(86246), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(86247), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""count""")), EBOp(OPlus, ERef(RefId(Id("""count"""))), EINum(1L))).setId(86240), ISeq(List()).setId(86271)).setId(86242), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(86248))).setId(86274)).setId(86250), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""count"""))))).setId(86253), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86254))).setId(86278))
  val instToStepMap: Map[Int, Int] = HashMap(86255 -> 7, 86236 -> 2, 86246 -> 6, 86242 -> 6, 86238 -> 3, 86253 -> 7, 86245 -> 6, 86227 -> 0, 86250 -> 6, 86243 -> 6, 86226 -> 0, 86251 -> 6, 86237 -> 2, 86233 -> 1, 86252 -> 6, 86241 -> 6, 86228 -> 1, 86234 -> 1, 86254 -> 7, 86239 -> 3, 86244 -> 6, 86235 -> 1, 86240 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86226, 86227), 1 -> HashSet(86233, 86228, 86234, 86235), 6 -> HashSet(86243, 86251, 86246, 86242, 86252, 86245, 86241, 86244, 86250, 86240), 2 -> HashSet(86236, 86237), 7 -> HashSet(86255, 86253, 86254), 3 -> HashSet(86238, 86239))
  /* Beautified form:
  "GLOBAL.getSet.prototype.size" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (RequireInternalSlot S "SetData")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let entries = S["SetData"]
    let count = 0i
    let __x1__ = entries
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let e = __x1__[__x2__]
      if (! (= e CONST_empty)) count = (+ count 1i) else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x3__ = (WrapCompletion count)
    return __x3__
  }
  */
}
