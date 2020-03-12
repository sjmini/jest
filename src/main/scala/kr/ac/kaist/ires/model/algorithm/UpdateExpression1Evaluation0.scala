package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression1Evaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""Evaluation""")).setId(18696), ILet(Id("""lhs"""), ERef(RefId(Id("""__x0__""")))).setId(18697), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lhs"""))))).setId(18699), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18700), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18701)).setId(18702), ISeq(List()).setId(18731)).setId(18704), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(18705), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18706), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18707)).setId(18708), ISeq(List()).setId(18737)).setId(18709), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(18710), ILet(Id("""newValue"""), EBOp(OPlus, ERef(RefId(Id("""oldValue"""))), ENum(1.0))).setId(18712), IApp(Id("""__x3__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""newValue"""))))).setId(18714), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18715), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18716)).setId(18717), ISeq(List()).setId(18745)).setId(18718), IExpr(ERef(RefId(Id("""__x3__""")))).setId(18719), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""oldValue"""))))).setId(18721), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18722))).setId(18750))
  val instToStepMap: Map[Int, Int] = HashMap(18723 -> 4, 18713 -> 2, 18710 -> 1, 18721 -> 4, 18712 -> 2, 18698 -> 0, 18720 -> 3, 18711 -> 1, 18699 -> 1, 18719 -> 3, 18722 -> 4, 18705 -> 1, 18718 -> 3, 18696 -> 0, 18714 -> 3, 18697 -> 0, 18709 -> 1, 18704 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18696, 18697, 18698), 1 -> HashSet(18710, 18705, 18711, 18699, 18709, 18704), 2 -> HashSet(18713, 18712), 3 -> HashSet(18718, 18714, 18720, 18719), 4 -> HashSet(18723, 18722, 18721))
  /* Beautified form:
  "UpdateExpression1Evaluation0" (this, LeftHandSideExpression) => {
    access __x0__ = (LeftHandSideExpression "Evaluation")
    let lhs = __x0__
    app __x1__ = (GetValue lhs)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumber __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    let newValue = (+ oldValue 1.0)
    app __x3__ = (PutValue lhs newValue)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion oldValue)
    return __x4__
  }
  */
}
