package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0NamedEvaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(41910), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(41911), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(41913), IExpr(ERef(RefId(Id("""__x1__""")))).setId(41914), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(41916), IReturn(ERef(RefId(Id("""__x2__""")))).setId(41917))).setId(41926))
  val instToStepMap: Map[Int, Int] = HashMap(41911 -> 0, 41918 -> 2, 41914 -> 1, 41910 -> 0, 41915 -> 1, 41912 -> 0, 41916 -> 2, 41917 -> 2, 41913 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41911, 41910, 41912), 1 -> HashSet(41914, 41915, 41913), 2 -> HashSet(41918, 41916, 41917))
  /* Beautified form:
  "AsyncGeneratorExpression0NamedEvaluation0" (this, FormalParameters, AsyncGeneratorBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
