package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""DeclarativeEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47364), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47365))).setId(47370))
  val instToStepMap: Map[Int, Int] = Map(47364 -> 0, 47365 -> 0, 47366 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47365, 47364, 47366))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
