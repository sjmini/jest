package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorMethod0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorMethod0ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""GeneratorBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(39964), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(39965), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39966))).setId(39972))
  val instToStepMap: Map[Int, Int] = Map(39964 -> 0, 39965 -> 0, 39966 -> 0, 39967 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39965, 39966, 39967, 39964))
  /* Beautified form:
  "GeneratorMethod0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, GeneratorBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
