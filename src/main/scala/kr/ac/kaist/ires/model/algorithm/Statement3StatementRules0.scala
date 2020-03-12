package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement3StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement3StatementRules0""", List(Id("""this"""), Id("""ExpressionStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44805), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44806))).setId(44811))
  val instToStepMap: Map[Int, Int] = Map(44805 -> 0, 44806 -> 0, 44807 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44806, 44807, 44805))
  /* Beautified form:
  "Statement3StatementRules0" (this, ExpressionStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
