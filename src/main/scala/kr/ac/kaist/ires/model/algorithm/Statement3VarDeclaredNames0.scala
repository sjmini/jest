package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement3VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement3VarDeclaredNames0""", List(Id("""this"""), Id("""ExpressionStatement""")), None, IReturn(EList(List())).setId(25834))
  val instToStepMap: Map[Int, Int] = Map(25834 -> 0, 25835 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25834, 25835))
  /* Beautified form:
  "Statement3VarDeclaredNames0" (this, ExpressionStatement) => return (new [])
  */
}
