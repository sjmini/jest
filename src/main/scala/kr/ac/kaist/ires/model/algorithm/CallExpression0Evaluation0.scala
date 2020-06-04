package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression0Evaluation0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverCallExpressionAndAsyncArrowHead"""))), EStr("""CoveredCallExpression""")).setId(17093), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(17094), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""MemberExpression""")).setId(17096), ILet(Id("""memberExpr"""), ERef(RefId(Id("""__x1__""")))).setId(17097), IAccess(Id("""__x2__"""), ERef(RefId(Id("""expr"""))), EStr("""Arguments""")).setId(17099), ILet(Id("""arguments"""), ERef(RefId(Id("""__x2__""")))).setId(17100), IAccess(Id("""__x3__"""), ERef(RefId(Id("""memberExpr"""))), EStr("""Evaluation""")).setId(17103), ILet(Id("""ref"""), ERef(RefId(Id("""__x3__""")))).setId(17104), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""ref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))).setId(17106), IReturn(ERef(RefId(Id("""ref""")))).setId(17107)).setId(17108), ISeq(List()).setId(17109)).setId(17110), IExpr(ERef(RefId(Id("""ref""")))).setId(17111), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(17113), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(17114), IReturn(ERef(RefId(Id("""__x4__""")))).setId(17115)).setId(17116), ISeq(List()).setId(17109)).setId(17117), ILet(Id("""func"""), ERef(RefId(Id("""__x4__""")))).setId(17118), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))).setId(17120), ILet(Id("""__x6__"""), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Reference"""))))).setId(17133), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))).setId(17121), ILet(Id("""__x8__"""), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false))).setId(17127), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))).setId(17122), IAssign(RefId(Id("""__x8__""")), EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EStr("""eval"""))).setId(17125))).setId(17126), ISeq(List()).setId(17109)).setId(17128), IAssign(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x8__""")))).setId(17131))).setId(17132), ISeq(List()).setId(17109)).setId(17134), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""INTRINSIC_eval"""))))).setId(17135), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x11__"""), ERef(RefId(Id("""arguments"""))), EStr("""ArgumentListEvaluation""")).setId(17136), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(17137), IReturn(ERef(RefId(Id("""__x11__""")))).setId(17138)).setId(17139), ISeq(List()).setId(17109)).setId(17140), ILet(Id("""argList"""), ERef(RefId(Id("""__x11__""")))).setId(17141), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argList""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(17143), IReturn(ERef(RefId(Id("""__x12__""")))).setId(17144))).setId(17145), ISeq(List()).setId(17109)).setId(17146), ILet(Id("""evalText"""), ERef(RefProp(RefId(Id("""argList""")), EINum(0L)))).setId(17148), IIf(EBool(true), ILet(Id("""strictCaller"""), EBool(true)).setId(17150), ILet(Id("""strictCaller"""), EBool(false)).setId(17152)).setId(17154), ILet(Id("""evalRealm"""), ERef(RefId(Id("""REALM""")))).setId(17156), IApp(Id("""__x13__"""), ERef(RefId(Id("""PerformEval"""))), List(ERef(RefId(Id("""evalText"""))), ERef(RefId(Id("""evalRealm"""))), ERef(RefId(Id("""strictCaller"""))), EBool(true))).setId(17158), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(17159), IReturn(ERef(RefId(Id("""__x13__""")))).setId(17160)).setId(17161), ISeq(List()).setId(17109)).setId(17162), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(17163), IReturn(ERef(RefId(Id("""__x14__""")))).setId(17164))).setId(17166), ISeq(List()).setId(17109)).setId(17167))).setId(17169), ISeq(List()).setId(17109)).setId(17170), ILet(Id("""thisCall"""), ERef(RefId(Id("""this""")))).setId(17172), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsInTailPosition"""))), List(ERef(RefId(Id("""thisCall"""))))).setId(17174), ILet(Id("""tailCall"""), ERef(RefId(Id("""__x15__""")))).setId(17175), IApp(Id("""__x16__"""), ERef(RefId(Id("""EvaluateCall"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""ref"""))), ERef(RefId(Id("""arguments"""))), ERef(RefId(Id("""tailCall"""))))).setId(17177), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(17178), IReturn(ERef(RefId(Id("""__x16__""")))).setId(17179)).setId(17180), ISeq(List()).setId(17109)).setId(17181), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))).setId(17182), IReturn(ERef(RefId(Id("""__x17__""")))).setId(17183))).setId(-1))
  /* Beautified form:
  "CallExpression0Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead) => {
    access __x0__ = (CoverCallExpressionAndAsyncArrowHead "CoveredCallExpression")
    let expr = __x0__
    access __x1__ = (expr "MemberExpression")
    let memberExpr = __x1__
    access __x2__ = (expr "Arguments")
    let arguments = __x2__
    access __x3__ = (memberExpr "Evaluation")
    let ref = __x3__
    if (= (typeof ref) "Completion") if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x4__ = (GetValue ref)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let func = __x4__
    app __x5__ = (Type ref)
    let __x6__ = (= __x5__ Reference)
    if __x6__ {
      app __x7__ = (IsPropertyReference ref)
      let __x8__ = (= __x7__ false)
      if __x8__ {
        app __x9__ = (GetReferencedName ref)
        __x8__ = (= __x9__ "eval")
      } else {}
      __x6__ = __x8__
    } else {}
    if __x6__ {
      app __x10__ = (SameValue func INTRINSIC_eval)
      if (= __x10__ true) {
        access __x11__ = (arguments "ArgumentListEvaluation")
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let argList = __x11__
        if (= argList["length"] 0i) {
          app __x12__ = (WrapCompletion undefined)
          return __x12__
        } else {}
        let evalText = argList[0i]
        if true let strictCaller = true else let strictCaller = false
        let evalRealm = REALM
        app __x13__ = (PerformEval evalText evalRealm strictCaller true)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        app __x14__ = (WrapCompletion __x13__)
        return __x14__
      } else {}
    } else {}
    let thisCall = this
    app __x15__ = (IsInTailPosition thisCall)
    let tailCall = __x15__
    app __x16__ = (EvaluateCall func ref arguments tailCall)
    if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    app __x17__ = (WrapCompletion __x16__)
    return __x17__
  }
  */
}
