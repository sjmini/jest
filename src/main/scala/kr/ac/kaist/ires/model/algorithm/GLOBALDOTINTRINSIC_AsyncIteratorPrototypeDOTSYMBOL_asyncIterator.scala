package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_AsyncIteratorPrototypeDOTSYMBOL_asyncIterator {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncIteratorPrototype.SYMBOL_asyncIterator""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(87765), IReturn(ERef(RefId(Id("""__x0__""")))).setId(87766))).setId(87771))
  val instToStepMap: Map[Int, Int] = Map(87765 -> 0, 87767 -> 0, 87766 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(87765, 87767, 87766))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncIteratorPrototype.SYMBOL_asyncIterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
