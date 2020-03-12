package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsStringPrefix {
  val length: Int = 2
  val func: Func = Func("""IsStringPrefix""", List(Id("""p"""), Id("""q""")), None, IExpr(ENotSupported("""Etc""")).setId(3755))
  val instToStepMap: Map[Int, Int] = Map(3754 -> 3, 3755 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(3754), 1 -> HashSet(3754), 2 -> HashSet(3755), 3 -> HashSet(3754))
  /* Beautified form:
  "IsStringPrefix" (p, q) => !!! "Etc"
  */
}
