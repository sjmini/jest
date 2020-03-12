package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetReferencedName {
  val length: Int = 1
  val func: Func = Func("""GetReferencedName""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""ReferencedName"""))))).setId(461), IReturn(ERef(RefId(Id("""__x0__""")))).setId(462))).setId(467))
  val instToStepMap: Map[Int, Int] = Map(460 -> 0, 461 -> 1, 462 -> 1, 463 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(460), 1 -> HashSet(461, 462, 463))
  /* Beautified form:
  "GetReferencedName" (V) => {
    app __x0__ = (WrapCompletion V["ReferencedName"])
    return __x0__
  }
  */
}
