package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""OrdinaryObject.GetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(49425), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49426), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49427)).setId(49428), ISeq(List()).setId(49439)).setId(49430), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49431), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49432))).setId(49443))
  val instToStepMap: Map[Int, Int] = HashMap(49432 -> 0, 49431 -> 0, 49430 -> 0, 49433 -> 0, 49425 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49432, 49431, 49430, 49433, 49425))
  /* Beautified form:
  "OrdinaryObject.GetOwnProperty" (O, P) => {
    app __x0__ = (OrdinaryGetOwnProperty O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
