package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""ModuleEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List()).setId(49130))
  val instToStepMap: Map[Int, Int] = Map(49128 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49128))
  /* Beautified form:
  "ModuleEnvironmentRecord.DeleteBinding" (this, N) => {}
  */
}
