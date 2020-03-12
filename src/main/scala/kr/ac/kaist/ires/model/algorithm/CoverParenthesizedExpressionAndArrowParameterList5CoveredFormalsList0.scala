package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList5CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList5CoveredFormalsList0""", List(Id("""this"""), Id("""Expression"""), Id("""BindingIdentifier""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38815))
  val instToStepMap: Map[Int, Int] = Map(38816 -> 0, 38815 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38816, 38815))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList5CoveredFormalsList0" (this, Expression, BindingIdentifier) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
