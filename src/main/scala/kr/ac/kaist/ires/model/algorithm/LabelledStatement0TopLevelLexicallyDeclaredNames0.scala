package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0TopLevelLexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0TopLevelLexicallyDeclaredNames0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, IReturn(EList(List())).setId(36346))
  val instToStepMap: Map[Int, Int] = Map(36346 -> 0, 36347 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36347, 36346))
  /* Beautified form:
  "LabelledStatement0TopLevelLexicallyDeclaredNames0" (this, LabelIdentifier, LabelledItem) => return (new [])
  */
}
