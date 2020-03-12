package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0BoundNames2 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0BoundNames2""", List(Id("""this"""), Id("""Elision""")), None, IReturn(EList(List())).setId(27782))
  val instToStepMap: Map[Int, Int] = Map(27782 -> 0, 27783 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27782, 27783))
  /* Beautified form:
  "ArrayBindingPattern0BoundNames2" (this, Elision) => return (new [])
  */
}
