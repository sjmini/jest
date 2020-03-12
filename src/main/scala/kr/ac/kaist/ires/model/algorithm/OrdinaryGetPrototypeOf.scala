package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryGetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""OrdinaryGetPrototypeOf""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""O""")), EStr("""Prototype"""))))).setId(49199), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49200))).setId(49205))
  val instToStepMap: Map[Int, Int] = Map(49200 -> 0, 49201 -> 0, 49199 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49200, 49201, 49199))
  /* Beautified form:
  "OrdinaryGetPrototypeOf" (O) => {
    app __x0__ = (WrapCompletion O["Prototype"])
    return __x0__
  }
  */
}
