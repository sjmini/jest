package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTcopyWithin {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Array.prototype.copyWithin""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(76325), ILet(Id("""target"""), ERef(RefId(Id("""__x0__""")))).setId(76326), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(76328), ILet(Id("""start"""), ERef(RefId(Id("""__x1__""")))).setId(76329), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(76331), ILet(Id("""end"""), ERef(RefId(Id("""__x2__""")))).setId(76332), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(76334), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(76335), IReturn(ERef(RefId(Id("""__x3__""")))).setId(76336)).setId(76337), ISeq(List()).setId(76338)).setId(76339), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(76340), IApp(Id("""__x4__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(76342), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(76343), IReturn(ERef(RefId(Id("""__x4__""")))).setId(76344)).setId(76345), ISeq(List()).setId(76338)).setId(76346), ILet(Id("""len"""), ERef(RefId(Id("""__x4__""")))).setId(76347), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""target"""))))).setId(76349), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(76350), IReturn(ERef(RefId(Id("""__x5__""")))).setId(76351)).setId(76352), ISeq(List()).setId(76338)).setId(76353), ILet(Id("""relativeTarget"""), ERef(RefId(Id("""__x5__""")))).setId(76354), IIf(EBOp(OLt, ERef(RefId(Id("""relativeTarget"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeTarget""")))), EINum(0L))).setId(76356), ILet(Id("""to"""), ERef(RefId(Id("""__x6__""")))).setId(76357))).setId(76358), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeTarget"""))), ERef(RefId(Id("""len"""))))).setId(76359), ILet(Id("""to"""), ERef(RefId(Id("""__x7__""")))).setId(76360))).setId(76361)).setId(76362), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(76364), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(76365), IReturn(ERef(RefId(Id("""__x8__""")))).setId(76366)).setId(76367), ISeq(List()).setId(76338)).setId(76368), ILet(Id("""relativeStart"""), ERef(RefId(Id("""__x8__""")))).setId(76369), IIf(EBOp(OLt, ERef(RefId(Id("""relativeStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeStart""")))), EINum(0L))).setId(76371), ILet(Id("""from"""), ERef(RefId(Id("""__x9__""")))).setId(76372))).setId(76373), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeStart"""))), ERef(RefId(Id("""len"""))))).setId(76374), ILet(Id("""from"""), ERef(RefId(Id("""__x10__""")))).setId(76375))).setId(76376)).setId(76377), IIf(EBOp(OEq, ERef(RefId(Id("""end"""))), EUndef), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""len""")))).setId(76379), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""end"""))))).setId(76381), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(76382), IReturn(ERef(RefId(Id("""__x11__""")))).setId(76383)).setId(76384), ISeq(List()).setId(76338)).setId(76385), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""__x11__""")))).setId(76386))).setId(76387)).setId(76388), IIf(EBOp(OLt, ERef(RefId(Id("""relativeEnd"""))), EINum(0L)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeEnd""")))), EINum(0L))).setId(76390), ILet(Id("""final"""), ERef(RefId(Id("""__x12__""")))).setId(76391))).setId(76392), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeEnd"""))), ERef(RefId(Id("""len"""))))).setId(76393), ILet(Id("""final"""), ERef(RefId(Id("""__x13__""")))).setId(76394))).setId(76395)).setId(76396), IApp(Id("""__x14__"""), ERef(RefId(Id("""min"""))), List(EBOp(OSub, ERef(RefId(Id("""final"""))), ERef(RefId(Id("""from""")))), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""to""")))))).setId(76398), ILet(Id("""count"""), ERef(RefId(Id("""__x14__""")))).setId(76399), IIf(EBOp(OAnd, EBOp(OLt, ERef(RefId(Id("""from"""))), ERef(RefId(Id("""to""")))), EBOp(OLt, ERef(RefId(Id("""to"""))), EBOp(OPlus, ERef(RefId(Id("""from"""))), ERef(RefId(Id("""count""")))))), ISeq(List(ILet(Id("""direction"""), EUOp(ONeg, EINum(1L))).setId(76401), IAssign(RefId(Id("""from""")), EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""from"""))), ERef(RefId(Id("""count""")))), EINum(1L))).setId(76403), IAssign(RefId(Id("""to""")), EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""to"""))), ERef(RefId(Id("""count""")))), EINum(1L))).setId(76405))).setId(76407), ILet(Id("""direction"""), EINum(1L)).setId(76408)).setId(76411), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""count""")))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""from"""))))).setId(76413), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(76414), IReturn(ERef(RefId(Id("""__x15__""")))).setId(76415)).setId(76416), ISeq(List()).setId(76338)).setId(76417), ILet(Id("""fromKey"""), ERef(RefId(Id("""__x15__""")))).setId(76418), IApp(Id("""__x16__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""to"""))))).setId(76420), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(76421), IReturn(ERef(RefId(Id("""__x16__""")))).setId(76422)).setId(76423), ISeq(List()).setId(76338)).setId(76424), ILet(Id("""toKey"""), ERef(RefId(Id("""__x16__""")))).setId(76425), IApp(Id("""__x17__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""fromKey"""))))).setId(76427), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))).setId(76428), IReturn(ERef(RefId(Id("""__x17__""")))).setId(76429)).setId(76430), ISeq(List()).setId(76338)).setId(76431), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x17__""")))).setId(76432), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""fromKey"""))))).setId(76434), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(76435), IReturn(ERef(RefId(Id("""__x18__""")))).setId(76436)).setId(76437), ISeq(List()).setId(76338)).setId(76438), ILet(Id("""fromVal"""), ERef(RefId(Id("""__x18__""")))).setId(76439), IApp(Id("""__x19__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""toKey"""))), ERef(RefId(Id("""fromVal"""))), EBool(true))).setId(76441), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))).setId(76442), IReturn(ERef(RefId(Id("""__x19__""")))).setId(76443)).setId(76444), ISeq(List()).setId(76338)).setId(76445), IExpr(ERef(RefId(Id("""__x19__""")))).setId(76446))).setId(76448), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""toKey"""))))).setId(76449), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(76450), IReturn(ERef(RefId(Id("""__x20__""")))).setId(76451)).setId(76452), ISeq(List()).setId(76338)).setId(76453), IExpr(ERef(RefId(Id("""__x20__""")))).setId(76454))).setId(76456)).setId(76457), IAssign(RefId(Id("""from""")), EBOp(OPlus, ERef(RefId(Id("""from"""))), ERef(RefId(Id("""direction"""))))).setId(76459), IAssign(RefId(Id("""to""")), EBOp(OPlus, ERef(RefId(Id("""to"""))), ERef(RefId(Id("""direction"""))))).setId(76461), IAssign(RefId(Id("""count""")), EBOp(OSub, ERef(RefId(Id("""count"""))), EINum(1L))).setId(76463))).setId(76465)).setId(76466), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(76468), IReturn(ERef(RefId(Id("""__x21__""")))).setId(76469))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.copyWithin" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
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
    app __x5__ = (ToInteger target)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let relativeTarget = __x5__
    if (< relativeTarget 0i) {
      app __x6__ = (max (+ len relativeTarget) 0i)
      let to = __x6__
    } else {
      app __x7__ = (min relativeTarget len)
      let to = __x7__
    }
    app __x8__ = (ToInteger start)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let relativeStart = __x8__
    if (< relativeStart 0i) {
      app __x9__ = (max (+ len relativeStart) 0i)
      let from = __x9__
    } else {
      app __x10__ = (min relativeStart len)
      let from = __x10__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x11__ = (ToInteger end)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let relativeEnd = __x11__
    }
    if (< relativeEnd 0i) {
      app __x12__ = (max (+ len relativeEnd) 0i)
      let final = __x12__
    } else {
      app __x13__ = (min relativeEnd len)
      let final = __x13__
    }
    app __x14__ = (min (- final from) (- len to))
    let count = __x14__
    if (&& (< from to) (< to (+ from count))) {
      let direction = (- 1i)
      from = (- (+ from count) 1i)
      to = (- (+ to count) 1i)
    } else let direction = 1i
    while (< 0i count) {
      app __x15__ = (ToString from)
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      let fromKey = __x15__
      app __x16__ = (ToString to)
      if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      let toKey = __x16__
      app __x17__ = (HasProperty O fromKey)
      if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      let fromPresent = __x17__
      if (= fromPresent true) {
        app __x18__ = (Get O fromKey)
        if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        let fromVal = __x18__
        app __x19__ = (Set O toKey fromVal true)
        if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
      } else {
        app __x20__ = (DeletePropertyOrThrow O toKey)
        if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        __x20__
      }
      from = (+ from direction)
      to = (+ to direction)
      count = (- count 1i)
    }
    app __x21__ = (WrapCompletion O)
    return __x21__
  }
  */
}
