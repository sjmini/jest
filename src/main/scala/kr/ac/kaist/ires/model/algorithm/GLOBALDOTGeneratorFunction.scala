package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTGeneratorFunction {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.GeneratorFunction""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(88636), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(88638), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateDynamicFunction"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""NewTarget"""))), EStr("""generator"""), ERef(RefId(Id("""args"""))))).setId(88640), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(88641), IReturn(ERef(RefId(Id("""__x0__""")))).setId(88642)).setId(88643), ISeq(List()).setId(88656)).setId(88645), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(88646), IReturn(ERef(RefId(Id("""__x1__""")))).setId(88647))).setId(88660))
  val instToStepMap: Map[Int, Int] = HashMap(88637 -> 0, 88636 -> 0, 88646 -> 2, 88640 -> 2, 88647 -> 2, 88639 -> 1, 88648 -> 2, 88645 -> 2, 88638 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(88637, 88636), 1 -> HashSet(88639, 88638), 2 -> HashSet(88646, 88640, 88647, 88645, 88648))
  /* Beautified form:
  "GLOBAL.GeneratorFunction" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget "generator" args)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
