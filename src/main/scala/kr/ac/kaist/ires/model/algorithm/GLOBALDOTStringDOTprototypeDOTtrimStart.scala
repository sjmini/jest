package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTtrimStart {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.trimStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(74399), IApp(Id("""__x0__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""S"""))), EStr("""start"""))).setId(74401), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74402), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74403)).setId(74404), ISeq(List()).setId(74416)).setId(74406), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(74407), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74408))).setId(74420))
  val instToStepMap: Map[Int, Int] = HashMap(74401 -> 1, 74406 -> 1, 74400 -> 0, 74407 -> 1, 74399 -> 0, 74408 -> 1, 74409 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(74400, 74399), 1 -> HashSet(74401, 74406, 74407, 74408, 74409))
  /* Beautified form:
  "GLOBAL.String.prototype.trimStart" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (TrimString S "start")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
