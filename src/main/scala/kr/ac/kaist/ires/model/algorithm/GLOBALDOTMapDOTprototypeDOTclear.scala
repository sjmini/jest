package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMapDOTprototypeDOTclear {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Map.prototype.clear""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84437), IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(84439), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(84440), IReturn(ERef(RefId(Id("""__x0__""")))).setId(84441)).setId(84442), ISeq(List()).setId(84471)).setId(84444), IExpr(ERef(RefId(Id("""__x0__""")))).setId(84445), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(84447), ILet(Id("""__x1__"""), ERef(RefId(Id("""entries""")))).setId(84454), ILet(Id("""__x2__"""), EINum(0L)).setId(84455), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(84456), IAssign(RefProp(RefId(Id("""p""")), EStr("""Key""")), ERef(RefId(Id("""CONST_empty""")))).setId(84449), IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""CONST_empty""")))).setId(84451), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(84457))).setId(84481)).setId(84459), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(84462), IReturn(ERef(RefId(Id("""__x3__""")))).setId(84463))).setId(84485))
  val instToStepMap: Map[Int, Int] = HashMap(84446 -> 1, 84438 -> 0, 84448 -> 2, 84452 -> 6, 84460 -> 6, 84447 -> 2, 84459 -> 6, 84439 -> 1, 84444 -> 1, 84450 -> 6, 84445 -> 1, 84451 -> 6, 84464 -> 7, 84437 -> 0, 84461 -> 6, 84463 -> 7, 84453 -> 6, 84454 -> 6, 84449 -> 6, 84455 -> 6, 84462 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(84437, 84438), 5 -> HashSet(84449, 84450), 1 -> HashSet(84445, 84446, 84439, 84444), 6 -> HashSet(84451, 84461, 84453, 84452, 84460, 84459, 84450, 84455, 84454, 84449), 2 -> HashSet(84448, 84447), 7 -> HashSet(84464, 84463, 84462))
  /* Beautified form:
  "GLOBAL.Map.prototype.clear" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let entries = M["MapData"]
    let __x1__ = entries
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let p = __x1__[__x2__]
      p["Key"] = CONST_empty
      p["Value"] = CONST_empty
      __x2__ = (+ __x2__ 1i)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
