package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ComputedPropertyName0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ComputedPropertyName0Evaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(14760), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x0__""")))).setId(14761), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(14763), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14764), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14765)).setId(14766), ISeq(List()).setId(14786)).setId(14768), ILet(Id("""propName"""), ERef(RefId(Id("""__x1__""")))).setId(14769), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""propName"""))))).setId(14771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14772), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14773)).setId(14774), ISeq(List()).setId(14793)).setId(14775), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(14776), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14777))).setId(14797))
  val instToStepMap: Map[Int, Int] = HashMap(14769 -> 1, 14761 -> 0, 14775 -> 2, 14778 -> 2, 14770 -> 1, 14762 -> 0, 14777 -> 2, 14776 -> 2, 14760 -> 0, 14771 -> 2, 14768 -> 1, 14763 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14761, 14762, 14760), 1 -> HashSet(14769, 14770, 14768, 14763), 2 -> HashSet(14771, 14775, 14778, 14777, 14776))
  /* Beautified form:
  "ComputedPropertyName0Evaluation0" (this, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let exprValue = __x0__
    app __x1__ = (GetValue exprValue)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let propName = __x1__
    app __x2__ = (ToPropertyKey propName)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
