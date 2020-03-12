package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, IReturn(EList(List())).setId(36311))
  val instToStepMap: Map[Int, Int] = Map(36311 -> 0, 36312 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36312, 36311))
  /* Beautified form:
  "LabelledItem0LexicallyDeclaredNames0" (this, Statement) => return (new [])
  */
}
