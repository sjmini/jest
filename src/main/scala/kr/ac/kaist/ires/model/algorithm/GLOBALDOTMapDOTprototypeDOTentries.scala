package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMapDOTprototypeDOTentries {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Map.prototype.entries""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84617), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateMapIterator"""))), List(ERef(RefId(Id("""M"""))), EStr("""key+value"""))).setId(84619), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(84620), IReturn(ERef(RefId(Id("""__x0__""")))).setId(84621)).setId(84622), ISeq(List()).setId(84634)).setId(84624), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(84625), IReturn(ERef(RefId(Id("""__x1__""")))).setId(84626))).setId(84638))
  val instToStepMap: Map[Int, Int] = HashMap(84625 -> 1, 84619 -> 1, 84618 -> 0, 84627 -> 1, 84624 -> 1, 84626 -> 1, 84617 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(84617, 84618), 1 -> HashSet(84625, 84619, 84626, 84627, 84624))
  /* Beautified form:
  "GLOBAL.Map.prototype.entries" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (CreateMapIterator M "key+value")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
