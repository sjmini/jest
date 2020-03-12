package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression1Evaluation0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""EqualityExpression"""))), EStr("""Evaluation""")).setId(21562), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21563), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21565), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21566), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21567)).setId(21568), ISeq(List()).setId(21596)).setId(21570), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21571), IAccess(Id("""__x2__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21574), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21575), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21577), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21578), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21579)).setId(21580), ISeq(List()).setId(21605)).setId(21581), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21582), IApp(Id("""__x4__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""lval"""))))).setId(21585), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(21586), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21587))).setId(21611))
  val instToStepMap: Map[Int, Int] = HashMap(21563 -> 0, 21588 -> 4, 21582 -> 3, 21564 -> 0, 21576 -> 2, 21577 -> 3, 21583 -> 3, 21575 -> 2, 21586 -> 4, 21562 -> 0, 21574 -> 2, 21581 -> 3, 21585 -> 4, 21570 -> 1, 21587 -> 4, 21572 -> 1, 21565 -> 1, 21571 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21563, 21564, 21562), 1 -> HashSet(21570, 21572, 21565, 21571), 2 -> HashSet(21576, 21575, 21574), 3 -> HashSet(21582, 21577, 21583, 21581), 4 -> HashSet(21585, 21588, 21587, 21586))
  /* Beautified form:
  "EqualityExpression1Evaluation0" (this, EqualityExpression, RelationalExpression) => {
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
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
