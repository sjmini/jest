package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetPromiseDOTSYMBOL_species {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getPromise.SYMBOL_species""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(92921), IReturn(ERef(RefId(Id("""__x0__""")))).setId(92922))).setId(92927))
  val instToStepMap: Map[Int, Int] = Map(92921 -> 0, 92923 -> 0, 92922 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(92923, 92921, 92922))
  /* Beautified form:
  "GLOBAL.getPromise.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
