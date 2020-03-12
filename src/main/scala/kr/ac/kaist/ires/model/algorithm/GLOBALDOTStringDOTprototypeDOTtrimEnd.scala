package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTtrimEnd {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.trimEnd""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(74367), IApp(Id("""__x0__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""S"""))), EStr("""end"""))).setId(74369), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74370), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74371)).setId(74372), ISeq(List()).setId(74384)).setId(74374), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(74375), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74376))).setId(74388))
  val instToStepMap: Map[Int, Int] = HashMap(74377 -> 1, 74376 -> 1, 74367 -> 0, 74375 -> 1, 74368 -> 0, 74374 -> 1, 74369 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(74367, 74368), 1 -> HashSet(74377, 74376, 74375, 74374, 74369))
  /* Beautified form:
  "GLOBAL.String.prototype.trimEnd" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (TrimString S "end")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
