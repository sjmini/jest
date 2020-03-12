package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementList1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1StatementRules0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""HasCallInTailPosition""")).setId(44723), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44724), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(44725), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(44727), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44728))).setId(44744), ISeq(List()).setId(44745)).setId(44731), IAccess(Id("""__x3__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""HasCallInTailPosition""")).setId(44733), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(44734), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(44735), IReturn(ERef(RefId(Id("""__x5__""")))).setId(44736))).setId(44751))
  val instToStepMap: Map[Int, Int] = HashMap(44725 -> 0, 44737 -> 3, 44732 -> 2, 44736 -> 3, 44735 -> 3, 44728 -> 1, 44731 -> 2, 44734 -> 3, 44726 -> 0, 44723 -> 0, 44733 -> 3, 44727 -> 1, 44729 -> 1, 44724 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44725, 44726, 44723, 44724), 1 -> HashSet(44728, 44727, 44729), 2 -> HashSet(44732, 44731), 3 -> HashSet(44737, 44736, 44735, 44734, 44733))
  /* Beautified form:
  "StatementList1StatementRules0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (StatementListItem "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
