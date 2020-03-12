package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ReturnStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""ReturnStatement0StatementRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44865), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44866))).setId(44871))
  val instToStepMap: Map[Int, Int] = Map(44865 -> 0, 44866 -> 0, 44867 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44866, 44867, 44865))
  /* Beautified form:
  "ReturnStatement0StatementRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
