package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTendsWith {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.endsWith""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71139), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(71140), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(71142), ILet(Id("""endPosition"""), ERef(RefId(Id("""__x1__""")))).setId(71143), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71145), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71146), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71147)).setId(71148), ISeq(List()).setId(71149)).setId(71150), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(71151), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71153), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71154), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71155)).setId(71156), ISeq(List()).setId(71149)).setId(71157), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(71158), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsRegExp"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71160), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(71161), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71162)).setId(71163), ISeq(List()).setId(71149)).setId(71164), ILet(Id("""isRegExp"""), ERef(RefId(Id("""__x4__""")))).setId(71165), IIf(EBOp(OEq, ERef(RefId(Id("""isRegExp"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(71167), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71168))).setId(71169), ISeq(List()).setId(71149)).setId(71170), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71172), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(71173), IReturn(ERef(RefId(Id("""__x6__""")))).setId(71174)).setId(71175), ISeq(List()).setId(71149)).setId(71176), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x6__""")))).setId(71177), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(71179), IIf(EBOp(OEq, ERef(RefId(Id("""endPosition"""))), EUndef), ILet(Id("""pos"""), ERef(RefId(Id("""len""")))).setId(71181), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""endPosition"""))))).setId(71183), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(71184), IReturn(ERef(RefId(Id("""__x7__""")))).setId(71185)).setId(71186), ISeq(List()).setId(71149)).setId(71187), ILet(Id("""pos"""), ERef(RefId(Id("""__x7__""")))).setId(71188))).setId(71189)).setId(71190), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(71192), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""len"""))))).setId(71193), ILet(Id("""end"""), ERef(RefId(Id("""__x9__""")))).setId(71194), ILet(Id("""searchLength"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(71196), ILet(Id("""start"""), EBOp(OSub, ERef(RefId(Id("""end"""))), ERef(RefId(Id("""searchLength"""))))).setId(71198), IIf(EBOp(OLt, ERef(RefId(Id("""start"""))), EINum(0L)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(71200), IReturn(ERef(RefId(Id("""__x10__""")))).setId(71201))).setId(71202), ISeq(List()).setId(71149)).setId(71203), IExpr(ENotSupported("""Etc""")).setId(71205), IExpr(ENotSupported("""Etc""")).setId(71205))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.endsWith" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let endPosition = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (IsRegExp searchString)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let isRegExp = __x4__
    if (= isRegExp true) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (ToString searchString)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let searchStr = __x6__
    let len = S["length"]
    if (= endPosition undefined) let pos = len else {
      app __x7__ = (ToInteger endPosition)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let pos = __x7__
    }
    app __x8__ = (max pos 0i)
    app __x9__ = (min __x8__ len)
    let end = __x9__
    let searchLength = searchStr["length"]
    let start = (- end searchLength)
    if (< start 0i) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    !!! "Etc"
    !!! "Etc"
  }
  */
}
