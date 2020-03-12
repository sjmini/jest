package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ExpressionStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ExpressionStatement0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(30150), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(30151), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(30153), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(30154), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30155)).setId(30156), ISeq(List()).setId(30169)).setId(30158), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(30159), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30160))).setId(30173))
  val instToStepMap: Map[Int, Int] = HashMap(30158 -> 1, 30160 -> 1, 30151 -> 0, 30159 -> 1, 30152 -> 0, 30161 -> 1, 30150 -> 0, 30153 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30150, 30151, 30152), 1 -> HashSet(30158, 30160, 30153, 30159, 30161))
  /* Beautified form:
  "ExpressionStatement0Evaluation0" (this, Expression) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
