package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Catch0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Catch0StatementRules0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""HasCallInTailPosition""")).setId(45372), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45373), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45374), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45375))).setId(45382))
  val instToStepMap: Map[Int, Int] = HashMap(45374 -> 0, 45376 -> 0, 45373 -> 0, 45372 -> 0, 45375 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45374, 45376, 45373, 45372, 45375))
  /* Beautified form:
  "Catch0StatementRules0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
