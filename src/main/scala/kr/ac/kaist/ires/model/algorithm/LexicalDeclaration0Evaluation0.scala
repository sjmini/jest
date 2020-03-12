package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LexicalDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LexicalDeclaration0Evaluation0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""BindingList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingList"""))), EStr("""Evaluation""")).setId(27198), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(27199), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(27201), IReturn(ERef(RefId(Id("""next""")))).setId(27202)).setId(27203), ISeq(List()).setId(27218)).setId(27205), IExpr(ERef(RefId(Id("""next""")))).setId(27206), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(27208), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(27209), IReturn(ERef(RefId(Id("""__x2__""")))).setId(27210))).setId(27224))
  val instToStepMap: Map[Int, Int] = HashMap(27205 -> 1, 27199 -> 0, 27209 -> 2, 27208 -> 2, 27200 -> 0, 27210 -> 2, 27207 -> 1, 27211 -> 2, 27198 -> 0, 27206 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27199, 27200, 27198), 1 -> HashSet(27205, 27207, 27206), 2 -> HashSet(27209, 27208, 27210, 27211))
  /* Beautified form:
  "LexicalDeclaration0Evaluation0" (this, LetOrConst, BindingList) => {
    access __x0__ = (BindingList "Evaluation")
    let next = __x0__
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
