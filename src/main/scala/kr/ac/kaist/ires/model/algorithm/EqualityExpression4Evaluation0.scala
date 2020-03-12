package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression4Evaluation0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""EqualityExpression"""))), EStr("""Evaluation""")).setId(21818), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21819), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21821), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21822), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21823)).setId(21824), ISeq(List()).setId(21859)).setId(21826), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21827), IAccess(Id("""__x2__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21830), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21831), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21833), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21834), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21835)).setId(21836), ISeq(List()).setId(21868)).setId(21837), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21838), IApp(Id("""__x4__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""lval"""))))).setId(21841), ILet(Id("""r"""), ERef(RefId(Id("""__x4__""")))).setId(21842), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""r""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(21844), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21845))).setId(21875), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(21847), IReturn(ERef(RefId(Id("""__x6__""")))).setId(21848))).setId(21878)).setId(21850))).setId(21880))
  val instToStepMap: Map[Int, Int] = HashMap(21839 -> 3, 21825 -> 5, 21820 -> 0, 21838 -> 3, 21851 -> 6, 21827 -> 1, 21837 -> 3, 21842 -> 4, 21831 -> 2, 21849 -> 6, 21844 -> 6, 21833 -> 3, 21848 -> 6, 21841 -> 4, 21826 -> 1, 21845 -> 6, 21819 -> 0, 21830 -> 2, 21818 -> 0, 21846 -> 6, 21843 -> 4, 21828 -> 1, 21821 -> 1, 21850 -> 6, 21847 -> 6, 21832 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21820, 21819, 21818), 5 -> HashSet(21825), 1 -> HashSet(21826, 21827, 21828, 21821), 6 -> HashSet(21848, 21851, 21845, 21846, 21850, 21847, 21849, 21844), 2 -> HashSet(21830, 21831, 21832), 3 -> HashSet(21839, 21833, 21838, 21837), 4 -> HashSet(21841, 21842, 21843))
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
