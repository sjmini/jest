package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTtoLocaleString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.toLocaleString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(83039), ILet(Id("""reserved1"""), ERef(RefId(Id("""__x0__""")))).setId(83040), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(83042), ILet(Id("""reserved2"""), ERef(RefId(Id("""__x1__""")))).setId(83043), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(83045), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(83046), IReturn(ERef(RefId(Id("""__x2__""")))).setId(83047)).setId(83048), ISeq(List()).setId(83049)).setId(83050), ILet(Id("""array"""), ERef(RefId(Id("""__x2__""")))).setId(83051), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""array"""))))).setId(83053), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(83054), IReturn(ERef(RefId(Id("""__x3__""")))).setId(83055)).setId(83056), ISeq(List()).setId(83049)).setId(83057), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(83058), IExpr(ENotSupported("""Etc""")).setId(83060), ILet(Id("""R"""), EStr("""""")).setId(83061), ILet(Id("""k"""), EINum(0L)).setId(83063), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""k""")))), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""separator"""))))).setId(83065), ISeq(List()).setId(83049)).setId(83068), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(83070), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(83071), IReturn(ERef(RefId(Id("""__x4__""")))).setId(83072)).setId(83073), ISeq(List()).setId(83049)).setId(83074), IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""__x4__"""))))).setId(83075), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(83076), IReturn(ERef(RefId(Id("""__x5__""")))).setId(83077)).setId(83078), ISeq(List()).setId(83049)).setId(83079), ILet(Id("""nextElement"""), ERef(RefId(Id("""__x5__""")))).setId(83080), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""nextElement"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""nextElement"""))), ENull))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""nextElement"""))), EStr("""toLocaleString"""))).setId(83082), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(83083), IReturn(ERef(RefId(Id("""__x6__""")))).setId(83084)).setId(83085), ISeq(List()).setId(83049)).setId(83086), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(83087), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(83088), IReturn(ERef(RefId(Id("""__x7__""")))).setId(83089)).setId(83090), ISeq(List()).setId(83049)).setId(83091), ILet(Id("""S"""), ERef(RefId(Id("""__x7__""")))).setId(83092), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""S"""))))).setId(83094))).setId(83096), ISeq(List()).setId(83049)).setId(83097), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(83099))).setId(83101)).setId(83102), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(83104), IReturn(ERef(RefId(Id("""__x8__""")))).setId(83105))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.toLocaleString" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reserved1 = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reserved2 = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let array = __x2__
    app __x3__ = (LengthOfArrayLike array)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    !!! "Etc"
    let R = ""
    let k = 0i
    while (< k len) {
      if (< 0i k) R = (+ R separator) else {}
      app __x4__ = (ToString k)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (Get array __x4__)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextElement = __x5__
      if (! (|| (= nextElement undefined) (= nextElement null))) {
        app __x6__ = (Invoke nextElement "toLocaleString")
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        app __x7__ = (ToString __x6__)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let S = __x7__
        R = (+ R S)
      } else {}
      k = (+ k 1i)
    }
    app __x8__ = (WrapCompletion R)
    return __x8__
  }
  */
}
