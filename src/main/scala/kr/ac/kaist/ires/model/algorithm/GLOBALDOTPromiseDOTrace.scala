package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTrace {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.race""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(92330), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(92331), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(92333), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(92335), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92336), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92337)).setId(92338), ISeq(List()).setId(92339)).setId(92340), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(92341), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(92343), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(92344), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""iteratorRecord""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""iteratorRecord""")), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value""")))).setId(92346), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value"""))))))).setId(92347), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92348), ISeq(List()).setId(92339)).setId(92349), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(92350))).setId(92351)).setId(92352), ISeq(List()).setId(92339)).setId(92353), IExpr(ERef(RefId(Id("""iteratorRecord""")))).setId(92354), IApp(Id("""__x4__"""), ERef(RefId(Id("""PerformPromiseRace"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""C"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(92356), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))).setId(92357), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(92359), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(92360), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x6__""")))).setId(92361))).setId(92362), ISeq(List()).setId(92339)).setId(92363), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(92365), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(92366), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))).setId(92367), ISeq(List()).setId(92339)).setId(92368), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(92369))).setId(92370)).setId(92371), ISeq(List()).setId(92339)).setId(92372), IExpr(ERef(RefId(Id("""result""")))).setId(92373))).setId(92375), ISeq(List()).setId(92339)).setId(92376), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(92378), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(92379), IReturn(ERef(RefId(Id("""__x9__""")))).setId(92380))).setId(-1))
  /* Beautified form:
  "GLOBAL.Promise.race" (this, argumentsList, NewTarget) => {
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
    app __x4__ = (PerformPromiseRace iteratorRecord C promiseCapability)
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
