package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0Evaluation0""", List(Id("""this"""), Id("""Block"""), Id("""Catch""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")).setId(37519), ILet(Id("""B"""), ERef(RefId(Id("""__x0__""")))).setId(37520), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""B""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""CatchClauseEvaluation""")).setId(37522), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefProp(RefId(Id("""B""")), EStr("""Value"""))))).setId(37523), ILet(Id("""C"""), ERef(RefId(Id("""__x2__""")))).setId(37524))).setId(37541), ILet(Id("""C"""), ERef(RefId(Id("""B""")))).setId(37526)).setId(37528), IApp(Id("""__x3__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""C"""))), EUndef)).setId(37530), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(37531), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(37532), IReturn(ERef(RefId(Id("""__x5__""")))).setId(37533))).setId(37548))
  val instToStepMap: Map[Int, Int] = HashMap(37522 -> 1, 37532 -> 3, 37526 -> 2, 37520 -> 0, 37523 -> 1, 37527 -> 2, 37531 -> 3, 37519 -> 0, 37524 -> 1, 37528 -> 2, 37530 -> 3, 37533 -> 3, 37525 -> 1, 37521 -> 0, 37534 -> 3, 37529 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37520, 37519, 37521), 1 -> HashSet(37522, 37523, 37524, 37525), 2 -> HashSet(37526, 37527, 37529, 37528), 3 -> HashSet(37532, 37531, 37534, 37530, 37533))
  /* Beautified form:
  "TryStatement0Evaluation0" (this, Block, Catch) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    if (= B["Type"] CONST_throw) {
      access __x1__ = (Catch "CatchClauseEvaluation")
      app __x2__ = (__x1__ B["Value"])
      let C = __x2__
    } else let C = B
    app __x3__ = (UpdateEmpty C undefined)
    app __x4__ = (Completion __x3__)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
