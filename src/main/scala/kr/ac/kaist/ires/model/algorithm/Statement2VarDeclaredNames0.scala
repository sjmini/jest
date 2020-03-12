package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement2VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement2VarDeclaredNames0""", List(Id("""this"""), Id("""EmptyStatement""")), None, IReturn(EList(List())).setId(25829))
  val instToStepMap: Map[Int, Int] = Map(25829 -> 0, 25830 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25830, 25829))
  /* Beautified form:
  "Statement2VarDeclaredNames0" (this, EmptyStatement) => return (new [])
  */
}
