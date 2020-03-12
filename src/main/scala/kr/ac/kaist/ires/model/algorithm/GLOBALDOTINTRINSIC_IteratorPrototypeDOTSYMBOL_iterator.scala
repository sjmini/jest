package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_IteratorPrototypeDOTSYMBOL_iterator {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_IteratorPrototype.SYMBOL_iterator""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(87755), IReturn(ERef(RefId(Id("""__x0__""")))).setId(87756))).setId(87761))
  val instToStepMap: Map[Int, Int] = Map(87755 -> 0, 87757 -> 0, 87756 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(87756, 87755, 87757))
  /* Beautified form:
  "GLOBAL.INTRINSIC_IteratorPrototype.SYMBOL_iterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
