package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement11LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement11LabelledEvaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(EList(List()), ERef(RefId(Id("""AssignmentExpression"""))), ERef(RefId(Id("""CONST_asynciterate"""))))).setId(32950), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(32951), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32952)).setId(32953), ISeq(List()).setId(32971)).setId(32955), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x0__""")))).setId(32956), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""LeftHandSideExpression"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_iterate"""))), ERef(RefId(Id("""CONST_assignment"""))), ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""CONST_async"""))))).setId(32958), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32959), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32960)).setId(32961), ISeq(List()).setId(32978)).setId(32962), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(32963), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32964))).setId(32982))
  val instToStepMap: Map[Int, Int] = HashMap(32950 -> 0, 32962 -> 1, 32955 -> 0, 32963 -> 1, 32958 -> 1, 32957 -> 0, 32964 -> 1, 32965 -> 1, 32956 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32950, 32955, 32957, 32956), 1 -> HashSet(32962, 32963, 32958, 32964, 32965))
  /* Beautified form:
  "IterationStatement11LabelledEvaluation0" (this, LeftHandSideExpression, AssignmentExpression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) AssignmentExpression CONST_asynciterate)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation LeftHandSideExpression Statement keyResult CONST_iterate CONST_assignment labelSet CONST_async)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
