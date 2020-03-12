package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""GlobalEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48503), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48504))).setId(48509))
  val instToStepMap: Map[Int, Int] = Map(48503 -> 0, 48504 -> 0, 48505 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(48504, 48505, 48503))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasSuperBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
