package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement9StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9StatementRules0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44895), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44896))).setId(44901))
  val instToStepMap: Map[Int, Int] = Map(44896 -> 0, 44897 -> 0, 44895 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44896, 44897, 44895))
  /* Beautified form:
  "IterationStatement9StatementRules0" (this, ForBinding, AssignmentExpression, Statement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
