package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HasProperty {
  val length: Int = 2
  val func: Func = Func("""HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(5360), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5361), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5362)).setId(5363), ISeq(List()).setId(5373)).setId(5364), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(5365), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5366))).setId(5377))
  val instToStepMap: Map[Int, Int] = HashMap(5365 -> 2, 5360 -> 2, 5366 -> 2, 5359 -> 1, 5367 -> 2, 5364 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(5359), 1 -> HashSet(5359), 2 -> HashSet(5365, 5360, 5366, 5367, 5364))
  /* Beautified form:
  "HasProperty" (O, P) => {
    app __x0__ = (O["HasProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
