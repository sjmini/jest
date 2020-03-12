package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisStringValue"""))), List(ERef(RefId(Id("""this"""))))).setId(74233), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74234), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74235)).setId(74236), ISeq(List()).setId(74247)).setId(74238), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(74239), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74240))).setId(74251))
  val instToStepMap: Map[Int, Int] = HashMap(74239 -> 0, 74241 -> 0, 74240 -> 0, 74233 -> 0, 74238 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(74239, 74241, 74240, 74233, 74238))
  /* Beautified form:
  "GLOBAL.String.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisStringValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
