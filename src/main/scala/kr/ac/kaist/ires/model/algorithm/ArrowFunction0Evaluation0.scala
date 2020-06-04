package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowFunction0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArrowFunction0Evaluation0""", List(Id("""this"""), Id("""ArrowParameters"""), Id("""ConciseBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(39387), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(39388), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ArrowParameters"""))), EStr("""CoveredFormalsList""")).setId(39390), ILet(Id("""parameters"""), ERef(RefId(Id("""__x1__""")))).setId(39391), IApp(Id("""__x2__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Arrow"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""ConciseBody"""))), ERef(RefId(Id("""scope"""))))).setId(39393), ILet(Id("""closure"""), ERef(RefId(Id("""__x2__""")))).setId(39394), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(39396), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(39398), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39399))).setId(-1))
  /* Beautified form:
  "ArrowFunction0Evaluation0" (this, ArrowParameters, ConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    access __x1__ = (ArrowParameters "CoveredFormalsList")
    let parameters = __x1__
    app __x2__ = (FunctionCreate CONST_Arrow parameters ConciseBody scope)
    let closure = __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion closure)
    return __x3__
  }
  */
}
