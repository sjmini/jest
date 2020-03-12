package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration1BoundNames0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EList(List(EStr("""*default*""")))).setId(37710))
  val instToStepMap: Map[Int, Int] = Map(37710 -> 0, 37711 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37711, 37710))
  /* Beautified form:
  "FunctionDeclaration1BoundNames0" (this, FormalParameters, FunctionBody) => return (new ["*default*"])
  */
}
