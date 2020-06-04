package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(26203), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(26204), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(26205), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(26207), ISeq(List()).setId(26209)).setId(26210), IAccess(Id("""__x2__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(26212), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(26213), IReturn(ERef(RefId(Id("""__x3__""")))).setId(26214))).setId(-1))
  /* Beautified form:
  "StatementList1ContainsUndefinedContinueTarget0" (this, StatementList, StatementListItem, iterationSet, labelSet) => {
    access __x0__ = (StatementList "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (StatementListItem "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }
  */
}
