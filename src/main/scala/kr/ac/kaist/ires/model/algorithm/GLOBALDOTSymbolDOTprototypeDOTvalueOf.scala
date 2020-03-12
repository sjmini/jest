package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSymbolDOTprototypeDOTvalueOf {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Symbol.prototype.valueOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisSymbolValue"""))), List(ERef(RefId(Id("""this"""))))).setId(67869), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(67870), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67871)).setId(67872), ISeq(List()).setId(67883)).setId(67874), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(67875), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67876))).setId(67887))
  val instToStepMap: Map[Int, Int] = HashMap(67869 -> 0, 67877 -> 0, 67874 -> 0, 67876 -> 0, 67875 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(67869, 67877, 67874, 67876, 67875))
  /* Beautified form:
  "GLOBAL.Symbol.prototype.valueOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisSymbolValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
