package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentPropertyList"""), Id("""AssignmentProperty"""), Id("""value""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentPropertyList"""))), EStr("""PropertyDestructuringAssignmentEvaluation""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""propertyNames"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentProperty"""))), EStr("""PropertyDestructuringAssignmentEvaluation""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""nextNames"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""__x4__"""), ERef(RefId(Id("""nextNames""")))), ILet(Id("""__x5__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x6__"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))), IAppend(ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""propertyNames""")))), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L)))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""propertyNames"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0" (this, AssignmentPropertyList, AssignmentProperty, value) => {
    access __x0__ = (AssignmentPropertyList "PropertyDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let propertyNames = __x1__
    access __x2__ = (AssignmentProperty "PropertyDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ value)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let nextNames = __x3__
    let __x4__ = nextNames
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let __x6__ = __x4__[__x5__]
      append __x6__ -> propertyNames
      __x5__ = (+ __x5__ 1i)
    }
    app __x7__ = (WrapCompletion propertyNames)
    return __x7__
  }
  */
}
