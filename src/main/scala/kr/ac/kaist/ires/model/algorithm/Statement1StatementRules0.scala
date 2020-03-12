package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement1StatementRules0""", List(Id("""this"""), Id("""VariableStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44785), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44786))).setId(44791))
  val instToStepMap: Map[Int, Int] = Map(44785 -> 0, 44786 -> 0, 44787 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44785, 44786, 44787))
  /* Beautified form:
  "Statement1StatementRules0" (this, VariableStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
