package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ParenthesizedExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0NamedEvaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""NamedEvaluation""")).setId(16137), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""name"""))))).setId(16138), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(16139), IReturn(ERef(RefId(Id("""__x2__""")))).setId(16140))).setId(16147))
  val instToStepMap: Map[Int, Int] = HashMap(16137 -> 1, 16141 -> 1, 16136 -> 0, 16140 -> 1, 16139 -> 1, 16138 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16136), 1 -> HashSet(16137, 16141, 16140, 16139, 16138))
  /* Beautified form:
  "ParenthesizedExpression0NamedEvaluation0" (this, Expression, name) => {
    access __x0__ = (Expression "NamedEvaluation")
    app __x1__ = (__x0__ name)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
