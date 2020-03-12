package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedElementSet {
  val length: Int = 3
  val func: Func = Func("""IntegerIndexedElementSet""", List(Id("""O"""), Id("""index"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""value"""))))).setId(57429), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(57430), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57431)).setId(57432), ISeq(List()).setId(57480)).setId(57433), ILet(Id("""numValue"""), ERef(RefId(Id("""__x0__""")))).setId(57434), ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))).setId(57436), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))).setId(57438), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(57439), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57440))).setId(57487), ISeq(List()).setId(57488)).setId(57442), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))).setId(57444), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57445), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57446))).setId(57493), ISeq(List()).setId(57494)).setId(57448), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57450), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57451))).setId(57498), ISeq(List()).setId(57499)).setId(57453), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(57455), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""length""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57457), IReturn(ERef(RefId(Id("""__x6__""")))).setId(57458))).setId(57504), ISeq(List()).setId(57505)).setId(57460), ILet(Id("""offset"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ByteOffset""")))).setId(57462), ILet(Id("""arrayTypeName"""), ERef(RefProp(RefId(Id("""O""")), EStr("""TypedArrayName""")))).setId(57464), IExpr(ENotSupported("""Etc""")).setId(57466), ILet(Id("""indexedPosition"""), EBOp(OPlus, EBOp(OMul, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementSize""")))), ERef(RefId(Id("""offset"""))))).setId(57467), IExpr(ENotSupported("""Etc""")).setId(57466), IApp(Id("""__x7__"""), ERef(RefId(Id("""SetValueInBuffer"""))), List(ERef(RefId(Id("""buffer"""))), ERef(RefId(Id("""indexedPosition"""))), ERef(RefId(Id("""elementType"""))), ERef(RefId(Id("""numValue"""))), EBool(true), EStr("""Unordered"""))).setId(57469), IExpr(ERef(RefId(Id("""__x7__""")))).setId(57470), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(57472), IReturn(ERef(RefId(Id("""__x8__""")))).setId(57473))).setId(57516))
  val instToStepMap: Map[Int, Int] = HashMap(57451 -> 8, 57434 -> 2, 57461 -> 12, 57437 -> 3, 57449 -> 7, 57440 -> 4, 57463 -> 13, 57428 -> 1, 57435 -> 2, 57452 -> 8, 57439 -> 4, 57471 -> 18, 57438 -> 5, 57455 -> 10, 57468 -> 16, 57457 -> 11, 57443 -> 5, 57429 -> 2, 57446 -> 6, 57474 -> 19, 57454 -> 9, 57465 -> 14, 57448 -> 7, 57472 -> 19, 57433 -> 2, 57450 -> 8, 57473 -> 19, 57464 -> 14, 57447 -> 6, 57460 -> 12, 57444 -> 7, 57453 -> 9, 57466 -> 17, 57469 -> 18, 57436 -> 3, 57459 -> 11, 57441 -> 4, 57456 -> 10, 57467 -> 16, 57470 -> 18, 57445 -> 6, 57458 -> 11, 57462 -> 13, 57442 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57428), 5 -> HashSet(57438, 57443, 57442), 10 -> HashSet(57455, 57456), 14 -> HashSet(57465, 57464), 1 -> HashSet(57428), 6 -> HashSet(57446, 57447, 57445), 9 -> HashSet(57454, 57453), 13 -> HashSet(57463, 57462), 2 -> HashSet(57434, 57429, 57433, 57435), 17 -> HashSet(57466), 12 -> HashSet(57461, 57460), 7 -> HashSet(57448, 57444, 57449), 3 -> HashSet(57437, 57436), 18 -> HashSet(57471, 57469, 57470), 16 -> HashSet(57468, 57467), 11 -> HashSet(57457, 57459, 57458), 8 -> HashSet(57451, 57450, 57452), 19 -> HashSet(57474, 57472, 57473), 4 -> HashSet(57440, 57441, 57439), 15 -> HashSet(57466))
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
