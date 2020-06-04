package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoPrecision {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toPrecision""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69598), ILet(Id("""precision"""), ERef(RefId(Id("""__x0__""")))).setId(69599), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(69601), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69602), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69603)).setId(69604), ISeq(List()).setId(69605)).setId(69606), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(69607), IIf(EBOp(OEq, ERef(RefId(Id("""precision"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))).setId(69609), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(69610), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69611)).setId(69612), ISeq(List()).setId(69605)).setId(69613), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(69614), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69615))).setId(69616), ISeq(List()).setId(69605)).setId(69617), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""precision"""))))).setId(69619), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(69620), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69621)).setId(69622), ISeq(List()).setId(69605)).setId(69623), ILet(Id("""p"""), ERef(RefId(Id("""__x4__""")))).setId(69624), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(69626), IReturn(ERef(RefId(Id("""__x5__""")))).setId(69627))).setId(69628), ISeq(List()).setId(69605)).setId(69629), ILet(Id("""s"""), EStr("""""")).setId(69631), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")).setId(69633), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))).setId(69635))).setId(69637), ISeq(List()).setId(69605)).setId(69638), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), EStr("""Infinity""")))).setId(69640), IReturn(ERef(RefId(Id("""__x6__""")))).setId(69641))).setId(69643), ISeq(List()).setId(69605)).setId(69644), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""p"""))), EINum(1L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""p"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69646), IReturn(ERef(RefId(Id("""__x7__""")))).setId(69647))).setId(69648), ISeq(List()).setId(69605)).setId(69649), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69651), ILet(Id("""e"""), EINum(0L)).setId(69653))).setId(69655), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69656), ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69657), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""e"""))), EUOp(ONeg, EINum(6L))), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""p""")))))), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""p"""))), EINum(1L))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69656), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))).setId(69659))).setId(69661), ISeq(List()).setId(69605)).setId(69662), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""e""")))), ILet(Id("""c"""), EStr("""+""")).setId(69664), ISeq(List(ILet(Id("""c"""), EStr("""-""")).setId(69667), IAssign(RefId(Id("""e""")), EUOp(ONeg, ERef(RefId(Id("""e"""))))).setId(69669))).setId(69671)).setId(69672), ILet(Id("""d"""), ENotSupported("""StringOp""")).setId(69674), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))), EStr("""e""")), ERef(RefId(Id("""c""")))), ERef(RefId(Id("""d""")))))).setId(69676), IReturn(ERef(RefId(Id("""__x8__""")))).setId(69677))).setId(69679), ISeq(List()).setId(69605)).setId(69680))).setId(69682)).setId(69683), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EBOp(OSub, ERef(RefId(Id("""p"""))), EINum(1L))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69685), IReturn(ERef(RefId(Id("""__x9__""")))).setId(69686))).setId(69687), ISeq(List()).setId(69605)).setId(69688), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""e"""))), EINum(0L))), IExpr(ENotSupported("""Etc""")).setId(69656), IExpr(ENotSupported("""Etc""")).setId(69656)).setId(69692), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69694), IReturn(ERef(RefId(Id("""__x10__""")))).setId(69695))).setId(-1))
  /* Beautified form:
  "GLOBAL.Number.prototype.toPrecision" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let precision = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    if (= precision undefined) {
      app __x2__ = (ToString x)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (ToInteger precision)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let p = __x4__
    if (= x NaN) {
      app __x5__ = (WrapCompletion "NaN")
      return __x5__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (= x Infinity) {
      app __x6__ = (WrapCompletion (+ s "Infinity"))
      return __x6__
    } else {}
    if (|| (< p 1i) (< 100i p)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    if (= x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      !!! "Etc"
      let m = !!! "StringOp"
      if (|| (< e (- 6i)) (! (< e p))) {
        if (! (= p 1i)) {
          !!! "Etc"
          m = (+ (+ a ".") b)
        } else {}
        if (< 0i e) let c = "+" else {
          let c = "-"
          e = (- e)
        }
        let d = !!! "StringOp"
        app __x8__ = (WrapCompletion (+ (+ (+ (+ s m) "e") c) d))
        return __x8__
      } else {}
    }
    if (= e (- p 1i)) {
      app __x9__ = (WrapCompletion (+ s m))
      return __x9__
    } else {}
    if (! (< e 0i)) !!! "Etc" else !!! "Etc"
    app __x10__ = (WrapCompletion (+ s m))
    return __x10__
  }
  */
}
