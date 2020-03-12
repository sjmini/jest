package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration1BoundNames0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EList(List(EStr("""*default*""")))).setId(43377))
  val instToStepMap: Map[Int, Int] = Map(43377 -> 0, 43378 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43378, 43377))
  /* Beautified form:
  "AsyncFunctionDeclaration1BoundNames0" (this, FormalParameters, AsyncFunctionBody) => return (new ["*default*"])
  */
}
