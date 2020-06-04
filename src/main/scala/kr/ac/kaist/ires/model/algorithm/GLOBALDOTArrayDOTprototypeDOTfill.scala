package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTfill {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.fill""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(76996), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(76997), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(76999), ILet(Id("""start"""), ERef(RefId(Id("""__x1__""")))).setId(77000), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(77002), ILet(Id("""end"""), ERef(RefId(Id("""__x2__""")))).setId(77003), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(77005), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(77006), IReturn(ERef(RefId(Id("""__x3__""")))).setId(77007)).setId(77008), ISeq(List()).setId(77009)).setId(77010), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(77011), IApp(Id("""__x4__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(77013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(77014), IReturn(ERef(RefId(Id("""__x4__""")))).setId(77015)).setId(77016), ISeq(List()).setId(77009)).setId(77017), ILet(Id("""len"""), ERef(RefId(Id("""__x4__""")))).setId(77018), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(77020), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(77021), IReturn(ERef(RefId(Id("""__x5__""")))).setId(77022)).setId(77023), ISeq(List()).setId(77009)).setId(77024), ILet(Id("""relativeStart"""), ERef(RefId(Id("""__x5__""")))).setId(77025), IIf(EBOp(OLt, ERef(RefId(Id("""relativeStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeStart""")))), EINum(0L))).setId(77027), ILet(Id("""k"""), ERef(RefId(Id("""__x6__""")))).setId(77028))).setId(77029), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeStart"""))), ERef(RefId(Id("""len"""))))).setId(77030), ILet(Id("""k"""), ERef(RefId(Id("""__x7__""")))).setId(77031))).setId(77032)).setId(77033), IIf(EBOp(OEq, ERef(RefId(Id("""end"""))), EUndef), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""len""")))).setId(77035), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""end"""))))).setId(77037), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(77038), IReturn(ERef(RefId(Id("""__x8__""")))).setId(77039)).setId(77040), ISeq(List()).setId(77009)).setId(77041), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""__x8__""")))).setId(77042))).setId(77043)).setId(77044), IIf(EBOp(OLt, ERef(RefId(Id("""relativeEnd"""))), EINum(0L)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeEnd""")))), EINum(0L))).setId(77046), ILet(Id("""final"""), ERef(RefId(Id("""__x9__""")))).setId(77047))).setId(77048), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeEnd"""))), ERef(RefId(Id("""len"""))))).setId(77049), ILet(Id("""final"""), ERef(RefId(Id("""__x10__""")))).setId(77050))).setId(77051)).setId(77052), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""final""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(77054), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(77055), IReturn(ERef(RefId(Id("""__x11__""")))).setId(77056)).setId(77057), ISeq(List()).setId(77009)).setId(77058), ILet(Id("""Pk"""), ERef(RefId(Id("""__x11__""")))).setId(77059), IApp(Id("""__x12__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""value"""))), EBool(true))).setId(77061), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(77062), IReturn(ERef(RefId(Id("""__x12__""")))).setId(77063)).setId(77064), ISeq(List()).setId(77009)).setId(77065), IExpr(ERef(RefId(Id("""__x12__""")))).setId(77066), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(77068))).setId(77070)).setId(77071), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(77073), IReturn(ERef(RefId(Id("""__x13__""")))).setId(77074))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.fill" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let start = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let end = __x2__
    app __x3__ = (ToObject this)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    app __x4__ = (LengthOfArrayLike O)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    app __x5__ = (ToInteger start)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let relativeStart = __x5__
    if (< relativeStart 0i) {
      app __x6__ = (max (+ len relativeStart) 0i)
      let k = __x6__
    } else {
      app __x7__ = (min relativeStart len)
      let k = __x7__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x8__ = (ToInteger end)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let relativeEnd = __x8__
    }
    if (< relativeEnd 0i) {
      app __x9__ = (max (+ len relativeEnd) 0i)
      let final = __x9__
    } else {
      app __x10__ = (min relativeEnd len)
      let final = __x10__
    }
    while (< k final) {
      app __x11__ = (ToString k)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let Pk = __x11__
      app __x12__ = (Set O Pk value true)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      __x12__
      k = (+ k 1i)
    }
    app __x13__ = (WrapCompletion O)
    return __x13__
  }
  */
}
