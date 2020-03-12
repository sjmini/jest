package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList2CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList2CoveredFormalsList0""", List(Id("""this""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38800))
  val instToStepMap: Map[Int, Int] = Map(38800 -> 0, 38801 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38801, 38800))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList2CoveredFormalsList0" (this) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
