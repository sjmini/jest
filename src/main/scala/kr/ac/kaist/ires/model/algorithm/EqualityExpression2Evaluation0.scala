package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression2Evaluation0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""EqualityExpression"""))), EStr("""Evaluation""")).setId(21635), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21636), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21638), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21639), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21640)).setId(21641), ISeq(List()).setId(21682)).setId(21643), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21644), IAccess(Id("""__x2__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21647), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21648), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21650), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21651), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21652)).setId(21653), ISeq(List()).setId(21691)).setId(21654), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21655), IApp(Id("""__x4__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""lval"""))))).setId(21658), ILet(Id("""r"""), ERef(RefId(Id("""__x4__""")))).setId(21659), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""r""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""r""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""r""")), ERef(RefProp(RefId(Id("""r""")), EStr("""Value""")))).setId(21661), IReturn(ERef(RefId(Id("""r""")))).setId(21662)).setId(21663), ISeq(List()).setId(21699)).setId(21664), IExpr(ERef(RefId(Id("""r""")))).setId(21665), IIf(EBOp(OEq, ERef(RefId(Id("""r"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(21667), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21668))).setId(21704), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(21670), IReturn(ERef(RefId(Id("""__x6__""")))).setId(21671))).setId(21707)).setId(21673))).setId(21709))
  val instToStepMap: Map[Int, Int] = HashMap(21645 -> 1, 21637 -> 0, 21669 -> 6, 21656 -> 3, 21665 -> 5, 21660 -> 4, 21655 -> 3, 21659 -> 4, 21635 -> 0, 21671 -> 6, 21654 -> 3, 21643 -> 1, 21650 -> 3, 21648 -> 2, 21658 -> 4, 21666 -> 5, 21649 -> 2, 21668 -> 6, 21673 -> 6, 21636 -> 0, 21672 -> 6, 21647 -> 2, 21644 -> 1, 21674 -> 6, 21664 -> 5, 21667 -> 6, 21670 -> 6, 21638 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21637, 21636, 21635), 5 -> HashSet(21665, 21664, 21666), 1 -> HashSet(21645, 21644, 21643, 21638), 6 -> HashSet(21669, 21672, 21671, 21670, 21668, 21673, 21674, 21667), 2 -> HashSet(21647, 21648, 21649), 3 -> HashSet(21656, 21655, 21654, 21650), 4 -> HashSet(21660, 21659, 21658))
  /* Beautified form:
  "EqualityExpression2Evaluation0" (this, EqualityExpression, RelationalExpression) => {
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
    app __x4__ = (AbstractEqualityComparison rval lval)
    let r = __x4__
    if (= (typeof r) "Completion") if (= r["Type"] CONST_normal) r = r["Value"] else return r else {}
    r
    if (= r true) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion true)
      return __x6__
    }
  }
  */
}
