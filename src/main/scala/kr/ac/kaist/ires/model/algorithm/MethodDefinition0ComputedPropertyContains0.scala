package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(39424), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(39425), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39426))).setId(39432))
  val instToStepMap: Map[Int, Int] = Map(39424 -> 0, 39425 -> 0, 39426 -> 0, 39427 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39427, 39426, 39425, 39424))
  /* Beautified form:
  "MethodDefinition0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, FunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
