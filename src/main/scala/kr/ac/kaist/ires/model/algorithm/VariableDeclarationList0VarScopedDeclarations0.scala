package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclarationList0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclarationList0VarScopedDeclarations0""", List(Id("""this"""), Id("""VariableDeclaration""")), None, IReturn(EList(List(ERef(RefId(Id("""VariableDeclaration""")))))).setId(27501))
  val instToStepMap: Map[Int, Int] = Map(27501 -> 0, 27502 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27502, 27501))
  /* Beautified form:
  "VariableDeclarationList0VarScopedDeclarations0" (this, VariableDeclaration) => return (new [VariableDeclaration])
  */
}
