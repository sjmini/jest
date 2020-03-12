package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSetDOTprototypeDOThas {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Set.prototype.has""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(86124), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(86125), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(86127), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""SetData"""))).setId(86129), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(86130), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86131)).setId(86132), ISeq(List()).setId(86171)).setId(86134), IExpr(ERef(RefId(Id("""__x1__""")))).setId(86135), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""SetData""")))).setId(86137), ILet(Id("""__x2__"""), ERef(RefId(Id("""entries""")))).setId(86152), ILet(Id("""__x3__"""), EINum(0L)).setId(86153), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(86154), ILet(Id("""__x4__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(86144), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(86139), IAssign(RefId(Id("""__x4__""")), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true))).setId(86142))).setId(86181), ISeq(List()).setId(86182)).setId(86145), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(86146), IReturn(ERef(RefId(Id("""__x6__""")))).setId(86147))).setId(86186), ISeq(List()).setId(86187)).setId(86149), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(86155))).setId(86190)).setId(86157), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86160), IReturn(ERef(RefId(Id("""__x7__""")))).setId(86161))).setId(86194))
  val instToStepMap: Map[Int, Int] = HashMap(86148 -> 6, 86135 -> 2, 86159 -> 6, 86126 -> 0, 86152 -> 6, 86158 -> 6, 86138 -> 3, 86157 -> 6, 86124 -> 0, 86146 -> 6, 86150 -> 6, 86153 -> 6, 86160 -> 7, 86162 -> 7, 86144 -> 6, 86145 -> 6, 86136 -> 2, 86125 -> 0, 86149 -> 6, 86137 -> 3, 86161 -> 7, 86129 -> 2, 86128 -> 1, 86147 -> 6, 86134 -> 2, 86151 -> 6, 86127 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86126, 86125, 86124), 1 -> HashSet(86128, 86127), 6 -> HashSet(86148, 86159, 86152, 86158, 86145, 86149, 86157, 86146, 86150, 86153, 86147, 86151, 86144), 2 -> HashSet(86135, 86136, 86129, 86134), 7 -> HashSet(86161, 86160, 86162), 3 -> HashSet(86138, 86137))
  /* Beautified form:
  "GLOBAL.Set.prototype.has" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "SetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = S["SetData"]
    let __x2__ = entries
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let e = __x2__[__x3__]
      let __x4__ = (! (= e CONST_empty))
      if __x4__ {
        app __x5__ = (SameValueZero e value)
        __x4__ = (= __x5__ true)
      } else {}
      if __x4__ {
        app __x6__ = (WrapCompletion true)
        return __x6__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x7__ = (WrapCompletion false)
    return __x7__
  }
  */
}
