package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement10LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement10LabelledEvaluation0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForDeclaration"""))), EStr("""BoundNames""")).setId(32898), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""AssignmentExpression"""))), ERef(RefId(Id("""CONST_iterate"""))))).setId(32899), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32900), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32901)).setId(32902), ISeq(List()).setId(32921)).setId(32904), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x1__""")))).setId(32905), IApp(Id("""__x2__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""ForDeclaration"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_iterate"""))), ERef(RefId(Id("""CONST_lexicalBinding"""))), ERef(RefId(Id("""labelSet"""))))).setId(32907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(32908), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32909)).setId(32910), ISeq(List()).setId(32928)).setId(32911), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(32912), IReturn(ERef(RefId(Id("""__x3__""")))).setId(32913))).setId(32932))
  val instToStepMap: Map[Int, Int] = HashMap(32913 -> 1, 32898 -> 0, 32912 -> 1, 32899 -> 0, 32904 -> 0, 32914 -> 1, 32907 -> 1, 32911 -> 1, 32906 -> 0, 32905 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32898, 32899, 32904, 32906, 32905), 1 -> HashSet(32913, 32912, 32914, 32907, 32911))
  /* Beautified form:
  "IterationStatement10LabelledEvaluation0" (this, ForDeclaration, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (ForDeclaration "BoundNames")
    app __x1__ = (ForInOfHeadEvaluation __x0__ AssignmentExpression CONST_iterate)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let keyResult = __x1__
    app __x2__ = (ForInOfBodyEvaluation ForDeclaration Statement keyResult CONST_iterate CONST_lexicalBinding labelSet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
