package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StringGetOwnProperty {
  val length: Int = 2
  val func: Func = Func("""StringGetOwnProperty""", List(Id("""S"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(55237), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55238), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55239))).setId(55284), ISeq(List()).setId(55285)).setId(55241), IApp(Id("""__x2__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(55243), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(55244), IReturn(ERef(RefId(Id("""__x2__""")))).setId(55245)).setId(55246), ISeq(List()).setId(55291)).setId(55247), ILet(Id("""index"""), ERef(RefId(Id("""__x2__""")))).setId(55248), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55250), IReturn(ERef(RefId(Id("""__x3__""")))).setId(55251))).setId(55296), ISeq(List()).setId(55297)).setId(55253), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))).setId(55255), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55256), IReturn(ERef(RefId(Id("""__x5__""")))).setId(55257))).setId(55302), ISeq(List()).setId(55303)).setId(55259), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55261), IReturn(ERef(RefId(Id("""__x6__""")))).setId(55262))).setId(55307), ISeq(List()).setId(55308)).setId(55264), ILet(Id("""str"""), ERef(RefProp(RefId(Id("""S""")), EStr("""StringData""")))).setId(55266), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))).setId(55268), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55270), IReturn(ERef(RefId(Id("""__x7__""")))).setId(55271))).setId(55314), ISeq(List()).setId(55315)).setId(55273), ILet(Id("""resultStr"""), ERef(RefProp(RefId(Id("""str""")), ERef(RefId(Id("""index""")))))).setId(55275), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""resultStr""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(55277), IReturn(ERef(RefId(Id("""__x8__""")))).setId(55278))).setId(55320))
  val instToStepMap: Map[Int, Int] = HashMap(55263 -> 9, 55236 -> 12, 55251 -> 5, 55255 -> 8, 55278 -> 17, 55259 -> 8, 55262 -> 9, 55240 -> 2, 55266 -> 11, 55249 -> 4, 55256 -> 7, 55261 -> 9, 55257 -> 7, 55247 -> 4, 55250 -> 5, 55267 -> 11, 55260 -> 8, 55272 -> 14, 55265 -> 10, 55258 -> 7, 55277 -> 17, 55275 -> 16, 55237 -> 3, 55268 -> 13, 55269 -> 13, 55243 -> 4, 55242 -> 3, 55274 -> 15, 55276 -> 16, 55270 -> 14, 55248 -> 4, 55238 -> 2, 55252 -> 5, 55253 -> 6, 55271 -> 14, 55241 -> 3, 55264 -> 10, 55273 -> 15, 55239 -> 2, 55254 -> 6, 55279 -> 17)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55236), 5 -> HashSet(55251, 55252, 55250), 10 -> HashSet(55265, 55264), 14 -> HashSet(55272, 55270, 55271), 1 -> HashSet(55236), 6 -> HashSet(55253, 55254), 9 -> HashSet(55263, 55262, 55261), 13 -> HashSet(55268, 55269), 2 -> HashSet(55240, 55238, 55239), 17 -> HashSet(55278, 55277, 55279), 12 -> HashSet(55236), 7 -> HashSet(55258, 55256, 55257), 3 -> HashSet(55237, 55242, 55241), 16 -> HashSet(55275, 55276), 11 -> HashSet(55266, 55267), 8 -> HashSet(55255, 55259, 55260), 4 -> HashSet(55243, 55249, 55248, 55247), 15 -> HashSet(55274, 55273))
  /* Beautified form:
  "StringGetOwnProperty" (S, P) => {
    app __x0__ = (Type P)
    if (! (= __x0__ String)) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    app __x2__ = (CanonicalNumericIndexString P)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let index = __x2__
    if (= index undefined) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    app __x4__ = (IsInteger index)
    if (= __x4__ false) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    if (= index -0.0) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {}
    let str = S["StringData"]
    let len = str["length"]
    if (|| (< index 0i) (! (< index len))) {
      app __x7__ = (WrapCompletion undefined)
      return __x7__
    } else {}
    let resultStr = str[index]
    app __x8__ = (WrapCompletion (new PropertyDescriptor("Value" -> resultStr, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
    return __x8__
  }
  */
}
