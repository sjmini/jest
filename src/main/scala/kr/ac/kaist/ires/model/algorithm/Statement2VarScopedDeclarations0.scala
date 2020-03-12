package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement2VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement2VarScopedDeclarations0""", List(Id("""this"""), Id("""EmptyStatement""")), None, IReturn(EList(List())).setId(25864))
  val instToStepMap: Map[Int, Int] = Map(25864 -> 0, 25865 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25865, 25864))
  /* Beautified form:
  "Statement2VarScopedDeclarations0" (this, EmptyStatement) => return (new [])
  */
}
