package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTvalueOf {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.valueOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisStringValue"""))), List(ERef(RefId(Id("""this"""))))).setId(74431), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74432), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74433)).setId(74434), ISeq(List()).setId(74445)).setId(74436), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(74437), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74438))).setId(74449))
  val instToStepMap: Map[Int, Int] = HashMap(74438 -> 0, 74439 -> 0, 74431 -> 0, 74436 -> 0, 74437 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(74438, 74439, 74431, 74436, 74437))
  /* Beautified form:
  "GLOBAL.String.prototype.valueOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisStringValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
