package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""ModuleEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49132), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49133))).setId(49138))
  val instToStepMap: Map[Int, Int] = Map(49132 -> 0, 49133 -> 0, 49134 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49134, 49132, 49133))
  /* Beautified form:
  "ModuleEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
