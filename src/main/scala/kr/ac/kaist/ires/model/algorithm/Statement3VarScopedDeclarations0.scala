package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement3VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement3VarScopedDeclarations0""", List(Id("""this"""), Id("""ExpressionStatement""")), None, IReturn(EList(List())).setId(25869))
  val instToStepMap: Map[Int, Int] = Map(25869 -> 0, 25870 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25869, 25870))
  /* Beautified form:
  "Statement3VarScopedDeclarations0" (this, ExpressionStatement) => return (new [])
  */
}
