package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Evaluation""")).setId(16851), ILet(Id("""baseReference"""), ERef(RefId(Id("""__x0__""")))).setId(16852), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""baseReference"""))))).setId(16854), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(16855), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16856)).setId(16857), ISeq(List()).setId(16888)).setId(16859), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x1__""")))).setId(16860), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))).setId(16862), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(16863), IReturn(ERef(RefId(Id("""__x2__""")))).setId(16864)).setId(16865), ISeq(List()).setId(16895)).setId(16866), ILet(Id("""bv"""), ERef(RefId(Id("""__x2__""")))).setId(16867), IAccess(Id("""__x3__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")).setId(16869), ILet(Id("""propertyNameString"""), ERef(RefId(Id("""__x3__""")))).setId(16870), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(16872), ILet(Id("""strict"""), EBool(false)).setId(16874)).setId(16876), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyNameString""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(16878), IReturn(ERef(RefId(Id("""__x4__""")))).setId(16879))).setId(16905))
  val instToStepMap: Map[Int, Int] = HashMap(16862 -> 2, 16854 -> 1, 16866 -> 2, 16851 -> 0, 16860 -> 1, 16852 -> 0, 16859 -> 1, 16868 -> 2, 16877 -> 4, 16853 -> 0, 16873 -> 4, 16872 -> 4, 16861 -> 1, 16880 -> 5, 16869 -> 3, 16879 -> 5, 16876 -> 4, 16875 -> 4, 16870 -> 3, 16867 -> 2, 16878 -> 5, 16871 -> 3, 16874 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(16853, 16851, 16852), 5 -> HashSet(16880, 16879, 16878), 1 -> HashSet(16861, 16854, 16860, 16859), 2 -> HashSet(16862, 16868, 16866, 16867), 3 -> HashSet(16869, 16870, 16871), 4 -> HashSet(16877, 16876, 16875, 16874, 16873, 16872))
  /* Beautified form:
  "MemberExpression2Evaluation0" (this, MemberExpression, IdentifierName) => {
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
