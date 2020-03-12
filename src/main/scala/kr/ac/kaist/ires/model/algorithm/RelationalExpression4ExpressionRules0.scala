package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression4ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45538), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45539))).setId(45544))
  val instToStepMap: Map[Int, Int] = Map(45538 -> 0, 45539 -> 0, 45540 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45540, 45539, 45538))
  /* Beautified form:
  "RelationalExpression4ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
