package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectLiteral2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectLiteral2Evaluation0""", List(Id("""this"""), Id("""PropertyDefinitionList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(14656), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))).setId(14657), IAccess(Id("""__x1__"""), ERef(RefId(Id("""PropertyDefinitionList"""))), EStr("""PropertyDefinitionEvaluation""")).setId(14659), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""obj"""))), EBool(true))).setId(14660), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14661), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14662)).setId(14663), ISeq(List()).setId(14664)).setId(14665), IExpr(ERef(RefId(Id("""__x2__""")))).setId(14666), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(14668), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14669))).setId(-1))
  /* Beautified form:
  "ObjectLiteral2Evaluation0" (this, PropertyDefinitionList) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x0__
    access __x1__ = (PropertyDefinitionList "PropertyDefinitionEvaluation")
    app __x2__ = (__x1__ obj true)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }
  */
}
