package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression3ExpressionRules0""", List(Id("""this"""), Id("""ArrayLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45878), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45879))).setId(45884))
  val instToStepMap: Map[Int, Int] = Map(45878 -> 0, 45879 -> 0, 45880 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45879, 45880, 45878))
  /* Beautified form:
  "PrimaryExpression3ExpressionRules0" (this, ArrayLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
