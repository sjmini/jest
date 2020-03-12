package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsSuperReference {
  val length: Int = 1
  val func: Func = Func("""IsSuperReference""", List(Id("""V""")), None, IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""thisValue"""))), EAbsent)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(568), IReturn(ERef(RefId(Id("""__x0__""")))).setId(569))).setId(579), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(571), IReturn(ERef(RefId(Id("""__x1__""")))).setId(572))).setId(582)).setId(574))
  val instToStepMap: Map[Int, Int] = HashMap(570 -> 1, 574 -> 1, 569 -> 1, 573 -> 1, 572 -> 1, 567 -> 0, 571 -> 1, 568 -> 1, 575 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(567), 1 -> HashSet(570, 574, 569, 573, 572, 571, 568, 575))
  /* Beautified form:
  "IsSuperReference" (V) => if (! (= V["thisValue"] absent)) {
    app __x0__ = (WrapCompletion true)
    return __x0__
  } else {
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
