package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1VarDeclaredNames0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, IReturn(EList(List())).setId(36459))
  val instToStepMap: Map[Int, Int] = Map(36459 -> 0, 36460 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36459, 36460))
  /* Beautified form:
  "LabelledItem1VarDeclaredNames0" (this, FunctionDeclaration) => return (new [])
  */
}
