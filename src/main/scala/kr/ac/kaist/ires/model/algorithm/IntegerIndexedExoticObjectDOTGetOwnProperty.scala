package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""IntegerIndexedExoticObject.GetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(56459), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(56460), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(56461), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56462)).setId(56463), ISeq(List()).setId(56498)).setId(56464), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x1__""")))).setId(56465), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IntegerIndexedElementGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""numericIndex"""))))).setId(56467), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(56468), IReturn(ERef(RefId(Id("""__x2__""")))).setId(56469)).setId(56470), ISeq(List()).setId(56505)).setId(56471), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(56472), IIf(EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(56474), IReturn(ERef(RefId(Id("""__x3__""")))).setId(56475))).setId(56510), ISeq(List()).setId(56511)).setId(56477), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(56479), IReturn(ERef(RefId(Id("""__x4__""")))).setId(56480))).setId(56515), ISeq(List()).setId(56516)).setId(56483))).setId(56518), ISeq(List()).setId(56519)).setId(56486), IApp(Id("""__x5__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(56488), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(56489), IReturn(ERef(RefId(Id("""__x6__""")))).setId(56490))).setId(56524))
  val instToStepMap: Map[Int, Int] = HashMap(56466 -> 10, 56459 -> 11, 56474 -> 8, 56478 -> 10, 56482 -> 10, 56472 -> 10, 56485 -> 10, 56479 -> 10, 56476 -> 8, 56481 -> 10, 56471 -> 10, 56484 -> 10, 56473 -> 10, 56487 -> 11, 56458 -> 1, 56490 -> 12, 56464 -> 10, 56477 -> 10, 56483 -> 10, 56491 -> 12, 56486 -> 11, 56460 -> 10, 56475 -> 8, 56465 -> 10, 56489 -> 12, 56488 -> 12, 56467 -> 10, 56480 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56458), 10 -> HashSet(56473, 56466, 56478, 56482, 56472, 56485, 56479, 56481, 56471, 56484, 56464, 56477, 56483, 56460, 56465, 56467, 56480), 1 -> HashSet(56458), 9 -> HashSet(56477, 56478), 12 -> HashSet(56490, 56491, 56489, 56488), 7 -> HashSet(56473, 56472, 56471, 56467), 11 -> HashSet(56487, 56486, 56459), 8 -> HashSet(56474, 56475, 56476), 4 -> HashSet(56464, 56466, 56460, 56465))
  /* Beautified form:
  "IntegerIndexedExoticObject.GetOwnProperty" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ String) {
      app __x1__ = (CanonicalNumericIndexString P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numericIndex = __x1__
      if (! (= numericIndex undefined)) {
        app __x2__ = (IntegerIndexedElementGet O numericIndex)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let value = __x2__
        if (= value undefined) {
          app __x3__ = (WrapCompletion undefined)
          return __x3__
        } else {}
        app __x4__ = (WrapCompletion (new PropertyDescriptor("Value" -> value, "Writable" -> true, "Enumerable" -> true, "Configurable" -> false)))
        return __x4__
      } else {}
    } else {}
    app __x5__ = (OrdinaryGetOwnProperty O P)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
