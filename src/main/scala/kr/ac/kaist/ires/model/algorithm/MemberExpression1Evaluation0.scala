package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Evaluation""")).setId(16648), ILet(Id("""baseReference"""), ERef(RefId(Id("""__x0__""")))).setId(16649), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""baseReference"""))))).setId(16651), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(16652), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16653)).setId(16654), ISeq(List()).setId(16700)).setId(16656), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x1__""")))).setId(16657), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(16660), ILet(Id("""propertyNameReference"""), ERef(RefId(Id("""__x2__""")))).setId(16661), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""propertyNameReference"""))))).setId(16663), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(16664), IReturn(ERef(RefId(Id("""__x3__""")))).setId(16665)).setId(16666), ISeq(List()).setId(16709)).setId(16667), ILet(Id("""propertyNameValue"""), ERef(RefId(Id("""__x3__""")))).setId(16668), IApp(Id("""__x4__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))).setId(16670), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(16671), IReturn(ERef(RefId(Id("""__x4__""")))).setId(16672)).setId(16673), ISeq(List()).setId(16716)).setId(16674), ILet(Id("""bv"""), ERef(RefId(Id("""__x4__""")))).setId(16675), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""propertyNameValue"""))))).setId(16677), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(16678), IReturn(ERef(RefId(Id("""__x5__""")))).setId(16679)).setId(16680), ISeq(List()).setId(16723)).setId(16681), ILet(Id("""propertyKey"""), ERef(RefId(Id("""__x5__""")))).setId(16682), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(16684), ILet(Id("""strict"""), EBool(false)).setId(16686)).setId(16688), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyKey""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(16690), IReturn(ERef(RefId(Id("""__x6__""")))).setId(16691))).setId(16731))
  val instToStepMap: Map[Int, Int] = HashMap(16648 -> 0, 16669 -> 3, 16649 -> 0, 16691 -> 7, 16686 -> 6, 16670 -> 4, 16674 -> 4, 16660 -> 2, 16667 -> 3, 16681 -> 5, 16662 -> 2, 16676 -> 4, 16658 -> 1, 16688 -> 6, 16668 -> 3, 16651 -> 1, 16684 -> 6, 16689 -> 6, 16687 -> 6, 16661 -> 2, 16657 -> 1, 16656 -> 1, 16683 -> 5, 16690 -> 7, 16677 -> 5, 16692 -> 7, 16675 -> 4, 16682 -> 5, 16650 -> 0, 16663 -> 3, 16685 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(16648, 16649, 16650), 5 -> HashSet(16683, 16677, 16682, 16681), 1 -> HashSet(16658, 16651, 16657, 16656), 6 -> HashSet(16688, 16687, 16686, 16685, 16684, 16689), 2 -> HashSet(16662, 16661, 16660), 7 -> HashSet(16690, 16691, 16692), 3 -> HashSet(16668, 16669, 16663, 16667), 4 -> HashSet(16676, 16670, 16674, 16675))
  /* Beautified form:
  "MemberExpression1Evaluation0" (this, MemberExpression, Expression) => {
    access __x0__ = (MemberExpression "Evaluation")
    let baseReference = __x0__
    app __x1__ = (GetValue baseReference)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let baseValue = __x1__
    access __x2__ = (Expression "Evaluation")
    let propertyNameReference = __x2__
    app __x3__ = (GetValue propertyNameReference)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let propertyNameValue = __x3__
    app __x4__ = (RequireObjectCoercible baseValue)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let bv = __x4__
    app __x5__ = (ToPropertyKey propertyNameValue)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let propertyKey = __x5__
    if true let strict = true else let strict = false
    app __x6__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "StrictReference" -> strict)))
    return __x6__
  }
  */
}
