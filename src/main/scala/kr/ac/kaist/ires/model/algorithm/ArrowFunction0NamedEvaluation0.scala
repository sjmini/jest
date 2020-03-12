package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowFunction0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArrowFunction0NamedEvaluation0""", List(Id("""this"""), Id("""ArrowParameters"""), Id("""ConciseBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(39363), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(39364), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(39366), IExpr(ERef(RefId(Id("""__x1__""")))).setId(39367), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(39369), IReturn(ERef(RefId(Id("""__x2__""")))).setId(39370))).setId(39379))
  val instToStepMap: Map[Int, Int] = HashMap(39365 -> 0, 39364 -> 0, 39363 -> 0, 39368 -> 1, 39369 -> 2, 39367 -> 1, 39370 -> 2, 39366 -> 1, 39371 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39365, 39364, 39363), 1 -> HashSet(39368, 39367, 39366), 2 -> HashSet(39369, 39370, 39371))
  /* Beautified form:
  "ArrowFunction0NamedEvaluation0" (this, ArrowParameters, ConciseBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
