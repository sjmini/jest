package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression2Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19325), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(19326), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(19328), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19329), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19330)).setId(19331), ISeq(List()).setId(19346)).setId(19333), IExpr(ERef(RefId(Id("""__x1__""")))).setId(19334), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(19336), IReturn(ERef(RefId(Id("""__x2__""")))).setId(19337))).setId(19351))
  val instToStepMap: Map[Int, Int] = HashMap(19326 -> 0, 19327 -> 0, 19338 -> 2, 19334 -> 1, 19337 -> 2, 19333 -> 1, 19335 -> 1, 19328 -> 1, 19325 -> 0, 19336 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19326, 19327, 19325), 1 -> HashSet(19334, 19333, 19335, 19328), 2 -> HashSet(19338, 19337, 19336))
  /* Beautified form:
  "UnaryExpression2Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion undefined)
    return __x2__
  }
  */
}
