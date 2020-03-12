package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement1ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement1ComputedPropertyContains0""", List(Id("""this"""), Id("""MethodDefinition"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MethodDefinition"""))), EStr("""ComputedPropertyContains""")).setId(42436), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42437), IReturn(ERef(RefId(Id("""__x1__""")))).setId(42438))).setId(42444))
  val instToStepMap: Map[Int, Int] = Map(42436 -> 0, 42437 -> 0, 42438 -> 0, 42439 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42438, 42437, 42436, 42439))
  /* Beautified form:
  "ClassElement1ComputedPropertyContains0" (this, MethodDefinition, symbol) => {
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
