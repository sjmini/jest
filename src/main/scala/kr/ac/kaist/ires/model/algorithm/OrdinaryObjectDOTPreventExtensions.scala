package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTPreventExtensions {
  val length: Int = 0
  val func: Func = Func("""OrdinaryObject.PreventExtensions""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryPreventExtensions"""))), List(ERef(RefId(Id("""O"""))))).setId(49383), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49384), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49385)).setId(49386), ISeq(List()).setId(49397)).setId(49388), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49389), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49390))).setId(49401))
  val instToStepMap: Map[Int, Int] = HashMap(49383 -> 0, 49389 -> 0, 49390 -> 0, 49391 -> 0, 49388 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49383, 49389, 49390, 49391, 49388))
  /* Beautified form:
  "OrdinaryObject.PreventExtensions" (O) => {
    app __x0__ = (OrdinaryPreventExtensions O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
