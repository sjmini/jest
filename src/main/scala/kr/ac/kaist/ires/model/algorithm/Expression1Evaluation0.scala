package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Expression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Expression1Evaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(25583), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(25584), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(25586), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(25587), IReturn(ERef(RefId(Id("""__x1__""")))).setId(25588)).setId(25589), ISeq(List()).setId(25613)).setId(25591), IExpr(ERef(RefId(Id("""__x1__""")))).setId(25592), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(25595), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(25596), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(25598), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(25599), IReturn(ERef(RefId(Id("""__x3__""")))).setId(25600)).setId(25601), ISeq(List()).setId(25622)).setId(25602), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(25603), IReturn(ERef(RefId(Id("""__x4__""")))).setId(25604))).setId(25626))
  val instToStepMap: Map[Int, Int] = HashMap(25595 -> 2, 25584 -> 0, 25603 -> 3, 25604 -> 3, 25583 -> 0, 25598 -> 3, 25605 -> 3, 25597 -> 2, 25592 -> 1, 25596 -> 2, 25602 -> 3, 25586 -> 1, 25593 -> 1, 25585 -> 0, 25591 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25585, 25584, 25583), 1 -> HashSet(25591, 25592, 25586, 25593), 2 -> HashSet(25595, 25597, 25596), 3 -> HashSet(25603, 25604, 25598, 25605, 25602))
  /* Beautified form:
  "Expression1Evaluation0" (this, Expression, AssignmentExpression) => {
    access __x0__ = (Expression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (AssignmentExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
