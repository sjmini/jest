package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement11StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement11StatementRules0""", List(Id("""this"""), Id("""ThrowStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44835), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44836))).setId(44841))
  val instToStepMap: Map[Int, Int] = Map(44835 -> 0, 44836 -> 0, 44837 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44835, 44836, 44837))
  /* Beautified form:
  "Statement11StatementRules0" (this, ThrowStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
