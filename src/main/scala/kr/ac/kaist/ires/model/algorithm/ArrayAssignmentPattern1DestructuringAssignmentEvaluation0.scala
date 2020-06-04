package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayAssignmentPattern1DestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArrayAssignmentPattern1DestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentElementList"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))).setId(23891), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23892), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23893)).setId(23894), ISeq(List()).setId(23895)).setId(23896), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(23897), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentElementList"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(23899), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(23900), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(23901), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(23903), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(23904), IReturn(ERef(RefId(Id("""__x3__""")))).setId(23905)).setId(23906), ISeq(List()).setId(23895)).setId(23907), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(23908), IReturn(ERef(RefId(Id("""__x4__""")))).setId(23909))).setId(23910), ISeq(List()).setId(23895)).setId(23911), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(23913), IReturn(ERef(RefId(Id("""__x5__""")))).setId(23914))).setId(-1))
  /* Beautified form:
  "ArrayAssignmentPattern1DestructuringAssignmentEvaluation0" (this, AssignmentElementList, value) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (AssignmentElementList "IteratorDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ iteratorRecord)
    let result = __x2__
    if (= iteratorRecord["Done"] false) {
      app __x3__ = (IteratorClose iteratorRecord result)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion result)
    return __x5__
  }
  */
}
