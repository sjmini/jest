package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTindexOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.indexOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78949), ILet(Id("""searchElement"""), ERef(RefId(Id("""__x0__""")))).setId(78950), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78952), ILet(Id("""fromIndex"""), ERef(RefId(Id("""__x1__""")))).setId(78953), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(78955), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(78956), IReturn(ERef(RefId(Id("""__x2__""")))).setId(78957)).setId(78958), ISeq(List()).setId(78959)).setId(78960), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(78961), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(78963), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(78964), IReturn(ERef(RefId(Id("""__x3__""")))).setId(78965)).setId(78966), ISeq(List()).setId(78959)).setId(78967), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(78968), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(78970), IReturn(ERef(RefId(Id("""__x4__""")))).setId(78971))).setId(78972), ISeq(List()).setId(78959)).setId(78973), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fromIndex"""))))).setId(78975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(78976), IReturn(ERef(RefId(Id("""__x5__""")))).setId(78977)).setId(78978), ISeq(List()).setId(78959)).setId(78979), ILet(Id("""n"""), ERef(RefId(Id("""__x5__""")))).setId(78980), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(78982), IReturn(ERef(RefId(Id("""__x6__""")))).setId(78983))).setId(78984), ISeq(List()).setId(78959)).setId(78985), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), ENum(-0.0)), ILet(Id("""k"""), EINum(0L)).setId(78987), ILet(Id("""k"""), ERef(RefId(Id("""n""")))).setId(78989)).setId(78991), ISeq(List(ILet(Id("""k"""), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""n"""))))).setId(78994), IIf(EBOp(OLt, ERef(RefId(Id("""k"""))), EINum(0L)), IAssign(RefId(Id("""k""")), EINum(0L)).setId(78996), ISeq(List()).setId(78959)).setId(78998))).setId(79000)).setId(79001), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79003), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(79004), IReturn(ERef(RefId(Id("""__x7__""")))).setId(79005)).setId(79006), ISeq(List()).setId(78959)).setId(79007), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x7__"""))))).setId(79008), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(79009), IReturn(ERef(RefId(Id("""__x8__""")))).setId(79010)).setId(79011), ISeq(List()).setId(78959)).setId(79012), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x8__""")))).setId(79013), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79015), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(79016), IReturn(ERef(RefId(Id("""__x9__""")))).setId(79017)).setId(79018), ISeq(List()).setId(78959)).setId(79019), IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x9__"""))))).setId(79020), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(79021), IReturn(ERef(RefId(Id("""__x10__""")))).setId(79022)).setId(79023), ISeq(List()).setId(78959)).setId(79024), ILet(Id("""elementK"""), ERef(RefId(Id("""__x10__""")))).setId(79025), IApp(Id("""__x11__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""searchElement"""))), ERef(RefId(Id("""elementK"""))))).setId(79028), ILet(Id("""same"""), ERef(RefId(Id("""__x11__""")))).setId(79029), IIf(EBOp(OEq, ERef(RefId(Id("""same"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""k"""))))).setId(79031), IReturn(ERef(RefId(Id("""__x12__""")))).setId(79032))).setId(79033), ISeq(List()).setId(78959)).setId(79034))).setId(79036), ISeq(List()).setId(78959)).setId(79037), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(79039))).setId(79041)).setId(79042), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(79044), IReturn(ERef(RefId(Id("""__x13__""")))).setId(79045))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.indexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchElement = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fromIndex = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    if (= len 0i) {
      app __x4__ = (WrapCompletion (- 1i))
      return __x4__
    } else {}
    app __x5__ = (ToInteger fromIndex)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let n = __x5__
    if (! (< n len)) {
      app __x6__ = (WrapCompletion (- 1i))
      return __x6__
    } else {}
    if (! (< n 0i)) if (= n -0.0) let k = 0i else let k = n else {
      let k = (+ len n)
      if (< k 0i) k = 0i else {}
    }
    while (< k len) {
      app __x7__ = (ToString k)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (HasProperty O __x7__)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let kPresent = __x8__
      if (= kPresent true) {
        app __x9__ = (ToString k)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (Get O __x9__)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let elementK = __x10__
        app __x11__ = (StrictEqualityComparison searchElement elementK)
        let same = __x11__
        if (= same true) {
          app __x12__ = (WrapCompletion k)
          return __x12__
        } else {}
      } else {}
      k = (+ k 1i)
    }
    app __x13__ = (WrapCompletion (- 1i))
    return __x13__
  }
  */
}
