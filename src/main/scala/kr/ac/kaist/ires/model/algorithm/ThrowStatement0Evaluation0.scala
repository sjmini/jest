package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ThrowStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ThrowStatement0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(36619), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(36620), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(36622), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(36623), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36624)).setId(36625), ISeq(List()).setId(36641)).setId(36627), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x1__""")))).setId(36628), IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(36630), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(36631), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36632))).setId(36647))
  val instToStepMap: Map[Int, Int] = HashMap(36622 -> 1, 36633 -> 2, 36628 -> 1, 36627 -> 1, 36632 -> 2, 36621 -> 0, 36629 -> 1, 36630 -> 2, 36620 -> 0, 36619 -> 0, 36631 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36621, 36620, 36619), 1 -> HashSet(36622, 36628, 36627, 36629), 2 -> HashSet(36633, 36632, 36630, 36631))
  /* Beautified form:
  "ThrowStatement0Evaluation0" (this, Expression) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let exprValue = __x1__
    app __x2__ = (ThrowCompletion exprValue)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
