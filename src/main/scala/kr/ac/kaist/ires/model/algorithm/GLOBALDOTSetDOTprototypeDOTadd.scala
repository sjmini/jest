package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSetDOTprototypeDOTadd {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Set.prototype.add""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(85670), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(85671), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(85673), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""SetData"""))).setId(85675), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(85676), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85677)).setId(85678), ISeq(List()).setId(85724)).setId(85680), IExpr(ERef(RefId(Id("""__x1__""")))).setId(85681), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""SetData""")))).setId(85683), ILet(Id("""__x2__"""), ERef(RefId(Id("""entries""")))).setId(85699), ILet(Id("""__x3__"""), EINum(0L)).setId(85700), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(85701), ILet(Id("""__x4__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(85690), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(85685), IAssign(RefId(Id("""__x4__""")), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true))).setId(85688))).setId(85734), ISeq(List()).setId(85735)).setId(85691), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(85692), IReturn(ERef(RefId(Id("""__x6__""")))).setId(85693))).setId(85739), ISeq(List()).setId(85740)).setId(85696), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(85702))).setId(85743)).setId(85704), IIf(EBOp(OEq, ERef(RefId(Id("""value"""))), ENum(-0.0)), IAssign(RefId(Id("""value""")), EINum(0L)).setId(85707), ISeq(List()).setId(85746)).setId(85709), IAppend(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""entries""")))).setId(85711), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(85713), IReturn(ERef(RefId(Id("""__x7__""")))).setId(85714))).setId(85751))
  val instToStepMap: Map[Int, Int] = HashMap(85692 -> 8, 85675 -> 2, 85698 -> 8, 85708 -> 9, 85696 -> 8, 85684 -> 3, 85693 -> 8, 85715 -> 12, 85712 -> 11, 85680 -> 2, 85694 -> 8, 85700 -> 8, 85709 -> 10, 85699 -> 8, 85710 -> 10, 85690 -> 8, 85671 -> 0, 85681 -> 2, 85691 -> 8, 85713 -> 12, 85711 -> 11, 85674 -> 1, 85704 -> 8, 85672 -> 0, 85706 -> 8, 85707 -> 9, 85697 -> 8, 85705 -> 8, 85683 -> 3, 85673 -> 1, 85714 -> 12, 85682 -> 2, 85695 -> 8, 85670 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(85671, 85672, 85670), 10 -> HashSet(85709, 85710), 1 -> HashSet(85674, 85673), 9 -> HashSet(85708, 85707), 2 -> HashSet(85675, 85681, 85680, 85682), 12 -> HashSet(85713, 85715, 85714), 3 -> HashSet(85684, 85683), 11 -> HashSet(85711, 85712), 8 -> HashSet(85692, 85698, 85691, 85704, 85706, 85696, 85697, 85693, 85705, 85694, 85700, 85699, 85690, 85695))
  /* Beautified form:
  "GLOBAL.Set.prototype.add" (this, argumentsList, NewTarget) => {
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
        app __x6__ = (WrapCompletion S)
        return __x6__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    if (= value -0.0) value = 0i else {}
    append value -> entries
    app __x7__ = (WrapCompletion S)
    return __x7__
  }
  */
}
