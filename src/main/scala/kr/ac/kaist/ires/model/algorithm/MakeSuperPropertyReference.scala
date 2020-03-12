package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MakeSuperPropertyReference {
  val length: Int = 3
  val func: Func = Func("""MakeSuperPropertyReference""", List(Id("""actualThis"""), Id("""propertyKey"""), Id("""strict""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(17926), ILet(Id("""env"""), ERef(RefId(Id("""__x0__""")))).setId(17927), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""GetSuperBase"""))), List(ERef(RefId(Id("""env"""))))).setId(17930), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(17931), IReturn(ERef(RefId(Id("""__x1__""")))).setId(17932)).setId(17933), ISeq(List()).setId(17954)).setId(17934), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x1__""")))).setId(17935), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))).setId(17937), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(17938), IReturn(ERef(RefId(Id("""__x2__""")))).setId(17939)).setId(17940), ISeq(List()).setId(17961)).setId(17941), ILet(Id("""bv"""), ERef(RefId(Id("""__x2__""")))).setId(17942), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyKey""")))), (EStr("""thisValue"""), ERef(RefId(Id("""actualThis""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(17944), IReturn(ERef(RefId(Id("""__x3__""")))).setId(17945))).setId(17966))
  val instToStepMap: Map[Int, Int] = HashMap(17929 -> 1, 17946 -> 4, 17928 -> 0, 17942 -> 3, 17935 -> 2, 17926 -> 0, 17943 -> 3, 17934 -> 2, 17930 -> 2, 17941 -> 3, 17927 -> 0, 17936 -> 2, 17945 -> 4, 17937 -> 3, 17944 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(17928, 17926, 17927), 1 -> HashSet(17929), 2 -> HashSet(17936, 17935, 17934, 17930), 3 -> HashSet(17942, 17943, 17941, 17937), 4 -> HashSet(17946, 17945, 17944))
  /* Beautified form:
  "MakeSuperPropertyReference" (actualThis, propertyKey, strict) => {
    app __x0__ = (GetThisEnvironment )
    let env = __x0__
    app __x1__ = (env["GetSuperBase"] env)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let baseValue = __x1__
    app __x2__ = (RequireObjectCoercible baseValue)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let bv = __x2__
    app __x3__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "thisValue" -> actualThis, "StrictReference" -> strict)))
    return __x3__
  }
  */
}
