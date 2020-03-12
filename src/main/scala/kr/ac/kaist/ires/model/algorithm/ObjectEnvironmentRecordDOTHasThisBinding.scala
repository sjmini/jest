package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""ObjectEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47785), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47786))).setId(47791))
  val instToStepMap: Map[Int, Int] = Map(47785 -> 0, 47786 -> 0, 47787 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47787, 47785, 47786))
  /* Beautified form:
  "ObjectEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
