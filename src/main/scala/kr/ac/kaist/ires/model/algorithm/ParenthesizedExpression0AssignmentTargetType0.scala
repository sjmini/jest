package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ParenthesizedExpression0AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0AssignmentTargetType0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""AssignmentTargetType""")).setId(16103), IReturn(ERef(RefId(Id("""__x0__""")))).setId(16104))).setId(16109))
  val instToStepMap: Map[Int, Int] = Map(16103 -> 0, 16104 -> 0, 16105 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16103, 16105, 16104))
  /* Beautified form:
  "ParenthesizedExpression0AssignmentTargetType0" (this, Expression) => {
    access __x0__ = (Expression "AssignmentTargetType")
    return __x0__
  }
  */
}
