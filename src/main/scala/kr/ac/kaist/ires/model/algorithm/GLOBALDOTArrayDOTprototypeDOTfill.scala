package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTfill {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.fill""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(76996), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(76997), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(76999), ILet(Id("""start"""), ERef(RefId(Id("""__x1__""")))).setId(77000), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(77002), ILet(Id("""end"""), ERef(RefId(Id("""__x2__""")))).setId(77003), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(77005), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(77006), IReturn(ERef(RefId(Id("""__x3__""")))).setId(77007)).setId(77008), ISeq(List()).setId(77087)).setId(77010), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(77011), IApp(Id("""__x4__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(77013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(77014), IReturn(ERef(RefId(Id("""__x4__""")))).setId(77015)).setId(77016), ISeq(List()).setId(77094)).setId(77017), ILet(Id("""len"""), ERef(RefId(Id("""__x4__""")))).setId(77018), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(77020), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(77021), IReturn(ERef(RefId(Id("""__x5__""")))).setId(77022)).setId(77023), ISeq(List()).setId(77101)).setId(77024), ILet(Id("""relativeStart"""), ERef(RefId(Id("""__x5__""")))).setId(77025), IIf(EBOp(OLt, ERef(RefId(Id("""relativeStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeStart""")))), EINum(0L))).setId(77027), ILet(Id("""k"""), ERef(RefId(Id("""__x6__""")))).setId(77028))).setId(77106), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeStart"""))), ERef(RefId(Id("""len"""))))).setId(77030), ILet(Id("""k"""), ERef(RefId(Id("""__x7__""")))).setId(77031))).setId(77109)).setId(77033), IIf(EBOp(OEq, ERef(RefId(Id("""end"""))), EUndef), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""len""")))).setId(77035), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""end"""))))).setId(77037), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(77038), IReturn(ERef(RefId(Id("""__x8__""")))).setId(77039)).setId(77040), ISeq(List()).setId(77116)).setId(77041), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""__x8__""")))).setId(77042))).setId(77119)).setId(77044), IIf(EBOp(OLt, ERef(RefId(Id("""relativeEnd"""))), EINum(0L)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeEnd""")))), EINum(0L))).setId(77046), ILet(Id("""final"""), ERef(RefId(Id("""__x9__""")))).setId(77047))).setId(77123), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeEnd"""))), ERef(RefId(Id("""len"""))))).setId(77049), ILet(Id("""final"""), ERef(RefId(Id("""__x10__""")))).setId(77050))).setId(77126)).setId(77052), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""final""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(77054), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(77055), IReturn(ERef(RefId(Id("""__x11__""")))).setId(77056)).setId(77057), ISeq(List()).setId(77132)).setId(77058), ILet(Id("""Pk"""), ERef(RefId(Id("""__x11__""")))).setId(77059), IApp(Id("""__x12__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""value"""))), EBool(true))).setId(77061), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(77062), IReturn(ERef(RefId(Id("""__x12__""")))).setId(77063)).setId(77064), ISeq(List()).setId(77139)).setId(77065), IExpr(ERef(RefId(Id("""__x12__""")))).setId(77066), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(77068))).setId(77143)).setId(77071), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(77073), IReturn(ERef(RefId(Id("""__x13__""")))).setId(77074))).setId(77147))
  val instToStepMap: Map[Int, Int] = HashMap(77017 -> 4, 77053 -> 8, 77067 -> 14, 77027 -> 6, 77000 -> 1, 77028 -> 6, 77043 -> 7, 77025 -> 5, 77051 -> 8, 76997 -> 0, 77029 -> 6, 77068 -> 14, 77049 -> 8, 77074 -> 15, 76999 -> 1, 77004 -> 2, 77013 -> 4, 77059 -> 14, 77036 -> 7, 76998 -> 0, 77042 -> 7, 77065 -> 14, 77010 -> 3, 77045 -> 7, 77048 -> 8, 77030 -> 6, 77031 -> 6, 77060 -> 14, 77075 -> 15, 77052 -> 8, 77024 -> 5, 77003 -> 2, 77035 -> 7, 77032 -> 6, 77072 -> 14, 77046 -> 8, 77020 -> 5, 77034 -> 6, 77011 -> 3, 77002 -> 2, 76996 -> 0, 77061 -> 14, 77071 -> 14, 77019 -> 4, 77050 -> 8, 77018 -> 4, 77012 -> 3, 77044 -> 7, 77005 -> 3, 77033 -> 6, 77070 -> 14, 77047 -> 8, 77073 -> 15, 77054 -> 14, 77001 -> 1, 77037 -> 7, 77058 -> 14, 77026 -> 5, 77041 -> 7, 77066 -> 14, 77069 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(76998, 76996, 76997), 5 -> HashSet(77024, 77020, 77025, 77026), 14 -> HashSet(77068, 77059, 77065, 77067, 77060, 77072, 77061, 77071, 77070, 77054, 77058, 77066, 77069), 1 -> HashSet(76999, 77000, 77001), 6 -> HashSet(77027, 77032, 77028, 77034, 77033, 77029, 77030, 77031), 13 -> HashSet(77065, 77067, 77061, 77066), 2 -> HashSet(77004, 77003, 77002), 12 -> HashSet(77059, 77060, 77054, 77058), 7 -> HashSet(77036, 77042, 77045, 77035, 77043, 77044, 77037, 77041), 3 -> HashSet(77010, 77011, 77012, 77005), 8 -> HashSet(77049, 77053, 77048, 77052, 77046, 77051, 77050, 77047), 4 -> HashSet(77017, 77013, 77019, 77018), 15 -> HashSet(77074, 77075, 77073))
  /* Beautified form:
  "GLOBAL.Array.prototype.fill" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let start = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let end = __x2__
    app __x3__ = (ToObject this)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    app __x4__ = (LengthOfArrayLike O)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    app __x5__ = (ToInteger start)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let relativeStart = __x5__
    if (< relativeStart 0i) {
      app __x6__ = (max (+ len relativeStart) 0i)
      let k = __x6__
    } else {
      app __x7__ = (min relativeStart len)
      let k = __x7__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x8__ = (ToInteger end)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let relativeEnd = __x8__
    }
    if (< relativeEnd 0i) {
      app __x9__ = (max (+ len relativeEnd) 0i)
      let final = __x9__
    } else {
      app __x10__ = (min relativeEnd len)
      let final = __x10__
    }
    while (< k final) {
      app __x11__ = (ToString k)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let Pk = __x11__
      app __x12__ = (Set O Pk value true)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      __x12__
      k = (+ k 1i)
    }
    app __x13__ = (WrapCompletion O)
    return __x13__
  }
  */
}
