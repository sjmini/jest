package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement8VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement8VarScopedDeclarations0""", List(Id("""this"""), Id("""ReturnStatement""")), None, IReturn(EList(List())).setId(25884))
  val instToStepMap: Map[Int, Int] = Map(25884 -> 0, 25885 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25884, 25885))
  /* Beautified form:
  "Statement8VarScopedDeclarations0" (this, ReturnStatement) => return (new [])
  */
}
