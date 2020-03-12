package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression1Evaluation0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(20754), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(20755), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(20757), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(20758), IReturn(ERef(RefId(Id("""__x1__""")))).setId(20759)).setId(20760), ISeq(List()).setId(20801)).setId(20762), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(20763), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(20766), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(20767), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(20769), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(20770), IReturn(ERef(RefId(Id("""__x3__""")))).setId(20771)).setId(20772), ISeq(List()).setId(20810)).setId(20773), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(20774), IApp(Id("""__x4__"""), ERef(RefId(Id("""AbstractRelationalComparison"""))), List(ERef(RefId(Id("""lval"""))), ERef(RefId(Id("""rval"""))))).setId(20777), ILet(Id("""r"""), ERef(RefId(Id("""__x4__""")))).setId(20778), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""r""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""r""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""r""")), ERef(RefProp(RefId(Id("""r""")), EStr("""Value""")))).setId(20780), IReturn(ERef(RefId(Id("""r""")))).setId(20781)).setId(20782), ISeq(List()).setId(20818)).setId(20783), IExpr(ERef(RefId(Id("""r""")))).setId(20784), IIf(EBOp(OEq, ERef(RefId(Id("""r"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(20786), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20787))).setId(20823), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""r"""))))).setId(20789), IReturn(ERef(RefId(Id("""__x6__""")))).setId(20790))).setId(20826)).setId(20792))).setId(20828))
  val instToStepMap: Map[Int, Int] = HashMap(20786 -> 6, 20775 -> 3, 20762 -> 1, 20787 -> 6, 20767 -> 2, 20773 -> 3, 20783 -> 5, 20779 -> 4, 20792 -> 6, 20764 -> 1, 20785 -> 5, 20768 -> 2, 20789 -> 6, 20778 -> 4, 20790 -> 6, 20777 -> 4, 20755 -> 0, 20754 -> 0, 20784 -> 5, 20757 -> 1, 20766 -> 2, 20793 -> 6, 20791 -> 6, 20763 -> 1, 20774 -> 3, 20788 -> 6, 20769 -> 3, 20756 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(20755, 20754, 20756), 5 -> HashSet(20784, 20783, 20785), 1 -> HashSet(20762, 20757, 20763, 20764), 6 -> HashSet(20786, 20790, 20787, 20793, 20791, 20788, 20792, 20789), 2 -> HashSet(20766, 20767, 20768), 3 -> HashSet(20775, 20774, 20773, 20769), 4 -> HashSet(20777, 20779, 20778))
  /* Beautified form:
  "RelationalExpression1Evaluation0" (this, RelationalExpression, ShiftExpression) => {
    access __x0__ = (RelationalExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (ShiftExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (AbstractRelationalComparison lval rval)
    let r = __x4__
    if (= (typeof r) "Completion") if (= r["Type"] CONST_normal) r = r["Value"] else return r else {}
    r
    if (= r undefined) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion r)
      return __x6__
    }
  }
  */
}
