package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PromiseResolveFunctions {
  val length: Int = 0
  val func: Func = Func("""PromiseResolveFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(11991), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(11994), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(11996), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11998), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11999))).setId(12056), ISeq(List()).setId(12057)).setId(12001), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(12003), IApp(Id("""__x1__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""promise"""))))).setId(12005), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(ILet(Id("""selfResolutionError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(12006), IApp(Id("""__x2__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""selfResolutionError"""))))).setId(12008), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(12009), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12010))).setId(12065), ISeq(List()).setId(12066)).setId(12013), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""resolution"""))))).setId(12015), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(12016), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(12017), IReturn(ERef(RefId(Id("""__x6__""")))).setId(12018))).setId(12072), ISeq(List()).setId(12073)).setId(12021), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""resolution"""))), EStr("""then"""))).setId(12023), ILet(Id("""then"""), ERef(RefId(Id("""__x7__""")))).setId(12024), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""then"""))))).setId(12026), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefProp(RefId(Id("""then""")), EStr("""Value"""))))).setId(12027), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(12028), IReturn(ERef(RefId(Id("""__x10__""")))).setId(12029))).setId(12081), ISeq(List()).setId(12082)).setId(12032), ILet(Id("""thenAction"""), ERef(RefProp(RefId(Id("""then""")), EStr("""Value""")))).setId(12034), IApp(Id("""__x11__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""thenAction"""))))).setId(12036), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(false)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(12037), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(12038), IReturn(ERef(RefId(Id("""__x13__""")))).setId(12039))).setId(12089), ISeq(List()).setId(12090)).setId(12042), IApp(Id("""__x14__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseResolveThenableJob"""))), EList(List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""thenAction"""))))))).setId(12044), IExpr(ERef(RefId(Id("""__x14__""")))).setId(12045), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12047), IReturn(ERef(RefId(Id("""__x15__""")))).setId(12048))).setId(12096))
  val instToStepMap: Map[Int, Int] = HashMap(11998 -> 4, 11994 -> 2, 11991 -> 0, 11997 -> 3, 11996 -> 3, 12006 -> 10, 12001 -> 5, 12010 -> 10, 12030 -> 19, 12040 -> 24, 12013 -> 11, 12026 -> 20, 12009 -> 10, 12046 -> 26, 12003 -> 6, 12018 -> 14, 12023 -> 16, 12041 -> 24, 12008 -> 10, 12036 -> 25, 11993 -> 1, 12029 -> 19, 12012 -> 10, 12037 -> 24, 12025 -> 16, 12020 -> 14, 12016 -> 14, 12033 -> 20, 12019 -> 14, 12045 -> 26, 12004 -> 6, 12005 -> 11, 12028 -> 19, 12038 -> 24, 12011 -> 10, 12032 -> 20, 12034 -> 21, 12015 -> 15, 12049 -> 27, 12044 -> 26, 12000 -> 4, 12021 -> 15, 12048 -> 27, 12043 -> 25, 12014 -> 11, 12039 -> 24, 11995 -> 2, 12027 -> 19, 11999 -> 4, 12031 -> 19, 12024 -> 16, 12022 -> 15, 12002 -> 5, 12042 -> 25, 12007 -> 10, 12035 -> 21, 11992 -> 0, 12017 -> 14, 12047 -> 27)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(11991, 11992), 5 -> HashSet(12001, 12002), 10 -> HashSet(12009, 12008, 12012, 12011, 12006, 12010, 12007), 14 -> HashSet(12018, 12020, 12016, 12019, 12017), 20 -> HashSet(12026, 12033, 12032), 1 -> HashSet(11993), 6 -> HashSet(12003, 12004), 21 -> HashSet(12034, 12035), 9 -> HashSet(12006, 12007), 2 -> HashSet(11994, 11995), 27 -> HashSet(12049, 12048, 12047), 3 -> HashSet(11997, 11996), 16 -> HashSet(12023, 12025, 12024), 11 -> HashSet(12013, 12005, 12014), 26 -> HashSet(12046, 12045, 12044), 19 -> HashSet(12030, 12029, 12028, 12027, 12031), 4 -> HashSet(11998, 12000, 11999), 15 -> HashSet(12015, 12021, 12022), 24 -> HashSet(12040, 12041, 12037, 12038, 12039), 25 -> HashSet(12036, 12043, 12042))
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
