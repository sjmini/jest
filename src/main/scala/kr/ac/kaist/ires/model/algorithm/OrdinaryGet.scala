package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGet {
  val length: Int = 3
  val func: Func = Func("""OrdinaryGet""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50362), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50363), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50364)).setId(50365), ISeq(List()).setId(50361)).setId(50366), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))).setId(50367), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(50369), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(50370), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50371)).setId(50372), ISeq(List()).setId(50361)).setId(50373), ILet(Id("""parent"""), ERef(RefId(Id("""__x1__""")))).setId(50374), IIf(EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(50376), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50377))).setId(50378), ISeq(List()).setId(50361)).setId(50379), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""Get"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(50381), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(50382), IReturn(ERef(RefId(Id("""__x3__""")))).setId(50383)).setId(50384), ISeq(List()).setId(50361)).setId(50385), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(50386), IReturn(ERef(RefId(Id("""__x4__""")))).setId(50387))).setId(50389), ISeq(List()).setId(50361)).setId(50390), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""desc"""))))).setId(50392), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""desc""")), EStr("""Value"""))))).setId(50393), IReturn(ERef(RefId(Id("""__x6__""")))).setId(50394))).setId(50395), ISeq(List()).setId(50361)).setId(50396), ILet(Id("""getter"""), ERef(RefProp(RefId(Id("""desc""")), EStr("""Get""")))).setId(50398), IIf(EBOp(OEq, ERef(RefId(Id("""getter"""))), EUndef), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(50400), IReturn(ERef(RefId(Id("""__x7__""")))).setId(50401))).setId(50402), ISeq(List()).setId(50361)).setId(50403), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""getter"""))), ERef(RefId(Id("""Receiver"""))))).setId(50405), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(50406), IReturn(ERef(RefId(Id("""__x8__""")))).setId(50407)).setId(50408), ISeq(List()).setId(50361)).setId(50409), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(50410), IReturn(ERef(RefId(Id("""__x9__""")))).setId(50411))).setId(-1))
  /* Beautified form:
  "OrdinaryGet" (O, P, Receiver) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (O["GetPrototypeOf"] O)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let parent = __x1__
      if (= parent null) {
        app __x2__ = (WrapCompletion undefined)
        return __x2__
      } else {}
      app __x3__ = (parent["Get"] parent P Receiver)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (IsDataDescriptor desc)
    if (= __x5__ true) {
      app __x6__ = (WrapCompletion desc["Value"])
      return __x6__
    } else {}
    let getter = desc["Get"]
    if (= getter undefined) {
      app __x7__ = (WrapCompletion undefined)
      return __x7__
    } else {}
    app __x8__ = (Call getter Receiver)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
