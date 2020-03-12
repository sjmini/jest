package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement7StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement7StatementRules0""", List(Id("""this"""), Id("""BreakStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44825), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44826))).setId(44831))
  val instToStepMap: Map[Int, Int] = Map(44825 -> 0, 44826 -> 0, 44827 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44825, 44827, 44826))
  /* Beautified form:
  "Statement7StatementRules0" (this, BreakStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
