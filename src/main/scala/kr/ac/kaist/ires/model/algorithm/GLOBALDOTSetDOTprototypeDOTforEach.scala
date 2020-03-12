package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSetDOTprototypeDOTforEach {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Set.prototype.forEach""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(85989), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(85990), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(85992), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(85993), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(85995), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""SetData"""))).setId(85997), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(85998), IReturn(ERef(RefId(Id("""__x2__""")))).setId(85999)).setId(86000), ISeq(List()).setId(86051)).setId(86002), IExpr(ERef(RefId(Id("""__x2__""")))).setId(86003), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(86005), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(86006), IReturn(ERef(RefId(Id("""__x4__""")))).setId(86007))).setId(86057), ISeq(List()).setId(86058)).setId(86009), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(86011), ILet(Id("""T"""), EUndef).setId(86013)).setId(86015), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""SetData""")))).setId(86017), ILet(Id("""__x5__"""), ERef(RefId(Id("""entries""")))).setId(86030), ILet(Id("""__x6__"""), EINum(0L)).setId(86031), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))).setId(86032), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""e"""))), ERef(RefId(Id("""S"""))))))).setId(86019), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(86020), IReturn(ERef(RefId(Id("""__x7__""")))).setId(86021)).setId(86022), ISeq(List()).setId(86071)).setId(86023), IExpr(ERef(RefId(Id("""__x7__""")))).setId(86024))).setId(86074), ISeq(List()).setId(86075)).setId(86027), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L))).setId(86033))).setId(86078)).setId(86035), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(86038), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86039))).setId(86082))
  val instToStepMap: Map[Int, Int] = HashMap(86035 -> 12, 86016 -> 6, 86013 -> 6, 86026 -> 12, 86040 -> 13, 86017 -> 7, 86036 -> 12, 85995 -> 2, 86012 -> 6, 86025 -> 12, 85994 -> 1, 86011 -> 6, 86037 -> 12, 86028 -> 12, 86029 -> 12, 86010 -> 5, 86027 -> 12, 85993 -> 1, 86024 -> 12, 86009 -> 5, 86005 -> 5, 85990 -> 0, 85996 -> 2, 86039 -> 13, 86008 -> 4, 85991 -> 0, 85992 -> 1, 86030 -> 12, 86006 -> 4, 86018 -> 7, 86015 -> 6, 86007 -> 4, 86002 -> 3, 86023 -> 12, 85997 -> 3, 86004 -> 3, 86019 -> 12, 86031 -> 12, 86038 -> 13, 86014 -> 6, 85989 -> 0, 86003 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(85990, 85991, 85989), 5 -> HashSet(86009, 86005, 86010), 1 -> HashSet(85992, 85994, 85993), 6 -> HashSet(86016, 86013, 86012, 86015, 86011, 86014), 13 -> HashSet(86039, 86040, 86038), 2 -> HashSet(85996, 85995), 12 -> HashSet(86035, 86024, 86026, 86036, 86025, 86030, 86037, 86028, 86029, 86023, 86027, 86019, 86031), 7 -> HashSet(86017, 86018), 3 -> HashSet(86002, 86003, 85997, 86004), 4 -> HashSet(86008, 86006, 86007))
  /* Beautified form:
  "GLOBAL.Set.prototype.forEach" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    let S = this
    app __x2__ = (RequireInternalSlot S "SetData")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (IsCallable callbackfn)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    let entries = S["SetData"]
    let __x5__ = entries
    let __x6__ = 0i
    while (< __x6__ __x5__["length"]) {
      let e = __x5__[__x6__]
      if (! (= e CONST_empty)) {
        app __x7__ = (Call callbackfn T (new [e, e, S]))
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        __x7__
      } else {}
      __x6__ = (+ __x6__ 1i)
    }
    app __x8__ = (WrapCompletion undefined)
    return __x8__
  }
  */
}
