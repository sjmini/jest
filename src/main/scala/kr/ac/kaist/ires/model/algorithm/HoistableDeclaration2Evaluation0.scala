package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HoistableDeclaration2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration2Evaluation0""", List(Id("""this"""), Id("""AsyncFunctionDeclaration""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(26030), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(26031), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26032))).setId(-1))
  /* Beautified form:
  "HoistableDeclaration2Evaluation0" (this, AsyncFunctionDeclaration) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
