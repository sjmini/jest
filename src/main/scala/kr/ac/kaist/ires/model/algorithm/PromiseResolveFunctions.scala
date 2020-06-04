package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PromiseResolveFunctions {
  val length: Int = 0
  val func: Func = Func("""PromiseResolveFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(11991), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(11994), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(11996), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11998), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11999))).setId(12000), ISeq(List()).setId(11993)).setId(12001), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(12003), IApp(Id("""__x1__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""promise"""))))).setId(12005), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(ILet(Id("""selfResolutionError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(12006), IApp(Id("""__x2__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""selfResolutionError"""))))).setId(12008), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(12009), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12010))).setId(12012), ISeq(List()).setId(11993)).setId(12013), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""resolution"""))))).setId(12015), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(12016), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(12017), IReturn(ERef(RefId(Id("""__x6__""")))).setId(12018))).setId(12020), ISeq(List()).setId(11993)).setId(12021), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""resolution"""))), EStr("""then"""))).setId(12023), ILet(Id("""then"""), ERef(RefId(Id("""__x7__""")))).setId(12024), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""then"""))))).setId(12026), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefProp(RefId(Id("""then""")), EStr("""Value"""))))).setId(12027), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(12028), IReturn(ERef(RefId(Id("""__x10__""")))).setId(12029))).setId(12031), ISeq(List()).setId(11993)).setId(12032), ILet(Id("""thenAction"""), ERef(RefProp(RefId(Id("""then""")), EStr("""Value""")))).setId(12034), IApp(Id("""__x11__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""thenAction"""))))).setId(12036), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(false)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(12037), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(12038), IReturn(ERef(RefId(Id("""__x13__""")))).setId(12039))).setId(12041), ISeq(List()).setId(11993)).setId(12042), IApp(Id("""__x14__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseResolveThenableJob"""))), EList(List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""thenAction"""))))))).setId(12044), IExpr(ERef(RefId(Id("""__x14__""")))).setId(12045), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12047), IReturn(ERef(RefId(Id("""__x15__""")))).setId(12048))).setId(-1))
  /* Beautified form:
  "PromiseResolveFunctions" () => {
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyResolved["Value"] = true
    app __x1__ = (SameValue resolution promise)
    if (= __x1__ true) {
      let selfResolutionError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (RejectPromise promise selfResolutionError)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Type resolution)
    if (! (= __x4__ Object)) {
      app __x5__ = (FulfillPromise promise resolution)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (Get resolution "then")
    let then = __x7__
    app __x8__ = (IsAbruptCompletion then)
    if __x8__ {
      app __x9__ = (RejectPromise promise then["Value"])
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    let thenAction = then["Value"]
    app __x11__ = (IsCallable thenAction)
    if (= __x11__ false) {
      app __x12__ = (FulfillPromise promise resolution)
      app __x13__ = (WrapCompletion __x12__)
      return __x13__
    } else {}
    app __x14__ = (EnqueueJob "PromiseJobs" PromiseResolveThenableJob (new [promise, resolution, thenAction]))
    __x14__
    app __x15__ = (WrapCompletion undefined)
    return __x15__
  }
  */
}
