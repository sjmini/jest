package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryIsExtensible {
  val length: Int = 1
  val func: Func = Func("""OrdinaryIsExtensible""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""O""")), EStr("""Extensible"""))))).setId(49373), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49374))).setId(49379))
  val instToStepMap: Map[Int, Int] = Map(49373 -> 0, 49374 -> 0, 49375 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49374, 49375, 49373))
  /* Beautified form:
  "OrdinaryIsExtensible" (O) => {
    app __x0__ = (WrapCompletion O["Extensible"])
    return __x0__
  }
  */
}
