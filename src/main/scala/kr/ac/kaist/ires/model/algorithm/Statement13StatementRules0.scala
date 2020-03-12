package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement13StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement13StatementRules0""", List(Id("""this"""), Id("""DebuggerStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44845), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44846))).setId(44851))
  val instToStepMap: Map[Int, Int] = Map(44845 -> 0, 44846 -> 0, 44847 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44847, 44846, 44845))
  /* Beautified form:
  "Statement13StatementRules0" (this, DebuggerStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
