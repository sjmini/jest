package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewTarget0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""NewTarget0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetNewTarget"""))), List()).setId(18642), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(18643), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18644))).setId(18650))
  val instToStepMap: Map[Int, Int] = Map(18642 -> 0, 18643 -> 0, 18644 -> 0, 18645 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18642, 18645, 18644, 18643))
  /* Beautified form:
  "NewTarget0Evaluation0" (this) => {
    app __x0__ = (GetNewTarget )
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
