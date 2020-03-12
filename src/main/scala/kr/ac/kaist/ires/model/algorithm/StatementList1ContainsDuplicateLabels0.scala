package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementList1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsDuplicateLabels""")).setId(26115), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(26116), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(26117), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(26119), ISeq(List()).setId(26133)).setId(26122), IAccess(Id("""__x2__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""ContainsDuplicateLabels""")).setId(26124), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(26125), IReturn(ERef(RefId(Id("""__x3__""")))).setId(26126))).setId(26138))
  val instToStepMap: Map[Int, Int] = HashMap(26120 -> 1, 26116 -> 0, 26117 -> 0, 26127 -> 3, 26118 -> 0, 26115 -> 0, 26119 -> 1, 26122 -> 2, 26124 -> 3, 26125 -> 3, 26126 -> 3, 26123 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26116, 26117, 26118, 26115), 1 -> HashSet(26120, 26119), 2 -> HashSet(26123, 26122), 3 -> HashSet(26127, 26126, 26124, 26125))
  /* Beautified form:
  "StatementList1ContainsDuplicateLabels0" (this, StatementList, StatementListItem, labelSet) => {
    access __x0__ = (StatementList "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (StatementListItem "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
