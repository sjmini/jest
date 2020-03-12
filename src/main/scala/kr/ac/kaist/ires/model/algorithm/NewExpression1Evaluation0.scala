package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""NewExpression1Evaluation0""", List(Id("""this"""), Id("""NewExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""EvaluateNew"""))), List(ERef(RefId(Id("""NewExpression"""))), ERef(RefId(Id("""CONST_empty"""))))).setId(16930), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(16931), IReturn(ERef(RefId(Id("""__x0__""")))).setId(16932)).setId(16933), ISeq(List()).setId(16944)).setId(16935), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(16936), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16937))).setId(16948))
  val instToStepMap: Map[Int, Int] = HashMap(16936 -> 0, 16937 -> 0, 16935 -> 0, 16938 -> 0, 16930 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16936, 16937, 16935, 16938, 16930))
  /* Beautified form:
  "NewExpression1Evaluation0" (this, NewExpression) => {
    app __x0__ = (EvaluateNew NewExpression CONST_empty)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
