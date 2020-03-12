package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression5ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""IdentifierName""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45778), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45779))).setId(45784))
  val instToStepMap: Map[Int, Int] = Map(45778 -> 0, 45779 -> 0, 45780 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45779, 45780, 45778))
  /* Beautified form:
  "CallExpression5ExpressionRules0" (this, CallExpression, IdentifierName) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
