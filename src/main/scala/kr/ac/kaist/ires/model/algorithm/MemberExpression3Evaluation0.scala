package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression3Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""TemplateLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Evaluation""")).setId(18507), ILet(Id("""tagRef"""), ERef(RefId(Id("""__x0__""")))).setId(18508), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""tagRef"""))))).setId(18510), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18511), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18512)).setId(18513), ISeq(List()).setId(18538)).setId(18515), ILet(Id("""tagFunc"""), ERef(RefId(Id("""__x1__""")))).setId(18516), ILet(Id("""thisCall"""), ERef(RefId(Id("""this""")))).setId(18518), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInTailPosition"""))), List(ERef(RefId(Id("""thisCall"""))))).setId(18520), ILet(Id("""tailCall"""), ERef(RefId(Id("""__x2__""")))).setId(18521), IApp(Id("""__x3__"""), ERef(RefId(Id("""EvaluateCall"""))), List(ERef(RefId(Id("""tagFunc"""))), ERef(RefId(Id("""tagRef"""))), ERef(RefId(Id("""TemplateLiteral"""))), ERef(RefId(Id("""tailCall"""))))).setId(18523), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18524), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18525)).setId(18526), ISeq(List()).setId(18548)).setId(18527), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(18528), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18529))).setId(18552))
  val instToStepMap: Map[Int, Int] = HashMap(18517 -> 1, 18528 -> 4, 18507 -> 0, 18520 -> 3, 18530 -> 4, 18521 -> 3, 18508 -> 0, 18529 -> 4, 18519 -> 2, 18516 -> 1, 18522 -> 3, 18509 -> 0, 18527 -> 4, 18518 -> 2, 18515 -> 1, 18510 -> 1, 18523 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18507, 18508, 18509), 1 -> HashSet(18517, 18516, 18515, 18510), 2 -> HashSet(18519, 18518), 3 -> HashSet(18520, 18521, 18522), 4 -> HashSet(18528, 18530, 18529, 18527, 18523))
  /* Beautified form:
  "MemberExpression3Evaluation0" (this, MemberExpression, TemplateLiteral) => {
    access __x0__ = (MemberExpression "Evaluation")
    let tagRef = __x0__
    app __x1__ = (GetValue tagRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let tagFunc = __x1__
    let thisCall = this
    app __x2__ = (IsInTailPosition thisCall)
    let tailCall = __x2__
    app __x3__ = (EvaluateCall tagFunc tagRef TemplateLiteral tailCall)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
