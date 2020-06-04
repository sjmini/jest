package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CopyDataProperties {
  val length: Int = 3
  val func: Func = Func("""CopyDataProperties""", List(Id("""target"""), Id("""source"""), Id("""excludedItems""")), None, ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""source"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""source"""))), ENull)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))).setId(6831), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6832))).setId(6833), ISeq(List()).setId(6830)).setId(6834), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""source"""))))).setId(6836), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(6837), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6838)).setId(6839), ISeq(List()).setId(6830)).setId(6840), ILet(Id("""from"""), ERef(RefId(Id("""__x1__""")))).setId(6841), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""from""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""from"""))))).setId(6843), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(6844), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6845)).setId(6846), ISeq(List()).setId(6830)).setId(6847), ILet(Id("""keys"""), ERef(RefId(Id("""__x2__""")))).setId(6848), ILet(Id("""__x3__"""), ERef(RefId(Id("""keys""")))).setId(6895), ILet(Id("""__x4__"""), EINum(0L)).setId(6896), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(6897), ILet(Id("""excluded"""), EBool(false)).setId(6850), ILet(Id("""__x5__"""), ERef(RefId(Id("""excludedItems""")))).setId(6859), ILet(Id("""__x6__"""), EINum(0L)).setId(6860), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))).setId(6861), IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""nextKey"""))))).setId(6852), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true)), IAssign(RefId(Id("""excluded""")), EBool(true)).setId(6853), ISeq(List()).setId(6830)).setId(6856), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L))).setId(6862))).setId(6863)).setId(6864), IIf(EBOp(OEq, ERef(RefId(Id("""excluded"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""from""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""from"""))), ERef(RefId(Id("""nextKey"""))))).setId(6867), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(6868), IReturn(ERef(RefId(Id("""__x8__""")))).setId(6869)).setId(6870), ISeq(List()).setId(6830)).setId(6871), ILet(Id("""desc"""), ERef(RefId(Id("""__x8__""")))).setId(6872), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Enumerable"""))), EBool(true))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""from"""))), ERef(RefId(Id("""nextKey"""))))).setId(6874), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(6875), IReturn(ERef(RefId(Id("""__x9__""")))).setId(6876)).setId(6877), ISeq(List()).setId(6830)).setId(6878), ILet(Id("""propValue"""), ERef(RefId(Id("""__x9__""")))).setId(6879), IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""propValue"""))))).setId(6881), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(6882), IReturn(ERef(RefId(Id("""__x10__""")))).setId(6883)).setId(6884), ISeq(List()).setId(6830)).setId(6885), IExpr(ERef(RefId(Id("""__x10__""")))).setId(6886))).setId(6888), ISeq(List()).setId(6830)).setId(6889))).setId(6891), ISeq(List()).setId(6830)).setId(6892), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(6898))).setId(6899)).setId(6900), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))).setId(6903), IReturn(ERef(RefId(Id("""__x11__""")))).setId(6904))).setId(-1))
  /* Beautified form:
  "CopyDataProperties" (target, source, excludedItems) => {
    if (|| (= source undefined) (= source null)) {
      app __x0__ = (WrapCompletion target)
      return __x0__
    } else {}
    app __x1__ = (ToObject source)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let from = __x1__
    app __x2__ = (from["OwnPropertyKeys"] from)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let keys = __x2__
    let __x3__ = keys
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let nextKey = __x3__[__x4__]
      let excluded = false
      let __x5__ = excludedItems
      let __x6__ = 0i
      while (< __x6__ __x5__["length"]) {
        let e = __x5__[__x6__]
        app __x7__ = (SameValue e nextKey)
        if (= __x7__ true) excluded = true else {}
        __x6__ = (+ __x6__ 1i)
      }
      if (= excluded false) {
        app __x8__ = (from["GetOwnProperty"] from nextKey)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let desc = __x8__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) {
          app __x9__ = (Get from nextKey)
          if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          let propValue = __x9__
          app __x10__ = (CreateDataProperty target nextKey propValue)
          if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          __x10__
        } else {}
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x11__ = (WrapCompletion target)
    return __x11__
  }
  */
}
