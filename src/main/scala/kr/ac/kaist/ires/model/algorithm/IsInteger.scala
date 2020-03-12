package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsInteger {
  val length: Int = 1
  val func: Func = Func("""IsInteger""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3542), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3543), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3544))).setId(3569), ISeq(List()).setId(3570)).setId(3547), IIf(EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""argument"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""argument"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""argument"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3549), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3550))).setId(3574), ISeq(List()).setId(3575)).setId(3552), IApp(Id("""__x3__"""), ERef(RefId(Id("""abs"""))), List(ERef(RefId(Id("""argument"""))))).setId(3554), IApp(Id("""__x4__"""), ERef(RefId(Id("""floor"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(3555), IApp(Id("""__x5__"""), ERef(RefId(Id("""abs"""))), List(ERef(RefId(Id("""argument"""))))).setId(3556), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""__x5__"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3557), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3558))).setId(3582), ISeq(List()).setId(3583)).setId(3560), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3562), IReturn(ERef(RefId(Id("""__x7__""")))).setId(3563))).setId(3587))
  val instToStepMap: Map[Int, Int] = HashMap(3549 -> 2, 3562 -> 6, 3545 -> 0, 3542 -> 1, 3557 -> 4, 3559 -> 4, 3550 -> 2, 3556 -> 5, 3555 -> 5, 3563 -> 6, 3547 -> 1, 3551 -> 2, 3548 -> 1, 3561 -> 5, 3552 -> 3, 3543 -> 0, 3553 -> 3, 3554 -> 5, 3544 -> 0, 3564 -> 6, 3560 -> 5, 3558 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3545, 3544, 3543), 5 -> HashSet(3556, 3555, 3554, 3561, 3560), 1 -> HashSet(3542, 3547, 3548), 6 -> HashSet(3562, 3563, 3564), 2 -> HashSet(3549, 3550, 3551), 3 -> HashSet(3552, 3553), 4 -> HashSet(3557, 3559, 3558))
  /* Beautified form:
  "IsInteger" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Number)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (|| (|| (= argument NaN) (= argument Infinity)) (= argument -Infinity)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (abs argument)
    app __x4__ = (floor __x3__)
    app __x5__ = (abs argument)
    if (! (= __x4__ __x5__)) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (WrapCompletion true)
    return __x7__
  }
  */
}
