package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorMethod0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorMethod0ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(41423), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(41424), IReturn(ERef(RefId(Id("""__x1__""")))).setId(41425))).setId(41431))
  val instToStepMap: Map[Int, Int] = Map(41424 -> 0, 41425 -> 0, 41426 -> 0, 41423 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41424, 41425, 41423, 41426))
  /* Beautified form:
  "AsyncGeneratorMethod0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
