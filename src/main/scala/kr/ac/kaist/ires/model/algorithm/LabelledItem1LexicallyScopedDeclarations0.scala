package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, IReturn(EList(List(ERef(RefId(Id("""FunctionDeclaration""")))))).setId(36341))
  val instToStepMap: Map[Int, Int] = Map(36341 -> 0, 36342 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36341, 36342))
  /* Beautified form:
  "LabelledItem1LexicallyScopedDeclarations0" (this, FunctionDeclaration) => return (new [FunctionDeclaration])
  */
}
