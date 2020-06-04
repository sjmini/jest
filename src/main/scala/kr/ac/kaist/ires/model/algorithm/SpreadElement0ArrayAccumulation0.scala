package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SpreadElement0ArrayAccumulation0 {
  val length: Int = 0
  val func: Func = Func("""SpreadElement0ArrayAccumulation0""", List(Id("""this"""), Id("""AssignmentExpression"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(14045), ILet(Id("""spreadRef"""), ERef(RefId(Id("""__x0__""")))).setId(14046), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""spreadRef"""))))).setId(14048), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14049), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14050)).setId(14051), ISeq(List()).setId(14052)).setId(14053), ILet(Id("""spreadObj"""), ERef(RefId(Id("""__x1__""")))).setId(14054), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""spreadObj"""))))).setId(14056), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14057), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14058)).setId(14059), ISeq(List()).setId(14052)).setId(14060), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(14061), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(14063), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(14064), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14065)).setId(14066), ISeq(List()).setId(14052)).setId(14067), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(14068), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""nextIndex"""))))).setId(14070), IReturn(ERef(RefId(Id("""__x4__""")))).setId(14071))).setId(14072), ISeq(List()).setId(14052)).setId(14073), IApp(Id("""__x5__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(14075), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(14076), IReturn(ERef(RefId(Id("""__x5__""")))).setId(14077)).setId(14078), ISeq(List()).setId(14052)).setId(14079), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x5__""")))).setId(14080), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""nextIndex"""))))).setId(14082), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(14083), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""nextValue"""))))).setId(14084), ILet(Id("""status"""), ERef(RefId(Id("""__x8__""")))).setId(14085), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L))).setId(14087))).setId(14089)).setId(14090))).setId(-1))
  /* Beautified form:
  "SpreadElement0ArrayAccumulation0" (this, AssignmentExpression, array, nextIndex) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x0__
    app __x1__ = (GetValue spreadRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let spreadObj = __x1__
    app __x2__ = (GetIterator spreadObj)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let iteratorRecord = __x2__
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let next = __x3__
      if (= next false) {
        app __x4__ = (WrapCompletion nextIndex)
        return __x4__
      } else {}
      app __x5__ = (IteratorValue next)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextValue = __x5__
      app __x6__ = (ToUint32 nextIndex)
      app __x7__ = (ToString __x6__)
      app __x8__ = (CreateDataProperty array __x7__ nextValue)
      let status = __x8__
      nextIndex = (+ nextIndex 1i)
    }
  }
  */
}
