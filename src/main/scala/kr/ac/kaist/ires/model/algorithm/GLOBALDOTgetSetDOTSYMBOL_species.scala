package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetSetDOTSYMBOL_species {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getSet.SYMBOL_species""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(85660), IReturn(ERef(RefId(Id("""__x0__""")))).setId(85661))).setId(85666))
  val instToStepMap: Map[Int, Int] = Map(85661 -> 0, 85660 -> 0, 85662 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(85662, 85661, 85660))
  /* Beautified form:
  "GLOBAL.getSet.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
