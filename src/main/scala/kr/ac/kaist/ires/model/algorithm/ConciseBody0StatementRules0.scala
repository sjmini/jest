package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0StatementRules0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""HasCallInTailPosition""")).setId(44707), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44708), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(44709), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44710))).setId(44717))
  val instToStepMap: Map[Int, Int] = HashMap(44710 -> 0, 44707 -> 0, 44711 -> 0, 44708 -> 0, 44709 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44710, 44707, 44711, 44708, 44709))
  /* Beautified form:
  "ConciseBody0StatementRules0" (this, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
