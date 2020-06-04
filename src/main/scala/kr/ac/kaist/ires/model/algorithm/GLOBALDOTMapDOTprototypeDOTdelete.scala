package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTdelete {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Map.prototype.delete""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(84506), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(84507), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84509), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(84511), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(84512), IReturn(ERef(RefId(Id("""__x1__""")))).setId(84513)).setId(84514), ISeq(List()).setId(84515)).setId(84516), IExpr(ERef(RefId(Id("""__x1__""")))).setId(84517), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(84519), ILet(Id("""__x2__"""), ERef(RefId(Id("""entries""")))).setId(84539), ILet(Id("""__x3__"""), EINum(0L)).setId(84540), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(84541), ILet(Id("""__x4__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(84526), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(84521), IAssign(RefId(Id("""__x4__""")), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true))).setId(84524))).setId(84525), ISeq(List()).setId(84515)).setId(84527), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Key""")), ERef(RefId(Id("""CONST_empty""")))).setId(84528), IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""CONST_empty""")))).setId(84530), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(84532), IReturn(ERef(RefId(Id("""__x6__""")))).setId(84533))).setId(84535), ISeq(List()).setId(84515)).setId(84536), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(84542))).setId(84543)).setId(84544), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(84547), IReturn(ERef(RefId(Id("""__x7__""")))).setId(84548))).setId(-1))
  /* Beautified form:
  "GLOBAL.Map.prototype.delete" (this, argumentsList, NewTarget) => {
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
        p["Key"] = CONST_empty
        p["Value"] = CONST_empty
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
