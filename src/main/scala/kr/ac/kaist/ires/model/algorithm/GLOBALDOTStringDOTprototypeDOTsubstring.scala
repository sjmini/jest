package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTsubstring {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.substring""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(74014), ILet(Id("""start"""), ERef(RefId(Id("""__x0__""")))).setId(74015), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(74017), ILet(Id("""end"""), ERef(RefId(Id("""__x1__""")))).setId(74018), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(74020), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(74021), IReturn(ERef(RefId(Id("""__x2__""")))).setId(74022)).setId(74023), ISeq(List()).setId(74081)).setId(74025), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(74026), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(74028), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(74029), IReturn(ERef(RefId(Id("""__x3__""")))).setId(74030)).setId(74031), ISeq(List()).setId(74088)).setId(74032), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(74033), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(74035), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(74037), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(74038), IReturn(ERef(RefId(Id("""__x4__""")))).setId(74039)).setId(74040), ISeq(List()).setId(74096)).setId(74041), ILet(Id("""intStart"""), ERef(RefId(Id("""__x4__""")))).setId(74042), IIf(EBOp(OEq, ERef(RefId(Id("""end"""))), EUndef), ILet(Id("""intEnd"""), ERef(RefId(Id("""len""")))).setId(74044), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""end"""))))).setId(74046), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(74047), IReturn(ERef(RefId(Id("""__x5__""")))).setId(74048)).setId(74049), ISeq(List()).setId(74104)).setId(74050), ILet(Id("""intEnd"""), ERef(RefId(Id("""__x5__""")))).setId(74051))).setId(74107)).setId(74053), IApp(Id("""__x6__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""intStart"""))), EINum(0L))).setId(74055), IApp(Id("""__x7__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""len"""))))).setId(74056), ILet(Id("""finalStart"""), ERef(RefId(Id("""__x7__""")))).setId(74057), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""intEnd"""))), EINum(0L))).setId(74059), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""len"""))))).setId(74060), ILet(Id("""finalEnd"""), ERef(RefId(Id("""__x9__""")))).setId(74061), IApp(Id("""__x10__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""finalStart"""))), ERef(RefId(Id("""finalEnd"""))))).setId(74063), ILet(Id("""from"""), ERef(RefId(Id("""__x10__""")))).setId(74064), IApp(Id("""__x11__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""finalStart"""))), ERef(RefId(Id("""finalEnd"""))))).setId(74066), ILet(Id("""to"""), ERef(RefId(Id("""__x11__""")))).setId(74067), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(74069), IReturn(ERef(RefId(Id("""__x12__""")))).setId(74070))).setId(74121))
  val instToStepMap: Map[Int, Int] = HashMap(74070 -> 11, 74059 -> 8, 74019 -> 1, 74065 -> 9, 74014 -> 0, 74057 -> 7, 74045 -> 6, 74063 -> 9, 74018 -> 1, 74053 -> 6, 74016 -> 0, 74067 -> 10, 74050 -> 6, 74035 -> 4, 74071 -> 11, 74027 -> 2, 74044 -> 6, 74054 -> 6, 74015 -> 0, 74068 -> 10, 74051 -> 6, 74036 -> 4, 74026 -> 2, 74055 -> 7, 74062 -> 8, 74043 -> 5, 74058 -> 7, 74046 -> 6, 74020 -> 2, 74033 -> 3, 74052 -> 6, 74061 -> 8, 74056 -> 7, 74025 -> 2, 74042 -> 5, 74034 -> 3, 74032 -> 3, 74064 -> 9, 74037 -> 5, 74066 -> 10, 74017 -> 1, 74069 -> 11, 74028 -> 3, 74041 -> 5, 74060 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(74016, 74015, 74014), 5 -> HashSet(74043, 74042, 74037, 74041), 10 -> HashSet(74067, 74068, 74066), 1 -> HashSet(74018, 74019, 74017), 6 -> HashSet(74053, 74050, 74044, 74054, 74051, 74045, 74046, 74052), 9 -> HashSet(74063, 74065, 74064), 2 -> HashSet(74027, 74026, 74020, 74025), 7 -> HashSet(74055, 74058, 74056, 74057), 3 -> HashSet(74033, 74028, 74034, 74032), 11 -> HashSet(74070, 74071, 74069), 8 -> HashSet(74059, 74062, 74061, 74060), 4 -> HashSet(74035, 74036))
  /* Beautified form:
  "GLOBAL.String.prototype.substring" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let len = S["length"]
    app __x4__ = (ToInteger start)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let intStart = __x4__
    if (= end undefined) let intEnd = len else {
      app __x5__ = (ToInteger end)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let intEnd = __x5__
    }
    app __x6__ = (max intStart 0i)
    app __x7__ = (min __x6__ len)
    let finalStart = __x7__
    app __x8__ = (max intEnd 0i)
    app __x9__ = (min __x8__ len)
    let finalEnd = __x9__
    app __x10__ = (min finalStart finalEnd)
    let from = __x10__
    app __x11__ = (max finalStart finalEnd)
    let to = __x11__
    app __x12__ = (WrapCompletion !!! "StringOp")
    return __x12__
  }
  */
}
