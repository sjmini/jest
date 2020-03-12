package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingProperty0PropertyBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty0PropertyBindingInitialization0""", List(Id("""this"""), Id("""SingleNameBinding"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""SingleNameBinding"""))), EStr("""BoundNames""")).setId(28543), IAccess(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), EINum(0L)).setId(28544), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))).setId(28545), IAccess(Id("""__x2__"""), ERef(RefId(Id("""SingleNameBinding"""))), EStr("""KeyedBindingInitialization""")).setId(28547), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""name"""))))).setId(28548), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(28549), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28550)).setId(28551), ISeq(List()).setId(28568)).setId(28553), IExpr(ERef(RefId(Id("""__x3__""")))).setId(28554), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""name"""))))))).setId(28556), IReturn(ERef(RefId(Id("""__x4__""")))).setId(28557))).setId(28573))
  val instToStepMap: Map[Int, Int] = HashMap(28555 -> 1, 28546 -> 0, 28554 -> 1, 28558 -> 2, 28543 -> 0, 28553 -> 1, 28548 -> 1, 28557 -> 2, 28556 -> 2, 28545 -> 0, 28544 -> 0, 28547 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28546, 28544, 28543, 28545), 1 -> HashSet(28555, 28554, 28547, 28553, 28548), 2 -> HashSet(28558, 28557, 28556))
  /* Beautified form:
  "BindingProperty0PropertyBindingInitialization0" (this, SingleNameBinding, value, environment) => {
    access __x0__ = (SingleNameBinding "BoundNames")
    access __x1__ = (__x0__ 0i)
    let name = __x1__
    access __x2__ = (SingleNameBinding "KeyedBindingInitialization")
    app __x3__ = (__x2__ value environment name)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion (new [name]))
    return __x4__
  }
  */
}
