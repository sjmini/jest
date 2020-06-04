package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalBinding0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding0Evaluation0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(27278), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(27279), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(27280), IApp(Id("""__x2__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), EUndef)).setId(27282), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(27283), IReturn(ERef(RefId(Id("""__x3__""")))).setId(27284))).setId(-1))
  /* Beautified form:
  "LexicalBinding0Evaluation0" (this, BindingIdentifier) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__)
    let lhs = __x1__
    app __x2__ = (InitializeReferencedBinding lhs undefined)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
