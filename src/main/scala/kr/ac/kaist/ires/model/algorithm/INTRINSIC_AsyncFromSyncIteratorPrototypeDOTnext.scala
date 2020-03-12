package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext {
  val length: Int = 1
  val func: Func = Func("""INTRINSIC_AsyncFromSyncIteratorPrototype.next""", List(Id("""value""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(9560), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(9563), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(9564), IReturn(ERef(RefId(Id("""__x0__""")))).setId(9565)).setId(9566), ISeq(List()).setId(9599)).setId(9567), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(9568), ILet(Id("""syncIteratorRecord"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")))).setId(9570), IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorNext"""))), List(ERef(RefId(Id("""syncIteratorRecord"""))), ERef(RefId(Id("""value"""))))).setId(9572), ILet(Id("""result"""), ERef(RefId(Id("""__x1__""")))).setId(9573), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(9575), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(9576), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x2__""")))).setId(9577), ISeq(List()).setId(9608)).setId(9578), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(9579))).setId(9611)).setId(9581), ISeq(List()).setId(9613)).setId(9582), IExpr(ERef(RefId(Id("""result""")))).setId(9583), IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(9585), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(9586), IReturn(ERef(RefId(Id("""__x3__""")))).setId(9587)).setId(9588), ISeq(List()).setId(9620)).setId(9589), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(9590), IReturn(ERef(RefId(Id("""__x4__""")))).setId(9591))).setId(9624))
  val instToStepMap: Map[Int, Int] = HashMap(9561 -> 0, 9571 -> 3, 9562 -> 1, 9585 -> 6, 9582 -> 5, 9563 -> 2, 9567 -> 2, 9574 -> 4, 9591 -> 6, 9569 -> 2, 9583 -> 5, 9568 -> 2, 9573 -> 4, 9590 -> 6, 9572 -> 4, 9589 -> 6, 9584 -> 5, 9560 -> 0, 9592 -> 6, 9570 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(9561, 9560), 5 -> HashSet(9584, 9582, 9583), 1 -> HashSet(9562), 6 -> HashSet(9590, 9589, 9585, 9592, 9591), 2 -> HashSet(9563, 9567, 9569, 9568), 3 -> HashSet(9571, 9570), 4 -> HashSet(9574, 9573, 9572))
  /* Beautified form:
  "INTRINSIC_AsyncFromSyncIteratorPrototype.next" (value) => {
    let O = this
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    let syncIteratorRecord = O["SyncIteratorRecord"]
    app __x1__ = (IteratorNext syncIteratorRecord value)
    let result = __x1__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x2__) "Completion") (! (= __x2__["Type"] CONST_normal))) return __x2__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x3__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
