package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0IteratorBindingInitialization3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0IteratorBindingInitialization3""", List(Id("""this"""), Id("""Elision"""), Id("""BindingRestElement"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(28762), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(28763), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28764), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28765)).setId(28766), ISeq(List()).setId(28785)).setId(28768), IExpr(ERef(RefId(Id("""__x1__""")))).setId(28769))).setId(28788), ISeq(List()).setId(28789)).setId(28772), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""IteratorBindingInitialization""")).setId(28774), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28775), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(28776), IReturn(ERef(RefId(Id("""__x4__""")))).setId(28777))).setId(28795))
  val instToStepMap: Map[Int, Int] = HashMap(28769 -> 2, 28773 -> 3, 28762 -> 2, 28772 -> 3, 28771 -> 2, 28768 -> 2, 28777 -> 4, 28775 -> 4, 28770 -> 2, 28774 -> 4, 28778 -> 4, 28763 -> 2, 28776 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(28769, 28762, 28763, 28771, 28768, 28770), 3 -> HashSet(28773, 28772), 4 -> HashSet(28776, 28777, 28775, 28774, 28778))
  /* Beautified form:
  "ArrayBindingPattern0IteratorBindingInitialization3" (this, Elision, BindingRestElement, iteratorRecord, environment) => {
    if (! (= Elision absent)) {
      access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x1__ = (__x0__ iteratorRecord)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    access __x2__ = (BindingRestElement "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
