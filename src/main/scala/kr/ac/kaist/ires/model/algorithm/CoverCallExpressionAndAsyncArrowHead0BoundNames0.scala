package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverCallExpressionAndAsyncArrowHead0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""CoverCallExpressionAndAsyncArrowHead0BoundNames0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""CoveredAsyncArrowHead""")).setId(44128), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(44129), IAccess(Id("""__x1__"""), ERef(RefId(Id("""head"""))), EStr("""BoundNames""")).setId(44131), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44132))).setId(44139))
  val instToStepMap: Map[Int, Int] = HashMap(44128 -> 0, 44133 -> 1, 44129 -> 0, 44130 -> 0, 44131 -> 1, 44132 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44128, 44129, 44130), 1 -> HashSet(44133, 44131, 44132))
  /* Beautified form:
  "CoverCallExpressionAndAsyncArrowHead0BoundNames0" (this, MemberExpression, Arguments) => {
    access __x0__ = (this "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "BoundNames")
    return __x1__
  }
  */
}
