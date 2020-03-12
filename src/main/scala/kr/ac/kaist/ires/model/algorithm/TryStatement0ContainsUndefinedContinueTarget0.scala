package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(36931), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(36932), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(36933), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36935), ISeq(List()).setId(36949)).setId(36938), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Catch"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(36940), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(36941), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36942))).setId(36954))
  val instToStepMap: Map[Int, Int] = HashMap(36939 -> 2, 36931 -> 0, 36935 -> 1, 36943 -> 3, 36938 -> 2, 36934 -> 0, 36932 -> 0, 36941 -> 3, 36942 -> 3, 36933 -> 0, 36936 -> 1, 36940 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36931, 36934, 36933, 36932), 1 -> HashSet(36935, 36936), 2 -> HashSet(36939, 36938), 3 -> HashSet(36943, 36942, 36940, 36941))
  /* Beautified form:
  "TryStatement0ContainsUndefinedContinueTarget0" (this, Block, Catch, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }
  */
}
