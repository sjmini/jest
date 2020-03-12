package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1VarScopedDeclarations0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, IReturn(EList(List())).setId(36474))
  val instToStepMap: Map[Int, Int] = Map(36474 -> 0, 36475 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36474, 36475))
  /* Beautified form:
  "LabelledItem1VarScopedDeclarations0" (this, FunctionDeclaration) => return (new [])
  */
}
