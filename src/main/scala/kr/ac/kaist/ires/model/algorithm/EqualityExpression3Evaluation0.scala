package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression3Evaluation0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""EqualityExpression"""))), EStr("""Evaluation""")).setId(21745), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21746), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21748), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21749), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21750)).setId(21751), ISeq(List()).setId(21779)).setId(21753), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21754), IAccess(Id("""__x2__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21757), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21758), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21760), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21761), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21762)).setId(21763), ISeq(List()).setId(21788)).setId(21764), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21765), IApp(Id("""__x4__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""lval"""))))).setId(21768), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(21769), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21770))).setId(21794))
  val instToStepMap: Map[Int, Int] = HashMap(21748 -> 1, 21766 -> 3, 21755 -> 1, 21747 -> 0, 21769 -> 4, 21765 -> 3, 21771 -> 4, 21759 -> 2, 21770 -> 4, 21768 -> 4, 21746 -> 0, 21760 -> 3, 21764 -> 3, 21753 -> 1, 21758 -> 2, 21745 -> 0, 21754 -> 1, 21757 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21747, 21746, 21745), 1 -> HashSet(21748, 21755, 21753, 21754), 2 -> HashSet(21759, 21758, 21757), 3 -> HashSet(21766, 21765, 21760, 21764), 4 -> HashSet(21769, 21771, 21770, 21768))
  /* Beautified form:
  "EqualityExpression3Evaluation0" (this, EqualityExpression, RelationalExpression) => {
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
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
