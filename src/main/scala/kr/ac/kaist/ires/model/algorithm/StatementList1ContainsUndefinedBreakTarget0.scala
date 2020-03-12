package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementList1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(26159), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(26160), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(26161), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(26163), ISeq(List()).setId(26177)).setId(26166), IAccess(Id("""__x2__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(26168), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(26169), IReturn(ERef(RefId(Id("""__x3__""")))).setId(26170))).setId(26182))
  val instToStepMap: Map[Int, Int] = HashMap(26160 -> 0, 26166 -> 2, 26170 -> 3, 26162 -> 0, 26159 -> 0, 26171 -> 3, 26168 -> 3, 26167 -> 2, 26169 -> 3, 26161 -> 0, 26164 -> 1, 26163 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26161, 26160, 26162, 26159), 1 -> HashSet(26164, 26163), 2 -> HashSet(26166, 26167), 3 -> HashSet(26169, 26170, 26171, 26168))
  /* Beautified form:
  "StatementList1ContainsUndefinedBreakTarget0" (this, StatementList, StatementListItem, labelSet) => {
    access __x0__ = (StatementList "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (StatementListItem "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
