package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTsome {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.some""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(81970), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(81971), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(81973), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(81974), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(81976), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(81977), IReturn(ERef(RefId(Id("""__x2__""")))).setId(81978)).setId(81979), ISeq(List()).setId(82063)).setId(81981), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(81982), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(81984), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(81985), IReturn(ERef(RefId(Id("""__x3__""")))).setId(81986)).setId(81987), ISeq(List()).setId(82070)).setId(81988), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(81989), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(81991), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(81992), IReturn(ERef(RefId(Id("""__x5__""")))).setId(81993))).setId(82076), ISeq(List()).setId(82077)).setId(81995), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(81997), ILet(Id("""T"""), EUndef).setId(81999)).setId(82001), ILet(Id("""k"""), EINum(0L)).setId(82003), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(82005), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(82006), IReturn(ERef(RefId(Id("""__x6__""")))).setId(82007)).setId(82008), ISeq(List()).setId(82087)).setId(82009), ILet(Id("""Pk"""), ERef(RefId(Id("""__x6__""")))).setId(82010), IApp(Id("""__x7__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(82012), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(82013), IReturn(ERef(RefId(Id("""__x7__""")))).setId(82014)).setId(82015), ISeq(List()).setId(82094)).setId(82016), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x7__""")))).setId(82017), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(82019), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(82020), IReturn(ERef(RefId(Id("""__x8__""")))).setId(82021)).setId(82022), ISeq(List()).setId(82101)).setId(82023), ILet(Id("""kValue"""), ERef(RefId(Id("""__x8__""")))).setId(82024), IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(82026), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(82027), IReturn(ERef(RefId(Id("""__x9__""")))).setId(82028)).setId(82029), ISeq(List()).setId(82108)).setId(82030), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(82031), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(82032), IReturn(ERef(RefId(Id("""__x10__""")))).setId(82033)).setId(82034), ISeq(List()).setId(82114)).setId(82035), ILet(Id("""testResult"""), ERef(RefId(Id("""__x10__""")))).setId(82036), IIf(EBOp(OEq, ERef(RefId(Id("""testResult"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(82038), IReturn(ERef(RefId(Id("""__x11__""")))).setId(82039))).setId(82119), ISeq(List()).setId(82120)).setId(82041))).setId(82122), ISeq(List()).setId(82123)).setId(82044), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(82046))).setId(82126)).setId(82049), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(82051), IReturn(ERef(RefId(Id("""__x12__""")))).setId(82052))).setId(82130))
  val instToStepMap: Map[Int, Int] = HashMap(81970 -> 0, 81994 -> 4, 82011 -> 19, 81982 -> 2, 82050 -> 19, 81990 -> 3, 82047 -> 19, 82012 -> 19, 82017 -> 19, 82026 -> 17, 81997 -> 6, 82002 -> 6, 82042 -> 17, 81995 -> 5, 81998 -> 6, 81981 -> 2, 82030 -> 17, 82010 -> 19, 82045 -> 19, 82023 -> 17, 82009 -> 19, 81991 -> 5, 82038 -> 17, 82051 -> 20, 81974 -> 1, 82019 -> 17, 82031 -> 17, 81996 -> 5, 82001 -> 6, 82046 -> 19, 81999 -> 6, 82043 -> 17, 82037 -> 17, 82018 -> 19, 81973 -> 1, 82005 -> 19, 82000 -> 6, 81983 -> 2, 82044 -> 19, 82049 -> 19, 81972 -> 0, 82004 -> 7, 82040 -> 17, 81976 -> 2, 82053 -> 20, 81989 -> 3, 82036 -> 17, 82048 -> 19, 82041 -> 17, 81984 -> 3, 81971 -> 0, 82016 -> 19, 81975 -> 1, 82003 -> 7, 81988 -> 3, 82039 -> 17, 82024 -> 17, 81993 -> 4, 82025 -> 17, 82052 -> 20, 82035 -> 17, 81992 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(81970, 81972, 81971), 5 -> HashSet(81995, 81991, 81996), 20 -> HashSet(82051, 82053, 82052), 1 -> HashSet(81974, 81973, 81975), 6 -> HashSet(82002, 81998, 82001, 81999, 82000, 81997), 2 -> HashSet(81981, 81982, 81983, 81976), 17 -> HashSet(82042, 82030, 82023, 82038, 82019, 82031, 82043, 82037, 82040, 82036, 82026, 82041, 82025, 82035, 82039, 82024), 12 -> HashSet(82018, 82012, 82017, 82016), 7 -> HashSet(82004, 82003), 3 -> HashSet(81990, 81989, 81984, 81988), 18 -> HashSet(82045, 82044), 16 -> HashSet(82030, 82031, 82037, 82036, 82026, 82035), 11 -> HashSet(82010, 82009, 82011, 82005), 19 -> HashSet(82009, 82011, 82046, 82018, 82050, 82005, 82047, 82012, 82017, 82044, 82049, 82048, 82016, 82010, 82045), 4 -> HashSet(81994, 81993, 81992), 15 -> HashSet(82023, 82019, 82024, 82025))
  /* Beautified form:
  "GLOBAL.Array.prototype.some" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable callbackfn)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    let k = 0i
    while (< k len) {
      app __x6__ = (ToString k)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let Pk = __x6__
      app __x7__ = (HasProperty O Pk)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let kPresent = __x7__
      if (= kPresent true) {
        app __x8__ = (Get O Pk)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let kValue = __x8__
        app __x9__ = (Call callbackfn T (new [kValue, k, O]))
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (ToBoolean __x9__)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let testResult = __x10__
        if (= testResult true) {
          app __x11__ = (WrapCompletion true)
          return __x11__
        } else {}
      } else {}
      k = (+ k 1i)
    }
    app __x12__ = (WrapCompletion false)
    return __x12__
  }
  */
}
