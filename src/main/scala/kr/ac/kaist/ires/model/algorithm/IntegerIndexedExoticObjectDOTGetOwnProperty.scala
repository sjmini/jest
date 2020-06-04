package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""IntegerIndexedExoticObject.GetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(56459), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(56460), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(56461), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56462)).setId(56463), ISeq(List()).setId(56458)).setId(56464), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x1__""")))).setId(56465), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IntegerIndexedElementGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""numericIndex"""))))).setId(56467), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(56468), IReturn(ERef(RefId(Id("""__x2__""")))).setId(56469)).setId(56470), ISeq(List()).setId(56458)).setId(56471), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(56472), IIf(EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(56474), IReturn(ERef(RefId(Id("""__x3__""")))).setId(56475))).setId(56476), ISeq(List()).setId(56458)).setId(56477), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(56479), IReturn(ERef(RefId(Id("""__x4__""")))).setId(56480))).setId(56482), ISeq(List()).setId(56458)).setId(56483))).setId(56485), ISeq(List()).setId(56458)).setId(56486), IApp(Id("""__x5__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(56488), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(56489), IReturn(ERef(RefId(Id("""__x6__""")))).setId(56490))).setId(-1))
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
