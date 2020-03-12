package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LexicalBinding1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding1Evaluation0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(27382), ILet(Id("""rhs"""), ERef(RefId(Id("""__x0__""")))).setId(27383), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rhs"""))))).setId(27385), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(27386), IReturn(ERef(RefId(Id("""__x1__""")))).setId(27387)).setId(27388), ISeq(List()).setId(27407)).setId(27390), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(27391), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(27393), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")).setId(27395), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""env"""))))).setId(27396), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(27397), IReturn(ERef(RefId(Id("""__x4__""")))).setId(27398))).setId(27415))
  val instToStepMap: Map[Int, Int] = HashMap(27391 -> 1, 27397 -> 3, 27392 -> 1, 27396 -> 3, 27383 -> 0, 27399 -> 3, 27385 -> 1, 27390 -> 1, 27398 -> 3, 27394 -> 2, 27384 -> 0, 27393 -> 2, 27382 -> 0, 27395 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27384, 27383, 27382), 1 -> HashSet(27391, 27392, 27385, 27390), 2 -> HashSet(27393, 27394), 3 -> HashSet(27397, 27396, 27399, 27395, 27398))
  /* Beautified form:
  "LexicalBinding1Evaluation0" (this, BindingPattern, Initializer) => {
    access __x0__ = (Initializer "Evaluation")
    let rhs = __x0__
    app __x1__ = (GetValue rhs)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let value = __x1__
    let env = GLOBAL_context["LexicalEnvironment"]
    access __x2__ = (BindingPattern "BindingInitialization")
    app __x3__ = (__x2__ value env)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
