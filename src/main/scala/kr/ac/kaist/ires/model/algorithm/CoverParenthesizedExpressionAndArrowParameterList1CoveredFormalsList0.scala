package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList1CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList1CoveredFormalsList0""", List(Id("""this"""), Id("""Expression""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38790))
  val instToStepMap: Map[Int, Int] = Map(38790 -> 0, 38791 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38791, 38790))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList1CoveredFormalsList0" (this, Expression) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
