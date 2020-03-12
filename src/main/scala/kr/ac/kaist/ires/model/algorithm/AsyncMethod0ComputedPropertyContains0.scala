package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncMethod0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncMethod0ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncFunctionBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(43384), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(43385), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43386))).setId(43392))
  val instToStepMap: Map[Int, Int] = Map(43384 -> 0, 43385 -> 0, 43386 -> 0, 43387 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43385, 43386, 43384, 43387))
  /* Beautified form:
  "AsyncMethod0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
