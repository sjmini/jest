package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DebuggerStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""DebuggerStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IIf(ENotSupported("""ImplDependent"""), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(37668), IExpr(ENotSupported("""Etc""")).setId(37668))).setId(37669), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(37670), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(37671))).setId(37673)).setId(37674), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(37676), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37677))).setId(-1))
  /* Beautified form:
  "DebuggerStatement0Evaluation0" (this) => {
    if !!! "ImplDependent" {
      !!! "Etc"
      !!! "Etc"
    } else {
      app __x0__ = (NormalCompletion CONST_empty)
      let result = __x0__
    }
    app __x1__ = (WrapCompletion result)
    return __x1__
  }
  */
}
