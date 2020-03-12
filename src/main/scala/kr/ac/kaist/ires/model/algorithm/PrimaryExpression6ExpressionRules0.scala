package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression6ExpressionRules0""", List(Id("""this"""), Id("""ClassExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45908), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45909))).setId(45914))
  val instToStepMap: Map[Int, Int] = Map(45908 -> 0, 45909 -> 0, 45910 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45908, 45909, 45910))
  /* Beautified form:
  "PrimaryExpression6ExpressionRules0" (this, ClassExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
