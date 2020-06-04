package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration0Evaluation0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""BindingClassDeclarationEvaluation""")).setId(43276), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(43277), IReturn(ERef(RefId(Id("""__x0__""")))).setId(43278)).setId(43279), ISeq(List()).setId(43280)).setId(43281), IExpr(ERef(RefId(Id("""__x0__""")))).setId(43282), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(43284), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(43285), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43286))).setId(-1))
  /* Beautified form:
  "ClassDeclaration0Evaluation0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (this "BindingClassDeclarationEvaluation")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
