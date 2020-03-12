package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression6Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""EvaluateNew"""))), List(ERef(RefId(Id("""MemberExpression"""))), ERef(RefId(Id("""Arguments"""))))).setId(16958), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(16959), IReturn(ERef(RefId(Id("""__x0__""")))).setId(16960)).setId(16961), ISeq(List()).setId(16972)).setId(16963), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(16964), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16965))).setId(16976))
  val instToStepMap: Map[Int, Int] = HashMap(16965 -> 0, 16958 -> 0, 16964 -> 0, 16966 -> 0, 16963 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16965, 16958, 16964, 16966, 16963))
  /* Beautified form:
  "MemberExpression6Evaluation0" (this, MemberExpression, Arguments) => {
    app __x0__ = (EvaluateNew MemberExpression Arguments)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
