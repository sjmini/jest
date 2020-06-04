package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentCanSuspend {
  val length: Int = 0
  val func: Func = Func("""AgentCanSuspend""", List(), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(8851), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""AR""")), EStr("""CanBlock"""))))).setId(8852), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8853))).setId(-1))
  /* Beautified form:
  "AgentCanSuspend" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["CanBlock"])
    return __x0__
  }
  */
}
