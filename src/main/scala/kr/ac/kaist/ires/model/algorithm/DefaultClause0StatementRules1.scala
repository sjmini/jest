package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0StatementRules1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0StatementRules1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""HasCallInTailPosition""")).setId(45292), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45293), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45294), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45295))).setId(45308), ISeq(List()).setId(45309)).setId(45298), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45300), IReturn(ERef(RefId(Id("""__x3__""")))).setId(45301))).setId(45313))
  val instToStepMap: Map[Int, Int] = HashMap(45296 -> 0, 45292 -> 0, 45302 -> 2, 45295 -> 0, 45298 -> 1, 45294 -> 0, 45299 -> 1, 45293 -> 0, 45301 -> 2, 45300 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45296, 45292, 45295, 45294, 45293), 1 -> HashSet(45298, 45299), 2 -> HashSet(45302, 45301, 45300))
  /* Beautified form:
  "DefaultClause0StatementRules1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "HasCallInTailPosition")
      app __x1__ = (__x0__ call)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
