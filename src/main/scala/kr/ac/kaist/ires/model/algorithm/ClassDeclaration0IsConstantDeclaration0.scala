package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, IReturn(EBool(false)).setId(42464))
  val instToStepMap: Map[Int, Int] = Map(42464 -> 0, 42465 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42465, 42464))
  /* Beautified form:
  "ClassDeclaration0IsConstantDeclaration0" (this, BindingIdentifier, ClassTail) => return false
  */
}
