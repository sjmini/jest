package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction0Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction0Contains0""", List(Id("""this"""), Id("""AsyncArrowBindingIdentifier"""), Id("""AsyncConciseBody"""), Id("""symbol""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """NewTarget"""), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperProperty""")), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperCall""")), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""super"""))), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""this""")))), IReturn(EBool(false)).setId(44145), ISeq(List()).setId(44147)).setId(44148), IAccess(Id("""__x0__"""), ERef(RefId(Id("""AsyncConciseBody"""))), EStr("""Contains""")).setId(44150), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(44151), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44152))).setId(-1))
  /* Beautified form:
  "AsyncArrowFunction0Contains0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (AsyncConciseBody "Contains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
