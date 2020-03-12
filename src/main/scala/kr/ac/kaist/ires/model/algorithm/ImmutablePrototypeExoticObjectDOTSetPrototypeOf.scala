package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ImmutablePrototypeExoticObjectDOTSetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""ImmutablePrototypeExoticObject.SetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""SetImmutablePrototype"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""V"""))))).setId(58258), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(58259), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58260)).setId(58261), ISeq(List()).setId(58272)).setId(58263), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(58264), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58265))).setId(58276))
  val instToStepMap: Map[Int, Int] = HashMap(58264 -> 0, 58265 -> 0, 58258 -> 0, 58263 -> 0, 58266 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(58264, 58265, 58258, 58263, 58266))
  /* Beautified form:
  "ImmutablePrototypeExoticObject.SetPrototypeOf" (O, V) => {
    app __x0__ = (SetImmutablePrototype O V)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
