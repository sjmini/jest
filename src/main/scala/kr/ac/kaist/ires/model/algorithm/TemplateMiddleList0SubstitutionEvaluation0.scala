package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateMiddleList0SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList0SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateMiddle"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(15654), ILet(Id("""subRef"""), ERef(RefId(Id("""__x0__""")))).setId(15655), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""subRef"""))))).setId(15657), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(15658), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15659)).setId(15660), ISeq(List()).setId(15675)).setId(15662), ILet(Id("""sub"""), ERef(RefId(Id("""__x1__""")))).setId(15663), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""sub"""))))))).setId(15665), IReturn(ERef(RefId(Id("""__x2__""")))).setId(15666))).setId(15680))
  val instToStepMap: Map[Int, Int] = HashMap(15666 -> 2, 15656 -> 0, 15663 -> 1, 15655 -> 0, 15665 -> 2, 15664 -> 1, 15654 -> 0, 15657 -> 1, 15667 -> 2, 15662 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15656, 15655, 15654), 1 -> HashSet(15663, 15664, 15657, 15662), 2 -> HashSet(15666, 15665, 15667))
  /* Beautified form:
  "TemplateMiddleList0SubstitutionEvaluation0" (this, TemplateMiddle, Expression) => {
    access __x0__ = (Expression "Evaluation")
    let subRef = __x0__
    app __x1__ = (GetValue subRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let sub = __x1__
    app __x2__ = (WrapCompletion (new [sub]))
    return __x2__
  }
  */
}
