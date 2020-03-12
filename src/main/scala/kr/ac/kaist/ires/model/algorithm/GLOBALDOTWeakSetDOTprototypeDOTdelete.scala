package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakSetDOTprototypeDOTdelete {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakSet.prototype.delete""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87511), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(87512), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(87514), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""WeakSetData"""))).setId(87516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87517), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87518)).setId(87519), ISeq(List()).setId(87566)).setId(87521), IExpr(ERef(RefId(Id("""__x1__""")))).setId(87522), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(87524), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(87525), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87526))).setId(87572), ISeq(List()).setId(87573)).setId(87528), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""WeakSetData""")))).setId(87530), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(87547), ILet(Id("""__x5__"""), EINum(0L)).setId(87548), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(87549), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(87537), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(87532), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(87535))).setId(87582), ISeq(List()).setId(87583)).setId(87538), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(87539), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(87540), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87541))).setId(87588), ISeq(List()).setId(87589)).setId(87544), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(87550))).setId(87592)).setId(87552), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(87555), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87556))).setId(87596))
  val instToStepMap: Map[Int, Int] = HashMap(87552 -> 11, 87512 -> 0, 87537 -> 11, 87522 -> 2, 87540 -> 11, 87514 -> 1, 87546 -> 11, 87543 -> 11, 87511 -> 0, 87513 -> 0, 87516 -> 2, 87521 -> 2, 87531 -> 5, 87548 -> 11, 87544 -> 11, 87524 -> 4, 87539 -> 11, 87529 -> 4, 87515 -> 1, 87525 -> 3, 87553 -> 11, 87556 -> 12, 87547 -> 11, 87526 -> 3, 87557 -> 12, 87541 -> 11, 87554 -> 11, 87538 -> 11, 87527 -> 3, 87542 -> 11, 87555 -> 12, 87545 -> 11, 87523 -> 2, 87528 -> 4, 87530 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87513, 87512, 87511), 5 -> HashSet(87531, 87530), 10 -> HashSet(87539), 1 -> HashSet(87515, 87514), 2 -> HashSet(87516, 87521, 87522, 87523), 12 -> HashSet(87556, 87557, 87555), 3 -> HashSet(87525, 87526, 87527), 11 -> HashSet(87552, 87548, 87544, 87539, 87553, 87537, 87547, 87540, 87538, 87542, 87546, 87543, 87545, 87541, 87554), 4 -> HashSet(87524, 87529, 87528))
  /* Beautified form:
  "GLOBAL.WeakSet.prototype.delete" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "WeakSetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (Type value)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    let entries = S["WeakSetData"]
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
        !!! "Etc"
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
