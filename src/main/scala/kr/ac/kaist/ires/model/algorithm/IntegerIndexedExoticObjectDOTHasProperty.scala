package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = Func("""IntegerIndexedExoticObject.HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(56558), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(56559), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(56560), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56561)).setId(56562), ISeq(List()).setId(56618)).setId(56563), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x1__""")))).setId(56564), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))).setId(56566), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))).setId(56568), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(56569), IReturn(ERef(RefId(Id("""__x3__""")))).setId(56570))).setId(56625), ISeq(List()).setId(56626)).setId(56572), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""numericIndex"""))))).setId(56574), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56575), IReturn(ERef(RefId(Id("""__x5__""")))).setId(56576))).setId(56631), ISeq(List()).setId(56632)).setId(56578), IIf(EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56580), IReturn(ERef(RefId(Id("""__x6__""")))).setId(56581))).setId(56636), ISeq(List()).setId(56637)).setId(56583), IIf(EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), EINum(0L)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56585), IReturn(ERef(RefId(Id("""__x7__""")))).setId(56586))).setId(56641), ISeq(List()).setId(56642)).setId(56588), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(56590), IReturn(ERef(RefId(Id("""__x8__""")))).setId(56591))).setId(56646), ISeq(List()).setId(56647)).setId(56593), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(56595), IReturn(ERef(RefId(Id("""__x9__""")))).setId(56596))).setId(56651), ISeq(List()).setId(56652)).setId(56599))).setId(56654), ISeq(List()).setId(56655)).setId(56602), IApp(Id("""__x10__"""), ERef(RefId(Id("""OrdinaryHasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(56604), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(56605), IReturn(ERef(RefId(Id("""__x10__""")))).setId(56606)).setId(56607), ISeq(List()).setId(56661)).setId(56608), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(56609), IReturn(ERef(RefId(Id("""__x11__""")))).setId(56610))).setId(56665))
  val instToStepMap: Map[Int, Int] = HashMap(56576 -> 10, 56587 -> 14, 56579 -> 18, 56594 -> 18, 56611 -> 20, 56570 -> 8, 56585 -> 14, 56591 -> 16, 56599 -> 18, 56584 -> 18, 56573 -> 18, 56595 -> 18, 56580 -> 12, 56566 -> 18, 56559 -> 18, 56592 -> 16, 56558 -> 19, 56602 -> 19, 56569 -> 8, 56583 -> 18, 56574 -> 18, 56598 -> 18, 56565 -> 18, 56603 -> 19, 56588 -> 18, 56568 -> 18, 56589 -> 18, 56578 -> 18, 56593 -> 18, 56564 -> 18, 56610 -> 20, 56582 -> 12, 56597 -> 18, 56571 -> 8, 56604 -> 20, 56600 -> 18, 56567 -> 18, 56590 -> 16, 56596 -> 18, 56563 -> 18, 56577 -> 10, 56609 -> 20, 56581 -> 12, 56608 -> 20, 56575 -> 10, 56601 -> 18, 56572 -> 18, 56586 -> 14, 56557 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56557), 10 -> HashSet(56576, 56577, 56575), 14 -> HashSet(56587, 56585, 56586), 20 -> HashSet(56611, 56610, 56604, 56609, 56608), 1 -> HashSet(56557), 9 -> HashSet(56573, 56568, 56572), 13 -> HashSet(56584, 56583), 17 -> HashSet(56594, 56593), 12 -> HashSet(56580, 56582, 56581), 7 -> HashSet(56566, 56567), 18 -> HashSet(56595, 56579, 56594, 56588, 56564, 56597, 56599, 56584, 56573, 56566, 56559, 56583, 56574, 56598, 56565, 56568, 56589, 56578, 56593, 56600, 56567, 56596, 56563, 56601, 56572), 16 -> HashSet(56592, 56590, 56591), 11 -> HashSet(56574, 56579, 56578), 8 -> HashSet(56569, 56570, 56571), 19 -> HashSet(56603, 56558, 56602), 4 -> HashSet(56559, 56565, 56564, 56563), 15 -> HashSet(56588, 56589))
  /* Beautified form:
  "IntegerIndexedExoticObject.HasProperty" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ String) {
      app __x1__ = (CanonicalNumericIndexString P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numericIndex = __x1__
      if (! (= numericIndex undefined)) {
        let buffer = O["ViewedArrayBuffer"]
        app __x2__ = (IsDetachedBuffer buffer)
        if (= __x2__ true) {
          app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x3__
        } else {}
        app __x4__ = (IsInteger numericIndex)
        if (= __x4__ false) {
          app __x5__ = (WrapCompletion false)
          return __x5__
        } else {}
        if (= numericIndex -0.0) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        if (< numericIndex 0i) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        if (! (< numericIndex O["ArrayLength"])) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        app __x9__ = (WrapCompletion true)
        return __x9__
      } else {}
    } else {}
    app __x10__ = (OrdinaryHasProperty O P)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
