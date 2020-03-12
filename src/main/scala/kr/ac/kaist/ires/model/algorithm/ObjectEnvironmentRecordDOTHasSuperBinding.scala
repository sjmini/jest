package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""ObjectEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47795), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47796))).setId(47801))
  val instToStepMap: Map[Int, Int] = Map(47795 -> 0, 47796 -> 0, 47797 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47795, 47796, 47797))
  /* Beautified form:
  "ObjectEnvironmentRecord.HasSuperBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
