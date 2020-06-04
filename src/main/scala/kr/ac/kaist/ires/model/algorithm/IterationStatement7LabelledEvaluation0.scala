package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement7LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7LabelledEvaluation0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForDeclaration"""))), EStr("""BoundNames""")).setId(32748), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Expression"""))), ERef(RefId(Id("""CONST_enumerate"""))))).setId(32749), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32750), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32751)).setId(32752), ISeq(List()).setId(32753)).setId(32754), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x1__""")))).setId(32755), IApp(Id("""__x2__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""ForDeclaration"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_enumerate"""))), ERef(RefId(Id("""CONST_lexicalBinding"""))), ERef(RefId(Id("""labelSet"""))))).setId(32757), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(32758), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32759)).setId(32760), ISeq(List()).setId(32753)).setId(32761), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(32762), IReturn(ERef(RefId(Id("""__x3__""")))).setId(32763))).setId(-1))
  /* Beautified form:
  "IterationStatement7LabelledEvaluation0" (this, ForDeclaration, Expression, Statement, labelSet) => {
    access __x0__ = (ForDeclaration "BoundNames")
    app __x1__ = (ForInOfHeadEvaluation __x0__ Expression CONST_enumerate)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let keyResult = __x1__
    app __x2__ = (ForInOfBodyEvaluation ForDeclaration Statement keyResult CONST_enumerate CONST_lexicalBinding labelSet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
