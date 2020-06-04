package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTlastIndexOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.lastIndexOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(79448), ILet(Id("""searchElement"""), ERef(RefId(Id("""__x0__""")))).setId(79449), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(79451), ILet(Id("""fromIndex"""), ERef(RefId(Id("""__x1__""")))).setId(79452), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(79454), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(79455), IReturn(ERef(RefId(Id("""__x2__""")))).setId(79456)).setId(79457), ISeq(List()).setId(79458)).setId(79459), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(79460), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(79462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(79463), IReturn(ERef(RefId(Id("""__x3__""")))).setId(79464)).setId(79465), ISeq(List()).setId(79458)).setId(79466), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(79467), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(79469), IReturn(ERef(RefId(Id("""__x4__""")))).setId(79470))).setId(79471), ISeq(List()).setId(79458)).setId(79472), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fromIndex"""))))).setId(79474), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(79475), IReturn(ERef(RefId(Id("""__x5__""")))).setId(79476)).setId(79477), ISeq(List()).setId(79458)).setId(79478), ILet(Id("""n"""), ERef(RefId(Id("""__x5__""")))).setId(79479))).setId(79480), ILet(Id("""n"""), EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L))).setId(79481)).setId(79483), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), ENum(-0.0)), ILet(Id("""k"""), EINum(0L)).setId(79485), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""n"""))), EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L)))).setId(79487), ILet(Id("""k"""), ERef(RefId(Id("""__x6__""")))).setId(79488))).setId(79489)).setId(79490), ILet(Id("""k"""), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""n"""))))).setId(79493)).setId(79496), IWhile(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""k"""))), EINum(0L))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79498), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(79499), IReturn(ERef(RefId(Id("""__x7__""")))).setId(79500)).setId(79501), ISeq(List()).setId(79458)).setId(79502), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x7__"""))))).setId(79503), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(79504), IReturn(ERef(RefId(Id("""__x8__""")))).setId(79505)).setId(79506), ISeq(List()).setId(79458)).setId(79507), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x8__""")))).setId(79508), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79510), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(79511), IReturn(ERef(RefId(Id("""__x9__""")))).setId(79512)).setId(79513), ISeq(List()).setId(79458)).setId(79514), IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x9__"""))))).setId(79515), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(79516), IReturn(ERef(RefId(Id("""__x10__""")))).setId(79517)).setId(79518), ISeq(List()).setId(79458)).setId(79519), ILet(Id("""elementK"""), ERef(RefId(Id("""__x10__""")))).setId(79520), IApp(Id("""__x11__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""searchElement"""))), ERef(RefId(Id("""elementK"""))))).setId(79523), ILet(Id("""same"""), ERef(RefId(Id("""__x11__""")))).setId(79524), IIf(EBOp(OEq, ERef(RefId(Id("""same"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""k"""))))).setId(79526), IReturn(ERef(RefId(Id("""__x12__""")))).setId(79527))).setId(79528), ISeq(List()).setId(79458)).setId(79529))).setId(79531), ISeq(List()).setId(79458)).setId(79532), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L))).setId(79534))).setId(79536)).setId(79537), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, EINum(1L)))).setId(79539), IReturn(ERef(RefId(Id("""__x13__""")))).setId(79540))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.lastIndexOf" (this, argumentsList, NewTarget) => {
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
    if (! (= argumentsList[1i] absent)) {
      app __x5__ = (ToInteger fromIndex)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let n = __x5__
    } else let n = (- len 1i)
    if (! (< n 0i)) if (= n -0.0) let k = 0i else {
      app __x6__ = (min n (- len 1i))
      let k = __x6__
    } else let k = (+ len n)
    while (! (< k 0i)) {
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
      k = (- k 1i)
    }
    app __x13__ = (WrapCompletion (- 1i))
    return __x13__
  }
  */
}
