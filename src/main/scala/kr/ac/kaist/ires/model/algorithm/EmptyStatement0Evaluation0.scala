package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EmptyStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EmptyStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(30136), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(30137), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30138))).setId(-1))
  /* Beautified form:
  "EmptyStatement0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
