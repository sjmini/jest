package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayAssignmentPattern0DestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArrayAssignmentPattern0DestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))).setId(23650), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23651), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23652)).setId(23653), ISeq(List()).setId(23672)).setId(23655), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(23656), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(23658), IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""__x1__"""))))).setId(23659), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(23660), IReturn(ERef(RefId(Id("""__x2__""")))).setId(23661)).setId(23662), ISeq(List()).setId(23680)).setId(23663), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(23664), IReturn(ERef(RefId(Id("""__x3__""")))).setId(23665))).setId(23684))
  val instToStepMap: Map[Int, Int] = HashMap(23650 -> 0, 23665 -> 1, 23656 -> 0, 23655 -> 0, 23659 -> 1, 23666 -> 1, 23657 -> 0, 23663 -> 1, 23658 -> 1, 23664 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(23650, 23656, 23657, 23655), 1 -> HashSet(23665, 23663, 23659, 23666, 23658, 23664))
  /* Beautified form:
  "ArrayAssignmentPattern0DestructuringAssignmentEvaluation0" (this, value) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (IteratorClose iteratorRecord __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
