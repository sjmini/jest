package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0StatementRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44765), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44766))).setId(44771))
  val instToStepMap: Map[Int, Int] = Map(44765 -> 0, 44766 -> 0, 44767 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44767, 44766, 44765))
  /* Beautified form:
  "FunctionStatementList0StatementRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
