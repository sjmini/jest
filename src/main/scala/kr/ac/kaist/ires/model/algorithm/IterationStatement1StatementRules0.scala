package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1StatementRules0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(44999), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45000), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45001), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45002))).setId(45009))
  val instToStepMap: Map[Int, Int] = HashMap(45002 -> 0, 44999 -> 0, 45003 -> 0, 45001 -> 0, 45000 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45002, 44999, 45003, 45001, 45000))
  /* Beautified form:
  "IterationStatement1StatementRules0" (this, Expression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
