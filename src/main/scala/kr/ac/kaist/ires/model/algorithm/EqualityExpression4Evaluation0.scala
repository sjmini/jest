package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EqualityExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression4Evaluation0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""EqualityExpression"""))), EStr("""Evaluation""")).setId(21818), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21819), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21821), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21822), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21823)).setId(21824), ISeq(List()).setId(21825)).setId(21826), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21827), IAccess(Id("""__x2__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21830), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21831), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21833), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21834), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21835)).setId(21836), ISeq(List()).setId(21825)).setId(21837), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21838), IApp(Id("""__x4__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""lval"""))))).setId(21841), ILet(Id("""r"""), ERef(RefId(Id("""__x4__""")))).setId(21842), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""r""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(21844), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21845))).setId(21846), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(21847), IReturn(ERef(RefId(Id("""__x6__""")))).setId(21848))).setId(21849)).setId(21850))).setId(-1))
  /* Beautified form:
  "EqualityExpression4Evaluation0" (this, EqualityExpression, RelationalExpression) => {
    access __x0__ = (EqualityExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (RelationalExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (StrictEqualityComparison rval lval)
    let r = __x4__
    if (= r["Value"] true) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion true)
      return __x6__
    }
  }
  */
}
