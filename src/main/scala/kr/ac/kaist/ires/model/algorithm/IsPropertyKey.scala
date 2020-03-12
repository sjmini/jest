package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsPropertyKey {
  val length: Int = 1
  val func: Func = Func("""IsPropertyKey""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3610), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3611), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3612))).setId(3630), ISeq(List()).setId(3631)).setId(3615), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3617), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3618), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3619))).setId(3636), ISeq(List()).setId(3637)).setId(3621), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3623), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3624))).setId(3641))
  val instToStepMap: Map[Int, Int] = HashMap(3616 -> 1, 3621 -> 3, 3610 -> 1, 3618 -> 2, 3615 -> 1, 3622 -> 3, 3611 -> 0, 3624 -> 4, 3619 -> 2, 3623 -> 4, 3613 -> 0, 3617 -> 3, 3612 -> 0, 3620 -> 2, 3625 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3612, 3611, 3613), 1 -> HashSet(3616, 3610, 3615), 2 -> HashSet(3618, 3619, 3620), 3 -> HashSet(3617, 3621, 3622), 4 -> HashSet(3624, 3623, 3625))
  /* Beautified form:
  "IsPropertyKey" (argument) => {
    app __x0__ = (Type argument)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (Type argument)
    if (= __x2__ Symbol) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
