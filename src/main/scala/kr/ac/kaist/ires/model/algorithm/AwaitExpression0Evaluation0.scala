package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AwaitExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AwaitExpression0Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(44067), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(44068), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(44070), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(44071), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44072)).setId(44073), ISeq(List()).setId(44093)).setId(44075), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(44076), IApp(Id("""__x2__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))).setId(44078), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(44079), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44080)).setId(44081), ISeq(List()).setId(44100)).setId(44082), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(44083), IReturn(ERef(RefId(Id("""__x3__""")))).setId(44084))).setId(44104))
  val instToStepMap: Map[Int, Int] = HashMap(44083 -> 2, 44068 -> 0, 44067 -> 0, 44076 -> 1, 44077 -> 1, 44070 -> 1, 44085 -> 2, 44078 -> 2, 44084 -> 2, 44069 -> 0, 44075 -> 1, 44082 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44068, 44067, 44069), 1 -> HashSet(44075, 44076, 44077, 44070), 2 -> HashSet(44083, 44082, 44085, 44078, 44084))
  /* Beautified form:
  "AwaitExpression0Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let value = __x1__
    app __x2__ = (Await value)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
