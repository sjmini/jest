package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Finally"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36830), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36831), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(36832), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36834), ISeq(List()).setId(36848)).setId(36837), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36839), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36840), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36841))).setId(36853))
  val instToStepMap: Map[Int, Int] = HashMap(36841 -> 3, 36832 -> 0, 36835 -> 1, 36838 -> 2, 36842 -> 3, 36839 -> 3, 36834 -> 1, 36833 -> 0, 36830 -> 0, 36840 -> 3, 36831 -> 0, 36837 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36832, 36833, 36830, 36831), 1 -> HashSet(36835, 36834), 2 -> HashSet(36838, 36837), 3 -> HashSet(36841, 36842, 36839, 36840))
  /* Beautified form:
  "TryStatement1ContainsUndefinedBreakTarget0" (this, Block, Finally, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Finally "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
