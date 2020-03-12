package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetGeneratorKind {
  val length: Int = 0
  val func: Func = Func("""GetGeneratorKind""", List(), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10714), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_nongenerator"""))))).setId(10716), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10717))).setId(10736), ISeq(List()).setId(10737)).setId(10720), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(10722), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_async"""))))).setId(10724), IReturn(ERef(RefId(Id("""__x1__""")))).setId(10725))).setId(10742), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_sync"""))))).setId(10727), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10728))).setId(10745)).setId(10730))).setId(10747))
  val instToStepMap: Map[Int, Int] = HashMap(10730 -> 5, 10722 -> 3, 10729 -> 5, 10725 -> 4, 10721 -> 2, 10720 -> 2, 10728 -> 5, 10714 -> 0, 10727 -> 5, 10718 -> 1, 10723 -> 3, 10715 -> 0, 10726 -> 4, 10716 -> 1, 10731 -> 5, 10717 -> 1, 10724 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10715, 10714), 5 -> HashSet(10730, 10729, 10731, 10728, 10727), 1 -> HashSet(10716, 10717, 10718), 2 -> HashSet(10721, 10720), 3 -> HashSet(10722, 10723), 4 -> HashSet(10726, 10725, 10724))
  /* Beautified form:
  "GetGeneratorKind" () => {
    let genContext = GLOBAL_context
    if (= genContext["Generator"] absent) {
      app __x0__ = (WrapCompletion CONST_nongenerator)
      return __x0__
    } else {}
    let generator = genContext["Generator"]
    if (! (= generator["AsyncGeneratorState"] absent)) {
      app __x1__ = (WrapCompletion CONST_async)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion CONST_sync)
      return __x2__
    }
  }
  */
}
