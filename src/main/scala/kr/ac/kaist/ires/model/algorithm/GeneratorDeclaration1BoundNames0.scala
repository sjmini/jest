package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration1BoundNames0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, IReturn(EList(List(EStr("""*default*""")))).setId(39957))
  val instToStepMap: Map[Int, Int] = Map(39957 -> 0, 39958 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39957, 39958))
  /* Beautified form:
  "GeneratorDeclaration1BoundNames0" (this, FormalParameters, GeneratorBody) => return (new ["*default*"])
  */
}
