package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncConciseBody0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody0VarDeclaredNames0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(44268))
  val instToStepMap: Map[Int, Int] = Map(44268 -> 0, 44269 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44269, 44268))
  /* Beautified form:
  "AsyncConciseBody0VarDeclaredNames0" (this, AssignmentExpression) => return (new [])
  */
}
