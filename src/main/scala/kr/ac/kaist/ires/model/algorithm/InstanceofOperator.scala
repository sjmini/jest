package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InstanceofOperator {
  val length: Int = 2
  val func: Func = Func("""InstanceofOperator""", List(Id("""V"""), Id("""target""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))).setId(21386), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(21387), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21388))).setId(21389), ISeq(List()).setId(21390)).setId(21391), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""SYMBOL_hasInstance"""))))).setId(21393), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(21394), IReturn(ERef(RefId(Id("""__x2__""")))).setId(21395)).setId(21396), ISeq(List()).setId(21390)).setId(21397), ILet(Id("""instOfHandler"""), ERef(RefId(Id("""__x2__""")))).setId(21398), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""instOfHandler"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""instOfHandler"""))), ERef(RefId(Id("""target"""))), EList(List(ERef(RefId(Id("""V"""))))))).setId(21400), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21401), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21402)).setId(21403), ISeq(List()).setId(21390)).setId(21404), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(21405), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(21406), IReturn(ERef(RefId(Id("""__x4__""")))).setId(21407)).setId(21408), ISeq(List()).setId(21390)).setId(21409), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(21410), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21411))).setId(21413), ISeq(List()).setId(21390)).setId(21414), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""target"""))))).setId(21416), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(21417), IReturn(ERef(RefId(Id("""__x7__""")))).setId(21418))).setId(21419), ISeq(List()).setId(21390)).setId(21420), IApp(Id("""__x8__"""), ERef(RefId(Id("""OrdinaryHasInstance"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""V"""))))).setId(21422), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(21423), IReturn(ERef(RefId(Id("""__x8__""")))).setId(21424)).setId(21425), ISeq(List()).setId(21390)).setId(21426), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(21427), IReturn(ERef(RefId(Id("""__x9__""")))).setId(21428))).setId(-1))
  /* Beautified form:
  "InstanceofOperator" (V, target) => {
    app __x0__ = (Type target)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetMethod target SYMBOL_hasInstance)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let instOfHandler = __x2__
    if (! (= instOfHandler undefined)) {
      app __x3__ = (Call instOfHandler target (new [V]))
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (ToBoolean __x3__)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (IsCallable target)
    if (= __x6__ false) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (OrdinaryHasInstance target V)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
