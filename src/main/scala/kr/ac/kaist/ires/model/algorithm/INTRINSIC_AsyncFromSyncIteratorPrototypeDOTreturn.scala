package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""INTRINSIC_AsyncFromSyncIteratorPrototype.return""", List(Id("""value""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(9656), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(9659), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(9660), IReturn(ERef(RefId(Id("""__x0__""")))).setId(9661)).setId(9662), ISeq(List()).setId(9742)).setId(9663), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(9664), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))).setId(9666), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""return"""))).setId(9668), ILet(Id("""return"""), ERef(RefId(Id("""__x1__""")))).setId(9669), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""return""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""return""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""return""")), ERef(RefProp(RefId(Id("""return""")), EStr("""Value""")))).setId(9671), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""return""")), EStr("""Value"""))))))).setId(9672), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x2__""")))).setId(9673), ISeq(List()).setId(9751)).setId(9674), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(9675))).setId(9754)).setId(9677), ISeq(List()).setId(9756)).setId(9678), IExpr(ERef(RefId(Id("""return""")))).setId(9679), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), EBool(true))).setId(9681), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(9682), IReturn(ERef(RefId(Id("""__x3__""")))).setId(9683)).setId(9684), ISeq(List()).setId(9763)).setId(9685), ILet(Id("""iterResult"""), ERef(RefId(Id("""__x3__""")))).setId(9686), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iterResult"""))))))).setId(9688), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(9689), IReturn(ERef(RefId(Id("""__x4__""")))).setId(9690)).setId(9691), ISeq(List()).setId(9770)).setId(9692), IExpr(ERef(RefId(Id("""__x4__""")))).setId(9693), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(9695), IReturn(ERef(RefId(Id("""__x5__""")))).setId(9696))).setId(9775), ISeq(List()).setId(9776)).setId(9699), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))).setId(9701), ILet(Id("""result"""), ERef(RefId(Id("""__x6__""")))).setId(9702), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(9704), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(9705), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))).setId(9706), ISeq(List()).setId(9783)).setId(9707), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(9708))).setId(9786)).setId(9710), ISeq(List()).setId(9788)).setId(9711), IExpr(ERef(RefId(Id("""result""")))).setId(9712), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(9714), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))).setId(9715), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(9716), IReturn(ERef(RefId(Id("""__x9__""")))).setId(9717)).setId(9718), ISeq(List()).setId(9796)).setId(9719), IExpr(ERef(RefId(Id("""__x9__""")))).setId(9720), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(9722), IReturn(ERef(RefId(Id("""__x10__""")))).setId(9723))).setId(9801), ISeq(List()).setId(9802)).setId(9726), IApp(Id("""__x11__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(9728), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(9729), IReturn(ERef(RefId(Id("""__x11__""")))).setId(9730)).setId(9731), ISeq(List()).setId(9808)).setId(9732), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(9733), IReturn(ERef(RefId(Id("""__x12__""")))).setId(9734))).setId(9812))
  val instToStepMap: Map[Int, Int] = HashMap(9685 -> 10, 9680 -> 5, 9700 -> 11, 9658 -> 1, 9694 -> 10, 9699 -> 11, 9698 -> 10, 9715 -> 17, 9666 -> 3, 9732 -> 19, 9697 -> 10, 9679 -> 5, 9735 -> 19, 9657 -> 0, 9693 -> 10, 9668 -> 4, 9725 -> 17, 9712 -> 13, 9703 -> 12, 9720 -> 17, 9688 -> 10, 9722 -> 17, 9734 -> 19, 9667 -> 3, 9714 -> 18, 9726 -> 18, 9721 -> 17, 9733 -> 19, 9719 -> 17, 9663 -> 2, 9659 -> 2, 9687 -> 10, 9681 -> 10, 9670 -> 4, 9713 -> 13, 9723 -> 17, 9702 -> 12, 9727 -> 18, 9695 -> 10, 9678 -> 5, 9656 -> 0, 9686 -> 10, 9664 -> 2, 9665 -> 2, 9724 -> 17, 9692 -> 10, 9701 -> 12, 9669 -> 4, 9711 -> 13, 9728 -> 19, 9696 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(9657, 9656), 5 -> HashSet(9680, 9678, 9679), 10 -> HashSet(9685, 9693, 9688, 9694, 9698, 9695, 9686, 9692, 9696, 9697, 9687, 9681), 1 -> HashSet(9658), 9 -> HashSet(9693, 9688, 9694, 9692), 13 -> HashSet(9712, 9713, 9711), 2 -> HashSet(9663, 9659, 9664, 9665), 17 -> HashSet(9725, 9720, 9722, 9721, 9719, 9723, 9715, 9724), 12 -> HashSet(9703, 9702, 9701), 3 -> HashSet(9667, 9666), 18 -> HashSet(9714, 9726, 9727), 16 -> HashSet(9720, 9721, 9719, 9715), 11 -> HashSet(9700, 9699), 8 -> HashSet(9685, 9686, 9687, 9681), 19 -> HashSet(9735, 9734, 9733, 9732, 9728), 4 -> HashSet(9668, 9670, 9669))
  /* Beautified form:
  "INTRINSIC_AsyncFromSyncIteratorPrototype.return" (value) => {
    let O = this
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x1__ = (GetMethod syncIterator "return")
    let return = __x1__
    if (= (typeof return) "Completion") if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (= (typeof __x2__) "Completion") (! (= __x2__["Type"] CONST_normal))) return __x2__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x3__ = (CreateIterResultObject value true)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let iterResult = __x3__
      app __x4__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      app __x5__ = (WrapCompletion promiseCapability["Promise"])
      return __x5__
    } else {}
    app __x6__ = (Call return syncIterator (new [value]))
    let result = __x6__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x7__) "Completion") (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x8__ = (Type result)
    if (! (= __x8__ Object)) {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      __x9__
      app __x10__ = (WrapCompletion promiseCapability["Promise"])
      return __x10__
    } else {}
    app __x11__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
