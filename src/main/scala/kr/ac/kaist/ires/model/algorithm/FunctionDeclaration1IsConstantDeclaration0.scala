package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration1IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration1IsConstantDeclaration0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(false)).setId(38011))
  val instToStepMap: Map[Int, Int] = Map(38011 -> 0, 38012 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38012, 38011))
  /* Beautified form:
  "FunctionDeclaration1IsConstantDeclaration0" (this, FormalParameters, FunctionBody) => return false
  */
}
