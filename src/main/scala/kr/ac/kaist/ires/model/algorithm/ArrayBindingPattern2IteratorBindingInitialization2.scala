package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern2IteratorBindingInitialization2 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2IteratorBindingInitialization2""", List(Id("""this"""), Id("""BindingElementList"""), Id("""Elision"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""IteratorBindingInitialization""")).setId(28844), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28845), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28846), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28847)).setId(28848), ISeq(List()).setId(28864)).setId(28850), IExpr(ERef(RefId(Id("""__x1__""")))).setId(28851), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(28853), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(28854), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(28855), IReturn(ERef(RefId(Id("""__x4__""")))).setId(28856))).setId(28871))
  val instToStepMap: Map[Int, Int] = HashMap(28853 -> 1, 28850 -> 0, 28856 -> 1, 28844 -> 0, 28852 -> 0, 28855 -> 1, 28845 -> 0, 28851 -> 0, 28857 -> 1, 28854 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28850, 28844, 28852, 28845, 28851), 1 -> HashSet(28853, 28856, 28855, 28857, 28854))
  /* Beautified form:
  "ArrayBindingPattern2IteratorBindingInitialization2" (this, BindingElementList, Elision, iteratorRecord, environment) => {
    access __x0__ = (BindingElementList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ iteratorRecord)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
