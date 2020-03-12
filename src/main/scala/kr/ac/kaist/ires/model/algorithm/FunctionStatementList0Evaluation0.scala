package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(38653), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(38654), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38655))).setId(38661))
  val instToStepMap: Map[Int, Int] = Map(38656 -> 0, 38653 -> 0, 38654 -> 0, 38655 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38653, 38655, 38656, 38654))
  /* Beautified form:
  "FunctionStatementList0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
