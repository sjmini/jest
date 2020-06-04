package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToIndex {
  val length: Int = 1
  val func: Func = Func("""ToIndex""", List(Id("""value""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef), ILet(Id("""index"""), EINum(0L)).setId(3232), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""value"""))))).setId(3235), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(3236), IReturn(ERef(RefId(Id("""__x0__""")))).setId(3237)).setId(3238), ISeq(List()).setId(3239)).setId(3240), ILet(Id("""integerIndex"""), ERef(RefId(Id("""__x0__""")))).setId(3241), IIf(EBOp(OLt, ERef(RefId(Id("""integerIndex"""))), EINum(0L)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(3243), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3244))).setId(3245), ISeq(List()).setId(3239)).setId(3246), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToLength"""))), List(ERef(RefId(Id("""integerIndex"""))))).setId(3248), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(3249), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3250)).setId(3251), ISeq(List()).setId(3239)).setId(3252), ILet(Id("""index"""), ERef(RefId(Id("""__x2__""")))).setId(3253), IApp(Id("""__x3__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefId(Id("""integerIndex"""))), ERef(RefId(Id("""index"""))))).setId(3255), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(3256), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3257))).setId(3258), ISeq(List()).setId(3239)).setId(3259))).setId(3261)).setId(3262), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""index"""))))).setId(3264), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3265))).setId(-1))
  /* Beautified form:
  "ToIndex" (value) => {
    if (= value undefined) let index = 0i else {
      app __x0__ = (ToInteger value)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let integerIndex = __x0__
      if (< integerIndex 0i) {
        app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x1__
      } else {}
      app __x2__ = (ToLength integerIndex)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let index = __x2__
      app __x3__ = (SameValueZero integerIndex index)
      if (= __x3__ false) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
    }
    app __x5__ = (WrapCompletion index)
    return __x5__
  }
  */
}
