package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorNext {
  val length: Int = 1
  val func: Func = Func("""IteratorNext""", List(Id("""iteratorRecord"""), Id("""value""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""value"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""NextMethod"""))), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))))).setId(7257), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7258), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7259)).setId(7260), ISeq(List()).setId(7261)).setId(7262), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(7263))).setId(7265), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""NextMethod"""))), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))), EList(List(ERef(RefId(Id("""value"""))))))).setId(7266), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7267), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7268)).setId(7269), ISeq(List()).setId(7261)).setId(7270), ILet(Id("""result"""), ERef(RefId(Id("""__x1__""")))).setId(7271))).setId(7273)).setId(7274), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(7276), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(7277), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7278))).setId(7279), ISeq(List()).setId(7261)).setId(7280), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(7282), IReturn(ERef(RefId(Id("""__x4__""")))).setId(7283))).setId(-1))
  /* Beautified form:
  "IteratorNext" (iteratorRecord, value) => {
    if (= value absent) {
      app __x0__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"])
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let result = __x0__
    } else {
      app __x1__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"] (new [value]))
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let result = __x1__
    }
    app __x2__ = (Type result)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion result)
    return __x4__
  }
  */
}
