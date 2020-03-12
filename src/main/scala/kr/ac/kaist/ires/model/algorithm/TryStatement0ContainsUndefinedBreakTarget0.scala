package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36796), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36797), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(36798), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36800), ISeq(List()).setId(36814)).setId(36803), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Catch"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36805), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36806), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36807))).setId(36819))
  val instToStepMap: Map[Int, Int] = HashMap(36807 -> 3, 36800 -> 1, 36804 -> 2, 36797 -> 0, 36806 -> 3, 36801 -> 1, 36798 -> 0, 36808 -> 3, 36805 -> 3, 36799 -> 0, 36796 -> 0, 36803 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36796, 36797, 36798, 36799), 1 -> HashSet(36800, 36801), 2 -> HashSet(36803, 36804), 3 -> HashSet(36807, 36806, 36808, 36805))
  /* Beautified form:
  "TryStatement0ContainsUndefinedBreakTarget0" (this, Block, Catch, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
