package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseDOTrace {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.race""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(92330), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(92331), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(92333), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(92335), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92336), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92337)).setId(92338), ISeq(List()).setId(92390)).setId(92340), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(92341), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(92343), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(92344), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""iteratorRecord""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""iteratorRecord""")), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value""")))).setId(92346), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value"""))))))).setId(92347), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92348), ISeq(List()).setId(92398)).setId(92349), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(92350))).setId(92401)).setId(92352), ISeq(List()).setId(92403)).setId(92353), IExpr(ERef(RefId(Id("""iteratorRecord""")))).setId(92354), IApp(Id("""__x4__"""), ERef(RefId(Id("""PerformPromiseRace"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""C"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(92356), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))).setId(92357), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(92359), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(92360), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x6__""")))).setId(92361))).setId(92411), ISeq(List()).setId(92412)).setId(92363), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(92365), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(92366), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))).setId(92367), ISeq(List()).setId(92417)).setId(92368), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(92369))).setId(92420)).setId(92371), ISeq(List()).setId(92422)).setId(92372), IExpr(ERef(RefId(Id("""result""")))).setId(92373))).setId(92425), ISeq(List()).setId(92426)).setId(92376), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(92378), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(92379), IReturn(ERef(RefId(Id("""__x9__""")))).setId(92380))).setId(92431))
  val instToStepMap: Map[Int, Int] = HashMap(92330 -> 0, 92353 -> 4, 92375 -> 10, 92356 -> 5, 92359 -> 11, 92340 -> 2, 92364 -> 10, 92379 -> 12, 92361 -> 8, 92354 -> 4, 92331 -> 0, 92344 -> 3, 92377 -> 11, 92376 -> 11, 92381 -> 12, 92343 -> 3, 92334 -> 1, 92360 -> 8, 92333 -> 1, 92363 -> 10, 92378 -> 12, 92374 -> 10, 92342 -> 2, 92341 -> 2, 92332 -> 0, 92372 -> 10, 92355 -> 4, 92373 -> 10, 92358 -> 5, 92335 -> 2, 92380 -> 12, 92362 -> 8, 92345 -> 3, 92357 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(92330, 92332, 92331), 5 -> HashSet(92356, 92358, 92357), 10 -> HashSet(92375, 92363, 92374, 92364, 92372, 92373), 1 -> HashSet(92334, 92333), 9 -> HashSet(92363, 92364), 2 -> HashSet(92342, 92340, 92341, 92335), 12 -> HashSet(92381, 92378, 92379, 92380), 3 -> HashSet(92343, 92344, 92345), 11 -> HashSet(92359, 92377, 92376), 8 -> HashSet(92360, 92361, 92362), 4 -> HashSet(92353, 92355, 92354))
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
