package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedElementGet {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedElementGet""", List(Id("""O"""), Id("""index""")), None, ISeq(List(ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))).setId(57324), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))).setId(57326), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(57327), IReturn(ERef(RefId(Id("""__x1__""")))).setId(57328))).setId(57366), ISeq(List()).setId(57367)).setId(57330), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))).setId(57332), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57333), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57334))).setId(57372), ISeq(List()).setId(57373)).setId(57336), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57338), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57339))).setId(57377), ISeq(List()).setId(57378)).setId(57341), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(57343), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""length""")))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57345), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57346))).setId(57383), ISeq(List()).setId(57384)).setId(57348), ILet(Id("""offset"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ByteOffset""")))).setId(57350), ILet(Id("""arrayTypeName"""), ERef(RefProp(RefId(Id("""O""")), EStr("""TypedArrayName""")))).setId(57352), IExpr(ENotSupported("""Etc""")).setId(57354), ILet(Id("""indexedPosition"""), EBOp(OPlus, EBOp(OMul, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementSize""")))), ERef(RefId(Id("""offset"""))))).setId(57355), IExpr(ENotSupported("""Etc""")).setId(57354), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValueFromBuffer"""))), List(ERef(RefId(Id("""buffer"""))), ERef(RefId(Id("""indexedPosition"""))), ERef(RefId(Id("""elementType"""))), EBool(true), EStr("""Unordered"""))).setId(57357), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(57358), IReturn(ERef(RefId(Id("""__x7__""")))).setId(57359))).setId(57394))
  val instToStepMap: Map[Int, Int] = HashMap(57324 -> 2, 57358 -> 17, 57332 -> 6, 57326 -> 4, 57336 -> 6, 57325 -> 2, 57340 -> 7, 57346 -> 10, 57339 -> 7, 57355 -> 15, 57335 -> 5, 57351 -> 12, 57331 -> 4, 57347 -> 10, 57343 -> 9, 57359 -> 17, 57352 -> 13, 57338 -> 7, 57354 -> 16, 57327 -> 3, 57348 -> 11, 57342 -> 8, 57333 -> 5, 57349 -> 11, 57328 -> 3, 57323 -> 1, 57337 -> 6, 57353 -> 13, 57341 -> 8, 57357 -> 17, 57329 -> 3, 57345 -> 10, 57356 -> 15, 57334 -> 5, 57350 -> 12, 57344 -> 9, 57360 -> 17, 57330 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57323), 5 -> HashSet(57335, 57333, 57334), 10 -> HashSet(57347, 57345, 57346), 14 -> HashSet(57354), 1 -> HashSet(57323), 6 -> HashSet(57332, 57337, 57336), 9 -> HashSet(57343, 57344), 13 -> HashSet(57352, 57353), 2 -> HashSet(57324, 57325), 17 -> HashSet(57359, 57358, 57357, 57360), 12 -> HashSet(57351, 57350), 7 -> HashSet(57339, 57338, 57340), 3 -> HashSet(57327, 57328, 57329), 16 -> HashSet(57354), 11 -> HashSet(57348, 57349), 8 -> HashSet(57342, 57341), 4 -> HashSet(57331, 57326, 57330), 15 -> HashSet(57355, 57356))
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
