package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ClassExpression0NamedEvaluation0""", List(Id("""this"""), Id("""ClassTail"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassTail"""))), EStr("""ClassDefinitionEvaluation""")).setId(43233), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EUndef, ERef(RefId(Id("""name"""))))).setId(43234), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(43235), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""value""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))).setId(43237), IReturn(ERef(RefId(Id("""value""")))).setId(43238)).setId(43239), ISeq(List()).setId(43240)).setId(43241), IExpr(ERef(RefId(Id("""value""")))).setId(43242), IAssign(RefProp(RefId(Id("""value""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43244), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(43246), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43247))).setId(-1))
  /* Beautified form:
  "ClassExpression0NamedEvaluation0" (this, ClassTail, name) => {
    access __x0__ = (ClassTail "ClassDefinitionEvaluation")
    app __x1__ = (__x0__ undefined name)
    let value = __x1__
    if (= (typeof value) "Completion") if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
    value
    value["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion value)
    return __x2__
  }
  */
}
