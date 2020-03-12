package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, IReturn(EList(List(ERef(RefId(Id("""FunctionDeclaration""")))))).setId(36444))
  val instToStepMap: Map[Int, Int] = Map(36444 -> 0, 36445 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36445, 36444))
  /* Beautified form:
  "LabelledItem1TopLevelVarScopedDeclarations0" (this, FunctionDeclaration) => return (new [FunctionDeclaration])
  */
}
