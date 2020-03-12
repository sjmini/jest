package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1Evaluation0""", List(Id("""this"""), Id("""Block"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")).setId(37563), ILet(Id("""B"""), ERef(RefId(Id("""__x0__""")))).setId(37564), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Finally"""))), EStr("""Evaluation""")).setId(37567), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(37568), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""F""")), ERef(RefId(Id("""B""")))).setId(37570), ISeq(List()).setId(37586)).setId(37573), IApp(Id("""__x2__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""F"""))), EUndef)).setId(37575), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(37576), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(37577), IReturn(ERef(RefId(Id("""__x4__""")))).setId(37578))).setId(37592))
  val instToStepMap: Map[Int, Int] = HashMap(37568 -> 1, 37573 -> 3, 37569 -> 1, 37579 -> 4, 37571 -> 2, 37575 -> 4, 37578 -> 4, 37576 -> 4, 37567 -> 1, 37570 -> 2, 37577 -> 4, 37563 -> 0, 37574 -> 3, 37565 -> 0, 37564 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(37563, 37565, 37564), 1 -> HashSet(37568, 37569, 37567), 2 -> HashSet(37570, 37571), 3 -> HashSet(37573, 37574), 4 -> HashSet(37577, 37579, 37575, 37578, 37576))
  /* Beautified form:
  "TryStatement1Evaluation0" (this, Block, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    access __x1__ = (Finally "Evaluation")
    let F = __x1__
    if (= F["Type"] CONST_normal) F = B else {}
    app __x2__ = (UpdateEmpty F undefined)
    app __x3__ = (Completion __x2__)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
