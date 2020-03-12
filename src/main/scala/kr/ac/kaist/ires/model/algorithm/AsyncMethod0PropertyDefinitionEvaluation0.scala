package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncMethod0PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncMethod0PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncFunctionBody"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(43703), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))).setId(43704), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))).setId(43706), IReturn(ERef(RefId(Id("""propKey""")))).setId(43707)).setId(43708), ISeq(List()).setId(43755)).setId(43710), IExpr(ERef(RefId(Id("""propKey""")))).setId(43711), IAccess(Id("""__x1__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(43713), ILet(Id("""scope"""), ERef(RefId(Id("""__x1__""")))).setId(43714), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Method"""))), ERef(RefId(Id("""UniqueFormalParameters"""))), ERef(RefId(Id("""AsyncFunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(43716), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(43717), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43718)).setId(43719), ISeq(List()).setId(43764)).setId(43720), ILet(Id("""closure"""), ERef(RefId(Id("""__x2__""")))).setId(43721), IApp(Id("""__x3__"""), ERef(RefId(Id("""MakeMethod"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""object"""))))).setId(43723), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(43724), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43725)).setId(43726), ISeq(List()).setId(43771)).setId(43727), IExpr(ERef(RefId(Id("""__x3__""")))).setId(43728), IApp(Id("""__x4__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""propKey"""))))).setId(43730), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(43731), IReturn(ERef(RefId(Id("""__x4__""")))).setId(43732)).setId(43733), ISeq(List()).setId(43778)).setId(43734), IExpr(ERef(RefId(Id("""__x4__""")))).setId(43735), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43737), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""closure""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), ERef(RefId(Id("""enumerable""")))), (EStr("""Configurable"""), EBool(true))))).setId(43739), IApp(Id("""__x5__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""propKey"""))), ERef(RefId(Id("""desc"""))))).setId(43741), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(43742), IReturn(ERef(RefId(Id("""__x5__""")))).setId(43743)).setId(43744), ISeq(List()).setId(43787)).setId(43745), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(43746), IReturn(ERef(RefId(Id("""__x6__""")))).setId(43747))).setId(43791))
  val instToStepMap: Map[Int, Int] = HashMap(43720 -> 3, 43710 -> 1, 43716 -> 3, 43737 -> 6, 43741 -> 8, 43705 -> 0, 43734 -> 5, 43728 -> 4, 43748 -> 8, 43712 -> 1, 43729 -> 4, 43704 -> 0, 43736 -> 5, 43721 -> 3, 43738 -> 6, 43713 -> 2, 43746 -> 8, 43740 -> 7, 43723 -> 4, 43703 -> 0, 43727 -> 4, 43714 -> 2, 43735 -> 5, 43745 -> 8, 43747 -> 8, 43722 -> 3, 43730 -> 5, 43739 -> 7, 43715 -> 2, 43711 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(43705, 43703, 43704), 5 -> HashSet(43734, 43735, 43730, 43736), 1 -> HashSet(43710, 43712, 43711), 6 -> HashSet(43738, 43737), 2 -> HashSet(43713, 43714, 43715), 7 -> HashSet(43740, 43739), 3 -> HashSet(43720, 43721, 43716, 43722), 8 -> HashSet(43741, 43748, 43746, 43745, 43747), 4 -> HashSet(43728, 43723, 43727, 43729))
  /* Beautified form:
  "AsyncMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    access __x1__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x1__
    app __x2__ = (AsyncFunctionCreate CONST_Method UniqueFormalParameters AsyncFunctionBody scope)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let closure = __x2__
    app __x3__ = (MakeMethod closure object)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (SetFunctionName closure propKey)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x5__ = (DefinePropertyOrThrow object propKey desc)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
