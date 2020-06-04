package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForBodyEvaluation {
  val length: Int = 5
  val func: Func = Func("""ForBodyEvaluation""", List(Id("""test"""), Id("""increment"""), Id("""stmt"""), Id("""perIterationBindings"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(31452), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreatePerIterationEnvironment"""))), List(ERef(RefId(Id("""perIterationBindings"""))))).setId(31454), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(31455), IReturn(ERef(RefId(Id("""__x0__""")))).setId(31456)).setId(31457), ISeq(List()).setId(31458)).setId(31459), IExpr(ERef(RefId(Id("""__x0__""")))).setId(31460), IWhile(EBool(true), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""test"""))), EAbsent)), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""test"""))), EStr("""Evaluation""")).setId(31463), ILet(Id("""testRef"""), ERef(RefId(Id("""__x1__""")))).setId(31464), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""testRef"""))))).setId(31466), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(31467), IReturn(ERef(RefId(Id("""__x2__""")))).setId(31468)).setId(31469), ISeq(List()).setId(31458)).setId(31470), ILet(Id("""testValue"""), ERef(RefId(Id("""__x2__""")))).setId(31471), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""testValue"""))))).setId(31473), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(31474), IReturn(ERef(RefId(Id("""__x3__""")))).setId(31475)).setId(31476), ISeq(List()).setId(31458)).setId(31477), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(31478), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(31479), IReturn(ERef(RefId(Id("""__x5__""")))).setId(31480))).setId(31481), ISeq(List()).setId(31458)).setId(31482))).setId(31484), ISeq(List()).setId(31458)).setId(31485), IAccess(Id("""__x6__"""), ERef(RefId(Id("""stmt"""))), EStr("""Evaluation""")).setId(31488), ILet(Id("""result"""), ERef(RefId(Id("""__x6__""")))).setId(31489), IApp(Id("""__x7__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""labelSet"""))))).setId(31491), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""V"""))))).setId(31492), IApp(Id("""__x9__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(31493), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(31494), IReturn(ERef(RefId(Id("""__x10__""")))).setId(31495))).setId(31496), ISeq(List()).setId(31458)).setId(31497), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(31499), ISeq(List()).setId(31458)).setId(31501), IApp(Id("""__x11__"""), ERef(RefId(Id("""CreatePerIterationEnvironment"""))), List(ERef(RefId(Id("""perIterationBindings"""))))).setId(31503), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(31504), IReturn(ERef(RefId(Id("""__x11__""")))).setId(31505)).setId(31506), ISeq(List()).setId(31458)).setId(31507), IExpr(ERef(RefId(Id("""__x11__""")))).setId(31508), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""increment"""))), EAbsent)), ISeq(List(IAccess(Id("""__x12__"""), ERef(RefId(Id("""increment"""))), EStr("""Evaluation""")).setId(31511), ILet(Id("""incRef"""), ERef(RefId(Id("""__x12__""")))).setId(31512), IApp(Id("""__x13__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""incRef"""))))).setId(31514), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(31515), IReturn(ERef(RefId(Id("""__x13__""")))).setId(31516)).setId(31517), ISeq(List()).setId(31458)).setId(31518), IExpr(ERef(RefId(Id("""__x13__""")))).setId(31519))).setId(31521), ISeq(List()).setId(31458)).setId(31522))).setId(31524)).setId(31525))).setId(-1))
  /* Beautified form:
  "ForBodyEvaluation" (test, increment, stmt, perIterationBindings, labelSet) => {
    let V = undefined
    app __x0__ = (CreatePerIterationEnvironment perIterationBindings)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    while true {
      if (! (= test absent)) {
        access __x1__ = (test "Evaluation")
        let testRef = __x1__
        app __x2__ = (GetValue testRef)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let testValue = __x2__
        app __x3__ = (ToBoolean testValue)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        if (= __x3__ false) {
          app __x4__ = (NormalCompletion V)
          app __x5__ = (WrapCompletion __x4__)
          return __x5__
        } else {}
      } else {}
      access __x6__ = (stmt "Evaluation")
      let result = __x6__
      app __x7__ = (LoopContinues result labelSet)
      if (= __x7__ false) {
        app __x8__ = (UpdateEmpty result V)
        app __x9__ = (Completion __x8__)
        app __x10__ = (WrapCompletion __x9__)
        return __x10__
      } else {}
      if (! (= result["Value"] CONST_empty)) V = result["Value"] else {}
      app __x11__ = (CreatePerIterationEnvironment perIterationBindings)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      if (! (= increment absent)) {
        access __x12__ = (increment "Evaluation")
        let incRef = __x12__
        app __x13__ = (GetValue incRef)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
      } else {}
    }
  }
  */
}
