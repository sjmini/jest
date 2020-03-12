package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Finally"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(36965), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(36966), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(36967), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36969), ISeq(List()).setId(36983)).setId(36972), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(36974), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(36975), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36976))).setId(36988))
  val instToStepMap: Map[Int, Int] = HashMap(36968 -> 0, 36975 -> 3, 36977 -> 3, 36965 -> 0, 36970 -> 1, 36973 -> 2, 36966 -> 0, 36972 -> 2, 36967 -> 0, 36976 -> 3, 36974 -> 3, 36969 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36968, 36965, 36966, 36967), 1 -> HashSet(36970, 36969), 2 -> HashSet(36973, 36972), 3 -> HashSet(36975, 36977, 36974, 36976))
  /* Beautified form:
  "TryStatement1ContainsUndefinedContinueTarget0" (this, Block, Finally, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Finally "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }
  */
}
