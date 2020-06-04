package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition2PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition2PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""AssignmentExpression"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(14983), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))).setId(14984), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))).setId(14986), IReturn(ERef(RefId(Id("""propKey""")))).setId(14987)).setId(14988), ISeq(List()).setId(14989)).setId(14990), IExpr(ERef(RefId(Id("""propKey""")))).setId(14991), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""AssignmentExpression"""))))).setId(14993), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""NamedEvaluation""")).setId(14994), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""propKey"""))))).setId(14995), ILet(Id("""propValue"""), ERef(RefId(Id("""__x3__""")))).setId(14996))).setId(14998), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(15000), ILet(Id("""exprValueRef"""), ERef(RefId(Id("""__x4__""")))).setId(15001), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprValueRef"""))))).setId(15003), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(15004), IReturn(ERef(RefId(Id("""__x5__""")))).setId(15005)).setId(15006), ISeq(List()).setId(14989)).setId(15007), ILet(Id("""propValue"""), ERef(RefId(Id("""__x5__""")))).setId(15008))).setId(15010)).setId(15011), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""propKey"""))), ERef(RefId(Id("""propValue"""))))).setId(15013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(15014), IReturn(ERef(RefId(Id("""__x6__""")))).setId(15015)).setId(15016), ISeq(List()).setId(14989)).setId(15017), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(15018), IReturn(ERef(RefId(Id("""__x7__""")))).setId(15019))).setId(-1))
  /* Beautified form:
  "PropertyDefinition2PropertyDefinitionEvaluation0" (this, PropertyName, AssignmentExpression, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    app __x1__ = (IsAnonymousFunctionDefinition AssignmentExpression)
    if (= __x1__ true) {
      access __x2__ = (AssignmentExpression "NamedEvaluation")
      app __x3__ = (__x2__ propKey)
      let propValue = __x3__
    } else {
      access __x4__ = (AssignmentExpression "Evaluation")
      let exprValueRef = __x4__
      app __x5__ = (GetValue exprValueRef)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let propValue = __x5__
    }
    app __x6__ = (CreateDataPropertyOrThrow object propKey propValue)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
