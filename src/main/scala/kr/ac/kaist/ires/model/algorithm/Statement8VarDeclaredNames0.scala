package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement8VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement8VarDeclaredNames0""", List(Id("""this"""), Id("""ReturnStatement""")), None, IReturn(EList(List())).setId(25849))
  val instToStepMap: Map[Int, Int] = Map(25849 -> 0, 25850 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25849, 25850))
  /* Beautified form:
  "Statement8VarDeclaredNames0" (this, ReturnStatement) => return (new [])
  */
}
