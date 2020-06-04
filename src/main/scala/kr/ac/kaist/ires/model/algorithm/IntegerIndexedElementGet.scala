package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementGet {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedElementGet""", List(Id("""O"""), Id("""index""")), None, ISeq(List(ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))).setId(57324), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))).setId(57326), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(57327), IReturn(ERef(RefId(Id("""__x1__""")))).setId(57328))).setId(57329), ISeq(List()).setId(57323)).setId(57330), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))).setId(57332), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57333), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57334))).setId(57335), ISeq(List()).setId(57323)).setId(57336), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57338), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57339))).setId(57340), ISeq(List()).setId(57323)).setId(57341), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(57343), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""length""")))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57345), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57346))).setId(57347), ISeq(List()).setId(57323)).setId(57348), ILet(Id("""offset"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ByteOffset""")))).setId(57350), ILet(Id("""arrayTypeName"""), ERef(RefProp(RefId(Id("""O""")), EStr("""TypedArrayName""")))).setId(57352), IExpr(ENotSupported("""Etc""")).setId(57354), ILet(Id("""indexedPosition"""), EBOp(OPlus, EBOp(OMul, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementSize""")))), ERef(RefId(Id("""offset"""))))).setId(57355), IExpr(ENotSupported("""Etc""")).setId(57354), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValueFromBuffer"""))), List(ERef(RefId(Id("""buffer"""))), ERef(RefId(Id("""indexedPosition"""))), ERef(RefId(Id("""elementType"""))), EBool(true), EStr("""Unordered"""))).setId(57357), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(57358), IReturn(ERef(RefId(Id("""__x7__""")))).setId(57359))).setId(-1))
  /* Beautified form:
  "IntegerIndexedElementGet" (O, index) => {
    let buffer = O["ViewedArrayBuffer"]
    app __x0__ = (IsDetachedBuffer buffer)
    if (= __x0__ true) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (IsInteger index)
    if (= __x2__ false) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    if (= index -0.0) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Etc"
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Etc"
    app __x6__ = (GetValueFromBuffer buffer indexedPosition elementType true "Unordered")
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
