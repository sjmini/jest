package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StringPad {
  val length: Int = 4
  val func: Func = Func("""StringPad""", List(Id("""O"""), Id("""maxLength"""), Id("""fillString"""), Id("""placement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72420), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(72421), IReturn(ERef(RefId(Id("""__x0__""")))).setId(72422)).setId(72423), ISeq(List()).setId(72470)).setId(72424), ILet(Id("""S"""), ERef(RefId(Id("""__x0__""")))).setId(72425), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToLength"""))), List(ERef(RefId(Id("""maxLength"""))))).setId(72427), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(72428), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72429)).setId(72430), ISeq(List()).setId(72477)).setId(72431), ILet(Id("""intMaxLength"""), ERef(RefId(Id("""__x1__""")))).setId(72432), ILet(Id("""stringLength"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(72434), IExpr(ENotSupported("""Etc""")).setId(72436), IIf(EBOp(OEq, ERef(RefId(Id("""fillString"""))), EUndef), ILet(Id("""filler"""), ENotSupported("""StringOp""")).setId(72437), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""fillString"""))))).setId(72439), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72440), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72441)).setId(72442), ISeq(List()).setId(72487)).setId(72443), ILet(Id("""filler"""), ERef(RefId(Id("""__x2__""")))).setId(72444))).setId(72490)).setId(72446), IIf(EBOp(OEq, ERef(RefId(Id("""filler"""))), EStr("""""")), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(72448), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72449))).setId(72494), ISeq(List()).setId(72495)).setId(72451), ILet(Id("""fillLen"""), EBOp(OSub, ERef(RefId(Id("""intMaxLength"""))), ERef(RefId(Id("""stringLength"""))))).setId(72453), ILet(Id("""truncatedStringFiller"""), ENotSupported("""StringOp""")).setId(72455), IIf(EBOp(OEq, ERef(RefId(Id("""placement"""))), EStr("""start""")), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""truncatedStringFiller"""))), ERef(RefId(Id("""S""")))))).setId(72457), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72458))).setId(72501), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""S"""))), ERef(RefId(Id("""truncatedStringFiller""")))))).setId(72460), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72461))).setId(72504)).setId(72463))).setId(72506))
  val instToStepMap: Map[Int, Int] = HashMap(72446 -> 6, 72462 -> 12, 72424 -> 1, 72455 -> 10, 72420 -> 1, 72448 -> 7, 72443 -> 6, 72432 -> 2, 72459 -> 11, 72431 -> 2, 72445 -> 6, 72450 -> 7, 72419 -> 0, 72454 -> 9, 72436 -> 4, 72437 -> 5, 72458 -> 11, 72427 -> 2, 72444 -> 6, 72451 -> 8, 72433 -> 2, 72456 -> 10, 72438 -> 5, 72461 -> 12, 72452 -> 8, 72464 -> 12, 72426 -> 1, 72447 -> 6, 72449 -> 7, 72460 -> 12, 72425 -> 1, 72453 -> 9, 72434 -> 3, 72439 -> 6, 72457 -> 11, 72435 -> 3, 72463 -> 12)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(72419), 5 -> HashSet(72437, 72438), 10 -> HashSet(72455, 72456), 1 -> HashSet(72424, 72420, 72426, 72425), 6 -> HashSet(72446, 72445, 72444, 72443, 72447, 72439), 9 -> HashSet(72454, 72453), 2 -> HashSet(72431, 72427, 72433, 72432), 12 -> HashSet(72462, 72461, 72464, 72460, 72463), 7 -> HashSet(72450, 72448, 72449), 3 -> HashSet(72434, 72435), 11 -> HashSet(72459, 72458, 72457), 8 -> HashSet(72451, 72452), 4 -> HashSet(72436))
  /* Beautified form:
  "StringPad" (O, maxLength, fillString, placement) => {
    app __x0__ = (ToString O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let S = __x0__
    app __x1__ = (ToLength maxLength)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let intMaxLength = __x1__
    let stringLength = S["length"]
    !!! "Etc"
    if (= fillString undefined) let filler = !!! "StringOp" else {
      app __x2__ = (ToString fillString)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let filler = __x2__
    }
    if (= filler "") {
      app __x3__ = (WrapCompletion S)
      return __x3__
    } else {}
    let fillLen = (- intMaxLength stringLength)
    let truncatedStringFiller = !!! "StringOp"
    if (= placement "start") {
      app __x4__ = (WrapCompletion (+ truncatedStringFiller S))
      return __x4__
    } else {
      app __x5__ = (WrapCompletion (+ S truncatedStringFiller))
      return __x5__
    }
  }
  */
}
