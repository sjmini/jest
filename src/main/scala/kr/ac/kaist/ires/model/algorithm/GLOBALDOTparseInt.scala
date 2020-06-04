package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseInt {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.parseInt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(62937), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(62938), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(62940), ILet(Id("""radix"""), ERef(RefId(Id("""__x1__""")))).setId(62941), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""string"""))))).setId(62943), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(62944), IReturn(ERef(RefId(Id("""__x2__""")))).setId(62945)).setId(62946), ISeq(List()).setId(62947)).setId(62948), ILet(Id("""inputString"""), ERef(RefId(Id("""__x2__""")))).setId(62949), IApp(Id("""__x3__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""inputString"""))), EStr("""start"""))).setId(62951), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(62952), IReturn(ERef(RefId(Id("""__x3__""")))).setId(62953)).setId(62954), ISeq(List()).setId(62947)).setId(62955), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(62956), ILet(Id("""sign"""), EINum(1L)).setId(62958), IExpr(ENotSupported("""Etc""")).setId(62960), IExpr(ENotSupported("""Etc""")).setId(62960), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""radix"""))))).setId(62961), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(62962), IReturn(ERef(RefId(Id("""__x4__""")))).setId(62963)).setId(62964), ISeq(List()).setId(62947)).setId(62965), ILet(Id("""R"""), ERef(RefId(Id("""__x4__""")))).setId(62966), ILet(Id("""stripPrefix"""), EBool(true)).setId(62968), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""R"""))), EINum(0L))), ISeq(List(IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""R"""))), EINum(2L)), EBOp(OLt, EINum(36L), ERef(RefId(Id("""R"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))).setId(62970), IReturn(ERef(RefId(Id("""__x5__""")))).setId(62971))).setId(62972), ISeq(List()).setId(62947)).setId(62973), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""R"""))), EINum(16L))), IAssign(RefId(Id("""stripPrefix""")), EBool(false)).setId(62975), ISeq(List()).setId(62947)).setId(62977))).setId(62979), IAssign(RefId(Id("""R""")), EINum(10L)).setId(62980)).setId(62983), IIf(EBOp(OEq, ERef(RefId(Id("""stripPrefix"""))), EBool(true)), IExpr(ENotSupported("""Etc""")).setId(62960), ISeq(List()).setId(62947)).setId(62986), IExpr(ENotSupported("""StringOp""")).setId(62988), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Z""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))).setId(62989), IReturn(ERef(RefId(Id("""__x6__""")))).setId(62990))).setId(62991), ISeq(List()).setId(62947)).setId(62992), ILet(Id("""mathInt"""), ENotSupported("""NumberOp""")).setId(62994), IExpr(ENotSupported("""Etc""")).setId(62960), IExpr(ENotSupported("""Etc""")).setId(62960), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OMul, ERef(RefId(Id("""sign"""))), ERef(RefId(Id("""number""")))))).setId(62996), IReturn(ERef(RefId(Id("""__x7__""")))).setId(62997))).setId(-1))
  /* Beautified form:
  "GLOBAL.parseInt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let radix = __x1__
    app __x2__ = (ToString string)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let inputString = __x2__
    app __x3__ = (TrimString inputString "start")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let sign = 1i
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (ToInt32 radix)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let R = __x4__
    let stripPrefix = true
    if (! (= R 0i)) {
      if (|| (< R 2i) (< 36i R)) {
        app __x5__ = (WrapCompletion NaN)
        return __x5__
      } else {}
      if (! (= R 16i)) stripPrefix = false else {}
    } else R = 10i
    if (= stripPrefix true) !!! "Etc" else {}
    !!! "StringOp"
    if (= Z["length"] 0i) {
      app __x6__ = (WrapCompletion NaN)
      return __x6__
    } else {}
    let mathInt = !!! "NumberOp"
    !!! "Etc"
    !!! "Etc"
    app __x7__ = (WrapCompletion (* sign number))
    return __x7__
  }
  */
}
