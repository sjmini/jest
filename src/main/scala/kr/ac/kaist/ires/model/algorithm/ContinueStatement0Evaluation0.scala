package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ContinueStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ContinueStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_continue""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(33947), IReturn(ERef(RefId(Id("""__x0__""")))).setId(33948))).setId(-1))
  /* Beautified form:
  "ContinueStatement0Evaluation0" (this) => {
    app __x0__ = (WrapCompletion (new Completion("Type" -> CONST_continue, "Value" -> CONST_empty, "Target" -> CONST_empty)))
    return __x0__
  }
  */
}
