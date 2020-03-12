package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LoopContinues {
  val length: Int = 2
  val func: Func = Func("""LoopContinues""", List(Id("""completion"""), Id("""labelSet""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(30606), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30607))).setId(30633), ISeq(List()).setId(30634)).setId(30610), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_continue"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(30612), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30613))).setId(30638), ISeq(List()).setId(30639)).setId(30615), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Target"""))), ERef(RefId(Id("""CONST_empty""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(30617), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30618))).setId(30643), ISeq(List()).setId(30644)).setId(30620), IIf(EContains(ERef(RefId(Id("""labelSet"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Target""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(30622), IReturn(ERef(RefId(Id("""__x3__""")))).setId(30623))).setId(30648), ISeq(List()).setId(30649)).setId(30625), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(30627), IReturn(ERef(RefId(Id("""__x4__""")))).setId(30628))).setId(30653))
  val instToStepMap: Map[Int, Int] = HashMap(30606 -> 0, 30611 -> 1, 30626 -> 7, 30615 -> 3, 30612 -> 2, 30616 -> 3, 30627 -> 8, 30608 -> 0, 30614 -> 2, 30625 -> 7, 30610 -> 1, 30619 -> 4, 30624 -> 6, 30621 -> 5, 30620 -> 5, 30623 -> 6, 30613 -> 2, 30618 -> 4, 30628 -> 8, 30617 -> 4, 30622 -> 6, 30629 -> 8, 30607 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(30606, 30608, 30607), 5 -> HashSet(30621, 30620), 1 -> HashSet(30611, 30610), 6 -> HashSet(30624, 30623, 30622), 2 -> HashSet(30612, 30613, 30614), 7 -> HashSet(30626, 30625), 3 -> HashSet(30615, 30616), 8 -> HashSet(30627, 30628, 30629), 4 -> HashSet(30619, 30618, 30617))
  /* Beautified form:
  "LoopContinues" (completion, labelSet) => {
    if (= completion["Type"] CONST_normal) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    if (! (= completion["Type"] CONST_continue)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= completion["Target"] CONST_empty) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    if (contains labelSet completion["Target"]) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
