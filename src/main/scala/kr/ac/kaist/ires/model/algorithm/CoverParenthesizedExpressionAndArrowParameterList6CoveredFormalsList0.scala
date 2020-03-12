package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList6CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList6CoveredFormalsList0""", List(Id("""this"""), Id("""Expression"""), Id("""BindingPattern""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38820))
  val instToStepMap: Map[Int, Int] = Map(38820 -> 0, 38821 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38820, 38821))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList6CoveredFormalsList0" (this, Expression, BindingPattern) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
