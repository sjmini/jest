package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression2ExpressionRules0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45478), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45479))).setId(45484))
  val instToStepMap: Map[Int, Int] = Map(45478 -> 0, 45479 -> 0, 45480 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45480, 45479, 45478))
  /* Beautified form:
  "EqualityExpression2ExpressionRules0" (this, EqualityExpression, RelationalExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
