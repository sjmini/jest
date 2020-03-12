package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsPropertyReference {
  val length: Int = 1
  val func: Func = Func("""IsPropertyReference""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))))).setId(512), IApp(Id("""__x1__"""), ERef(RefId(Id("""HasPrimitiveBase"""))), List(ERef(RefId(Id("""V"""))))).setId(513), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EStr("""Object""")), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(514), IReturn(ERef(RefId(Id("""__x2__""")))).setId(515))).setId(527), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(517), IReturn(ERef(RefId(Id("""__x3__""")))).setId(518))).setId(530)).setId(520))).setId(532))
  val instToStepMap: Map[Int, Int] = HashMap(518 -> 1, 511 -> 0, 514 -> 1, 512 -> 1, 519 -> 1, 515 -> 1, 513 -> 1, 520 -> 1, 521 -> 1, 516 -> 1, 517 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(511), 1 -> HashSet(518, 514, 512, 519, 515, 513, 520, 521, 516, 517))
  /* Beautified form:
  "IsPropertyReference" (V) => {
    app __x0__ = (Type V["BaseValue"])
    app __x1__ = (HasPrimitiveBase V)
    if (|| (= __x0__ "Object") (= __x1__ true)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion false)
      return __x3__
    }
  }
  */
}
