package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0NamedEvaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(40310), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(40311), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(40313), IExpr(ERef(RefId(Id("""__x1__""")))).setId(40314), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(40316), IReturn(ERef(RefId(Id("""__x2__""")))).setId(40317))).setId(40326))
  val instToStepMap: Map[Int, Int] = HashMap(40314 -> 1, 40315 -> 1, 40311 -> 0, 40316 -> 2, 40310 -> 0, 40317 -> 2, 40312 -> 0, 40313 -> 1, 40318 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40311, 40310, 40312), 1 -> HashSet(40314, 40315, 40313), 2 -> HashSet(40316, 40318, 40317))
  /* Beautified form:
  "GeneratorExpression0NamedEvaluation0" (this, FormalParameters, GeneratorBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
