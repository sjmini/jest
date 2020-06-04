package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AdditiveExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression1Evaluation0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AdditiveExpression"""))), EStr("""Evaluation""")).setId(19975), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(19976), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(19978), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19979), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19980)).setId(19981), ISeq(List()).setId(19982)).setId(19983), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(19984), IAccess(Id("""__x2__"""), ERef(RefId(Id("""MultiplicativeExpression"""))), EStr("""Evaluation""")).setId(19987), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(19988), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(19990), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(19991), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19992)).setId(19993), ISeq(List()).setId(19982)).setId(19994), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(19995), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""lval"""))))).setId(19997), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(19998), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19999)).setId(20000), ISeq(List()).setId(19982)).setId(20001), ILet(Id("""lprim"""), ERef(RefId(Id("""__x4__""")))).setId(20002), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""rval"""))))).setId(20004), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(20005), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20006)).setId(20007), ISeq(List()).setId(19982)).setId(20008), ILet(Id("""rprim"""), ERef(RefId(Id("""__x5__""")))).setId(20009), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""lprim"""))))).setId(20011), ILet(Id("""__x7__"""), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""String"""))))).setId(20017), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List()).setId(19982), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""rprim"""))))).setId(20012), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""String"""))))).setId(20015))).setId(20016)).setId(20018), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""lprim"""))))).setId(20019), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(20020), IReturn(ERef(RefId(Id("""__x9__""")))).setId(20021)).setId(20022), ISeq(List()).setId(19982)).setId(20023), ILet(Id("""lstr"""), ERef(RefId(Id("""__x9__""")))).setId(20024), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""rprim"""))))).setId(20026), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(20027), IReturn(ERef(RefId(Id("""__x10__""")))).setId(20028)).setId(20029), ISeq(List()).setId(19982)).setId(20030), ILet(Id("""rstr"""), ERef(RefId(Id("""__x10__""")))).setId(20031), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""lstr"""))), ERef(RefId(Id("""rstr""")))))).setId(20033), IReturn(ERef(RefId(Id("""__x11__""")))).setId(20034))).setId(20036), ISeq(List()).setId(19982)).setId(20037), IApp(Id("""__x12__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lprim"""))))).setId(20039), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(20040), IReturn(ERef(RefId(Id("""__x12__""")))).setId(20041)).setId(20042), ISeq(List()).setId(19982)).setId(20043), ILet(Id("""lnum"""), ERef(RefId(Id("""__x12__""")))).setId(20044), IApp(Id("""__x13__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rprim"""))))).setId(20046), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(20047), IReturn(ERef(RefId(Id("""__x13__""")))).setId(20048)).setId(20049), ISeq(List()).setId(19982)).setId(20050), ILet(Id("""rnum"""), ERef(RefId(Id("""__x13__""")))).setId(20051), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""rnum""")))))).setId(20053), IReturn(ERef(RefId(Id("""__x14__""")))).setId(20054))).setId(-1))
  /* Beautified form:
  "AdditiveExpression1Evaluation0" (this, AdditiveExpression, MultiplicativeExpression) => {
    access __x0__ = (AdditiveExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (MultiplicativeExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToPrimitive lval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lprim = __x4__
    app __x5__ = (ToPrimitive rval)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rprim = __x5__
    app __x6__ = (Type lprim)
    let __x7__ = (= __x6__ String)
    if __x7__ {} else {
      app __x8__ = (Type rprim)
      __x7__ = (= __x8__ String)
    }
    if __x7__ {
      app __x9__ = (ToString lprim)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let lstr = __x9__
      app __x10__ = (ToString rprim)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let rstr = __x10__
      app __x11__ = (WrapCompletion (+ lstr rstr))
      return __x11__
    } else {}
    app __x12__ = (ToNumber lprim)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let lnum = __x12__
    app __x13__ = (ToNumber rprim)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let rnum = __x13__
    app __x14__ = (WrapCompletion (+ lnum rnum))
    return __x14__
  }
  */
}
