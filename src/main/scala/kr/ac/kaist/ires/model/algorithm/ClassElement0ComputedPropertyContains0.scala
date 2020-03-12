package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement0ComputedPropertyContains0""", List(Id("""this"""), Id("""MethodDefinition"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MethodDefinition"""))), EStr("""ComputedPropertyContains""")).setId(42421), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(42423))).setId(42429))
  val instToStepMap: Map[Int, Int] = Map(42421 -> 0, 42422 -> 0, 42423 -> 0, 42424 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42424, 42423, 42422, 42421))
  /* Beautified form:
  "ClassElement0ComputedPropertyContains0" (this, MethodDefinition, symbol) => {
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
