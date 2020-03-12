package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0StatementRules0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(44967), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44968), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(44969), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44970))).setId(44977))
  val instToStepMap: Map[Int, Int] = HashMap(44971 -> 0, 44969 -> 0, 44968 -> 0, 44970 -> 0, 44967 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44971, 44969, 44968, 44970, 44967))
  /* Beautified form:
  "IfStatement0StatementRules0" (this, Expression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
