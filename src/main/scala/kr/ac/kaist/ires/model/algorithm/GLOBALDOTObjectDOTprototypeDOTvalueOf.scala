package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTprototypeDOTvalueOf {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Object.prototype.valueOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(66089), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(66090), IReturn(ERef(RefId(Id("""__x0__""")))).setId(66091)).setId(66092), ISeq(List()).setId(66103)).setId(66094), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(66095), IReturn(ERef(RefId(Id("""__x1__""")))).setId(66096))).setId(66107))
  val instToStepMap: Map[Int, Int] = HashMap(66096 -> 0, 66089 -> 0, 66094 -> 0, 66097 -> 0, 66095 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(66096, 66089, 66094, 66097, 66095))
  /* Beautified form:
  "GLOBAL.Object.prototype.valueOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
