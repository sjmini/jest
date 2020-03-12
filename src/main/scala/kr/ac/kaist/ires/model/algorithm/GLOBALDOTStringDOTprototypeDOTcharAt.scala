package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTcharAt {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.charAt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(70726), ILet(Id("""pos"""), ERef(RefId(Id("""__x0__""")))).setId(70727), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(70729), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(70730), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70731)).setId(70732), ISeq(List()).setId(70768)).setId(70734), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(70735), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(70737), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(70738), IReturn(ERef(RefId(Id("""__x2__""")))).setId(70739)).setId(70740), ISeq(List()).setId(70775)).setId(70741), ILet(Id("""S"""), ERef(RefId(Id("""__x2__""")))).setId(70742), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""pos"""))))).setId(70744), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(70745), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70746)).setId(70747), ISeq(List()).setId(70782)).setId(70748), ILet(Id("""position"""), ERef(RefId(Id("""__x3__""")))).setId(70749), ILet(Id("""size"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(70751), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""position"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""size""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))).setId(70753), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70754))).setId(70788), ISeq(List()).setId(70789)).setId(70756), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""S""")), ERef(RefId(Id("""position"""))))))).setId(70758), IReturn(ERef(RefId(Id("""__x5__""")))).setId(70759))).setId(70793))
  val instToStepMap: Map[Int, Int] = HashMap(70755 -> 5, 70751 -> 4, 70736 -> 1, 70727 -> 0, 70754 -> 5, 70743 -> 2, 70758 -> 7, 70742 -> 2, 70750 -> 3, 70757 -> 6, 70737 -> 2, 70756 -> 6, 70741 -> 2, 70735 -> 1, 70729 -> 1, 70728 -> 0, 70760 -> 7, 70759 -> 7, 70744 -> 3, 70726 -> 0, 70752 -> 4, 70753 -> 5, 70734 -> 1, 70749 -> 3, 70748 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(70727, 70726, 70728), 5 -> HashSet(70755, 70754, 70753), 1 -> HashSet(70736, 70734, 70735, 70729), 6 -> HashSet(70757, 70756), 2 -> HashSet(70743, 70742, 70737, 70741), 7 -> HashSet(70759, 70758, 70760), 3 -> HashSet(70744, 70750, 70749, 70748), 4 -> HashSet(70751, 70752))
  /* Beautified form:
  "GLOBAL.String.prototype.charAt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let pos = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    app __x3__ = (ToInteger pos)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let position = __x3__
    let size = S["length"]
    if (|| (< position 0i) (! (< position size))) {
      app __x4__ = (WrapCompletion "")
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion S[position])
    return __x5__
  }
  */
}
