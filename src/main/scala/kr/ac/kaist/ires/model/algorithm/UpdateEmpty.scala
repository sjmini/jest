package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateEmpty {
  val length: Int = 2
  val func: Func = Func("""UpdateEmpty""", List(Id("""completionRecord"""), Id("""value""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""completionRecord""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completionRecord"""))))).setId(421), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(423))).setId(434), ISeq(List()).setId(435)).setId(425), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefProp(RefId(Id("""completionRecord""")), EStr("""Type""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefProp(RefId(Id("""completionRecord""")), EStr("""Target""")))))))).setId(427), IReturn(ERef(RefId(Id("""__x2__""")))).setId(428))).setId(439))
  val instToStepMap: Map[Int, Int] = HashMap(421 -> 1, 428 -> 3, 420 -> 0, 425 -> 2, 423 -> 1, 426 -> 2, 422 -> 1, 427 -> 3, 424 -> 1, 429 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(420), 1 -> HashSet(421, 424, 423, 422), 2 -> HashSet(425, 426), 3 -> HashSet(428, 429, 427))
  /* Beautified form:
  "UpdateEmpty" (completionRecord, value) => {
    if (! (= completionRecord["Value"] CONST_empty)) {
      app __x0__ = (Completion completionRecord)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion (new Completion("Type" -> completionRecord["Type"], "Value" -> value, "Target" -> completionRecord["Target"])))
    return __x2__
  }
  */
}
