package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition4PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition4PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""AssignmentExpression"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(14858), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x0__""")))).setId(14859), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(14861), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14862), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14863)).setId(14864), ISeq(List()).setId(14865)).setId(14866), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x1__""")))).setId(14867), ILet(Id("""excludedNames"""), EList(List())).setId(14869), IApp(Id("""__x2__"""), ERef(RefId(Id("""CopyDataProperties"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""fromValue"""))), ERef(RefId(Id("""excludedNames"""))))).setId(14871), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14872), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14873)).setId(14874), ISeq(List()).setId(14865)).setId(14875), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(14876), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14877))).setId(-1))
  /* Beautified form:
  "PropertyDefinition4PropertyDefinitionEvaluation0" (this, AssignmentExpression, object, enumerable) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let exprValue = __x0__
    app __x1__ = (GetValue exprValue)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let fromValue = __x1__
    let excludedNames = (new [])
    app __x2__ = (CopyDataProperties object fromValue excludedNames)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
