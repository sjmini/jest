package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HoistableDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration0Evaluation0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclaration"""))), EStr("""Evaluation""")).setId(26057), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(26058), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26059))).setId(-1))
  /* Beautified form:
  "HoistableDeclaration0Evaluation0" (this, FunctionDeclaration) => {
    access __x0__ = (FunctionDeclaration "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
