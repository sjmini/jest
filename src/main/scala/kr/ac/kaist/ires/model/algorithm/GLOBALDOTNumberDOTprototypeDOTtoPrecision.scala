package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumberDOTprototypeDOTtoPrecision {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toPrecision""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69598), ILet(Id("""precision"""), ERef(RefId(Id("""__x0__""")))).setId(69599), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(69601), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69602), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69603)).setId(69604), ISeq(List()).setId(69704)).setId(69606), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(69607), IIf(EBOp(OEq, ERef(RefId(Id("""precision"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))).setId(69609), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(69610), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69611)).setId(69612), ISeq(List()).setId(69711)).setId(69613), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(69614), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69615))).setId(69715), ISeq(List()).setId(69716)).setId(69617), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""precision"""))))).setId(69619), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(69620), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69621)).setId(69622), ISeq(List()).setId(69722)).setId(69623), ILet(Id("""p"""), ERef(RefId(Id("""__x4__""")))).setId(69624), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(69626), IReturn(ERef(RefId(Id("""__x5__""")))).setId(69627))).setId(69727), ISeq(List()).setId(69728)).setId(69629), ILet(Id("""s"""), EStr("""""")).setId(69631), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")).setId(69633), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))).setId(69635))).setId(69733), ISeq(List()).setId(69734)).setId(69638), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), EStr("""Infinity""")))).setId(69640), IReturn(ERef(RefId(Id("""__x6__""")))).setId(69641))).setId(69738), ISeq(List()).setId(69739)).setId(69644), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""p"""))), EINum(1L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""p"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69646), IReturn(ERef(RefId(Id("""__x7__""")))).setId(69647))).setId(69743), ISeq(List()).setId(69744)).setId(69649), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69651), ILet(Id("""e"""), EINum(0L)).setId(69653))).setId(69748), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69656), ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69657), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""e"""))), EUOp(ONeg, EINum(6L))), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""p""")))))), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""p"""))), EINum(1L))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69656), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))).setId(69659))).setId(69753), ISeq(List()).setId(69754)).setId(69662), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""e""")))), ILet(Id("""c"""), EStr("""+""")).setId(69664), ISeq(List(ILet(Id("""c"""), EStr("""-""")).setId(69667), IAssign(RefId(Id("""e""")), EUOp(ONeg, ERef(RefId(Id("""e"""))))).setId(69669))).setId(69759)).setId(69672), ILet(Id("""d"""), ENotSupported("""StringOp""")).setId(69674), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))), EStr("""e""")), ERef(RefId(Id("""c""")))), ERef(RefId(Id("""d""")))))).setId(69676), IReturn(ERef(RefId(Id("""__x8__""")))).setId(69677))).setId(69764), ISeq(List()).setId(69765)).setId(69680))).setId(69767)).setId(69683), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EBOp(OSub, ERef(RefId(Id("""p"""))), EINum(1L))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69685), IReturn(ERef(RefId(Id("""__x9__""")))).setId(69686))).setId(69771), ISeq(List()).setId(69772)).setId(69688), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""e"""))), EINum(0L))), IExpr(ENotSupported("""Etc""")).setId(69656), IExpr(ENotSupported("""Etc""")).setId(69656)).setId(69692), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69694), IReturn(ERef(RefId(Id("""__x10__""")))).setId(69695))).setId(69779))
  val instToStepMap: Map[Int, Int] = HashMap(69658 -> 44, 69654 -> 22, 69682 -> 44, 69668 -> 42, 69684 -> 44, 69651 -> 22, 69666 -> 37, 69626 -> 5, 69608 -> 1, 69633 -> 11, 69643 -> 15, 69678 -> 44, 69646 -> 17, 69693 -> 52, 69615 -> 2, 69661 -> 33, 69630 -> 6, 69637 -> 11, 69690 -> 49, 69675 -> 44, 69598 -> 0, 69686 -> 45, 69679 -> 44, 69669 -> 42, 69650 -> 18, 69619 -> 4, 69665 -> 37, 69605 -> 44, 69672 -> 44, 69694 -> 53, 69659 -> 33, 69640 -> 15, 69599 -> 0, 69662 -> 44, 69631 -> 7, 69644 -> 16, 69647 -> 17, 69636 -> 11, 69691 -> 52, 69676 -> 44, 69632 -> 7, 69627 -> 5, 69648 -> 17, 69695 -> 53, 69616 -> 2, 69653 -> 22, 69685 -> 45, 69601 -> 1, 69680 -> 44, 69618 -> 3, 69681 -> 44, 69649 -> 18, 69656 -> 52, 69609 -> 2, 69639 -> 12, 69688 -> 46, 69660 -> 33, 69663 -> 44, 69613 -> 2, 69635 -> 11, 69673 -> 44, 69692 -> 52, 69641 -> 15, 69664 -> 37, 69617 -> 3, 69667 -> 42, 69607 -> 1, 69628 -> 5, 69696 -> 53, 69600 -> 0, 69652 -> 22, 69671 -> 42, 69625 -> 4, 69687 -> 45, 69624 -> 4, 69677 -> 44, 69645 -> 16, 69634 -> 11, 69674 -> 44, 69629 -> 6, 69642 -> 15, 69614 -> 2, 69657 -> 44, 69638 -> 12, 69689 -> 46, 69623 -> 4, 69670 -> 42, 69606 -> 1, 69683 -> 44, 69655 -> 22)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(69598, 69599, 69600), 5 -> HashSet(69626, 69627, 69628), 10 -> HashSet(69633, 69634), 52 -> HashSet(69693, 69691, 69656, 69692), 1 -> HashSet(69608, 69601, 69607, 69606), 6 -> HashSet(69630, 69629), 53 -> HashSet(69694, 69695, 69696), 41 -> HashSet(69668, 69667), 2 -> HashSet(69615, 69616, 69609, 69613, 69614), 7 -> HashSet(69631, 69632), 3 -> HashSet(69618, 69617), 18 -> HashSet(69650, 69649), 16 -> HashSet(69644, 69645), 4 -> HashSet(69619, 69623, 69625, 69624), 15 -> HashSet(69643, 69640, 69641, 69642), 42 -> HashSet(69669, 69605, 69672, 69668, 69673, 69667, 69671, 69670), 37 -> HashSet(69665, 69664, 69666), 25 -> HashSet(69656), 46 -> HashSet(69688, 69689), 29 -> HashSet(69605), 21 -> HashSet(69652, 69651), 33 -> HashSet(69661, 69659, 69656, 69660), 45 -> HashSet(69686, 69685, 69687), 17 -> HashSet(69646, 69647, 69648), 32 -> HashSet(69656), 34 -> HashSet(69662, 69663), 22 -> HashSet(69654, 69653, 69652, 69651, 69655), 44 -> HashSet(69678, 69675, 69658, 69679, 69682, 69605, 69672, 69662, 69676, 69680, 69681, 69656, 69663, 69673, 69684, 69677, 69674, 69657, 69683), 12 -> HashSet(69639, 69638), 49 -> HashSet(69690, 69656), 11 -> HashSet(69633, 69637, 69636, 69635, 69634), 43 -> HashSet(69675, 69674), 40 -> HashSet(69605), 26 -> HashSet(69658, 69657))
  /* Beautified form:
  "GLOBAL.Number.prototype.toPrecision" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let precision = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    if (= precision undefined) {
      app __x2__ = (ToString x)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (ToInteger precision)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let p = __x4__
    if (= x NaN) {
      app __x5__ = (WrapCompletion "NaN")
      return __x5__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (= x Infinity) {
      app __x6__ = (WrapCompletion (+ s "Infinity"))
      return __x6__
    } else {}
    if (|| (< p 1i) (< 100i p)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    if (= x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      !!! "Etc"
      let m = !!! "StringOp"
      if (|| (< e (- 6i)) (! (< e p))) {
        if (! (= p 1i)) {
          !!! "Etc"
          m = (+ (+ a ".") b)
        } else {}
        if (< 0i e) let c = "+" else {
          let c = "-"
          e = (- e)
        }
        let d = !!! "StringOp"
        app __x8__ = (WrapCompletion (+ (+ (+ (+ s m) "e") c) d))
        return __x8__
      } else {}
    }
    if (= e (- p 1i)) {
      app __x9__ = (WrapCompletion (+ s m))
      return __x9__
    } else {}
    if (! (< e 0i)) !!! "Etc" else !!! "Etc"
    app __x10__ = (WrapCompletion (+ s m))
    return __x10__
  }
  */
}
