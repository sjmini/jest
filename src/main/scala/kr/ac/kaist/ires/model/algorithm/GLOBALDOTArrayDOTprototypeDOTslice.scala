package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTslice {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Array.prototype.slice""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(81629), ILet(Id("""start"""), ERef(RefId(Id("""__x0__""")))).setId(81630), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(81632), ILet(Id("""end"""), ERef(RefId(Id("""__x1__""")))).setId(81633), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(81635), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(81636), IReturn(ERef(RefId(Id("""__x2__""")))).setId(81637)).setId(81638), ISeq(List()).setId(81639)).setId(81640), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(81641), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(81643), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(81644), IReturn(ERef(RefId(Id("""__x3__""")))).setId(81645)).setId(81646), ISeq(List()).setId(81639)).setId(81647), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(81648), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(81650), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(81651), IReturn(ERef(RefId(Id("""__x4__""")))).setId(81652)).setId(81653), ISeq(List()).setId(81639)).setId(81654), ILet(Id("""relativeStart"""), ERef(RefId(Id("""__x4__""")))).setId(81655), IIf(EBOp(OLt, ERef(RefId(Id("""relativeStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeStart""")))), EINum(0L))).setId(81657), ILet(Id("""k"""), ERef(RefId(Id("""__x5__""")))).setId(81658))).setId(81659), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeStart"""))), ERef(RefId(Id("""len"""))))).setId(81660), ILet(Id("""k"""), ERef(RefId(Id("""__x6__""")))).setId(81661))).setId(81662)).setId(81663), IIf(EBOp(OEq, ERef(RefId(Id("""end"""))), EUndef), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""len""")))).setId(81665), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""end"""))))).setId(81667), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(81668), IReturn(ERef(RefId(Id("""__x7__""")))).setId(81669)).setId(81670), ISeq(List()).setId(81639)).setId(81671), ILet(Id("""relativeEnd"""), ERef(RefId(Id("""__x7__""")))).setId(81672))).setId(81673)).setId(81674), IIf(EBOp(OLt, ERef(RefId(Id("""relativeEnd"""))), EINum(0L)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeEnd""")))), EINum(0L))).setId(81676), ILet(Id("""final"""), ERef(RefId(Id("""__x8__""")))).setId(81677))).setId(81678), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeEnd"""))), ERef(RefId(Id("""len"""))))).setId(81679), ILet(Id("""final"""), ERef(RefId(Id("""__x9__""")))).setId(81680))).setId(81681)).setId(81682), IApp(Id("""__x10__"""), ERef(RefId(Id("""max"""))), List(EBOp(OSub, ERef(RefId(Id("""final"""))), ERef(RefId(Id("""k""")))), EINum(0L))).setId(81684), ILet(Id("""count"""), ERef(RefId(Id("""__x10__""")))).setId(81685), IApp(Id("""__x11__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""count"""))))).setId(81687), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(81688), IReturn(ERef(RefId(Id("""__x11__""")))).setId(81689)).setId(81690), ISeq(List()).setId(81639)).setId(81691), ILet(Id("""A"""), ERef(RefId(Id("""__x11__""")))).setId(81692), ILet(Id("""n"""), EINum(0L)).setId(81694), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""final""")))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(81696), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(81697), IReturn(ERef(RefId(Id("""__x12__""")))).setId(81698)).setId(81699), ISeq(List()).setId(81639)).setId(81700), ILet(Id("""Pk"""), ERef(RefId(Id("""__x12__""")))).setId(81701), IApp(Id("""__x13__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(81703), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(81704), IReturn(ERef(RefId(Id("""__x13__""")))).setId(81705)).setId(81706), ISeq(List()).setId(81639)).setId(81707), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x13__""")))).setId(81708), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(81710), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(81711), IReturn(ERef(RefId(Id("""__x14__""")))).setId(81712)).setId(81713), ISeq(List()).setId(81639)).setId(81714), ILet(Id("""kValue"""), ERef(RefId(Id("""__x14__""")))).setId(81715), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(81717), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(81718), IReturn(ERef(RefId(Id("""__x15__""")))).setId(81719)).setId(81720), ISeq(List()).setId(81639)).setId(81721), IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""kValue"""))))).setId(81722), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(81723), IReturn(ERef(RefId(Id("""__x16__""")))).setId(81724)).setId(81725), ISeq(List()).setId(81639)).setId(81726), IExpr(ERef(RefId(Id("""__x16__""")))).setId(81727))).setId(81729), ISeq(List()).setId(81639)).setId(81730), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(81732), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(81734))).setId(81736)).setId(81737), IApp(Id("""__x17__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""n"""))), EBool(true))).setId(81739), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))).setId(81740), IReturn(ERef(RefId(Id("""__x17__""")))).setId(81741)).setId(81742), ISeq(List()).setId(81639)).setId(81743), IExpr(ERef(RefId(Id("""__x17__""")))).setId(81744), IApp(Id("""__x18__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(81746), IReturn(ERef(RefId(Id("""__x18__""")))).setId(81747))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.slice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (ToInteger start)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let relativeStart = __x4__
    if (< relativeStart 0i) {
      app __x5__ = (max (+ len relativeStart) 0i)
      let k = __x5__
    } else {
      app __x6__ = (min relativeStart len)
      let k = __x6__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x7__ = (ToInteger end)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let relativeEnd = __x7__
    }
    if (< relativeEnd 0i) {
      app __x8__ = (max (+ len relativeEnd) 0i)
      let final = __x8__
    } else {
      app __x9__ = (min relativeEnd len)
      let final = __x9__
    }
    app __x10__ = (max (- final k) 0i)
    let count = __x10__
    app __x11__ = (ArraySpeciesCreate O count)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let A = __x11__
    let n = 0i
    while (< k final) {
      app __x12__ = (ToString k)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let Pk = __x12__
      app __x13__ = (HasProperty O Pk)
      if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let kPresent = __x13__
      if (= kPresent true) {
        app __x14__ = (Get O Pk)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let kValue = __x14__
        app __x15__ = (ToString n)
        if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (CreateDataPropertyOrThrow A __x15__ kValue)
        if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        __x16__
      } else {}
      k = (+ k 1i)
      n = (+ n 1i)
    }
    app __x17__ = (Set A "length" n true)
    if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    __x17__
    app __x18__ = (WrapCompletion A)
    return __x18__
  }
  */
}
