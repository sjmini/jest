package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayAssignmentPattern0DestructuringAssignmentEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""ArrayAssignmentPattern0DestructuringAssignmentEvaluation3""", List(Id("""this"""), Id("""Elision"""), Id("""AssignmentRestElement"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))).setId(23776), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23777), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23778)).setId(23779), ISeq(List()).setId(23780)).setId(23781), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(23782), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent)), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(23784), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(23785), ILet(Id("""status"""), ERef(RefId(Id("""__x2__""")))).setId(23786), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(23788), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(23789), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(23790), IReturn(ERef(RefId(Id("""__x5__""")))).setId(23791))).setId(23793), ISeq(List()).setId(23780)).setId(23794))).setId(23796), ISeq(List()).setId(23780)).setId(23797), IAccess(Id("""__x6__"""), ERef(RefId(Id("""AssignmentRestElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(23799), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(23800), ILet(Id("""result"""), ERef(RefId(Id("""__x7__""")))).setId(23801), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(23803), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(23804), IReturn(ERef(RefId(Id("""__x8__""")))).setId(23805)).setId(23806), ISeq(List()).setId(23780)).setId(23807), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(23808), IReturn(ERef(RefId(Id("""__x9__""")))).setId(23809))).setId(23810), ISeq(List()).setId(23780)).setId(23811), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(23813), IReturn(ERef(RefId(Id("""__x10__""")))).setId(23814))).setId(-1))
  /* Beautified form:
  "ArrayAssignmentPattern0DestructuringAssignmentEvaluation3" (this, Elision, AssignmentRestElement, value) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    if (! (= Elision absent)) {
      access __x1__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x2__ = (__x1__ iteratorRecord)
      let status = __x2__
      app __x3__ = (IsAbruptCompletion status)
      if __x3__ {
        app __x4__ = (Completion status)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    access __x6__ = (AssignmentRestElement "IteratorDestructuringAssignmentEvaluation")
    app __x7__ = (__x6__ iteratorRecord)
    let result = __x7__
    if (= iteratorRecord["Done"] false) {
      app __x8__ = (IteratorClose iteratorRecord result)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    app __x10__ = (WrapCompletion result)
    return __x10__
  }
  */
}
