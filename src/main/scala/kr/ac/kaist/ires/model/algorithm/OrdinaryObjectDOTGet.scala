package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""OrdinaryObject.Get""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(50333), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50334), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50335)).setId(50336), ISeq(List()).setId(50347)).setId(50338), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(50339), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50340))).setId(50351))
  val instToStepMap: Map[Int, Int] = HashMap(50341 -> 0, 50340 -> 0, 50339 -> 0, 50333 -> 0, 50338 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(50341, 50340, 50339, 50333, 50338))
  /* Beautified form:
  "OrdinaryObject.Get" (O, P, Receiver) => {
    app __x0__ = (OrdinaryGet O P Receiver)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
