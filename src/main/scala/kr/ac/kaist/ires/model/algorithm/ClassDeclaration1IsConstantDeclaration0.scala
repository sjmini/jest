package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassDeclaration1IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration1IsConstantDeclaration0""", List(Id("""this"""), Id("""ClassTail""")), None, IReturn(EBool(false)).setId(42469))
  val instToStepMap: Map[Int, Int] = Map(42469 -> 0, 42470 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42470, 42469))
  /* Beautified form:
  "ClassDeclaration1IsConstantDeclaration0" (this, ClassTail) => return false
  */
}
