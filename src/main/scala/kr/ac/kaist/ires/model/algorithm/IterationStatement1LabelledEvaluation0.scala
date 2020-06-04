package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1LabelledEvaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(30915), IWhile(EBool(true), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(30918), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(30919), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(30921), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(30922), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30923)).setId(30924), ISeq(List()).setId(30925)).setId(30926), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x1__""")))).setId(30927), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(30929), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(30930), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30931)).setId(30932), ISeq(List()).setId(30925)).setId(30933), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(30934), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(30935), IReturn(ERef(RefId(Id("""__x4__""")))).setId(30936))).setId(30937), ISeq(List()).setId(30925)).setId(30938), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")).setId(30941), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x5__""")))).setId(30942), IApp(Id("""__x6__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""labelSet"""))))).setId(30944), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""V"""))))).setId(30945), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(30946), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(30947), IReturn(ERef(RefId(Id("""__x9__""")))).setId(30948))).setId(30949), ISeq(List()).setId(30925)).setId(30950), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value""")))).setId(30952), ISeq(List()).setId(30925)).setId(30954))).setId(30956)).setId(30957))).setId(-1))
  /* Beautified form:
  "IterationStatement1LabelledEvaluation0" (this, Expression, Statement, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Expression "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exprValue = __x1__
      app __x2__ = (ToBoolean exprValue)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      if (= __x2__ false) {
        app __x3__ = (NormalCompletion V)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      access __x5__ = (Statement "Evaluation")
      let stmtResult = __x5__
      app __x6__ = (LoopContinues stmtResult labelSet)
      if (= __x6__ false) {
        app __x7__ = (UpdateEmpty stmtResult V)
        app __x8__ = (Completion __x7__)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
    }
  }
  */
}
