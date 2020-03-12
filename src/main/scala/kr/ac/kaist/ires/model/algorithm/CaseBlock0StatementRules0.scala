package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0StatementRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44915), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44916))).setId(44921))
  val instToStepMap: Map[Int, Int] = Map(44915 -> 0, 44916 -> 0, 44917 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44917, 44916, 44915))
  /* Beautified form:
  "CaseBlock0StatementRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
