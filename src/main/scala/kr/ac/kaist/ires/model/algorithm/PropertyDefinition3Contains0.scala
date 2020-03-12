package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinition3Contains0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition3Contains0""", List(Id("""this"""), Id("""MethodDefinition"""), Id("""symbol""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """MethodDefinition"""), IReturn(EBool(true)).setId(14395), ISeq(List()).setId(14408)).setId(14398), IAccess(Id("""__x0__"""), ERef(RefId(Id("""MethodDefinition"""))), EStr("""ComputedPropertyContains""")).setId(14402), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(14403), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14404))).setId(14413))
  val instToStepMap: Map[Int, Int] = HashMap(14404 -> 2, 14399 -> 1, 14396 -> 0, 14395 -> 0, 14398 -> 1, 14405 -> 2, 14402 -> 2, 14403 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14396, 14395), 1 -> HashSet(14399, 14398), 2 -> HashSet(14404, 14405, 14402, 14403))
  /* Beautified form:
  "PropertyDefinition3Contains0" (this, MethodDefinition, symbol) => {
    if (is-instance-of symbol MethodDefinition) return true else {}
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
