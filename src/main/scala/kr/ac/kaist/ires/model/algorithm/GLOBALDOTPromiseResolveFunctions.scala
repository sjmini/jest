package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseResolveFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.PromiseResolveFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90828), ILet(Id("""resolution"""), ERef(RefId(Id("""__x0__""")))).setId(90829), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90831), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(90834), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(90836), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90838), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90839))).setId(90898), ISeq(List()).setId(90899)).setId(90841), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(90843), IApp(Id("""__x2__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""promise"""))))).setId(90845), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(ILet(Id("""selfResolutionError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(90846), IApp(Id("""__x3__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""selfResolutionError"""))))).setId(90848), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(90849), IReturn(ERef(RefId(Id("""__x4__""")))).setId(90850))).setId(90907), ISeq(List()).setId(90908)).setId(90853), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""resolution"""))))).setId(90855), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(90856), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(90857), IReturn(ERef(RefId(Id("""__x7__""")))).setId(90858))).setId(90914), ISeq(List()).setId(90915)).setId(90861), IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""resolution"""))), EStr("""then"""))).setId(90863), ILet(Id("""then"""), ERef(RefId(Id("""__x8__""")))).setId(90864), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""then"""))))).setId(90866), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefProp(RefId(Id("""then""")), EStr("""Value"""))))).setId(90867), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(90868), IReturn(ERef(RefId(Id("""__x11__""")))).setId(90869))).setId(90923), ISeq(List()).setId(90924)).setId(90872), ILet(Id("""thenAction"""), ERef(RefProp(RefId(Id("""then""")), EStr("""Value""")))).setId(90874), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""thenAction"""))))).setId(90876), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(false)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))).setId(90877), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(90878), IReturn(ERef(RefId(Id("""__x14__""")))).setId(90879))).setId(90931), ISeq(List()).setId(90932)).setId(90882), IApp(Id("""__x15__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseResolveThenableJob"""))), EList(List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""thenAction"""))))))).setId(90884), IExpr(ERef(RefId(Id("""__x15__""")))).setId(90885), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90887), IReturn(ERef(RefId(Id("""__x16__""")))).setId(90888))).setId(90938))
  val instToStepMap: Map[Int, Int] = HashMap(90881 -> 25, 90832 -> 1, 90879 -> 25, 90876 -> 26, 90838 -> 5, 90865 -> 17, 90842 -> 6, 90837 -> 4, 90854 -> 12, 90846 -> 11, 90875 -> 22, 90836 -> 4, 90853 -> 12, 90843 -> 7, 90860 -> 15, 90888 -> 28, 90840 -> 5, 90872 -> 21, 90847 -> 11, 90864 -> 17, 90884 -> 27, 90868 -> 20, 90839 -> 5, 90856 -> 15, 90887 -> 28, 90871 -> 20, 90849 -> 11, 90829 -> 0, 90828 -> 0, 90883 -> 26, 90861 -> 16, 90867 -> 20, 90835 -> 3, 90852 -> 11, 90848 -> 11, 90880 -> 25, 90857 -> 15, 90886 -> 27, 90855 -> 16, 90870 -> 20, 90858 -> 15, 90833 -> 2, 90889 -> 28, 90834 -> 3, 90873 -> 21, 90845 -> 12, 90844 -> 7, 90877 -> 25, 90882 -> 26, 90851 -> 11, 90866 -> 21, 90841 -> 6, 90862 -> 16, 90830 -> 0, 90885 -> 27, 90869 -> 20, 90859 -> 15, 90874 -> 22, 90878 -> 25, 90863 -> 17, 90831 -> 1, 90850 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(90830, 90829, 90828), 5 -> HashSet(90840, 90839, 90838), 10 -> HashSet(90847, 90846), 25 -> HashSet(90881, 90879, 90880, 90877, 90878), 20 -> HashSet(90868, 90871, 90867, 90870, 90869), 1 -> HashSet(90832, 90831), 6 -> HashSet(90841, 90842), 2 -> HashSet(90833), 17 -> HashSet(90864, 90865, 90863), 12 -> HashSet(90853, 90845, 90854), 7 -> HashSet(90843, 90844), 3 -> HashSet(90835, 90834), 16 -> HashSet(90861, 90855, 90862), 11 -> HashSet(90847, 90849, 90852, 90848, 90851, 90850, 90846), 26 -> HashSet(90876, 90883, 90882), 4 -> HashSet(90836, 90837), 15 -> HashSet(90860, 90856, 90857, 90858, 90859), 28 -> HashSet(90888, 90887, 90889), 21 -> HashSet(90872, 90873, 90866), 22 -> HashSet(90875, 90874), 27 -> HashSet(90884, 90886, 90885))
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
