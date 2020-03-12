package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression5ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45548), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45549))).setId(45554))
  val instToStepMap: Map[Int, Int] = Map(45548 -> 0, 45549 -> 0, 45550 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45549, 45548, 45550))
  /* Beautified form:
  "RelationalExpression5ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
