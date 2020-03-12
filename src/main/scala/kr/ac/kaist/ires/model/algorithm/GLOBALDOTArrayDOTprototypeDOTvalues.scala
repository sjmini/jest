package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTvalues {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.values""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(83614), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(83615), IReturn(ERef(RefId(Id("""__x0__""")))).setId(83616)).setId(83617), ISeq(List()).setId(83631)).setId(83619), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(83620), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateArrayIterator"""))), List(ERef(RefId(Id("""O"""))), EStr("""value"""))).setId(83622), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(83623), IReturn(ERef(RefId(Id("""__x2__""")))).setId(83624))).setId(83637))
  val instToStepMap: Map[Int, Int] = HashMap(83614 -> 0, 83624 -> 1, 83622 -> 1, 83625 -> 1, 83621 -> 0, 83620 -> 0, 83619 -> 0, 83623 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(83614, 83619, 83621, 83620), 1 -> HashSet(83623, 83624, 83622, 83625))
  /* Beautified form:
  "GLOBAL.Array.prototype.values" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (CreateArrayIterator O "value")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
