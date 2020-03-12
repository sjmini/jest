package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTtrim {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.trim""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(74261), IApp(Id("""__x0__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""S"""))), EStr("""start+end"""))).setId(74263), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74264), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74265)).setId(74266), ISeq(List()).setId(74278)).setId(74268), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(74269), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74270))).setId(74282))
  val instToStepMap: Map[Int, Int] = HashMap(74262 -> 0, 74261 -> 0, 74270 -> 1, 74271 -> 1, 74268 -> 1, 74263 -> 1, 74269 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(74262, 74261), 1 -> HashSet(74270, 74271, 74268, 74263, 74269))
  /* Beautified form:
  "GLOBAL.String.prototype.trim" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (TrimString S "start+end")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
