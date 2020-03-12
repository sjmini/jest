package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList3CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList3CoveredFormalsList0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38805))
  val instToStepMap: Map[Int, Int] = Map(38805 -> 0, 38806 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38805, 38806))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList3CoveredFormalsList0" (this, BindingIdentifier) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
