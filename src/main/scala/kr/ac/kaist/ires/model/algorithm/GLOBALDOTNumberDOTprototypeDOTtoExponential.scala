package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoExponential {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toExponential""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69181), ILet(Id("""fractionDigits"""), ERef(RefId(Id("""__x0__""")))).setId(69182), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(69184), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69185), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69186)).setId(69187), ISeq(List()).setId(69188)).setId(69189), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(69190), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fractionDigits"""))))).setId(69192), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(69193), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69194)).setId(69195), ISeq(List()).setId(69188)).setId(69196), ILet(Id("""f"""), ERef(RefId(Id("""__x2__""")))).setId(69197), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(69199), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69200))).setId(69201), ISeq(List()).setId(69188)).setId(69202), ILet(Id("""s"""), EStr("""""")).setId(69204), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")).setId(69206), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))).setId(69208))).setId(69210), ISeq(List()).setId(69188)).setId(69211), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), EStr("""Infinity""")))).setId(69213), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69214))).setId(69216), ISeq(List()).setId(69188)).setId(69217), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""f"""))), EINum(0L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""f"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69219), IReturn(ERef(RefId(Id("""__x5__""")))).setId(69220))).setId(69221), ISeq(List()).setId(69188)).setId(69222), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69224), ILet(Id("""e"""), EINum(0L)).setId(69226))).setId(69228), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""fractionDigits"""))), EUndef)), IExpr(ENotSupported("""Etc""")).setId(69229), IExpr(ENotSupported("""Etc""")).setId(69229)).setId(69232), ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69234))).setId(69236)).setId(69237), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""f"""))), EINum(0L))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69229), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))).setId(69239))).setId(69241), ISeq(List()).setId(69188)).setId(69242), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EINum(0L)), ISeq(List(ILet(Id("""c"""), EStr("""+""")).setId(69244), ILet(Id("""d"""), EStr("""0""")).setId(69246))).setId(69248), ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""e""")))), ILet(Id("""c"""), EStr("""+""")).setId(69249), ISeq(List(ILet(Id("""c"""), EStr("""-""")).setId(69251), IAssign(RefId(Id("""e""")), EUOp(ONeg, ERef(RefId(Id("""e"""))))).setId(69253))).setId(69255)).setId(69256), ILet(Id("""d"""), ENotSupported("""StringOp""")).setId(69258))).setId(69260)).setId(69261), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""m"""))), EStr("""e""")), ERef(RefId(Id("""c""")))), ERef(RefId(Id("""d"""))))).setId(69263), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69265), IReturn(ERef(RefId(Id("""__x6__""")))).setId(69266))).setId(-1))
  /* Beautified form:
  "GLOBAL.Number.prototype.toExponential" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (= x NaN) {
      app __x3__ = (WrapCompletion "NaN")
      return __x3__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (= x Infinity) {
      app __x4__ = (WrapCompletion (+ s "Infinity"))
      return __x4__
    } else {}
    if (|| (< f 0i) (< 100i f)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (= x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      if (! (= fractionDigits undefined)) !!! "Etc" else !!! "Etc"
      let m = !!! "StringOp"
    }
    if (! (= f 0i)) {
      !!! "Etc"
      m = (+ (+ a ".") b)
    } else {}
    if (= e 0i) {
      let c = "+"
      let d = "0"
    } else {
      if (< 0i e) let c = "+" else {
        let c = "-"
        e = (- e)
      }
      let d = !!! "StringOp"
    }
    m = (+ (+ (+ m "e") c) d)
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }
  */
}
