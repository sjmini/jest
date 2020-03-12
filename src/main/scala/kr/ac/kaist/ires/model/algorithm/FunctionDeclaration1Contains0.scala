package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration1Contains0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration1Contains0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(37805))
  val instToStepMap: Map[Int, Int] = Map(37805 -> 0, 37806 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37805, 37806))
  /* Beautified form:
  "FunctionDeclaration1Contains0" (this, FormalParameters, FunctionBody, symbol) => return false
  */
}
