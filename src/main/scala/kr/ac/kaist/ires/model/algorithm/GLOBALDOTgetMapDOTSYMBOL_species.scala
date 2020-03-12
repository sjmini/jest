package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetMapDOTSYMBOL_species {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getMap.SYMBOL_species""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(84427), IReturn(ERef(RefId(Id("""__x0__""")))).setId(84428))).setId(84433))
  val instToStepMap: Map[Int, Int] = Map(84427 -> 0, 84429 -> 0, 84428 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(84428, 84427, 84429))
  /* Beautified form:
  "GLOBAL.getMap.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
