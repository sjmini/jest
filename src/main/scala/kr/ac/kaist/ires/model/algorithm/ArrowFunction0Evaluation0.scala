package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowFunction0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArrowFunction0Evaluation0""", List(Id("""this"""), Id("""ArrowParameters"""), Id("""ConciseBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(39387), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(39388), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ArrowParameters"""))), EStr("""CoveredFormalsList""")).setId(39390), ILet(Id("""parameters"""), ERef(RefId(Id("""__x1__""")))).setId(39391), IApp(Id("""__x2__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Arrow"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""ConciseBody"""))), ERef(RefId(Id("""scope"""))))).setId(39393), ILet(Id("""closure"""), ERef(RefId(Id("""__x2__""")))).setId(39394), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(39396), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(39398), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39399))).setId(39411))
  val instToStepMap: Map[Int, Int] = HashMap(39389 -> 0, 39396 -> 3, 39397 -> 3, 39399 -> 4, 39390 -> 1, 39387 -> 0, 39394 -> 2, 39391 -> 1, 39392 -> 1, 39388 -> 0, 39393 -> 2, 39398 -> 4, 39400 -> 4, 39395 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(39389, 39387, 39388), 1 -> HashSet(39390, 39391, 39392), 2 -> HashSet(39395, 39394, 39393), 3 -> HashSet(39396, 39397), 4 -> HashSet(39399, 39400, 39398))
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
