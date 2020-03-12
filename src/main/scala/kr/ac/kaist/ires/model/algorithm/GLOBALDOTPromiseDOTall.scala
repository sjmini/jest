package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseDOTall {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.all""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91738), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(91739), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(91741), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(91743), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(91744), IReturn(ERef(RefId(Id("""__x1__""")))).setId(91745)).setId(91746), ISeq(List()).setId(91798)).setId(91748), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(91749), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(91751), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(91752), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""iteratorRecord""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""iteratorRecord""")), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value""")))).setId(91754), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value"""))))))).setId(91755), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91756), ISeq(List()).setId(91806)).setId(91757), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(91758))).setId(91809)).setId(91760), ISeq(List()).setId(91811)).setId(91761), IExpr(ERef(RefId(Id("""iteratorRecord""")))).setId(91762), IApp(Id("""__x4__"""), ERef(RefId(Id("""PerformPromiseAll"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""C"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(91764), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))).setId(91765), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(91767), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(91768), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x6__""")))).setId(91769))).setId(91819), ISeq(List()).setId(91820)).setId(91771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(91773), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(91774), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))).setId(91775), ISeq(List()).setId(91825)).setId(91776), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(91777))).setId(91828)).setId(91779), ISeq(List()).setId(91830)).setId(91780), IExpr(ERef(RefId(Id("""result""")))).setId(91781))).setId(91833), ISeq(List()).setId(91834)).setId(91784), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(91786), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(91787), IReturn(ERef(RefId(Id("""__x9__""")))).setId(91788))).setId(91839))
  val instToStepMap: Map[Int, Int] = HashMap(91785 -> 11, 91748 -> 2, 91743 -> 2, 91752 -> 3, 91784 -> 11, 91771 -> 10, 91770 -> 8, 91741 -> 1, 91761 -> 4, 91753 -> 3, 91780 -> 10, 91789 -> 12, 91767 -> 11, 91739 -> 0, 91762 -> 4, 91749 -> 2, 91768 -> 8, 91788 -> 12, 91742 -> 1, 91781 -> 10, 91764 -> 5, 91763 -> 4, 91738 -> 0, 91782 -> 10, 91750 -> 2, 91787 -> 12, 91765 -> 5, 91740 -> 0, 91751 -> 3, 91766 -> 5, 91786 -> 12, 91769 -> 8, 91772 -> 10, 91783 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(91739, 91738, 91740), 5 -> HashSet(91764, 91765, 91766), 10 -> HashSet(91780, 91771, 91781, 91782, 91772, 91783), 1 -> HashSet(91742, 91741), 9 -> HashSet(91771, 91772), 2 -> HashSet(91748, 91743, 91749, 91750), 12 -> HashSet(91789, 91788, 91787, 91786), 3 -> HashSet(91753, 91752, 91751), 11 -> HashSet(91785, 91767, 91784), 8 -> HashSet(91768, 91770, 91769), 4 -> HashSet(91762, 91763, 91761))
  /* Beautified form:
  "GLOBAL.Promise.all" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    let C = this
    app __x1__ = (NewPromiseCapability C)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    app __x2__ = (GetIterator iterable)
    let iteratorRecord = __x2__
    if (= (typeof iteratorRecord) "Completion") if (= iteratorRecord["Type"] CONST_normal) iteratorRecord = iteratorRecord["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [iteratorRecord["Value"]]))
      if (&& (= (typeof __x3__) "Completion") (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    iteratorRecord
    app __x4__ = (PerformPromiseAll iteratorRecord C promiseCapability)
    let result = __x4__
    app __x5__ = (IsAbruptCompletion result)
    if __x5__ {
      if (= iteratorRecord["Done"] false) {
        app __x6__ = (IteratorClose iteratorRecord result)
        result = __x6__
      } else {}
      if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
        app __x7__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (&& (= (typeof __x7__) "Completion") (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
        return promiseCapability["Promise"]
      } else {}
      result
    } else {}
    app __x8__ = (Completion result)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
