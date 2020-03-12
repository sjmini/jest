package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTIsExtensible {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.IsExtensible""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(58754), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58756), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58757))).setId(58814), ISeq(List()).setId(58815)).setId(58760), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(58762), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""isExtensible"""))).setId(58764), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(58765), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58766)).setId(58767), ISeq(List()).setId(58822)).setId(58768), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(58769), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(58771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(58772), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58773)).setId(58774), ISeq(List()).setId(58829)).setId(58775), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(58776), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58777))).setId(58833), ISeq(List()).setId(58834)).setId(58780), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))).setId(58782), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(58783), IReturn(ERef(RefId(Id("""__x4__""")))).setId(58784)).setId(58785), ISeq(List()).setId(58840)).setId(58786), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(58787), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(58788), IReturn(ERef(RefId(Id("""__x5__""")))).setId(58789)).setId(58790), ISeq(List()).setId(58846)).setId(58791), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x5__""")))).setId(58792), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(58794), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(58795), IReturn(ERef(RefId(Id("""__x6__""")))).setId(58796)).setId(58797), ISeq(List()).setId(58853)).setId(58798), ILet(Id("""targetResult"""), ERef(RefId(Id("""__x6__""")))).setId(58799), IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""booleanTrapResult"""))), ERef(RefId(Id("""targetResult"""))))).setId(58801), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58802), IReturn(ERef(RefId(Id("""__x8__""")))).setId(58803))).setId(58859), ISeq(List()).setId(58860)).setId(58805), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""booleanTrapResult"""))))).setId(58807), IReturn(ERef(RefId(Id("""__x9__""")))).setId(58808))).setId(58864))
  val instToStepMap: Map[Int, Int] = HashMap(58787 -> 10, 58763 -> 4, 58781 -> 9, 58769 -> 5, 58809 -> 14, 58777 -> 8, 58794 -> 11, 58762 -> 4, 58807 -> 14, 58802 -> 12, 58793 -> 10, 58776 -> 8, 58808 -> 14, 58786 -> 10, 58754 -> 0, 58764 -> 5, 58755 -> 0, 58782 -> 10, 58806 -> 13, 58799 -> 11, 58778 -> 8, 58759 -> 3, 58803 -> 12, 58791 -> 10, 58798 -> 11, 58756 -> 1, 58771 -> 8, 58801 -> 13, 58760 -> 2, 58804 -> 12, 58775 -> 8, 58792 -> 10, 58757 -> 1, 58770 -> 5, 58780 -> 9, 58761 -> 2, 58768 -> 5, 58800 -> 11, 58758 -> 1, 58805 -> 13, 58779 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(58755, 58754), 5 -> HashSet(58769, 58770, 58768, 58764), 10 -> HashSet(58782, 58787, 58791, 58792, 58793, 58786), 14 -> HashSet(58809, 58807, 58808), 1 -> HashSet(58756, 58757, 58758), 9 -> HashSet(58781, 58780), 13 -> HashSet(58806, 58801, 58805), 2 -> HashSet(58760, 58761), 12 -> HashSet(58803, 58804, 58802), 3 -> HashSet(58759), 11 -> HashSet(58799, 58798, 58794, 58800), 8 -> HashSet(58778, 58771, 58777, 58775, 58776, 58779), 4 -> HashSet(58763, 58762))
  /* Beautified form:
  "ProxyExoticObject.IsExtensible" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "isExtensible")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (IsExtensible target)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToBoolean __x4__)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let booleanTrapResult = __x5__
    app __x6__ = (IsExtensible target)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let targetResult = __x6__
    app __x7__ = (SameValue booleanTrapResult targetResult)
    if (= __x7__ false) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app __x9__ = (WrapCompletion booleanTrapResult)
    return __x9__
  }
  */
}
