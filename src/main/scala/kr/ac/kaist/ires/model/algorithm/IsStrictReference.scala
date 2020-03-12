package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsStrictReference {
  val length: Int = 1
  val func: Func = Func("""IsStrictReference""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""StrictReference"""))))).setId(472), IReturn(ERef(RefId(Id("""__x0__""")))).setId(473))).setId(478))
  val instToStepMap: Map[Int, Int] = Map(471 -> 0, 472 -> 1, 473 -> 1, 474 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(471), 1 -> HashSet(472, 473, 474))
  /* Beautified form:
  "IsStrictReference" (V) => {
    app __x0__ = (WrapCompletion V["StrictReference"])
    return __x0__
  }
  */
}
