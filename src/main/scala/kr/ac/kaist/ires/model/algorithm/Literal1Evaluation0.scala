package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Literal1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Literal1Evaluation0""", List(Id("""this"""), Id("""BooleanLiteral""")), None, ISeq(List(IIf(EBOp(OEq, EGetSyntax(ERef(RefId(Id("""BooleanLiteral""")))), EStr("""false""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(13709), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13710))).setId(13711), ISeq(List()).setId(13712)).setId(13713), IIf(EBOp(OEq, EGetSyntax(ERef(RefId(Id("""BooleanLiteral""")))), EStr("""true""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(13715), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13716))).setId(13717), ISeq(List()).setId(13712)).setId(13718))).setId(-1))
  /* Beautified form:
  "Literal1Evaluation0" (this, BooleanLiteral) => {
    if (= (get-syntax BooleanLiteral) "false") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= (get-syntax BooleanLiteral) "true") {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
  }
  */
}
