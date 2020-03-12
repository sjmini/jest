package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ArrayExoticObject.DefineOwnProperty""", List(Id("""A"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""P"""))), EStr("""length""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArraySetLength"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Desc"""))))).setId(53975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(53976), IReturn(ERef(RefId(Id("""__x0__""")))).setId(53977)).setId(53978), ISeq(List()).setId(54039)).setId(53979), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(53980), IReturn(ERef(RefId(Id("""__x1__""")))).setId(53981))).setId(54043), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsArrayIndex"""))), List(ERef(RefId(Id("""P"""))))).setId(53984), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""))).setId(53985), ILet(Id("""oldLenDesc"""), ERef(RefId(Id("""__x3__""")))).setId(53986), ILet(Id("""oldLen"""), ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")))).setId(53988), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""P"""))))).setId(53990), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(53991), IReturn(ERef(RefId(Id("""__x4__""")))).setId(53992)).setId(53993), ISeq(List()).setId(54052)).setId(53994), ILet(Id("""index"""), ERef(RefId(Id("""__x4__""")))).setId(53995), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""oldLen"""))))), EBOp(OEq, ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(53997), IReturn(ERef(RefId(Id("""__x5__""")))).setId(53998))).setId(54057), ISeq(List()).setId(54058)).setId(54000), IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(54002), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(54003), IReturn(ERef(RefId(Id("""__x6__""")))).setId(54004)).setId(54005), ISeq(List()).setId(54064)).setId(54006), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x6__""")))).setId(54007), IIf(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54009), IReturn(ERef(RefId(Id("""__x7__""")))).setId(54010))).setId(54069), ISeq(List()).setId(54070)).setId(54012), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""oldLen"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(54014), IApp(Id("""__x8__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""oldLenDesc"""))))).setId(54016), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x8__""")))).setId(54017))).setId(54075), ISeq(List()).setId(54076)).setId(54020), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(54022), IReturn(ERef(RefId(Id("""__x9__""")))).setId(54023))).setId(54080), ISeq(List()).setId(54081)).setId(54026))).setId(54083)).setId(54028), IApp(Id("""__x10__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(54030), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(54031), IReturn(ERef(RefId(Id("""__x11__""")))).setId(54032))).setId(54088))
  val instToStepMap: Map[Int, Int] = HashMap(53986 -> 21, 54027 -> 22, 54001 -> 21, 54015 -> 19, 54028 -> 22, 53997 -> 10, 54021 -> 21, 54029 -> 22, 53982 -> 3, 53974 -> 21, 53980 -> 3, 53983 -> 3, 54031 -> 23, 53979 -> 3, 53995 -> 21, 53998 -> 10, 54019 -> 19, 54022 -> 21, 53990 -> 21, 54012 -> 21, 54013 -> 21, 54032 -> 23, 54008 -> 21, 53989 -> 21, 53984 -> 22, 53999 -> 10, 53985 -> 21, 54016 -> 19, 54018 -> 19, 53996 -> 21, 54033 -> 23, 54009 -> 13, 53981 -> 3, 54007 -> 21, 54017 -> 19, 53975 -> 3, 54000 -> 21, 54024 -> 21, 53988 -> 21, 54006 -> 21, 54026 -> 22, 54010 -> 13, 54030 -> 23, 54025 -> 21, 54014 -> 19, 53994 -> 21, 53987 -> 21, 54023 -> 21, 54011 -> 13, 54002 -> 21, 54020 -> 21)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(53974), 10 -> HashSet(53998, 53999, 53997), 14 -> HashSet(54012, 54013), 20 -> HashSet(54021, 54020), 6 -> HashSet(53986, 53985, 53987), 21 -> HashSet(53986, 54001, 53995, 53989, 53985, 53996, 54007, 54021, 54006, 54025, 53974, 54022, 53990, 54012, 54013, 54008, 54000, 54024, 53988, 53994, 53987, 54023, 54002, 54020), 9 -> HashSet(53995, 53990, 53996, 53994), 13 -> HashSet(54009, 54010, 54011), 17 -> HashSet(54015, 54014), 22 -> HashSet(54027, 53984, 54028, 54029, 54026), 12 -> HashSet(54008, 54007, 54006, 54002), 7 -> HashSet(53974), 3 -> HashSet(53979, 53981, 53975, 53982, 53983, 53980), 18 -> HashSet(54017, 54016, 54018), 11 -> HashSet(54001, 54000), 23 -> HashSet(54031, 54032, 54033, 54030), 8 -> HashSet(53989, 53988), 19 -> HashSet(54015, 54019, 54017, 54014, 53974, 54016, 54018))
  /* Beautified form:
  "ArrayExoticObject.DefineOwnProperty" (A, P, Desc) => {
    if (= P "length") {
      app __x0__ = (ArraySetLength A Desc)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {
      app __x2__ = (IsArrayIndex P)
      if __x2__ {
        app __x3__ = (OrdinaryGetOwnProperty A "length")
        let oldLenDesc = __x3__
        let oldLen = oldLenDesc["Value"]
        app __x4__ = (ToUint32 P)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let index = __x4__
        if (&& (! (< index oldLen)) (= oldLenDesc["Writable"] false)) {
          app __x5__ = (WrapCompletion false)
          return __x5__
        } else {}
        app __x6__ = (OrdinaryDefineOwnProperty A P Desc)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let succeeded = __x6__
        if (= succeeded false) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        if (! (< index oldLen)) {
          oldLenDesc["Value"] = (+ index 1i)
          app __x8__ = (OrdinaryDefineOwnProperty A "length" oldLenDesc)
          let succeeded = __x8__
        } else {}
        app __x9__ = (WrapCompletion true)
        return __x9__
      } else {}
    }
    app __x10__ = (OrdinaryDefineOwnProperty A P Desc)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
