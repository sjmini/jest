package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArraySetLength {
  val length: Int = 2
  val func: Func = Func("""ArraySetLength""", List(Id("""A"""), Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""Desc"""))))).setId(54590), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(54591), IReturn(ERef(RefId(Id("""__x1__""")))).setId(54592))).setId(54709), ISeq(List()).setId(54710)).setId(54596), ILet(Id("""newLenDesc"""), ECopy(ERef(RefId(Id("""Desc"""))))).setId(54598), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))).setId(54600), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(54601), IReturn(ERef(RefId(Id("""__x2__""")))).setId(54602)).setId(54603), ISeq(List()).setId(54717)).setId(54604), ILet(Id("""newLen"""), ERef(RefId(Id("""__x2__""")))).setId(54605), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))).setId(54607), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(54608), IReturn(ERef(RefId(Id("""__x3__""")))).setId(54609)).setId(54610), ISeq(List()).setId(54724)).setId(54611), ILet(Id("""numberLen"""), ERef(RefId(Id("""__x3__""")))).setId(54612), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""numberLen"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(54614), IReturn(ERef(RefId(Id("""__x4__""")))).setId(54615))).setId(54729), ISeq(List()).setId(54730)).setId(54617), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Value""")), ERef(RefId(Id("""newLen""")))).setId(54619), IApp(Id("""__x5__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""))).setId(54621), ILet(Id("""oldLenDesc"""), ERef(RefId(Id("""__x5__""")))).setId(54622), ILet(Id("""oldLen"""), ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")))).setId(54624), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""oldLen"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))).setId(54626), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(54627), IReturn(ERef(RefId(Id("""__x7__""")))).setId(54628))).setId(54739), ISeq(List()).setId(54740)).setId(54631), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54633), IReturn(ERef(RefId(Id("""__x8__""")))).setId(54634))).setId(54744), ISeq(List()).setId(54745)).setId(54636), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable"""))), EBool(true))), ILet(Id("""newWritable"""), EBool(true)).setId(54638), ISeq(List(ILet(Id("""newWritable"""), EBool(false)).setId(54640), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable""")), EBool(true)).setId(54642))).setId(54750)).setId(54645), IApp(Id("""__x9__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))).setId(54647), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(54648), IReturn(ERef(RefId(Id("""__x9__""")))).setId(54649)).setId(54650), ISeq(List()).setId(54756)).setId(54651), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x9__""")))).setId(54652), IIf(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54654), IReturn(ERef(RefId(Id("""__x10__""")))).setId(54655))).setId(54761), ISeq(List()).setId(54762)).setId(54657), IWhile(EBOp(OLt, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""oldLen""")))), ISeq(List(IAssign(RefId(Id("""oldLen""")), EBOp(OSub, ERef(RefId(Id("""oldLen"""))), EINum(1L))).setId(54659), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""oldLen"""))))).setId(54661), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(54662), IReturn(ERef(RefId(Id("""__x11__""")))).setId(54663)).setId(54664), ISeq(List()).setId(54769)).setId(54665), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))))).setId(54666), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(54667), IReturn(ERef(RefId(Id("""__x12__""")))).setId(54668)).setId(54669), ISeq(List()).setId(54775)).setId(54670), ILet(Id("""deleteSucceeded"""), ERef(RefId(Id("""__x12__""")))).setId(54671), IIf(EBOp(OEq, ERef(RefId(Id("""deleteSucceeded"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Value""")), EBOp(OPlus, ERef(RefId(Id("""oldLen"""))), EINum(1L))).setId(54673), IIf(EBOp(OEq, ERef(RefId(Id("""newWritable"""))), EBool(false)), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable""")), EBool(false)).setId(54675), ISeq(List()).setId(54780)).setId(54677), IApp(Id("""__x13__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))).setId(54679), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(54680), IReturn(ERef(RefId(Id("""__x13__""")))).setId(54681)).setId(54682), ISeq(List()).setId(54786)).setId(54683), IExpr(ERef(RefId(Id("""__x13__""")))).setId(54684), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54686), IReturn(ERef(RefId(Id("""__x14__""")))).setId(54687))).setId(54791), ISeq(List()).setId(54792)).setId(54690))).setId(54794)).setId(54693), IIf(EBOp(OEq, ERef(RefId(Id("""newWritable"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Writable"""), EBool(false)))))).setId(54695), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(54696), IReturn(ERef(RefId(Id("""__x16__""")))).setId(54697))).setId(54799), ISeq(List()).setId(54800)).setId(54700), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(54702), IReturn(ERef(RefId(Id("""__x17__""")))).setId(54703))).setId(54804))
  val instToStepMap: Map[Int, Int] = HashMap(54686 -> 38, 54694 -> 38, 54701 -> 42, 54653 -> 25, 54595 -> 24, 54600 -> 5, 54615 -> 7, 54637 -> 18, 54654 -> 26, 54604 -> 5, 54674 -> 38, 54678 -> 38, 54642 -> 24, 54621 -> 10, 54628 -> 15, 54631 -> 16, 54646 -> 24, 54599 -> 4, 54618 -> 8, 54596 -> 3, 54611 -> 6, 54685 -> 38, 54614 -> 7, 54643 -> 24, 54640 -> 24, 54695 -> 41, 54700 -> 42, 54627 -> 15, 54659 -> 38, 54605 -> 5, 54622 -> 10, 54636 -> 18, 54704 -> 43, 54698 -> 41, 54691 -> 38, 54590 -> 2, 54672 -> 38, 54666 -> 38, 54689 -> 38, 54630 -> 15, 54598 -> 4, 54613 -> 6, 54647 -> 25, 54657 -> 27, 54684 -> 38, 54644 -> 24, 54591 -> 2, 54699 -> 41, 54594 -> 2, 54679 -> 38, 54696 -> 41, 54656 -> 26, 54626 -> 15, 54619 -> 9, 54660 -> 38, 54697 -> 41, 54703 -> 43, 54675 -> 35, 54692 -> 38, 54639 -> 19, 54652 -> 25, 54606 -> 5, 54665 -> 38, 54623 -> 10, 54633 -> 17, 54688 -> 38, 54671 -> 38, 54635 -> 17, 54683 -> 38, 54670 -> 38, 54616 -> 7, 54629 -> 15, 54690 -> 38, 54597 -> 3, 54620 -> 9, 54693 -> 38, 54638 -> 19, 54592 -> 2, 54658 -> 27, 54625 -> 12, 54673 -> 38, 54661 -> 38, 54593 -> 2, 54641 -> 24, 54624 -> 12, 54702 -> 43, 54677 -> 38, 54655 -> 26, 54607 -> 6, 54676 -> 35, 54687 -> 38, 54612 -> 6, 54645 -> 24, 54617 -> 8, 54632 -> 16, 54634 -> 17, 54651 -> 25)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(54600, 54604, 54605, 54606), 10 -> HashSet(54621, 54622, 54623), 6 -> HashSet(54611, 54613, 54607, 54612), 38 -> HashSet(54686, 54674, 54694, 54678, 54685, 54659, 54691, 54689, 54684, 54679, 54665, 54690, 54693, 54677, 54687, 54672, 54666, 54660, 54692, 54688, 54671, 54670, 54683, 54673, 54661), 9 -> HashSet(54619, 54620), 41 -> HashSet(54695, 54698, 54697, 54699, 54696), 2 -> HashSet(54590, 54592, 54593, 54591, 54594), 12 -> HashSet(54625, 54624), 7 -> HashSet(54615, 54614, 54616), 18 -> HashSet(54637, 54636), 8 -> HashSet(54618, 54617), 4 -> HashSet(54599, 54598), 15 -> HashSet(54628, 54627, 54630, 54626, 54629), 42 -> HashSet(54701, 54700), 24 -> HashSet(54642, 54646, 54595, 54644, 54641, 54645, 54643, 54640), 37 -> HashSet(54685, 54684, 54679, 54683), 25 -> HashSet(54653, 54647, 54652, 54651), 34 -> HashSet(54674, 54673), 17 -> HashSet(54634, 54633, 54635), 22 -> HashSet(54595), 27 -> HashSet(54657, 54658), 3 -> HashSet(54596, 54597), 35 -> HashSet(54675, 54676), 16 -> HashSet(54631, 54632), 31 -> HashSet(54665, 54671, 54670, 54661, 54672, 54666), 11 -> HashSet(54595), 43 -> HashSet(54704, 54703, 54702), 26 -> HashSet(54654, 54656, 54655), 23 -> HashSet(54640, 54641), 36 -> HashSet(54678, 54677), 30 -> HashSet(54659, 54660), 19 -> HashSet(54639, 54638))
  /* Beautified form:
  "ArraySetLength" (A, Desc) => {
    if (= Desc["Value"] absent) {
      app __x0__ = (OrdinaryDefineOwnProperty A "length" Desc)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let newLenDesc = (copy-obj Desc)
    app __x2__ = (ToUint32 Desc["Value"])
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let newLen = __x2__
    app __x3__ = (ToNumber Desc["Value"])
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let numberLen = __x3__
    if (! (= newLen numberLen)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    newLenDesc["Value"] = newLen
    app __x5__ = (OrdinaryGetOwnProperty A "length")
    let oldLenDesc = __x5__
    let oldLen = oldLenDesc["Value"]
    if (! (< newLen oldLen)) {
      app __x6__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (= oldLenDesc["Writable"] false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    if (|| (= newLenDesc["Writable"] absent) (= newLenDesc["Writable"] true)) let newWritable = true else {
      let newWritable = false
      newLenDesc["Writable"] = true
    }
    app __x9__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let succeeded = __x9__
    if (= succeeded false) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    while (< newLen oldLen) {
      oldLen = (- oldLen 1i)
      app __x11__ = (ToString oldLen)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (A["Delete"] A __x11__)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let deleteSucceeded = __x12__
      if (= deleteSucceeded false) {
        newLenDesc["Value"] = (+ oldLen 1i)
        if (= newWritable false) newLenDesc["Writable"] = false else {}
        app __x13__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
    }
    if (= newWritable false) {
      app __x15__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Writable" -> false)))
      app __x16__ = (WrapCompletion __x15__)
      return __x16__
    } else {}
    app __x17__ = (WrapCompletion true)
    return __x17__
  }
  */
}
