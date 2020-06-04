package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(41406), IReturn(ERef(RefId(Id("""__x0__""")))).setId(41407))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
