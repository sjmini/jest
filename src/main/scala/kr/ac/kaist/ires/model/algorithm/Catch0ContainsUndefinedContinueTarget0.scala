package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Catch0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Catch0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(37053), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(37054), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37055))).setId(37061))
  val instToStepMap: Map[Int, Int] = Map(37056 -> 0, 37053 -> 0, 37054 -> 0, 37055 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37055, 37054, 37053, 37056))
  /* Beautified form:
  "Catch0ContainsUndefinedContinueTarget0" (this, CatchParameter, Block, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
