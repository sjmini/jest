package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTnormalize {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.normalize""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72183), ILet(Id("""form"""), ERef(RefId(Id("""__x0__""")))).setId(72184), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72186), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(72187), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72188)).setId(72189), ISeq(List()).setId(72190)).setId(72191), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(72192), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72194), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72195), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72196)).setId(72197), ISeq(List()).setId(72190)).setId(72198), ILet(Id("""S"""), ERef(RefId(Id("""__x2__""")))).setId(72199), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), EBOp(OEq, ERef(RefId(Id("""form"""))), EUndef)), IAssign(RefId(Id("""form""")), EStr("""NFC""")).setId(72201), ISeq(List()).setId(72190)).setId(72203), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""form"""))))).setId(72205), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72206), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72207)).setId(72208), ISeq(List()).setId(72190)).setId(72209), ILet(Id("""f"""), ERef(RefId(Id("""__x3__""")))).setId(72210), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""f"""))), EStr("""NFC""")), EBOp(OEq, ERef(RefId(Id("""f"""))), EStr("""NFD"""))), EBOp(OEq, ERef(RefId(Id("""f"""))), EStr("""NFKC"""))), EBOp(OEq, ERef(RefId(Id("""f"""))), EStr("""NFKD""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(72212), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72213))).setId(72214), ISeq(List()).setId(72190)).setId(72215), ILet(Id("""ns"""), ENotSupported("""StringOp""")).setId(72217), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""ns"""))))).setId(72219), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72220))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.normalize" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let form = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    if (|| (= argumentsList[0i] absent) (= form undefined)) form = "NFC" else {}
    app __x3__ = (ToString form)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let f = __x3__
    if (! (|| (|| (|| (= f "NFC") (= f "NFD")) (= f "NFKC")) (= f "NFKD"))) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let ns = !!! "StringOp"
    app __x5__ = (WrapCompletion ns)
    return __x5__
  }
  */
}
