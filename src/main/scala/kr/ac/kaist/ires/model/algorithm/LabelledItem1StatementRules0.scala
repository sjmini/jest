package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1StatementRules0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44875), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44876))).setId(-1))
  /* Beautified form:
  "LabelledItem1StatementRules0" (this, FunctionDeclaration) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
