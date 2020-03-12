package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Block0StatementRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44855), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44856))).setId(44861))
  val instToStepMap: Map[Int, Int] = Map(44855 -> 0, 44856 -> 0, 44857 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44857, 44856, 44855))
  /* Beautified form:
  "Block0StatementRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
