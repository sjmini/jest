package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementSet {
  val length: Int = 3
  val func: Func = Func("""IntegerIndexedElementSet""", List(Id("""O"""), Id("""index"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""value"""))))).setId(57429), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(57430), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57431)).setId(57432), ISeq(List()).setId(57428)).setId(57433), ILet(Id("""numValue"""), ERef(RefId(Id("""__x0__""")))).setId(57434), ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))).setId(57436), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))).setId(57438), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(57439), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57440))).setId(57441), ISeq(List()).setId(57428)).setId(57442), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))).setId(57444), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57445), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57446))).setId(57447), ISeq(List()).setId(57428)).setId(57448), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57450), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57451))).setId(57452), ISeq(List()).setId(57428)).setId(57453), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(57455), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""length""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57457), IReturn(ERef(RefId(Id("""__x6__""")))).setId(57458))).setId(57459), ISeq(List()).setId(57428)).setId(57460), ILet(Id("""offset"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ByteOffset""")))).setId(57462), ILet(Id("""arrayTypeName"""), ERef(RefProp(RefId(Id("""O""")), EStr("""TypedArrayName""")))).setId(57464), IExpr(ENotSupported("""Etc""")).setId(57466), ILet(Id("""indexedPosition"""), EBOp(OPlus, EBOp(OMul, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementSize""")))), ERef(RefId(Id("""offset"""))))).setId(57467), IExpr(ENotSupported("""Etc""")).setId(57466), IApp(Id("""__x7__"""), ERef(RefId(Id("""SetValueInBuffer"""))), List(ERef(RefId(Id("""buffer"""))), ERef(RefId(Id("""indexedPosition"""))), ERef(RefId(Id("""elementType"""))), ERef(RefId(Id("""numValue"""))), EBool(true), EStr("""Unordered"""))).setId(57469), IExpr(ERef(RefId(Id("""__x7__""")))).setId(57470), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(57472), IReturn(ERef(RefId(Id("""__x8__""")))).setId(57473))).setId(-1))
  /* Beautified form:
  "IntegerIndexedElementSet" (O, index, value) => {
    app __x0__ = (ToNumber value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let numValue = __x0__
    let buffer = O["ViewedArrayBuffer"]
    app __x1__ = (IsDetachedBuffer buffer)
    if (= __x1__ true) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (IsInteger index)
    if (= __x3__ false) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    if (= index -0.0) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Etc"
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Etc"
    app __x7__ = (SetValueInBuffer buffer indexedPosition elementType numValue true "Unordered")
    __x7__
    app __x8__ = (WrapCompletion true)
    return __x8__
  }
  */
}
