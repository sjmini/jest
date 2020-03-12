package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration1BoundNames0""", List(Id("""this"""), Id("""ClassTail""")), None, IReturn(EList(List(EStr("""*default*""")))).setId(42206))
  val instToStepMap: Map[Int, Int] = Map(42206 -> 0, 42207 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42207, 42206))
  /* Beautified form:
  "ClassDeclaration1BoundNames0" (this, ClassTail) => return (new ["*default*"])
  */
}
