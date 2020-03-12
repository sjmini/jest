package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTBooleanDOTprototypeDOTvalueOf {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Boolean.prototype.valueOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisBooleanValue"""))), List(ERef(RefId(Id("""this"""))))).setId(67542), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(67543), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67544)).setId(67545), ISeq(List()).setId(67556)).setId(67547), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(67548), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67549))).setId(67560))
  val instToStepMap: Map[Int, Int] = HashMap(67550 -> 0, 67542 -> 0, 67547 -> 0, 67548 -> 0, 67549 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(67550, 67542, 67547, 67548, 67549))
  /* Beautified form:
  "GLOBAL.Boolean.prototype.valueOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisBooleanValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
