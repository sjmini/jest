package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition5ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition5ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""PropertySetParameterList"""), Id("""FunctionBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(39454), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(39455), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39456))).setId(39462))
  val instToStepMap: Map[Int, Int] = Map(39456 -> 0, 39457 -> 0, 39454 -> 0, 39455 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39456, 39454, 39457, 39455))
  /* Beautified form:
  "MethodDefinition5ComputedPropertyContains0" (this, PropertyName, PropertySetParameterList, FunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
