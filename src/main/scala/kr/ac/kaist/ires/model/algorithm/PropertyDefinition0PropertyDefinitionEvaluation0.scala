package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinition0PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition0PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""IdentifierReference"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierReference"""))), EStr("""StringValue""")).setId(14918), ILet(Id("""propName"""), ERef(RefId(Id("""__x0__""")))).setId(14919), IAccess(Id("""__x1__"""), ERef(RefId(Id("""IdentifierReference"""))), EStr("""Evaluation""")).setId(14922), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x1__""")))).setId(14923), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(14925), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14926), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14927)).setId(14928), ISeq(List()).setId(14950)).setId(14930), ILet(Id("""propValue"""), ERef(RefId(Id("""__x2__""")))).setId(14931), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""propName"""))), ERef(RefId(Id("""propValue"""))))).setId(14933), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(14934), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14935)).setId(14936), ISeq(List()).setId(14957)).setId(14937), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(14938), IReturn(ERef(RefId(Id("""__x4__""")))).setId(14939))).setId(14961))
  val instToStepMap: Map[Int, Int] = HashMap(14937 -> 5, 14923 -> 1, 14929 -> 4, 14918 -> 0, 14933 -> 5, 14940 -> 5, 14919 -> 0, 14939 -> 5, 14924 -> 1, 14920 -> 0, 14922 -> 1, 14932 -> 2, 14925 -> 2, 14930 -> 2, 14938 -> 5, 14931 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(14918, 14919, 14920), 5 -> HashSet(14937, 14933, 14940, 14938, 14939), 1 -> HashSet(14922, 14923, 14924), 2 -> HashSet(14932, 14931, 14925, 14930), 3 -> HashSet(14929), 4 -> HashSet(14929))
  /* Beautified form:
  "PropertyDefinition0PropertyDefinitionEvaluation0" (this, IdentifierReference, object, enumerable) => {
    access __x0__ = (IdentifierReference "StringValue")
    let propName = __x0__
    access __x1__ = (IdentifierReference "Evaluation")
    let exprValue = __x1__
    app __x2__ = (GetValue exprValue)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let propValue = __x2__
    app __x3__ = (CreateDataPropertyOrThrow object propName propValue)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
