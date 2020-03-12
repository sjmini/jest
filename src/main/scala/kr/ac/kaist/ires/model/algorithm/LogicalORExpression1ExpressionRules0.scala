package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LogicalORExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""LogicalORExpression1ExpressionRules0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""LogicalANDExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LogicalANDExpression"""))), EStr("""HasCallInTailPosition""")).setId(46058), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46059), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(46060), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46061))).setId(46068))
  val instToStepMap: Map[Int, Int] = HashMap(46060 -> 0, 46061 -> 0, 46062 -> 0, 46059 -> 0, 46058 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46060, 46061, 46062, 46059, 46058))
  /* Beautified form:
  "LogicalORExpression1ExpressionRules0" (this, LogicalORExpression, LogicalANDExpression) => {
    access __x0__ = (LogicalANDExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
