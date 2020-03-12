package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAwait {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Await""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))).setId(61349), ILet(Id("""completion"""), ERef(RefId(Id("""__x0__""")))).setId(61350))).setId(61355))
  val instToStepMap: Map[Int, Int] = Map(61349 -> 0, 61350 -> 0, 61351 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(61349, 61350, 61351))
  /* Beautified form:
  "GLOBAL.Await" (this, argumentsList, NewTarget) => {
    app __x0__ = (Await value)
    let completion = __x0__
  }
  */
}
