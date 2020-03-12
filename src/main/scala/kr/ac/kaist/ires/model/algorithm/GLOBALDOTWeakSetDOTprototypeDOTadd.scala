package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakSetDOTprototypeDOTadd {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakSet.prototype.add""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87386), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(87387), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(87389), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""WeakSetData"""))).setId(87391), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87392), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87393)).setId(87394), ISeq(List()).setId(87442)).setId(87396), IExpr(ERef(RefId(Id("""__x1__""")))).setId(87397), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(87399), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87400), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87401))).setId(87448), ISeq(List()).setId(87449)).setId(87403), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""WeakSetData""")))).setId(87405), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(87421), ILet(Id("""__x5__"""), EINum(0L)).setId(87422), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(87423), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(87412), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(87407), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(87410))).setId(87458), ISeq(List()).setId(87459)).setId(87413), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(87414), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87415))).setId(87463), ISeq(List()).setId(87464)).setId(87418), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(87424))).setId(87467)).setId(87426), IAppend(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""entries""")))).setId(87429), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(87431), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87432))).setId(87472))
  val instToStepMap: Map[Int, Int] = HashMap(87419 -> 10, 87387 -> 0, 87406 -> 5, 87433 -> 12, 87416 -> 10, 87412 -> 10, 87402 -> 3, 87417 -> 10, 87415 -> 10, 87386 -> 0, 87414 -> 10, 87390 -> 1, 87413 -> 10, 87430 -> 11, 87391 -> 2, 87426 -> 10, 87401 -> 3, 87429 -> 11, 87397 -> 2, 87420 -> 10, 87403 -> 4, 87428 -> 10, 87388 -> 0, 87404 -> 4, 87400 -> 3, 87421 -> 10, 87427 -> 10, 87432 -> 12, 87389 -> 1, 87418 -> 10, 87431 -> 12, 87396 -> 2, 87405 -> 5, 87399 -> 4, 87422 -> 10, 87398 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87387, 87388, 87386), 5 -> HashSet(87406, 87405), 10 -> HashSet(87419, 87426, 87420, 87416, 87428, 87412, 87417, 87415, 87418, 87414, 87413, 87422, 87421, 87427), 1 -> HashSet(87389, 87390), 2 -> HashSet(87391, 87397, 87396, 87398), 12 -> HashSet(87433, 87432, 87431), 3 -> HashSet(87401, 87402, 87400), 11 -> HashSet(87429, 87430), 4 -> HashSet(87403, 87404, 87399))
  /* Beautified form:
  "GLOBAL.WeakSet.prototype.add" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "WeakSetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (Type value)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    let entries = S["WeakSetData"]
    let __x4__ = entries
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let e = __x4__[__x5__]
      let __x6__ = (! (= e CONST_empty))
      if __x6__ {
        app __x7__ = (SameValue e value)
        __x6__ = (= __x7__ true)
      } else {}
      if __x6__ {
        app __x8__ = (WrapCompletion S)
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    append value -> entries
    app __x9__ = (WrapCompletion S)
    return __x9__
  }
  */
}
