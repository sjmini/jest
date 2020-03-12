package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionBody0ContainsUseStrict0 {
  val length: Int = 0
  val func: Func = Func("""FunctionBody0ContainsUseStrict0""", List(Id("""this"""), Id("""FunctionStatementList""")), None, IExpr(ENotSupported("""Etc""")).setId(37868))
  val instToStepMap: Map[Int, Int] = Map(37868 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37868))
  /* Beautified form:
  "FunctionBody0ContainsUseStrict0" (this, FunctionStatementList) => !!! "Etc"
  */
}
