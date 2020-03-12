package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement5StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement5StatementRules0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(45015), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45016), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45017), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45018))).setId(45025))
  val instToStepMap: Map[Int, Int] = HashMap(45016 -> 0, 45019 -> 0, 45017 -> 0, 45015 -> 0, 45018 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45016, 45019, 45017, 45015, 45018))
  /* Beautified form:
  "IterationStatement5StatementRules0" (this, LeftHandSideExpression, Expression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
