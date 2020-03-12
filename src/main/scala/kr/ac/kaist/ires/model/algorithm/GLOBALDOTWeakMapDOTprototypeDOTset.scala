package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakMapDOTprototypeDOTset {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.WeakMap.prototype.set""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87005), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(87006), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(87008), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(87009), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(87011), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""WeakMapData"""))).setId(87013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(87014), IReturn(ERef(RefId(Id("""__x2__""")))).setId(87015)).setId(87016), ISeq(List()).setId(87070)).setId(87018), IExpr(ERef(RefId(Id("""__x2__""")))).setId(87019), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""WeakMapData""")))).setId(87021), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(87023), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87024), IReturn(ERef(RefId(Id("""__x4__""")))).setId(87025))).setId(87077), ISeq(List()).setId(87078)).setId(87027), ILet(Id("""__x5__"""), ERef(RefId(Id("""entries""")))).setId(87045), ILet(Id("""__x6__"""), EINum(0L)).setId(87046), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))).setId(87047), ILet(Id("""__x7__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(87034), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(87029), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true))).setId(87032))).setId(87086), ISeq(List()).setId(87087)).setId(87035), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""p""")), EStr("""Value""")), ERef(RefId(Id("""value""")))).setId(87036), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))).setId(87038), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87039))).setId(87092), ISeq(List()).setId(87093)).setId(87042), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L))).setId(87048))).setId(87096)).setId(87050), ILet(Id("""p"""), EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""key""")))), (EStr("""Value"""), ERef(RefId(Id("""value"""))))))).setId(87053), IAppend(ERef(RefId(Id("""p"""))), ERef(RefId(Id("""entries""")))).setId(87055), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))).setId(87057), IReturn(ERef(RefId(Id("""__x10__""")))).setId(87058))).setId(87102))
  val instToStepMap: Map[Int, Int] = HashMap(87018 -> 3, 87039 -> 12, 87052 -> 12, 87006 -> 0, 87034 -> 12, 87051 -> 12, 87044 -> 12, 87025 -> 5, 87028 -> 6, 87036 -> 12, 87042 -> 12, 87045 -> 12, 87008 -> 1, 87040 -> 12, 87010 -> 1, 87058 -> 15, 87022 -> 4, 87007 -> 0, 87035 -> 12, 87011 -> 2, 87026 -> 5, 87046 -> 12, 87043 -> 12, 87038 -> 12, 87021 -> 4, 87012 -> 2, 87009 -> 1, 87056 -> 14, 87050 -> 12, 87027 -> 6, 87054 -> 13, 87024 -> 5, 87059 -> 15, 87041 -> 12, 87013 -> 3, 87020 -> 3, 87005 -> 0, 87037 -> 12, 87055 -> 14, 87053 -> 13, 87023 -> 6, 87019 -> 3, 87057 -> 15)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87007, 87006, 87005), 5 -> HashSet(87026, 87024, 87025), 14 -> HashSet(87056, 87055), 1 -> HashSet(87009, 87008, 87010), 6 -> HashSet(87027, 87028, 87023), 13 -> HashSet(87054, 87053), 2 -> HashSet(87011, 87012), 12 -> HashSet(87039, 87035, 87046, 87052, 87034, 87051, 87050, 87041, 87037, 87044, 87036, 87042, 87045, 87040, 87043, 87038), 3 -> HashSet(87018, 87019, 87013, 87020), 11 -> HashSet(87037, 87036), 4 -> HashSet(87022, 87021), 15 -> HashSet(87058, 87059, 87057))
  /* Beautified form:
  "GLOBAL.WeakMap.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "WeakMapData")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let entries = M["WeakMapData"]
    app __x3__ = (Type key)
    if (! (= __x3__ Object)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let __x5__ = entries
    let __x6__ = 0i
    while (< __x6__ __x5__["length"]) {
      let p = __x5__[__x6__]
      let __x7__ = (! (= p["Key"] CONST_empty))
      if __x7__ {
        app __x8__ = (SameValue p["Key"] key)
        __x7__ = (= __x8__ true)
      } else {}
      if __x7__ {
        p["Value"] = value
        app __x9__ = (WrapCompletion M)
        return __x9__
      } else {}
      __x6__ = (+ __x6__ 1i)
    }
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x10__ = (WrapCompletion M)
    return __x10__
  }
  */
}
