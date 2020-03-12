package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowFunction1NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction1NamedEvaluation0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead"""), Id("""AsyncConciseBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(44530), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(44531), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(44533), IExpr(ERef(RefId(Id("""__x1__""")))).setId(44534), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(44536), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44537))).setId(44546))
  val instToStepMap: Map[Int, Int] = HashMap(44535 -> 1, 44533 -> 1, 44538 -> 2, 44532 -> 0, 44531 -> 0, 44530 -> 0, 44537 -> 2, 44536 -> 2, 44534 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44532, 44531, 44530), 1 -> HashSet(44535, 44533, 44534), 2 -> HashSet(44538, 44536, 44537))
  /* Beautified form:
  "AsyncArrowFunction1NamedEvaluation0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
