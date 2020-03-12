package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement2StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement2StatementRules0""", List(Id("""this"""), Id("""EmptyStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44795), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44796))).setId(44801))
  val instToStepMap: Map[Int, Int] = Map(44795 -> 0, 44796 -> 0, 44797 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44796, 44795, 44797))
  /* Beautified form:
  "Statement2StatementRules0" (this, EmptyStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
