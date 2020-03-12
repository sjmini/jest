package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement8LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement8LabelledEvaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(EList(List()), ERef(RefId(Id("""AssignmentExpression"""))), ERef(RefId(Id("""CONST_iterate"""))))).setId(32800), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(32801), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32802)).setId(32803), ISeq(List()).setId(32821)).setId(32805), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x0__""")))).setId(32806), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""LeftHandSideExpression"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_iterate"""))), ERef(RefId(Id("""CONST_assignment"""))), ERef(RefId(Id("""labelSet"""))))).setId(32808), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32809), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32810)).setId(32811), ISeq(List()).setId(32828)).setId(32812), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(32813), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32814))).setId(32832))
  val instToStepMap: Map[Int, Int] = HashMap(32800 -> 0, 32806 -> 0, 32807 -> 0, 32814 -> 1, 32813 -> 1, 32808 -> 1, 32805 -> 0, 32815 -> 1, 32812 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32800, 32806, 32807, 32805), 1 -> HashSet(32814, 32813, 32808, 32815, 32812))
  /* Beautified form:
  "IterationStatement8LabelledEvaluation0" (this, LeftHandSideExpression, AssignmentExpression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) AssignmentExpression CONST_iterate)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation LeftHandSideExpression Statement keyResult CONST_iterate CONST_assignment labelSet)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
