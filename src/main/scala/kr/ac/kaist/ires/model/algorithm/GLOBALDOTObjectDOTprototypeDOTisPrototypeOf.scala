package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTprototypeDOTisPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.prototype.isPrototypeOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65644), ILet(Id("""V"""), ERef(RefId(Id("""__x0__""")))).setId(65645), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))).setId(65647), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(65648), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65649))).setId(65687), ISeq(List()).setId(65688)).setId(65652), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(65654), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65655), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65656)).setId(65657), ISeq(List()).setId(65694)).setId(65658), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(65659), IWhile(EBool(true), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""V""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""V"""))))).setId(65661), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(65662), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65663)).setId(65664), ISeq(List()).setId(65701)).setId(65665), IAssign(RefId(Id("""V""")), ERef(RefId(Id("""__x4__""")))).setId(65666), IIf(EBOp(OEq, ERef(RefId(Id("""V"""))), ENull), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(65668), IReturn(ERef(RefId(Id("""__x5__""")))).setId(65669))).setId(65706), ISeq(List()).setId(65707)).setId(65671), IApp(Id("""__x6__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""V"""))))).setId(65673), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(65674), IReturn(ERef(RefId(Id("""__x7__""")))).setId(65675))).setId(65712), ISeq(List()).setId(65713)).setId(65677))).setId(65715)).setId(65680))).setId(65717))
  val instToStepMap: Map[Int, Int] = HashMap(65678 -> 9, 65653 -> 2, 65674 -> 9, 65649 -> 1, 65661 -> 9, 65658 -> 3, 65648 -> 1, 65669 -> 7, 65676 -> 9, 65680 -> 9, 65675 -> 9, 65659 -> 3, 65671 -> 9, 65672 -> 9, 65665 -> 9, 65654 -> 3, 65677 -> 9, 65650 -> 1, 65673 -> 9, 65666 -> 9, 65647 -> 2, 65644 -> 0, 65670 -> 7, 65667 -> 9, 65660 -> 3, 65646 -> 0, 65679 -> 9, 65652 -> 2, 65668 -> 7, 65645 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(65644, 65646, 65645), 1 -> HashSet(65649, 65648, 65650), 6 -> HashSet(65661, 65665, 65666, 65667), 9 -> HashSet(65678, 65674, 65661, 65677, 65673, 65666, 65676, 65680, 65667, 65675, 65679, 65671, 65672, 65665), 2 -> HashSet(65653, 65647, 65652), 7 -> HashSet(65669, 65670, 65668), 3 -> HashSet(65658, 65654, 65660, 65659), 8 -> HashSet(65672, 65671))
  /* Beautified form:
  "GLOBAL.Object.prototype.isPrototypeOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    app __x1__ = (Type V)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (ToObject this)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    while true {
      app __x4__ = (V["GetPrototypeOf"] V)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      V = __x4__
      if (= V null) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      app __x6__ = (SameValue O V)
      if (= __x6__ true) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
    }
  }
  */
}
