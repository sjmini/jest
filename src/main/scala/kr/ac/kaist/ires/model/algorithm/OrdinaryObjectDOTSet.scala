package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""OrdinaryObject.Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinarySet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))).setId(50516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50517), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50518)).setId(50519), ISeq(List()).setId(50530)).setId(50521), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(50522), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50523))).setId(50534))
  val instToStepMap: Map[Int, Int] = HashMap(50521 -> 0, 50522 -> 0, 50516 -> 0, 50523 -> 0, 50524 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(50521, 50522, 50516, 50523, 50524))
  /* Beautified form:
  "OrdinaryObject.Set" (O, P, V, Receiver) => {
    app __x0__ = (OrdinarySet O P V Receiver)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
