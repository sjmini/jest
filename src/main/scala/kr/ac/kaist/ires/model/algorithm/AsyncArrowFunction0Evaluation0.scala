package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowFunction0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction0Evaluation0""", List(Id("""this"""), Id("""AsyncArrowBindingIdentifier"""), Id("""AsyncConciseBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(44554), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(44555), ILet(Id("""parameters"""), ERef(RefId(Id("""AsyncArrowBindingIdentifier""")))).setId(44557), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Arrow"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""AsyncConciseBody"""))), ERef(RefId(Id("""scope"""))))).setId(44559), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(44560), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44561)).setId(44562), ISeq(List()).setId(44580)).setId(44564), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(44565), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(44567), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(44569), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44570))).setId(44586))
  val instToStepMap: Map[Int, Int] = HashMap(44564 -> 2, 44569 -> 4, 44556 -> 0, 44557 -> 1, 44570 -> 4, 44567 -> 3, 44558 -> 1, 44568 -> 3, 44566 -> 2, 44559 -> 2, 44555 -> 0, 44565 -> 2, 44571 -> 4, 44554 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(44556, 44554, 44555), 1 -> HashSet(44557, 44558), 2 -> HashSet(44564, 44566, 44559, 44565), 3 -> HashSet(44567, 44568), 4 -> HashSet(44569, 44570, 44571))
  /* Beautified form:
  "AsyncArrowFunction0Evaluation0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    let parameters = AsyncArrowBindingIdentifier
    app __x1__ = (AsyncFunctionCreate CONST_Arrow parameters AsyncConciseBody scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
