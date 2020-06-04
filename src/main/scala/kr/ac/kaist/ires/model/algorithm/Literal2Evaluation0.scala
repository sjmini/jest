package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Literal2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Literal2Evaluation0""", List(Id("""this"""), Id("""NumericLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""NumericLiteral"""))), EStr("""MV""")).setId(13743), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(13744), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13745))).setId(-1))
  /* Beautified form:
  "Literal2Evaluation0" (this, NumericLiteral) => {
    access __x0__ = (NumericLiteral "MV")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
