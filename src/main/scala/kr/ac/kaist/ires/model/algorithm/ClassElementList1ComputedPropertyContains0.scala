package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList1ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList1ComputedPropertyContains0""", List(Id("""this"""), Id("""ClassElementList"""), Id("""ClassElement"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElementList"""))), EStr("""ComputedPropertyContains""")).setId(42383), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42384), ILet(Id("""inList"""), ERef(RefId(Id("""__x1__""")))).setId(42385), IIf(EBOp(OEq, ERef(RefId(Id("""inList"""))), EBool(true)), IReturn(EBool(true)).setId(42387), ISeq(List()).setId(42403)).setId(42390), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""ComputedPropertyContains""")).setId(42394), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42395), IReturn(ERef(RefId(Id("""__x3__""")))).setId(42396))).setId(42408))
  val instToStepMap: Map[Int, Int] = HashMap(42387 -> 1, 42391 -> 2, 42383 -> 0, 42397 -> 3, 42384 -> 0, 42388 -> 1, 42395 -> 3, 42385 -> 0, 42396 -> 3, 42390 -> 2, 42386 -> 0, 42394 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42385, 42383, 42384, 42386), 1 -> HashSet(42387, 42388), 2 -> HashSet(42391, 42390), 3 -> HashSet(42395, 42396, 42397, 42394))
  /* Beautified form:
  "ClassElementList1ComputedPropertyContains0" (this, ClassElementList, ClassElement, symbol) => {
    access __x0__ = (ClassElementList "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    let inList = __x1__
    if (= inList true) return true else {}
    access __x2__ = (ClassElement "ComputedPropertyContains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }
  */
}
