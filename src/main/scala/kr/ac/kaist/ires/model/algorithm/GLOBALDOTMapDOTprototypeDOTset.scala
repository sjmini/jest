package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTset {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Map.prototype.set""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(84972), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(84973), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(84975), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(84976), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84978), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(84980), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(84981), IReturn(ERef(RefId(Id("""__x2__""")))).setId(84982)).setId(84983), ISeq(List()).setId(84984)).setId(84985), IExpr(ERef(RefId(Id("""__x2__""")))).setId(84986), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(84988), ILet(Id("""__x3__"""), ERef(RefId(Id("""entries""")))).setId(85006), ILet(Id("""__x4__"""), EINum(0L)).setId(85007), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(85008), ILet(Id("""__x5__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(84995), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(84990), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))).setId(84993))).setId(84994), ISeq(List()).setId(84984)).setId(84996), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""value""")))).setId(84997), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))).setId(84999), IReturn(ERef(RefId(Id("""__x7__""")))).setId(85000))).setId(85002), ISeq(List()).setId(84984)).setId(85003), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(85009))).setId(85010)).setId(85011), IIf(EBOp(OEq, ERef(RefId(Id("""key"""))), ENum(-0.0)), IAssign(RefId(Id("""key""")), EINum(0L)).setId(85014), ISeq(List()).setId(84984)).setId(85016), ILet(Id("""p"""), EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""key""")))), (EStr("""Value"""), ERef(RefId(Id("""value"""))))))).setId(85018), IAppend(ERef(RefId(Id("""p"""))), ERef(RefId(Id("""entries""")))).setId(85020), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))).setId(85022), IReturn(ERef(RefId(Id("""__x8__""")))).setId(85023))).setId(-1))
  /* Beautified form:
  "GLOBAL.Map.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let entries = M["MapData"]
    let __x3__ = entries
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let p = __x3__[__x4__]
      let __x5__ = (! (= p["Key"] CONST_empty))
      if __x5__ {
        app __x6__ = (SameValueZero p["Key"] key)
        __x5__ = (= __x6__ true)
      } else {}
      if __x5__ {
        p["Value"] = value
        app __x7__ = (WrapCompletion M)
        return __x7__
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    if (= key -0.0) key = 0i else {}
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x8__ = (WrapCompletion M)
    return __x8__
  }
  */
}
