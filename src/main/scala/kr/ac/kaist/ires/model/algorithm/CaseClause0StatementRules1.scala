package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0StatementRules1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0StatementRules1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""HasCallInTailPosition""")).setId(45260), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45261), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45262), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45263))).setId(45276), ISeq(List()).setId(45277)).setId(45266), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45268), IReturn(ERef(RefId(Id("""__x3__""")))).setId(45269))).setId(45281))
  val instToStepMap: Map[Int, Int] = HashMap(45270 -> 2, 45260 -> 0, 45266 -> 1, 45264 -> 0, 45263 -> 0, 45267 -> 1, 45262 -> 0, 45268 -> 2, 45269 -> 2, 45261 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45260, 45264, 45263, 45262, 45261), 1 -> HashSet(45266, 45267), 2 -> HashSet(45270, 45268, 45269))
  /* Beautified form:
  "CaseClause0StatementRules1" (this, Expression, StatementList) => {
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
