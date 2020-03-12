package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclaration1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclaration1Evaluation0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(27727), ILet(Id("""rhs"""), ERef(RefId(Id("""__x0__""")))).setId(27728), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rhs"""))))).setId(27730), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(27731), IReturn(ERef(RefId(Id("""__x1__""")))).setId(27732)).setId(27733), ISeq(List()).setId(27750)).setId(27735), ILet(Id("""rval"""), ERef(RefId(Id("""__x1__""")))).setId(27736), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")).setId(27738), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""rval"""))), EUndef)).setId(27739), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(27740), IReturn(ERef(RefId(Id("""__x4__""")))).setId(27741))).setId(27757))
  val instToStepMap: Map[Int, Int] = HashMap(27740 -> 2, 27741 -> 2, 27730 -> 1, 27742 -> 2, 27727 -> 0, 27729 -> 0, 27739 -> 2, 27728 -> 0, 27737 -> 1, 27736 -> 1, 27735 -> 1, 27738 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27727, 27729, 27728), 1 -> HashSet(27730, 27735, 27737, 27736), 2 -> HashSet(27740, 27741, 27738, 27742, 27739))
  /* Beautified form:
  "VariableDeclaration1Evaluation0" (this, BindingPattern, Initializer) => {
    access __x0__ = (Initializer "Evaluation")
    let rhs = __x0__
    app __x1__ = (GetValue rhs)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let rval = __x1__
    access __x2__ = (BindingPattern "BindingInitialization")
    app __x3__ = (__x2__ rval undefined)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
