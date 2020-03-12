package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression10ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10ExpressionRules0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45948), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45949))).setId(45954))
  val instToStepMap: Map[Int, Int] = Map(45948 -> 0, 45949 -> 0, 45950 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45949, 45950, 45948))
  /* Beautified form:
  "PrimaryExpression10ExpressionRules0" (this, RegularExpressionLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
