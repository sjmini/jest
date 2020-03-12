package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression8ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression8ExpressionRules0""", List(Id("""this"""), Id("""AsyncFunctionExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45928), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45929))).setId(45934))
  val instToStepMap: Map[Int, Int] = Map(45928 -> 0, 45929 -> 0, 45930 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45928, 45929, 45930))
  /* Beautified form:
  "PrimaryExpression8ExpressionRules0" (this, AsyncFunctionExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
