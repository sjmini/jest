package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTWithBaseObject {
  val length: Int = 0
  val func: Func = Func("""DeclarativeEnvironmentRecord.WithBaseObject""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(47384), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47385))).setId(47390))
  val instToStepMap: Map[Int, Int] = Map(47384 -> 0, 47385 -> 0, 47386 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47386, 47385, 47384))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.WithBaseObject" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }
  */
}
