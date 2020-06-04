package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakMapDOTprototypeDOTdelete {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakMap.prototype.delete""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(86636), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(86637), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(86639), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""WeakMapData"""))).setId(86641), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(86642), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86643)).setId(86644), ISeq(List()).setId(86645)).setId(86646), IExpr(ERef(RefId(Id("""__x1__""")))).setId(86647), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""WeakMapData""")))).setId(86649), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(86651), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86652), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86653))).setId(86654), ISeq(List()).setId(86645)).setId(86655), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(86675), ILet(Id("""__x5__"""), EINum(0L)).setId(86676), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(86677), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(86662), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(86657), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(86660))).setId(86661), ISeq(List()).setId(86645)).setId(86663), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Key""")), ERef(RefId(Id("""CONST_empty""")))).setId(86664), IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""CONST_empty""")))).setId(86666), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(86668), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86669))).setId(86671), ISeq(List()).setId(86645)).setId(86672), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(86678))).setId(86679)).setId(86680), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86683), IReturn(ERef(RefId(Id("""__x9__""")))).setId(86684))).setId(-1))
  /* Beautified form:
  "GLOBAL.WeakMap.prototype.delete" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (RequireInternalSlot M "WeakMapData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = M["WeakMapData"]
    app __x2__ = (Type key)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
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
        p["Key"] = CONST_empty
        p["Value"] = CONST_empty
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
