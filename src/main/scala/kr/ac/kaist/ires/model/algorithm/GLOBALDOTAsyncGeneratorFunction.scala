package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorFunction {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.AsyncGeneratorFunction""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(88672), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(88674), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateDynamicFunction"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""NewTarget"""))), EStr("""async generator"""), ERef(RefId(Id("""args"""))))).setId(88676), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(88677), IReturn(ERef(RefId(Id("""__x0__""")))).setId(88678)).setId(88679), ISeq(List()).setId(88692)).setId(88681), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(88682), IReturn(ERef(RefId(Id("""__x1__""")))).setId(88683))).setId(88696))
  val instToStepMap: Map[Int, Int] = HashMap(88682 -> 2, 88673 -> 0, 88672 -> 0, 88674 -> 1, 88675 -> 1, 88681 -> 2, 88684 -> 2, 88676 -> 2, 88683 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(88673, 88672), 1 -> HashSet(88674, 88675), 2 -> HashSet(88682, 88681, 88684, 88676, 88683))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorFunction" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget "async generator" args)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
