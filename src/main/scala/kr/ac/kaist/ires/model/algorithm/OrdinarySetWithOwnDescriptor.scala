package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinarySetWithOwnDescriptor {
  val length: Int = 5
  val func: Func = Func("""OrdinarySetWithOwnDescriptor""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver"""), Id("""ownDesc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""ownDesc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(50580), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50581), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50582)).setId(50583), ISeq(List()).setId(50681)).setId(50584), ILet(Id("""parent"""), ERef(RefId(Id("""__x0__""")))).setId(50585), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""Set"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))).setId(50587), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(50588), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50589)).setId(50590), ISeq(List()).setId(50688)).setId(50591), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(50592), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50593))).setId(50692), IAssign(RefId(Id("""ownDesc""")), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(true))))).setId(50596)).setId(50599))).setId(50695), ISeq(List()).setId(50696)).setId(50602), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""ownDesc"""))))).setId(50604), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ownDesc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50605), IReturn(ERef(RefId(Id("""__x4__""")))).setId(50606))).setId(50701), ISeq(List()).setId(50702)).setId(50608), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""Receiver"""))))).setId(50610), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50611), IReturn(ERef(RefId(Id("""__x6__""")))).setId(50612))).setId(50707), ISeq(List()).setId(50708)).setId(50614), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""Receiver""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))))).setId(50616), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(50617), IReturn(ERef(RefId(Id("""__x7__""")))).setId(50618)).setId(50619), ISeq(List()).setId(50714)).setId(50620), ILet(Id("""existingDescriptor"""), ERef(RefId(Id("""__x7__""")))).setId(50621), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""existingDescriptor"""))), EUndef)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""existingDescriptor"""))))).setId(50623), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50624), IReturn(ERef(RefId(Id("""__x9__""")))).setId(50625))).setId(50720), ISeq(List()).setId(50721)).setId(50627), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""existingDescriptor""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50629), IReturn(ERef(RefId(Id("""__x10__""")))).setId(50630))).setId(50725), ISeq(List()).setId(50726)).setId(50632), ILet(Id("""valueDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V"""))))))).setId(50634), IApp(Id("""__x11__"""), ERef(RefProp(RefId(Id("""Receiver""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""valueDesc"""))))).setId(50636), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(50637), IReturn(ERef(RefId(Id("""__x11__""")))).setId(50638)).setId(50639), ISeq(List()).setId(50733)).setId(50640), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(50641), IReturn(ERef(RefId(Id("""__x12__""")))).setId(50642))).setId(50737), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))))).setId(50645), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(50646), IReturn(ERef(RefId(Id("""__x13__""")))).setId(50647)).setId(50648), ISeq(List()).setId(50742)).setId(50649), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(50650), IReturn(ERef(RefId(Id("""__x14__""")))).setId(50651))).setId(50746)).setId(50654))).setId(50748), ISeq(List()).setId(50749)).setId(50657), ILet(Id("""setter"""), ERef(RefProp(RefId(Id("""ownDesc""")), EStr("""Set""")))).setId(50659), IIf(EBOp(OEq, ERef(RefId(Id("""setter"""))), EUndef), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50661), IReturn(ERef(RefId(Id("""__x15__""")))).setId(50662))).setId(50754), ISeq(List()).setId(50755)).setId(50664), IApp(Id("""__x16__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""setter"""))), ERef(RefId(Id("""Receiver"""))), EList(List(ERef(RefId(Id("""V"""))))))).setId(50666), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(50667), IReturn(ERef(RefId(Id("""__x16__""")))).setId(50668)).setId(50669), ISeq(List()).setId(50761)).setId(50670), IExpr(ERef(RefId(Id("""__x16__""")))).setId(50671), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50673), IReturn(ERef(RefId(Id("""__x17__""")))).setId(50674))).setId(50766))
  val instToStepMap: Map[Int, Int] = HashMap(50629 -> 22, 50621 -> 29, 50643 -> 25, 50665 -> 34, 50632 -> 25, 50645 -> 29, 50601 -> 9, 50660 -> 32, 50608 -> 29, 50613 -> 15, 50642 -> 25, 50610 -> 29, 50586 -> 9, 50596 -> 9, 50674 -> 36, 50609 -> 29, 50654 -> 29, 50622 -> 29, 50600 -> 9, 50628 -> 25, 50633 -> 25, 50650 -> 29, 50605 -> 13, 50664 -> 34, 50614 -> 29, 50592 -> 6, 50604 -> 30, 50607 -> 13, 50636 -> 25, 50624 -> 20, 50672 -> 35, 50597 -> 9, 50640 -> 25, 50653 -> 29, 50671 -> 35, 50585 -> 9, 50661 -> 33, 50649 -> 29, 50591 -> 6, 50603 -> 10, 50620 -> 29, 50598 -> 9, 50630 -> 22, 50652 -> 29, 50623 -> 25, 50657 -> 30, 50675 -> 36, 50635 -> 25, 50625 -> 20, 50611 -> 15, 50656 -> 29, 50615 -> 29, 50579 -> 31, 50662 -> 33, 50594 -> 6, 50666 -> 35, 50602 -> 10, 50663 -> 33, 50631 -> 22, 50587 -> 6, 50626 -> 20, 50641 -> 25, 50659 -> 32, 50651 -> 29, 50658 -> 30, 50670 -> 35, 50595 -> 6, 50673 -> 36, 50612 -> 15, 50606 -> 13, 50655 -> 29, 50584 -> 9, 50644 -> 25, 50593 -> 6, 50599 -> 9, 50616 -> 29, 50634 -> 25, 50580 -> 9, 50627 -> 25)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(50579), 10 -> HashSet(50603, 50602), 14 -> HashSet(50608, 50609), 6 -> HashSet(50592, 50591, 50594, 50587, 50595, 50593), 9 -> HashSet(50601, 50600, 50597, 50585, 50598, 50584, 50599, 50580, 50596, 50586), 13 -> HashSet(50605, 50607, 50606), 22 -> HashSet(50629, 50630, 50631), 23 -> HashSet(50632, 50633), 15 -> HashSet(50613, 50611, 50612), 24 -> HashSet(50635, 50634), 25 -> HashSet(50632, 50642, 50636, 50640, 50623, 50635, 50643, 50641, 50644, 50628, 50633, 50634, 50627), 20 -> HashSet(50624, 50625, 50626), 29 -> HashSet(50645, 50650, 50614, 50653, 50649, 50621, 50620, 50652, 50656, 50651, 50655, 50616, 50608, 50610, 50609, 50654, 50622, 50615, 50579), 28 -> HashSet(50579), 21 -> HashSet(50628, 50623, 50627), 33 -> HashSet(50661, 50662, 50663), 17 -> HashSet(50622, 50621, 50620, 50616), 32 -> HashSet(50660, 50659), 34 -> HashSet(50665, 50664), 3 -> HashSet(50586, 50585, 50584, 50580), 35 -> HashSet(50672, 50671, 50666, 50670), 16 -> HashSet(50610, 50614, 50615), 31 -> HashSet(50579), 36 -> HashSet(50674, 50675, 50673), 30 -> HashSet(50604, 50657, 50658))
  /* Beautified form:
  "OrdinarySetWithOwnDescriptor" (O, P, V, Receiver, ownDesc) => {
    if (= ownDesc undefined) {
      app __x0__ = (O["GetPrototypeOf"] O)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let parent = __x0__
      if (! (= parent null)) {
        app __x1__ = (parent["Set"] parent P V Receiver)
        if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        app __x2__ = (WrapCompletion __x1__)
        return __x2__
      } else ownDesc = (new PropertyDescriptor("Value" -> undefined, "Writable" -> true, "Enumerable" -> true, "Configurable" -> true))
    } else {}
    app __x3__ = (IsDataDescriptor ownDesc)
    if (= __x3__ true) {
      if (= ownDesc["Writable"] false) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else {}
      app __x5__ = (Type Receiver)
      if (! (= __x5__ Object)) {
        app __x6__ = (WrapCompletion false)
        return __x6__
      } else {}
      app __x7__ = (Receiver["GetOwnProperty"] Receiver P)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let existingDescriptor = __x7__
      if (! (= existingDescriptor undefined)) {
        app __x8__ = (IsAccessorDescriptor existingDescriptor)
        if (= __x8__ true) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (= existingDescriptor["Writable"] false) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        let valueDesc = (new PropertyDescriptor("Value" -> V))
        app __x11__ = (Receiver["DefineOwnProperty"] Receiver P valueDesc)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {
        app __x13__ = (CreateDataProperty Receiver P V)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        app __x14__ = (WrapCompletion __x13__)
        return __x14__
      }
    } else {}
    let setter = ownDesc["Set"]
    if (= setter undefined) {
      app __x15__ = (WrapCompletion false)
      return __x15__
    } else {}
    app __x16__ = (Call setter Receiver (new [V]))
    if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    __x16__
    app __x17__ = (WrapCompletion true)
    return __x17__
  }
  */
}
