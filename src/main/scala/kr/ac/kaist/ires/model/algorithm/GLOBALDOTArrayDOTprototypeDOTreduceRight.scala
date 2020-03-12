package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTreduceRight {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.reduceRight""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(80608), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(80609), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(80611), ILet(Id("""initialValue"""), ERef(RefId(Id("""__x1__""")))).setId(80612), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(80614), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(80615), IReturn(ERef(RefId(Id("""__x2__""")))).setId(80616)).setId(80617), ISeq(List()).setId(80734)).setId(80619), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(80620), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(80622), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(80623), IReturn(ERef(RefId(Id("""__x3__""")))).setId(80624)).setId(80625), ISeq(List()).setId(80741)).setId(80626), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(80627), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(80629), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80630), IReturn(ERef(RefId(Id("""__x5__""")))).setId(80631))).setId(80747), ISeq(List()).setId(80748)).setId(80633), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80635), IReturn(ERef(RefId(Id("""__x6__""")))).setId(80636))).setId(80752), ISeq(List()).setId(80753)).setId(80638), ILet(Id("""k"""), EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L))).setId(80640), ILet(Id("""accumulator"""), EUndef).setId(80642), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), IAssign(RefId(Id("""accumulator""")), ERef(RefId(Id("""initialValue""")))).setId(80644), ISeq(List(ILet(Id("""kPresent"""), EBool(false)).setId(80647), IWhile(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(false)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""k"""))), EINum(0L)))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(80649), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(80650), IReturn(ERef(RefId(Id("""__x7__""")))).setId(80651)).setId(80652), ISeq(List()).setId(80763)).setId(80653), ILet(Id("""Pk"""), ERef(RefId(Id("""__x7__""")))).setId(80654), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80656), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(80657), IReturn(ERef(RefId(Id("""__x8__""")))).setId(80658)).setId(80659), ISeq(List()).setId(80770)).setId(80660), IAssign(RefId(Id("""kPresent""")), ERef(RefId(Id("""__x8__""")))).setId(80661), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80663), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(80664), IReturn(ERef(RefId(Id("""__x9__""")))).setId(80665)).setId(80666), ISeq(List()).setId(80777)).setId(80667), IAssign(RefId(Id("""accumulator""")), ERef(RefId(Id("""__x9__""")))).setId(80668))).setId(80780), ISeq(List()).setId(80781)).setId(80671), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L))).setId(80673))).setId(80784)).setId(80676), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80678), IReturn(ERef(RefId(Id("""__x10__""")))).setId(80679))).setId(80788), ISeq(List()).setId(80789)).setId(80681))).setId(80791)).setId(80684), IWhile(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""k"""))), EINum(0L))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(80686), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(80687), IReturn(ERef(RefId(Id("""__x11__""")))).setId(80688)).setId(80689), ISeq(List()).setId(80797)).setId(80690), ILet(Id("""Pk"""), ERef(RefId(Id("""__x11__""")))).setId(80691), IApp(Id("""__x12__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80693), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(80694), IReturn(ERef(RefId(Id("""__x12__""")))).setId(80695)).setId(80696), ISeq(List()).setId(80804)).setId(80697), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x12__""")))).setId(80698), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80700), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(80701), IReturn(ERef(RefId(Id("""__x13__""")))).setId(80702)).setId(80703), ISeq(List()).setId(80811)).setId(80704), ILet(Id("""kValue"""), ERef(RefId(Id("""__x13__""")))).setId(80705), IApp(Id("""__x14__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), EUndef, EList(List(ERef(RefId(Id("""accumulator"""))), ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(80707), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(80708), IReturn(ERef(RefId(Id("""__x14__""")))).setId(80709)).setId(80710), ISeq(List()).setId(80818)).setId(80711), IAssign(RefId(Id("""accumulator""")), ERef(RefId(Id("""__x14__""")))).setId(80712))).setId(80821), ISeq(List()).setId(80822)).setId(80715), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L))).setId(80717))).setId(80825)).setId(80720), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""accumulator"""))))).setId(80722), IReturn(ERef(RefId(Id("""__x15__""")))).setId(80723))).setId(80829))
  val instToStepMap: Map[Int, Int] = HashMap(80653 -> 25, 80643 -> 9, 80612 -> 1, 80676 -> 26, 80660 -> 25, 80683 -> 26, 80614 -> 2, 80698 -> 37, 80677 -> 26, 80704 -> 35, 80628 -> 3, 80715 -> 37, 80646 -> 12, 80721 -> 37, 80609 -> 0, 80673 -> 25, 80678 -> 26, 80655 -> 25, 80720 -> 37, 80608 -> 0, 80692 -> 37, 80640 -> 8, 80613 -> 1, 80645 -> 12, 80724 -> 38, 80718 -> 37, 80711 -> 35, 80686 -> 37, 80647 -> 26, 80642 -> 9, 80637 -> 6, 80630 -> 4, 80693 -> 37, 80714 -> 35, 80669 -> 23, 80671 -> 25, 80662 -> 25, 80682 -> 26, 80629 -> 5, 80719 -> 37, 80672 -> 25, 80622 -> 3, 80706 -> 35, 80633 -> 5, 80661 -> 25, 80674 -> 25, 80679 -> 26, 80610 -> 0, 80639 -> 7, 80654 -> 25, 80697 -> 37, 80649 -> 25, 80681 -> 26, 80648 -> 26, 80712 -> 35, 80663 -> 23, 80700 -> 35, 80631 -> 4, 80621 -> 2, 80670 -> 23, 80638 -> 7, 80611 -> 1, 80675 -> 25, 80717 -> 37, 80668 -> 23, 80722 -> 38, 80690 -> 37, 80685 -> 26, 80707 -> 35, 80636 -> 6, 80626 -> 3, 80713 -> 35, 80680 -> 26, 80699 -> 37, 80632 -> 4, 80619 -> 2, 80644 -> 12, 80684 -> 26, 80627 -> 3, 80716 -> 37, 80705 -> 35, 80634 -> 5, 80641 -> 8, 80691 -> 37, 80656 -> 25, 80723 -> 38, 80620 -> 2, 80667 -> 23, 80635 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(80609, 80608, 80610), 5 -> HashSet(80629, 80633, 80634), 20 -> HashSet(80660, 80662, 80661, 80656), 1 -> HashSet(80613, 80611, 80612), 6 -> HashSet(80637, 80636, 80635), 38 -> HashSet(80724, 80722, 80723), 9 -> HashSet(80642, 80643), 2 -> HashSet(80614, 80621, 80619, 80620), 34 -> HashSet(80704, 80706, 80700, 80705), 12 -> HashSet(80646, 80645, 80644), 7 -> HashSet(80639, 80638), 31 -> HashSet(80698, 80693, 80697, 80699), 8 -> HashSet(80640, 80641), 4 -> HashSet(80630, 80631, 80632), 15 -> HashSet(80647, 80648), 24 -> HashSet(80671, 80672), 37 -> HashSet(80721, 80693, 80719, 80697, 80717, 80690, 80699, 80716, 80691, 80698, 80715, 80692, 80720, 80718, 80686), 25 -> HashSet(80660, 80677, 80673, 80655, 80672, 80654, 80649, 80653, 80675, 80656, 80676, 80671, 80662, 80661, 80674), 3 -> HashSet(80628, 80622, 80626, 80627), 35 -> HashSet(80704, 80711, 80714, 80706, 80712, 80700, 80707, 80713, 80705), 26 -> HashSet(80683, 80677, 80678, 80647, 80682, 80679, 80685, 80680, 80684, 80676, 80681, 80648), 23 -> HashSet(80669, 80668, 80667, 80663, 80670), 36 -> HashSet(80715, 80716), 30 -> HashSet(80692, 80686, 80690, 80691), 19 -> HashSet(80655, 80654, 80649, 80653))
  /* Beautified form:
  "GLOBAL.Array.prototype.reduceRight" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let initialValue = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable callbackfn)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (&& (= len 0i) (= argumentsList[1i] absent)) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let k = (- len 1i)
    let accumulator = undefined
    if (! (= argumentsList[1i] absent)) accumulator = initialValue else {
      let kPresent = false
      while (&& (= kPresent false) (! (< k 0i))) {
        app __x7__ = (ToString k)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let Pk = __x7__
        app __x8__ = (HasProperty O Pk)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        kPresent = __x8__
        if (= kPresent true) {
          app __x9__ = (Get O Pk)
          if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          accumulator = __x9__
        } else {}
        k = (- k 1i)
      }
      if (= kPresent false) {
        app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x10__
      } else {}
    }
    while (! (< k 0i)) {
      app __x11__ = (ToString k)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let Pk = __x11__
      app __x12__ = (HasProperty O Pk)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let kPresent = __x12__
      if (= kPresent true) {
        app __x13__ = (Get O Pk)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        let kValue = __x13__
        app __x14__ = (Call callbackfn undefined (new [accumulator, kValue, k, O]))
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        accumulator = __x14__
      } else {}
      k = (- k 1i)
    }
    app __x15__ = (WrapCompletion accumulator)
    return __x15__
  }
  */
}
