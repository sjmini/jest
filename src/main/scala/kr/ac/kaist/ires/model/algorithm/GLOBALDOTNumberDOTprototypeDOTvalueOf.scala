package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumberDOTprototypeDOTvalueOf {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Number.prototype.valueOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(70066), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(70067), IReturn(ERef(RefId(Id("""__x0__""")))).setId(70068)).setId(70069), ISeq(List()).setId(70080)).setId(70071), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(70072), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70073))).setId(70084))
  val instToStepMap: Map[Int, Int] = HashMap(70072 -> 0, 70071 -> 0, 70073 -> 0, 70066 -> 0, 70074 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(70072, 70071, 70073, 70066, 70074))
  /* Beautified form:
  "GLOBAL.Number.prototype.valueOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisNumberValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
