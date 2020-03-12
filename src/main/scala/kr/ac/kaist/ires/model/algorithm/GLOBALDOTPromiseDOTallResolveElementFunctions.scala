package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseDOTallResolveElementFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Promise.allResolveElementFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(92214), ILet(Id("""alreadyCalled"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyCalled""")))).setId(92216), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyCalled""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(92218), IReturn(ERef(RefId(Id("""__x0__""")))).setId(92219))).setId(92264), ISeq(List()).setId(92265)).setId(92222), IAssign(RefProp(RefId(Id("""alreadyCalled""")), EStr("""Value""")), EBool(true)).setId(92224), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Index""")))).setId(92226), ILet(Id("""values"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Values""")))).setId(92228), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))).setId(92230), ILet(Id("""remainingElementsCount"""), ERef(RefProp(RefId(Id("""F""")), EStr("""RemainingElements""")))).setId(92232), IAssign(RefProp(RefId(Id("""values""")), ERef(RefId(Id("""index""")))), ERef(RefId(Id("""x""")))).setId(92234), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OSub, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))).setId(92236), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(0L)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""values"""))))).setId(92238), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92239), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92240)).setId(92241), ISeq(List()).setId(92278)).setId(92242), ILet(Id("""valuesArray"""), ERef(RefId(Id("""__x1__""")))).setId(92243), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""valuesArray"""))))))).setId(92245), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(92246), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92247)).setId(92248), ISeq(List()).setId(92285)).setId(92249), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(92250), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92251))).setId(92289), ISeq(List()).setId(92290)).setId(92254), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(92256), IReturn(ERef(RefId(Id("""__x4__""")))).setId(92257))).setId(92294))
  val instToStepMap: Map[Int, Int] = HashMap(92234 -> 9, 92249 -> 14, 92258 -> 16, 92243 -> 14, 92233 -> 8, 92220 -> 2, 92244 -> 14, 92236 -> 10, 92242 -> 14, 92253 -> 14, 92216 -> 1, 92229 -> 6, 92256 -> 16, 92226 -> 5, 92224 -> 4, 92217 -> 1, 92237 -> 10, 92230 -> 7, 92245 -> 14, 92252 -> 14, 92255 -> 15, 92223 -> 3, 92227 -> 5, 92214 -> 0, 92231 -> 7, 92219 -> 2, 92251 -> 14, 92222 -> 3, 92254 -> 15, 92228 -> 6, 92232 -> 8, 92250 -> 14, 92235 -> 9, 92215 -> 0, 92257 -> 16, 92225 -> 4, 92218 -> 2, 92238 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(92214, 92215), 5 -> HashSet(92226, 92227), 10 -> HashSet(92237, 92236), 14 -> HashSet(92249, 92243, 92244, 92251, 92250, 92242, 92238, 92253, 92245, 92252), 1 -> HashSet(92216, 92217), 6 -> HashSet(92229, 92228), 9 -> HashSet(92234, 92235), 13 -> HashSet(92243, 92244, 92242, 92238), 2 -> HashSet(92220, 92219, 92218), 7 -> HashSet(92230, 92231), 3 -> HashSet(92223, 92222), 16 -> HashSet(92256, 92258, 92257), 8 -> HashSet(92233, 92232), 4 -> HashSet(92224, 92225), 15 -> HashSet(92255, 92254))
  /* Beautified form:
  "GLOBAL.Promise.allResolveElementFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let alreadyCalled = F["AlreadyCalled"]
    if (= alreadyCalled["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyCalled["Value"] = true
    let index = F["Index"]
    let values = F["Values"]
    let promiseCapability = F["Capability"]
    let remainingElementsCount = F["RemainingElements"]
    values[index] = x
    remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
    if (= remainingElementsCount["Value"] 0i) {
      app __x1__ = (CreateArrayFromList values)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let valuesArray = __x1__
      app __x2__ = (Call promiseCapability["Resolve"] undefined (new [valuesArray]))
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }
  */
}
