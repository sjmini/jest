package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""NewExpression1ExpressionRules0""", List(Id("""this"""), Id("""NewExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45788), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45789))).setId(45794))
  val instToStepMap: Map[Int, Int] = Map(45788 -> 0, 45789 -> 0, 45790 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45790, 45789, 45788))
  /* Beautified form:
  "NewExpression1ExpressionRules0" (this, NewExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
