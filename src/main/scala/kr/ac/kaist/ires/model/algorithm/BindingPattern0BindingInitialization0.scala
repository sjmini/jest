package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingPattern0BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingPattern0BindingInitialization0""", List(Id("""this"""), Id("""ObjectBindingPattern"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))).setId(28199), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(28200), IReturn(ERef(RefId(Id("""__x0__""")))).setId(28201)).setId(28202), ISeq(List()).setId(28217)).setId(28204), IExpr(ERef(RefId(Id("""__x0__""")))).setId(28205), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ObjectBindingPattern"""))), EStr("""BindingInitialization""")).setId(28207), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(28208), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(28209), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28210))).setId(28224))
  val instToStepMap: Map[Int, Int] = HashMap(28205 -> 0, 28208 -> 1, 28210 -> 1, 28211 -> 1, 28204 -> 0, 28207 -> 1, 28206 -> 0, 28199 -> 0, 28209 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28205, 28204, 28206, 28199), 1 -> HashSet(28208, 28210, 28211, 28207, 28209))
  /* Beautified form:
  "BindingPattern0BindingInitialization0" (this, ObjectBindingPattern, value, environment) => {
    app __x0__ = (RequireObjectCoercible value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (ObjectBindingPattern "BindingInitialization")
    app __x2__ = (__x1__ value environment)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
