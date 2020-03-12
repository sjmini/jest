package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression4ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""Expression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45768), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45769))).setId(45774))
  val instToStepMap: Map[Int, Int] = Map(45768 -> 0, 45769 -> 0, 45770 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45768, 45769, 45770))
  /* Beautified form:
  "CallExpression4ExpressionRules0" (this, CallExpression, Expression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
