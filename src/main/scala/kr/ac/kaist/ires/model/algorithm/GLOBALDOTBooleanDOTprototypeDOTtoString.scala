package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTBooleanDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Boolean.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisBooleanValue"""))), List(ERef(RefId(Id("""this"""))))).setId(67495), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(67496), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67497)).setId(67498), ISeq(List()).setId(67516)).setId(67500), ILet(Id("""b"""), ERef(RefId(Id("""__x0__""")))).setId(67501), IIf(EBOp(OEq, ERef(RefId(Id("""b"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""true"""))).setId(67503), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67504))).setId(67521), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""false"""))).setId(67506), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67507))).setId(67524)).setId(67509))).setId(67526))
  val instToStepMap: Map[Int, Int] = HashMap(67506 -> 1, 67505 -> 1, 67504 -> 1, 67495 -> 0, 67510 -> 1, 67502 -> 0, 67509 -> 1, 67503 -> 1, 67507 -> 1, 67508 -> 1, 67500 -> 0, 67501 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(67495, 67502, 67500, 67501), 1 -> HashSet(67506, 67505, 67504, 67510, 67509, 67503, 67507, 67508))
  /* Beautified form:
  "GLOBAL.Boolean.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisBooleanValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let b = __x0__
    if (= b true) {
      app __x1__ = (WrapCompletion "true")
      return __x1__
    } else {
      app __x2__ = (WrapCompletion "false")
      return __x2__
    }
  }
  */
}
