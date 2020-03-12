package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ParenthesizedExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(16175), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(16176), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16177))).setId(16184))
  val instToStepMap: Map[Int, Int] = Map(16176 -> 0, 16177 -> 0, 16178 -> 0, 16175 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16176, 16178, 16177, 16175))
  /* Beautified form:
  "ParenthesizedExpression0Evaluation0" (this, Expression) => {
    access __x0__ = (Expression "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
