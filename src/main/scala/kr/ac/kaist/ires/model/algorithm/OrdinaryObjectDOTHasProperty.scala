package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = Func("""OrdinaryObject.HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryHasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50204), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50205), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50206)).setId(50207), ISeq(List()).setId(50218)).setId(50209), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(50210), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50211))).setId(50222))
  val instToStepMap: Map[Int, Int] = HashMap(50209 -> 0, 50211 -> 0, 50210 -> 0, 50212 -> 0, 50204 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(50209, 50211, 50210, 50212, 50204))
  /* Beautified form:
  "OrdinaryObject.HasProperty" (O, P) => {
    app __x0__ = (OrdinaryHasProperty O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
