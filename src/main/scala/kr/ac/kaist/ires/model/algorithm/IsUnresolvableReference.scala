package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsUnresolvableReference {
  val length: Int = 1
  val func: Func = Func("""IsUnresolvableReference""", List(Id("""V""")), None, IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(544), IReturn(ERef(RefId(Id("""__x0__""")))).setId(545))).setId(555), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(547), IReturn(ERef(RefId(Id("""__x1__""")))).setId(548))).setId(558)).setId(550))
  val instToStepMap: Map[Int, Int] = HashMap(550 -> 1, 546 -> 1, 551 -> 1, 547 -> 1, 545 -> 1, 548 -> 1, 544 -> 1, 549 -> 1, 543 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(543), 1 -> HashSet(550, 546, 551, 547, 545, 548, 544, 549))
  /* Beautified form:
  "IsUnresolvableReference" (V) => if (= V["BaseValue"] undefined) {
    app __x0__ = (WrapCompletion true)
    return __x0__
  } else {
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
