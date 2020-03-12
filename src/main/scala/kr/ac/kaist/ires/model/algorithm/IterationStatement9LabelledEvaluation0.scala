package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement9LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9LabelledEvaluation0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(EList(List()), ERef(RefId(Id("""AssignmentExpression"""))), ERef(RefId(Id("""CONST_iterate"""))))).setId(32849), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(32850), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32851)).setId(32852), ISeq(List()).setId(32870)).setId(32854), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x0__""")))).setId(32855), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""ForBinding"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_iterate"""))), ERef(RefId(Id("""CONST_varBinding"""))), ERef(RefId(Id("""labelSet"""))))).setId(32857), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32858), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32859)).setId(32860), ISeq(List()).setId(32877)).setId(32861), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(32862), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32863))).setId(32881))
  val instToStepMap: Map[Int, Int] = HashMap(32854 -> 0, 32863 -> 1, 32855 -> 0, 32862 -> 1, 32856 -> 0, 32857 -> 1, 32861 -> 1, 32864 -> 1, 32849 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32854, 32855, 32856, 32849), 1 -> HashSet(32863, 32862, 32857, 32861, 32864))
  /* Beautified form:
  "IterationStatement9LabelledEvaluation0" (this, ForBinding, AssignmentExpression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) AssignmentExpression CONST_iterate)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation ForBinding Statement keyResult CONST_iterate CONST_varBinding labelSet)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
