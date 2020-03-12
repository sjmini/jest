package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement6StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement6StatementRules0""", List(Id("""this"""), Id("""ContinueStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44815), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44816))).setId(44821))
  val instToStepMap: Map[Int, Int] = Map(44816 -> 0, 44817 -> 0, 44815 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44815, 44817, 44816))
  /* Beautified form:
  "Statement6StatementRules0" (this, ContinueStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
