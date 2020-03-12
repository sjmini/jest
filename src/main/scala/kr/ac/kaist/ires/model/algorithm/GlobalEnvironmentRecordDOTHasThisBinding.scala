package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""GlobalEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48493), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48494))).setId(48499))
  val instToStepMap: Map[Int, Int] = Map(48493 -> 0, 48494 -> 0, 48495 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(48493, 48494, 48495))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
