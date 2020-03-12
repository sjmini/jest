package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTindexOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.indexOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78949), ILet(Id("""searchElement"""), ERef(RefId(Id("""__x0__""")))).setId(78950), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78952), ILet(Id("""fromIndex"""), ERef(RefId(Id("""__x1__""")))).setId(78953), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(78955), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(78956), IReturn(ERef(RefId(Id("""__x2__""")))).setId(78957)).setId(78958), ISeq(List()).setId(79056)).setId(78960), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(78961), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(78963), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(78964), IReturn(ERef(RefId(Id("""__x3__""")))).setId(78965)).setId(78966), ISeq(List()).setId(79063)).setId(78967), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(78968), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(78970), IReturn(ERef(RefId(Id("""__x4__""")))).setId(78971))).setId(79068), ISeq(List()).setId(79069)).setId(78973), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fromIndex"""))))).setId(78975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(78976), IReturn(ERef(RefId(Id("""__x5__""")))).setId(78977)).setId(78978), ISeq(List()).setId(79075)).setId(78979), ILet(Id("""n"""), ERef(RefId(Id("""__x5__""")))).setId(78980), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(78982), IReturn(ERef(RefId(Id("""__x6__""")))).setId(78983))).setId(79080), ISeq(List()).setId(79081)).setId(78985), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), ENum(-0.0)), ILet(Id("""k"""), EINum(0L)).setId(78987), ILet(Id("""k"""), ERef(RefId(Id("""n""")))).setId(78989)).setId(78991), ISeq(List(ILet(Id("""k"""), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""n"""))))).setId(78994), IIf(EBOp(OLt, ERef(RefId(Id("""k"""))), EINum(0L)), IAssign(RefId(Id("""k""")), EINum(0L)).setId(78996), ISeq(List()).setId(79088)).setId(78998))).setId(79090)).setId(79001), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79003), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(79004), IReturn(ERef(RefId(Id("""__x7__""")))).setId(79005)).setId(79006), ISeq(List()).setId(79096)).setId(79007), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x7__"""))))).setId(79008), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(79009), IReturn(ERef(RefId(Id("""__x8__""")))).setId(79010)).setId(79011), ISeq(List()).setId(79102)).setId(79012), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x8__""")))).setId(79013), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79015), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(79016), IReturn(ERef(RefId(Id("""__x9__""")))).setId(79017)).setId(79018), ISeq(List()).setId(79109)).setId(79019), IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x9__"""))))).setId(79020), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(79021), IReturn(ERef(RefId(Id("""__x10__""")))).setId(79022)).setId(79023), ISeq(List()).setId(79115)).setId(79024), ILet(Id("""elementK"""), ERef(RefId(Id("""__x10__""")))).setId(79025), IApp(Id("""__x11__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""searchElement"""))), ERef(RefId(Id("""elementK"""))))).setId(79028), ILet(Id("""same"""), ERef(RefId(Id("""__x11__""")))).setId(79029), IIf(EBOp(OEq, ERef(RefId(Id("""same"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""k"""))))).setId(79031), IReturn(ERef(RefId(Id("""__x12__""")))).setId(79032))).setId(79122), ISeq(List()).setId(79123)).setId(79034))).setId(79125), ISeq(List()).setId(79126)).setId(79037), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(79039))).setId(79129)).setId(79042), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(79044), IReturn(ERef(RefId(Id("""__x13__""")))).setId(79045))).setId(79133))
  val instToStepMap: Map[Int, Int] = HashMap(78985 -> 9, 78997 -> 16, 79007 -> 27, 78961 -> 2, 78973 -> 5, 79015 -> 25, 79030 -> 25, 78968 -> 3, 79020 -> 25, 78949 -> 0, 78989 -> 12, 79025 -> 25, 79042 -> 27, 79043 -> 27, 79024 -> 25, 79037 -> 27, 78974 -> 5, 78982 -> 8, 78986 -> 9, 78971 -> 4, 78996 -> 16, 79001 -> 16, 78990 -> 12, 78952 -> 1, 78967 -> 3, 79026 -> 25, 79019 -> 25, 79036 -> 25, 79008 -> 27, 78953 -> 1, 79044 -> 28, 78963 -> 3, 79040 -> 27, 78975 -> 6, 78981 -> 6, 79012 -> 27, 79034 -> 25, 79000 -> 16, 79003 -> 27, 79002 -> 16, 79032 -> 25, 79013 -> 27, 78995 -> 16, 79035 -> 25, 78955 -> 2, 78983 -> 8, 78972 -> 4, 78962 -> 2, 78980 -> 6, 79045 -> 28, 79039 -> 27, 78951 -> 0, 78969 -> 3, 78994 -> 16, 78991 -> 12, 78954 -> 1, 79028 -> 25, 78999 -> 16, 79031 -> 25, 78987 -> 12, 78959 -> 7, 79033 -> 25, 78984 -> 8, 79029 -> 25, 79046 -> 28, 79014 -> 27, 78979 -> 6, 78950 -> 0, 78992 -> 12, 78993 -> 12, 79038 -> 27, 79041 -> 27, 78970 -> 4, 78988 -> 12, 78998 -> 16, 78960 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(78949, 78951, 78950), 5 -> HashSet(78974, 78973), 20 -> HashSet(79008, 79012, 79007, 79014, 79003, 79013), 1 -> HashSet(78952, 78953, 78954), 6 -> HashSet(78980, 78979, 78975, 78981), 28 -> HashSet(79044, 79045, 79046), 9 -> HashSet(78985, 78986), 2 -> HashSet(78961, 78960, 78955, 78962), 27 -> HashSet(79042, 79008, 79040, 79012, 79007, 79039, 79014, 79038, 79041, 79043, 79037, 79003, 79013), 12 -> HashSet(78989, 78990, 78991, 78987, 78992, 78993, 78988), 7 -> HashSet(78959), 3 -> HashSet(78968, 78967, 78963, 78969), 16 -> HashSet(78997, 79000, 78994, 78999, 78998, 78996, 79001, 79002, 78995), 8 -> HashSet(78982, 78983, 78984), 4 -> HashSet(78971, 78972, 78970), 15 -> HashSet(78995, 78994), 24 -> HashSet(79030, 79028, 79029), 25 -> HashSet(79020, 79025, 79024, 79034, 79032, 79035, 79033, 79029, 79015, 79030, 79026, 79019, 79036, 79028, 79031), 26 -> HashSet(79037, 79038), 23 -> HashSet(79015, 79020, 79025, 79024, 79026, 79019))
  /* Beautified form:
  "GLOBAL.Array.prototype.indexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchElement = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fromIndex = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    if (= len 0i) {
      app __x4__ = (WrapCompletion (- 1i))
      return __x4__
    } else {}
    app __x5__ = (ToInteger fromIndex)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let n = __x5__
    if (! (< n len)) {
      app __x6__ = (WrapCompletion (- 1i))
      return __x6__
    } else {}
    if (! (< n 0i)) if (= n -0.0) let k = 0i else let k = n else {
      let k = (+ len n)
      if (< k 0i) k = 0i else {}
    }
    while (< k len) {
      app __x7__ = (ToString k)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (HasProperty O __x7__)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let kPresent = __x8__
      if (= kPresent true) {
        app __x9__ = (ToString k)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (Get O __x9__)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let elementK = __x10__
        app __x11__ = (StrictEqualityComparison searchElement elementK)
        let same = __x11__
        if (= same true) {
          app __x12__ = (WrapCompletion k)
          return __x12__
        } else {}
      } else {}
      k = (+ k 1i)
    }
    app __x13__ = (WrapCompletion (- 1i))
    return __x13__
  }
  */
}
