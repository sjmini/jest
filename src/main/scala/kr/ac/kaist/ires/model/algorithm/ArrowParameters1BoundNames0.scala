package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowParameters1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters1BoundNames0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredFormalsList""")).setId(38666), ILet(Id("""formals"""), ERef(RefId(Id("""__x0__""")))).setId(38667), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""BoundNames""")).setId(38669), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38670))).setId(38677))
  val instToStepMap: Map[Int, Int] = HashMap(38670 -> 1, 38667 -> 0, 38666 -> 0, 38669 -> 1, 38668 -> 0, 38671 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38667, 38666, 38668), 1 -> HashSet(38670, 38669, 38671))
  /* Beautified form:
  "ArrowParameters1BoundNames0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "BoundNames")
    return __x1__
  }
  */
}
