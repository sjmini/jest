package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression5Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression5Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Evaluation""")).setId(16771), ILet(Id("""baseReference"""), ERef(RefId(Id("""__x0__""")))).setId(16772), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""baseReference"""))))).setId(16774), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(16775), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16776)).setId(16777), ISeq(List()).setId(16808)).setId(16779), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x1__""")))).setId(16780), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))).setId(16782), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(16783), IReturn(ERef(RefId(Id("""__x2__""")))).setId(16784)).setId(16785), ISeq(List()).setId(16815)).setId(16786), ILet(Id("""bv"""), ERef(RefId(Id("""__x2__""")))).setId(16787), IAccess(Id("""__x3__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")).setId(16789), ILet(Id("""propertyNameString"""), ERef(RefId(Id("""__x3__""")))).setId(16790), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(16792), ILet(Id("""strict"""), EBool(false)).setId(16794)).setId(16796), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyNameString""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(16798), IReturn(ERef(RefId(Id("""__x4__""")))).setId(16799))).setId(16825))
  val instToStepMap: Map[Int, Int] = HashMap(16789 -> 3, 16772 -> 0, 16798 -> 5, 16780 -> 1, 16800 -> 5, 16774 -> 1, 16799 -> 5, 16787 -> 2, 16791 -> 3, 16781 -> 1, 16795 -> 4, 16792 -> 4, 16794 -> 4, 16797 -> 4, 16790 -> 3, 16793 -> 4, 16786 -> 2, 16773 -> 0, 16796 -> 4, 16779 -> 1, 16782 -> 2, 16788 -> 2, 16771 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(16772, 16773, 16771), 5 -> HashSet(16798, 16800, 16799), 1 -> HashSet(16780, 16779, 16774, 16781), 2 -> HashSet(16786, 16782, 16787, 16788), 3 -> HashSet(16789, 16790, 16791), 4 -> HashSet(16793, 16796, 16795, 16792, 16794, 16797))
  /* Beautified form:
  "CallExpression5Evaluation0" (this, MemberExpression, IdentifierName) => {
    access __x0__ = (MemberExpression "Evaluation")
    let baseReference = __x0__
    app __x1__ = (GetValue baseReference)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let baseValue = __x1__
    app __x2__ = (RequireObjectCoercible baseValue)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let bv = __x2__
    access __x3__ = (IdentifierName "StringValue")
    let propertyNameString = __x3__
    if true let strict = true else let strict = false
    app __x4__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyNameString, "StrictReference" -> strict)))
    return __x4__
  }
  */
}
