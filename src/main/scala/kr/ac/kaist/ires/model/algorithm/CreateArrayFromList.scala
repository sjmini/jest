package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateArrayFromList {
  val length: Int = 1
  val func: Func = Func("""CreateArrayFromList""", List(Id("""elements""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(5923), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5924), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5925)).setId(5926), ISeq(List()).setId(5922)).setId(5927), ILet(Id("""array"""), ERef(RefId(Id("""__x0__""")))).setId(5928), ILet(Id("""n"""), EINum(0L)).setId(5930), ILet(Id("""__x1__"""), ERef(RefId(Id("""elements""")))).setId(5943), ILet(Id("""__x2__"""), EINum(0L)).setId(5944), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(5945), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(5932), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(5933), IReturn(ERef(RefId(Id("""__x3__""")))).setId(5934)).setId(5935), ISeq(List()).setId(5922)).setId(5936), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""e"""))))).setId(5937), ILet(Id("""status"""), ERef(RefId(Id("""__x4__""")))).setId(5938), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(5940), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(5946))).setId(5947)).setId(5948), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))).setId(5951), IReturn(ERef(RefId(Id("""__x5__""")))).setId(5952))).setId(-1))
  /* Beautified form:
  "CreateArrayFromList" (elements) => {
    app __x0__ = (ArrayCreate 0i)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    let n = 0i
    let __x1__ = elements
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let e = __x1__[__x2__]
      app __x3__ = (ToString n)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (CreateDataProperty array __x3__ e)
      let status = __x4__
      n = (+ n 1i)
      __x2__ = (+ __x2__ 1i)
    }
    app __x5__ = (WrapCompletion array)
    return __x5__
  }
  */
}
