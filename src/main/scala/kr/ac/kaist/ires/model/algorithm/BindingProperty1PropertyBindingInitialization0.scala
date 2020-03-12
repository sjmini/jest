package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingProperty1PropertyBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1PropertyBindingInitialization0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(28589), ILet(Id("""P"""), ERef(RefId(Id("""__x0__""")))).setId(28590), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""P""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""P""")), ERef(RefProp(RefId(Id("""P""")), EStr("""Value""")))).setId(28592), IReturn(ERef(RefId(Id("""P""")))).setId(28593)).setId(28594), ISeq(List()).setId(28616)).setId(28596), IExpr(ERef(RefId(Id("""P""")))).setId(28597), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""KeyedBindingInitialization""")).setId(28599), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""P"""))))).setId(28600), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(28601), IReturn(ERef(RefId(Id("""__x2__""")))).setId(28602)).setId(28603), ISeq(List()).setId(28624)).setId(28604), IExpr(ERef(RefId(Id("""__x2__""")))).setId(28605), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""P"""))))))).setId(28607), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28608))).setId(28629))
  val instToStepMap: Map[Int, Int] = HashMap(28590 -> 0, 28591 -> 0, 28599 -> 2, 28605 -> 2, 28596 -> 1, 28608 -> 3, 28597 -> 1, 28607 -> 3, 28589 -> 0, 28604 -> 2, 28600 -> 2, 28609 -> 3, 28598 -> 1, 28606 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28590, 28591, 28589), 1 -> HashSet(28596, 28597, 28598), 2 -> HashSet(28599, 28605, 28604, 28600, 28606), 3 -> HashSet(28608, 28607, 28609))
  /* Beautified form:
  "BindingProperty1PropertyBindingInitialization0" (this, PropertyName, BindingElement, value, environment) => {
    access __x0__ = (PropertyName "Evaluation")
    let P = __x0__
    if (= (typeof P) "Completion") if (= P["Type"] CONST_normal) P = P["Value"] else return P else {}
    P
    access __x1__ = (BindingElement "KeyedBindingInitialization")
    app __x2__ = (__x1__ value environment P)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new [P]))
    return __x3__
  }
  */
}
