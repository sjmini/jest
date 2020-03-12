package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression12NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12NamedEvaluation0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(16113), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(16114), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""NamedEvaluation""")).setId(16116), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""name"""))))).setId(16117), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(16118), IReturn(ERef(RefId(Id("""__x3__""")))).setId(16119))).setId(16128))
  val instToStepMap: Map[Int, Int] = HashMap(16118 -> 1, 16114 -> 0, 16119 -> 1, 16116 -> 1, 16117 -> 1, 16113 -> 0, 16115 -> 0, 16120 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16114, 16115, 16113), 1 -> HashSet(16118, 16119, 16120, 16116, 16117))
  /* Beautified form:
  "PrimaryExpression12NamedEvaluation0" (this, CoverParenthesizedExpressionAndArrowParameterList, name) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "NamedEvaluation")
    app __x2__ = (__x1__ name)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
