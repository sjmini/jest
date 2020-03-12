package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTWithBaseObject {
  val length: Int = 0
  val func: Func = Func("""GlobalEnvironmentRecord.WithBaseObject""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(48513), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48514))).setId(48519))
  val instToStepMap: Map[Int, Int] = Map(48513 -> 0, 48514 -> 0, 48515 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(48513, 48514, 48515))
  /* Beautified form:
  "GlobalEnvironmentRecord.WithBaseObject" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }
  */
}
