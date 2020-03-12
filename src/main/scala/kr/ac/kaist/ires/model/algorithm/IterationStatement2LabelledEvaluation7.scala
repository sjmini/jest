package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement2LabelledEvaluation7 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement2LabelledEvaluation7""", List(Id("""this"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Expression2"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Expression0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression0"""))), EStr("""Evaluation""")).setId(31156), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(31157), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(31159), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(31160), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31161)).setId(31162), ISeq(List()).setId(31185)).setId(31164), IExpr(ERef(RefId(Id("""__x1__""")))).setId(31165))).setId(31188), ISeq(List()).setId(31189)).setId(31168), IApp(Id("""__x2__"""), ERef(RefId(Id("""ForBodyEvaluation"""))), List(ERef(RefId(Id("""Expression1"""))), ERef(RefId(Id("""Expression2"""))), ERef(RefId(Id("""Statement"""))), EList(List()), ERef(RefId(Id("""labelSet"""))))).setId(31170), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(31171), IReturn(ERef(RefId(Id("""__x2__""")))).setId(31172)).setId(31173), ISeq(List()).setId(31195)).setId(31174), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(31175), IReturn(ERef(RefId(Id("""__x3__""")))).setId(31176))).setId(31199))
  val instToStepMap: Map[Int, Int] = HashMap(31175 -> 5, 31156 -> 3, 31166 -> 3, 31176 -> 5, 31165 -> 3, 31169 -> 4, 31158 -> 3, 31170 -> 5, 31159 -> 3, 31174 -> 5, 31168 -> 4, 31157 -> 3, 31164 -> 3, 31177 -> 5, 31167 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(31156, 31157, 31158), 3 -> HashSet(31156, 31166, 31165, 31158, 31159, 31167, 31157, 31164), 4 -> HashSet(31169, 31168), 5 -> HashSet(31175, 31176, 31170, 31174, 31177))
  /* Beautified form:
  "IterationStatement2LabelledEvaluation7" (this, Expression0, Expression1, Expression2, Statement, labelSet) => {
    if (! (= Expression0 absent)) {
      access __x0__ = (Expression0 "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    app __x2__ = (ForBodyEvaluation Expression1 Expression2 Statement (new []) labelSet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
