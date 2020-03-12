package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement11VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement11VarScopedDeclarations0""", List(Id("""this"""), Id("""ThrowStatement""")), None, IReturn(EList(List())).setId(25889))
  val instToStepMap: Map[Int, Int] = Map(25889 -> 0, 25890 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25890, 25889))
  /* Beautified form:
  "Statement11VarScopedDeclarations0" (this, ThrowStatement) => return (new [])
  */
}
