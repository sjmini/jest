package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object WithStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0StatementRules0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(45063), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45064), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45065), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45066))).setId(45073))
  val instToStepMap: Map[Int, Int] = HashMap(45065 -> 0, 45066 -> 0, 45067 -> 0, 45064 -> 0, 45063 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45065, 45066, 45067, 45064, 45063))
  /* Beautified form:
  "WithStatement0StatementRules0" (this, Expression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
