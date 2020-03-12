package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""OrdinaryObject.DefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(49516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49517), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49518)).setId(49519), ISeq(List()).setId(49530)).setId(49521), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49522), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49523))).setId(49534))
  val instToStepMap: Map[Int, Int] = HashMap(49523 -> 0, 49524 -> 0, 49521 -> 0, 49516 -> 0, 49522 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49523, 49524, 49521, 49516, 49522))
  /* Beautified form:
  "OrdinaryObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (OrdinaryDefineOwnProperty O P Desc)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
