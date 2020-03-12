package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""DeclarativeEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47374), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47375))).setId(47380))
  val instToStepMap: Map[Int, Int] = Map(47376 -> 0, 47374 -> 0, 47375 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47376, 47375, 47374))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.HasSuperBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
