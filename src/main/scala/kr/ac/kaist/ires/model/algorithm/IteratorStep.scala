package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IteratorStep {
  val length: Int = 1
  val func: Func = Func("""IteratorStep""", List(Id("""iteratorRecord""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorNext"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(7411), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7412), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7413)).setId(7414), ISeq(List()).setId(7439)).setId(7416), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(7417), IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""result"""))))).setId(7419), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7420), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7421)).setId(7422), ISeq(List()).setId(7446)).setId(7423), ILet(Id("""done"""), ERef(RefId(Id("""__x1__""")))).setId(7424), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(7426), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7427))).setId(7451), ISeq(List()).setId(7452)).setId(7429), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(7431), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7432))).setId(7456))
  val instToStepMap: Map[Int, Int] = HashMap(7427 -> 2, 7431 -> 4, 7418 -> 0, 7423 -> 1, 7428 -> 2, 7432 -> 4, 7417 -> 0, 7411 -> 0, 7425 -> 1, 7429 -> 3, 7426 -> 2, 7416 -> 0, 7419 -> 1, 7433 -> 4, 7430 -> 3, 7424 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(7418, 7417, 7411, 7416), 1 -> HashSet(7423, 7425, 7419, 7424), 2 -> HashSet(7427, 7428, 7426), 3 -> HashSet(7429, 7430), 4 -> HashSet(7431, 7432, 7433))
  /* Beautified form:
  "IteratorStep" (iteratorRecord) => {
    app __x0__ = (IteratorNext iteratorRecord)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let result = __x0__
    app __x1__ = (IteratorComplete result)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let done = __x1__
    if (= done true) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion result)
    return __x3__
  }
  */
}
