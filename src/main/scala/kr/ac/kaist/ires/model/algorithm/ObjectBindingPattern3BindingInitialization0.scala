package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectBindingPattern3BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern3BindingInitialization0""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""PropertyBindingInitialization""")).setId(28362), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(28363), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28364), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28365)).setId(28366), ISeq(List()).setId(28381)).setId(28368), IExpr(ERef(RefId(Id("""__x1__""")))).setId(28369), IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(28371), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(28372), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28373))).setId(28387))
  val instToStepMap: Map[Int, Int] = HashMap(28369 -> 0, 28363 -> 0, 28372 -> 1, 28368 -> 0, 28370 -> 0, 28362 -> 0, 28373 -> 1, 28371 -> 1, 28374 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28362, 28369, 28363, 28368, 28370), 1 -> HashSet(28373, 28372, 28371, 28374))
  /* Beautified form:
  "ObjectBindingPattern3BindingInitialization0" (this, BindingPropertyList, value, environment) => {
    access __x0__ = (BindingPropertyList "PropertyBindingInitialization")
    app __x1__ = (__x0__ value environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (NormalCompletion CONST_empty)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
