package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetMapDOTprototypeDOTsize {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getMap.prototype.size""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(85104), IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(85106), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(85107), IReturn(ERef(RefId(Id("""__x0__""")))).setId(85108)).setId(85109), ISeq(List()).setId(85140)).setId(85111), IExpr(ERef(RefId(Id("""__x0__""")))).setId(85112), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(85114), ILet(Id("""count"""), EINum(0L)).setId(85116), ILet(Id("""__x1__"""), ERef(RefId(Id("""entries""")))).setId(85123), ILet(Id("""__x2__"""), EINum(0L)).setId(85124), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(85125), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""count""")), EBOp(OPlus, ERef(RefId(Id("""count"""))), EINum(1L))).setId(85118), ISeq(List()).setId(85149)).setId(85120), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(85126))).setId(85152)).setId(85128), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""count"""))))).setId(85131), IReturn(ERef(RefId(Id("""__x3__""")))).setId(85132))).setId(85156))
  val instToStepMap: Map[Int, Int] = HashMap(85128 -> 6, 85117 -> 3, 85105 -> 0, 85112 -> 1, 85123 -> 6, 85120 -> 6, 85106 -> 1, 85132 -> 7, 85119 -> 6, 85124 -> 6, 85115 -> 2, 85116 -> 3, 85131 -> 7, 85129 -> 6, 85114 -> 2, 85118 -> 6, 85130 -> 6, 85113 -> 1, 85133 -> 7, 85122 -> 6, 85104 -> 0, 85121 -> 6, 85111 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(85104, 85105), 1 -> HashSet(85113, 85112, 85106, 85111), 6 -> HashSet(85128, 85122, 85123, 85120, 85119, 85124, 85129, 85118, 85121, 85130), 2 -> HashSet(85115, 85114), 7 -> HashSet(85133, 85132, 85131), 3 -> HashSet(85117, 85116))
  /* Beautified form:
  "GLOBAL.getMap.prototype.size" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let entries = M["MapData"]
    let count = 0i
    let __x1__ = entries
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let p = __x1__[__x2__]
      if (! (= p["Key"] CONST_empty)) count = (+ count 1i) else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x3__ = (WrapCompletion count)
    return __x3__
  }
  */
}
