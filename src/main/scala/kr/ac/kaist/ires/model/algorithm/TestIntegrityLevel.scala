package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TestIntegrityLevel {
  val length: Int = 2
  val func: Func = Func("""TestIntegrityLevel""", List(Id("""O"""), Id("""level""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""O"""))))).setId(5748), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5749), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5750)).setId(5751), ISeq(List()).setId(5747)).setId(5752), ILet(Id("""extensible"""), ERef(RefId(Id("""__x0__""")))).setId(5753), IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(5755), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5756))).setId(5757), ISeq(List()).setId(5747)).setId(5758), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))).setId(5760), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(5761), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5762)).setId(5763), ISeq(List()).setId(5747)).setId(5764), ILet(Id("""keys"""), ERef(RefId(Id("""__x2__""")))).setId(5765), ILet(Id("""__x3__"""), ERef(RefId(Id("""keys""")))).setId(5798), ILet(Id("""__x4__"""), EINum(0L)).setId(5799), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(5800), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))))).setId(5767), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(5768), IReturn(ERef(RefId(Id("""__x5__""")))).setId(5769)).setId(5770), ISeq(List()).setId(5747)).setId(5771), ILet(Id("""currentDesc"""), ERef(RefId(Id("""__x5__""")))).setId(5772), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""currentDesc"""))), EUndef)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""currentDesc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(5774), IReturn(ERef(RefId(Id("""__x6__""")))).setId(5775))).setId(5776), ISeq(List()).setId(5747)).setId(5777), ILet(Id("""__x7__"""), EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""frozen"""))).setId(5784), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""currentDesc"""))))).setId(5779), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true))).setId(5782))).setId(5783), ISeq(List()).setId(5747)).setId(5785), IIf(ERef(RefId(Id("""__x7__"""))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""currentDesc""")), EStr("""Writable"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(5786), IReturn(ERef(RefId(Id("""__x9__""")))).setId(5787))).setId(5788), ISeq(List()).setId(5747)).setId(5789), ISeq(List()).setId(5747)).setId(5792))).setId(5794), ISeq(List()).setId(5747)).setId(5795), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(5801))).setId(5802)).setId(5803), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(5806), IReturn(ERef(RefId(Id("""__x10__""")))).setId(5807))).setId(-1))
  /* Beautified form:
  "TestIntegrityLevel" (O, level) => {
    app __x0__ = (IsExtensible O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let extensible = __x0__
    if (= extensible true) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (O["OwnPropertyKeys"] O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let keys = __x2__
    let __x3__ = keys
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let k = __x3__[__x4__]
      app __x5__ = (O["GetOwnProperty"] O k)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let currentDesc = __x5__
      if (! (= currentDesc undefined)) {
        if (= currentDesc["Configurable"] true) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        let __x7__ = (= level "frozen")
        if __x7__ {
          app __x8__ = (IsDataDescriptor currentDesc)
          __x7__ = (= __x8__ true)
        } else {}
        if __x7__ if (= currentDesc["Writable"] true) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {} else {}
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x10__ = (WrapCompletion true)
    return __x10__
  }
  */
}
