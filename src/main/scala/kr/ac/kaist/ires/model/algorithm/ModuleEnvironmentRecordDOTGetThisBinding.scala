package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val func: Func = Func("""ModuleEnvironmentRecord.GetThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(49142), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49143))).setId(49148))
  val instToStepMap: Map[Int, Int] = Map(49142 -> 0, 49143 -> 0, 49144 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49142, 49144, 49143))
  /* Beautified form:
  "ModuleEnvironmentRecord.GetThisBinding" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }
  */
}
