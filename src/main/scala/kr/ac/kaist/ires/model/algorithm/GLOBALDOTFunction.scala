package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTFunction {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.Function""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(66117), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(66119), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateDynamicFunction"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""NewTarget"""))), EStr("""normal"""), ERef(RefId(Id("""args"""))))).setId(66121), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(66122), IReturn(ERef(RefId(Id("""__x0__""")))).setId(66123)).setId(66124), ISeq(List()).setId(66137)).setId(66126), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(66127), IReturn(ERef(RefId(Id("""__x1__""")))).setId(66128))).setId(66141))
  val instToStepMap: Map[Int, Int] = HashMap(66128 -> 2, 66117 -> 0, 66119 -> 1, 66121 -> 2, 66120 -> 1, 66118 -> 0, 66129 -> 2, 66126 -> 2, 66127 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(66117, 66118), 1 -> HashSet(66119, 66120), 2 -> HashSet(66128, 66121, 66129, 66126, 66127))
  /* Beautified form:
  "GLOBAL.Function" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget "normal" args)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
