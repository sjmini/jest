package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetArrayDOTSYMBOL_species {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getArray.SYMBOL_species""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(75868), IReturn(ERef(RefId(Id("""__x0__""")))).setId(75869))).setId(75874))
  val instToStepMap: Map[Int, Int] = Map(75869 -> 0, 75868 -> 0, 75870 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(75869, 75868, 75870))
  /* Beautified form:
  "GLOBAL.getArray.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
