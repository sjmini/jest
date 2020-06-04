package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoFixed {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toFixed""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69401), ILet(Id("""fractionDigits"""), ERef(RefId(Id("""__x0__""")))).setId(69402), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(69404), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69405), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69406)).setId(69407), ISeq(List()).setId(69408)).setId(69409), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(69410), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fractionDigits"""))))).setId(69412), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(69413), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69414)).setId(69415), ISeq(List()).setId(69408)).setId(69416), ILet(Id("""f"""), ERef(RefId(Id("""__x2__""")))).setId(69417), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""f"""))), EINum(0L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""f"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69419), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69420))).setId(69421), ISeq(List()).setId(69408)).setId(69422), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(69424), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69425))).setId(69426), ISeq(List()).setId(69408)).setId(69427), ILet(Id("""s"""), EStr("""""")).setId(69429), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")).setId(69431), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))).setId(69433))).setId(69435), ISeq(List()).setId(69408)).setId(69436), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(9223372036854775807L))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))).setId(69438), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(69439), IReturn(ERef(RefId(Id("""__x5__""")))).setId(69440)).setId(69441), ISeq(List()).setId(69408)).setId(69442), ILet(Id("""m"""), ERef(RefId(Id("""__x5__""")))).setId(69443))).setId(69445), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69446), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(0L)), ILet(Id("""m"""), EStr("""0""")).setId(69447), ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69449)).setId(69451), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""f"""))), EINum(0L))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""m""")), EStr("""length""")))).setId(69453), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""f"""))), ERef(RefId(Id("""k"""))))), ISeq(List(ILet(Id("""z"""), ENotSupported("""StringOp""")).setId(69455), IAssign(RefId(Id("""m""")), EBOp(OPlus, ERef(RefId(Id("""z"""))), ERef(RefId(Id("""m"""))))).setId(69457), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""f"""))), EINum(1L))).setId(69459))).setId(69461), ISeq(List()).setId(69408)).setId(69462), IExpr(ENotSupported("""Etc""")).setId(69446), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))).setId(69464))).setId(69466), ISeq(List()).setId(69408)).setId(69467))).setId(69469)).setId(69470), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69472), IReturn(ERef(RefId(Id("""__x6__""")))).setId(69473))).setId(-1))
  /* Beautified form:
  "GLOBAL.Number.prototype.toFixed" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (|| (< f 0i) (< 100i f)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= x NaN) {
      app __x4__ = (WrapCompletion "NaN")
      return __x4__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (! (< x 9223372036854775807i)) {
      app __x5__ = (ToString x)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let m = __x5__
    } else {
      !!! "Etc"
      if (= n 0i) let m = "0" else let m = !!! "StringOp"
      if (! (= f 0i)) {
        let k = m["length"]
        if (! (< f k)) {
          let z = !!! "StringOp"
          m = (+ z m)
          k = (+ f 1i)
        } else {}
        !!! "Etc"
        m = (+ (+ a ".") b)
      } else {}
    }
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }
  */
}
