package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression4Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19456), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(19457), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(19459), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19460), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19461)).setId(19462), ISeq(List()).setId(19480)).setId(19464), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(19465), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(19466), IReturn(ERef(RefId(Id("""__x2__""")))).setId(19467)).setId(19468), ISeq(List()).setId(19486)).setId(19469), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(19470), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19471))).setId(19490))
  val instToStepMap: Map[Int, Int] = HashMap(19464 -> 1, 19458 -> 0, 19472 -> 1, 19471 -> 1, 19459 -> 1, 19470 -> 1, 19465 -> 1, 19456 -> 0, 19457 -> 0, 19469 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19458, 19456, 19457), 1 -> HashSet(19464, 19472, 19471, 19459, 19470, 19465, 19469))
  /* Beautified form:
  "UnaryExpression4Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumber __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
