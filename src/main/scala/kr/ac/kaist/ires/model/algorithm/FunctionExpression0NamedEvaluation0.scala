package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0NamedEvaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(38497), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(38498), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(38500), IExpr(ERef(RefId(Id("""__x1__""")))).setId(38501), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(38503), IReturn(ERef(RefId(Id("""__x2__""")))).setId(38504))).setId(38513))
  val instToStepMap: Map[Int, Int] = HashMap(38503 -> 2, 38498 -> 0, 38499 -> 0, 38504 -> 2, 38500 -> 1, 38501 -> 1, 38497 -> 0, 38502 -> 1, 38505 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38498, 38499, 38497), 1 -> HashSet(38500, 38501, 38502), 2 -> HashSet(38503, 38504, 38505))
  /* Beautified form:
  "FunctionExpression0NamedEvaluation0" (this, FormalParameters, FunctionBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
