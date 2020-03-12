package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowFunction1Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction1Contains0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead"""), Id("""AsyncConciseBody"""), Id("""symbol""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """NewTarget"""), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperProperty""")), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperCall""")), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""super"""))), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""this""")))), IReturn(EBool(false)).setId(44169), ISeq(List()).setId(44189)).setId(44172), IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverCallExpressionAndAsyncArrowHead"""))), EStr("""CoveredAsyncArrowHead""")).setId(44174), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(44175), IAccess(Id("""__x1__"""), ERef(RefId(Id("""head"""))), EStr("""Contains""")).setId(44177), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(44178), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), IReturn(EBool(true)).setId(44179), ISeq(List()).setId(44196)).setId(44181), IAccess(Id("""__x3__"""), ERef(RefId(Id("""AsyncConciseBody"""))), EStr("""Contains""")).setId(44183), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(44184), IReturn(ERef(RefId(Id("""__x4__""")))).setId(44185))).setId(44201))
  val instToStepMap: Map[Int, Int] = HashMap(44174 -> 2, 44179 -> 3, 44170 -> 0, 44173 -> 1, 44186 -> 5, 44169 -> 0, 44177 -> 4, 44184 -> 5, 44185 -> 5, 44172 -> 1, 44178 -> 4, 44180 -> 3, 44183 -> 5, 44176 -> 2, 44181 -> 4, 44182 -> 4, 44175 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(44170, 44169), 5 -> HashSet(44183, 44186, 44184, 44185), 1 -> HashSet(44173, 44172), 2 -> HashSet(44174, 44176, 44175), 3 -> HashSet(44179, 44180), 4 -> HashSet(44177, 44181, 44178, 44182))
  /* Beautified form:
  "AsyncArrowFunction1Contains0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (CoverCallExpressionAndAsyncArrowHead "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "Contains")
    app __x2__ = (__x1__ symbol)
    if (= __x2__ true) return true else {}
    access __x3__ = (AsyncConciseBody "Contains")
    app __x4__ = (__x3__ symbol)
    return __x4__
  }
  */
}
