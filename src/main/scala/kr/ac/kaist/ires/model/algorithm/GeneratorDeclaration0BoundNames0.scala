package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(39947), IReturn(ERef(RefId(Id("""__x0__""")))).setId(39948))).setId(-1))
  /* Beautified form:
  "GeneratorDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, GeneratorBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
