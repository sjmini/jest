package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSetDOTprototypeDOTvalues {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Set.prototype.values""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(86301), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateSetIterator"""))), List(ERef(RefId(Id("""S"""))), EStr("""value"""))).setId(86303), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(86304), IReturn(ERef(RefId(Id("""__x0__""")))).setId(86305)).setId(86306), ISeq(List()).setId(86318)).setId(86308), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(86309), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86310))).setId(86322))
  val instToStepMap: Map[Int, Int] = HashMap(86301 -> 0, 86302 -> 0, 86311 -> 1, 86303 -> 1, 86310 -> 1, 86309 -> 1, 86308 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(86301, 86302), 1 -> HashSet(86311, 86303, 86310, 86309, 86308))
  /* Beautified form:
  "GLOBAL.Set.prototype.values" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (CreateSetIterator S "value")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
