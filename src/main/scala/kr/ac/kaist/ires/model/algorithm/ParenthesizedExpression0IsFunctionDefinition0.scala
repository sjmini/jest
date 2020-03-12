package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ParenthesizedExpression0IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0IsFunctionDefinition0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""IsFunctionDefinition""")).setId(16093), IReturn(ERef(RefId(Id("""__x0__""")))).setId(16094))).setId(16099))
  val instToStepMap: Map[Int, Int] = Map(16093 -> 0, 16094 -> 0, 16095 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16095, 16094, 16093))
  /* Beautified form:
  "ParenthesizedExpression0IsFunctionDefinition0" (this, Expression) => {
    access __x0__ = (Expression "IsFunctionDefinition")
    return __x0__
  }
  */
}
