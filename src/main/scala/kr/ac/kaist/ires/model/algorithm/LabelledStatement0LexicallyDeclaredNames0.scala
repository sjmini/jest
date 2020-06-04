package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""LexicallyDeclaredNames""")).setId(36301), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36302))).setId(-1))
  /* Beautified form:
  "LabelledStatement0LexicallyDeclaredNames0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "LexicallyDeclaredNames")
    return __x0__
  }
  */
}
