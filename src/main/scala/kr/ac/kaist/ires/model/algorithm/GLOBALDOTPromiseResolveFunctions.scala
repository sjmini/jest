package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseResolveFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.PromiseResolveFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90828), ILet(Id("""resolution"""), ERef(RefId(Id("""__x0__""")))).setId(90829), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90831), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(90834), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(90836), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90838), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90839))).setId(90840), ISeq(List()).setId(90833)).setId(90841), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(90843), IApp(Id("""__x2__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""promise"""))))).setId(90845), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(ILet(Id("""selfResolutionError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(90846), IApp(Id("""__x3__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""selfResolutionError"""))))).setId(90848), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(90849), IReturn(ERef(RefId(Id("""__x4__""")))).setId(90850))).setId(90852), ISeq(List()).setId(90833)).setId(90853), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""resolution"""))))).setId(90855), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(90856), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(90857), IReturn(ERef(RefId(Id("""__x7__""")))).setId(90858))).setId(90860), ISeq(List()).setId(90833)).setId(90861), IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""resolution"""))), EStr("""then"""))).setId(90863), ILet(Id("""then"""), ERef(RefId(Id("""__x8__""")))).setId(90864), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""then"""))))).setId(90866), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefProp(RefId(Id("""then""")), EStr("""Value"""))))).setId(90867), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(90868), IReturn(ERef(RefId(Id("""__x11__""")))).setId(90869))).setId(90871), ISeq(List()).setId(90833)).setId(90872), ILet(Id("""thenAction"""), ERef(RefProp(RefId(Id("""then""")), EStr("""Value""")))).setId(90874), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""thenAction"""))))).setId(90876), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(false)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(90877), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(90878), IReturn(ERef(RefId(Id("""__x14__""")))).setId(90879))).setId(90881), ISeq(List()).setId(90833)).setId(90882), IApp(Id("""__x15__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseResolveThenableJob"""))), EList(List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""thenAction"""))))))).setId(90884), IExpr(ERef(RefId(Id("""__x15__""")))).setId(90885), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90887), IReturn(ERef(RefId(Id("""__x16__""")))).setId(90888))).setId(-1))
  /* Beautified form:
  "GLOBAL.PromiseResolveFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let resolution = __x0__
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    alreadyResolved["Value"] = true
    app __x2__ = (SameValue resolution promise)
    if (= __x2__ true) {
      let selfResolutionError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x3__ = (RejectPromise promise selfResolutionError)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (Type resolution)
    if (! (= __x5__ Object)) {
      app __x6__ = (FulfillPromise promise resolution)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (Get resolution "then")
    let then = __x8__
    app __x9__ = (IsAbruptCompletion then)
    if __x9__ {
      app __x10__ = (RejectPromise promise then["Value"])
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    let thenAction = then["Value"]
    app __x12__ = (IsCallable thenAction)
    if (= __x12__ false) {
      app __x13__ = (FulfillPromise promise resolution)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (EnqueueJob "PromiseJobs" PromiseResolveThenableJob (new [promise, resolution, thenAction]))
    __x15__
    app __x16__ = (WrapCompletion undefined)
    return __x16__
  }
  */
}
