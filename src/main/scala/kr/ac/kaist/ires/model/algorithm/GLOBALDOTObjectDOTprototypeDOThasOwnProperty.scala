package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTprototypeDOThasOwnProperty {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.prototype.hasOwnProperty""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65567), ILet(Id("""V"""), ERef(RefId(Id("""__x0__""")))).setId(65568), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""V"""))))).setId(65570), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(65571), IReturn(ERef(RefId(Id("""__x1__""")))).setId(65572)).setId(65573), ISeq(List()).setId(65600)).setId(65575), ILet(Id("""P"""), ERef(RefId(Id("""__x1__""")))).setId(65576), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(65578), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65579), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65580)).setId(65581), ISeq(List()).setId(65607)).setId(65582), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(65583), IApp(Id("""__x3__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(65585), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65586), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65587)).setId(65588), ISeq(List()).setId(65614)).setId(65589), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(65590), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65591))).setId(65618))
  val instToStepMap: Map[Int, Int] = HashMap(65585 -> 3, 65589 -> 3, 65577 -> 1, 65576 -> 1, 65569 -> 0, 65584 -> 2, 65590 -> 3, 65583 -> 2, 65591 -> 3, 65582 -> 2, 65567 -> 0, 65578 -> 2, 65568 -> 0, 65570 -> 1, 65575 -> 1, 65592 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(65569, 65568, 65567), 1 -> HashSet(65577, 65576, 65570, 65575), 2 -> HashSet(65584, 65583, 65582, 65578), 3 -> HashSet(65585, 65589, 65590, 65591, 65592))
  /* Beautified form:
  "GLOBAL.Object.prototype.hasOwnProperty" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    app __x1__ = (ToPropertyKey V)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let P = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (HasOwnProperty O P)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
