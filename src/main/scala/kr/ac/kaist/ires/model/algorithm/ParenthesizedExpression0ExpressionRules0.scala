package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ParenthesizedExpression0ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0ExpressionRules0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""HasCallInTailPosition""")).setId(46201), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46202), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(46203), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46204))).setId(46211))
  val instToStepMap: Map[Int, Int] = HashMap(46203 -> 0, 46202 -> 0, 46205 -> 0, 46201 -> 0, 46204 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46203, 46202, 46205, 46201, 46204))
  /* Beautified form:
  "ParenthesizedExpression0ExpressionRules0" (this, Expression) => {
    access __x0__ = (Expression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
