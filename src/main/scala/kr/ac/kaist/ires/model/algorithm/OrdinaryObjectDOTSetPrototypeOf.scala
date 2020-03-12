package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTSetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""OrdinaryObject.SetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinarySetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""V"""))))).setId(49209), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49210), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49211)).setId(49212), ISeq(List()).setId(49223)).setId(49214), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49215), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49216))).setId(49227))
  val instToStepMap: Map[Int, Int] = HashMap(49215 -> 0, 49217 -> 0, 49216 -> 0, 49209 -> 0, 49214 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49215, 49217, 49216, 49209, 49214))
  /* Beautified form:
  "OrdinaryObject.SetPrototypeOf" (O, V) => {
    app __x0__ = (OrdinarySetPrototypeOf O V)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
