package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTshift {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.shift""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(81308), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(81309), IReturn(ERef(RefId(Id("""__x0__""")))).setId(81310)).setId(81311), ISeq(List()).setId(81312)).setId(81313), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(81314), IApp(Id("""__x1__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(81316), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(81317), IReturn(ERef(RefId(Id("""__x1__""")))).setId(81318)).setId(81319), ISeq(List()).setId(81312)).setId(81320), ILet(Id("""len"""), ERef(RefId(Id("""__x1__""")))).setId(81321), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EINum(0L), EBool(true))).setId(81323), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(81324), IReturn(ERef(RefId(Id("""__x2__""")))).setId(81325)).setId(81326), ISeq(List()).setId(81312)).setId(81327), IExpr(ERef(RefId(Id("""__x2__""")))).setId(81328), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(81330), IReturn(ERef(RefId(Id("""__x3__""")))).setId(81331))).setId(81333), ISeq(List()).setId(81312)).setId(81334), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), EStr("""0"""))).setId(81336), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(81337), IReturn(ERef(RefId(Id("""__x4__""")))).setId(81338)).setId(81339), ISeq(List()).setId(81312)).setId(81340), ILet(Id("""first"""), ERef(RefId(Id("""__x4__""")))).setId(81341), ILet(Id("""k"""), EINum(1L)).setId(81343), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(81345), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(81346), IReturn(ERef(RefId(Id("""__x5__""")))).setId(81347)).setId(81348), ISeq(List()).setId(81312)).setId(81349), ILet(Id("""from"""), ERef(RefId(Id("""__x5__""")))).setId(81350), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L)))).setId(81352), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(81353), IReturn(ERef(RefId(Id("""__x6__""")))).setId(81354)).setId(81355), ISeq(List()).setId(81312)).setId(81356), ILet(Id("""to"""), ERef(RefId(Id("""__x6__""")))).setId(81357), IApp(Id("""__x7__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(81359), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(81360), IReturn(ERef(RefId(Id("""__x7__""")))).setId(81361)).setId(81362), ISeq(List()).setId(81312)).setId(81363), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x7__""")))).setId(81364), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(81366), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(81367), IReturn(ERef(RefId(Id("""__x8__""")))).setId(81368)).setId(81369), ISeq(List()).setId(81312)).setId(81370), ILet(Id("""fromVal"""), ERef(RefId(Id("""__x8__""")))).setId(81371), IApp(Id("""__x9__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))), ERef(RefId(Id("""fromVal"""))), EBool(true))).setId(81373), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(81374), IReturn(ERef(RefId(Id("""__x9__""")))).setId(81375)).setId(81376), ISeq(List()).setId(81312)).setId(81377), IExpr(ERef(RefId(Id("""__x9__""")))).setId(81378))).setId(81380), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))))).setId(81381), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(81382), IReturn(ERef(RefId(Id("""__x10__""")))).setId(81383)).setId(81384), ISeq(List()).setId(81312)).setId(81385), IExpr(ERef(RefId(Id("""__x10__""")))).setId(81386))).setId(81388)).setId(81389), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(81391))).setId(81393)).setId(81394), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L)))).setId(81396), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(81397), IReturn(ERef(RefId(Id("""__x11__""")))).setId(81398)).setId(81399), ISeq(List()).setId(81312)).setId(81400), IApp(Id("""__x12__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x11__"""))))).setId(81401), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(81402), IReturn(ERef(RefId(Id("""__x12__""")))).setId(81403)).setId(81404), ISeq(List()).setId(81312)).setId(81405), IExpr(ERef(RefId(Id("""__x12__""")))).setId(81406), IApp(Id("""__x13__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L)), EBool(true))).setId(81408), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(81409), IReturn(ERef(RefId(Id("""__x13__""")))).setId(81410)).setId(81411), ISeq(List()).setId(81312)).setId(81412), IExpr(ERef(RefId(Id("""__x13__""")))).setId(81413), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""first"""))))).setId(81415), IReturn(ERef(RefId(Id("""__x14__""")))).setId(81416))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.shift" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    if (= len 0i) {
      app __x2__ = (Set O "length" 0i true)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    app __x4__ = (Get O "0")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let first = __x4__
    let k = 1i
    while (< k len) {
      app __x5__ = (ToString k)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let from = __x5__
      app __x6__ = (ToString (- k 1i))
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let to = __x6__
      app __x7__ = (HasProperty O from)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let fromPresent = __x7__
      if (= fromPresent true) {
        app __x8__ = (Get O from)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let fromVal = __x8__
        app __x9__ = (Set O to fromVal true)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
      } else {
        app __x10__ = (DeletePropertyOrThrow O to)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x10__
      }
      k = (+ k 1i)
    }
    app __x11__ = (ToString (- len 1i))
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    app __x12__ = (DeletePropertyOrThrow O __x11__)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    __x12__
    app __x13__ = (Set O "length" (- len 1i) true)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion first)
    return __x14__
  }
  */
}
