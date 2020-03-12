package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration1BoundNames0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, IReturn(EList(List(EStr("""*default*""")))).setId(41416))
  val instToStepMap: Map[Int, Int] = Map(41416 -> 0, 41417 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41416, 41417))
  /* Beautified form:
  "AsyncGeneratorDeclaration1BoundNames0" (this, FormalParameters, AsyncGeneratorBody) => return (new ["*default*"])
  */
}
