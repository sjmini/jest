package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression4ExpressionRules0""", List(Id("""this"""), Id("""ObjectLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45888), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45889))).setId(45894))
  val instToStepMap: Map[Int, Int] = Map(45888 -> 0, 45889 -> 0, 45890 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45889, 45890, 45888))
  /* Beautified form:
  "PrimaryExpression4ExpressionRules0" (this, ObjectLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
