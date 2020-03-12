package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTHasRestrictedGlobalProperty {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasRestrictedGlobalProperty""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48592), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48594), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48596), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""globalObject""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48598), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(48599), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48600)).setId(48601), ISeq(List()).setId(48627)).setId(48603), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x0__""")))).setId(48604), IIf(EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48606), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48607))).setId(48632), ISeq(List()).setId(48633)).setId(48609), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""existingProp""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48611), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48612))).setId(48637), ISeq(List()).setId(48638)).setId(48614), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48616), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48617))).setId(48642))
  val instToStepMap: Map[Int, Int] = HashMap(48604 -> 3, 48597 -> 2, 48610 -> 5, 48614 -> 7, 48607 -> 4, 48617 -> 8, 48609 -> 5, 48596 -> 2, 48618 -> 8, 48616 -> 8, 48592 -> 0, 48612 -> 6, 48595 -> 1, 48606 -> 4, 48611 -> 6, 48593 -> 0, 48594 -> 1, 48613 -> 6, 48608 -> 4, 48605 -> 3, 48598 -> 3, 48603 -> 3, 48615 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48592, 48593), 5 -> HashSet(48610, 48609), 1 -> HashSet(48595, 48594), 6 -> HashSet(48613, 48612, 48611), 2 -> HashSet(48597, 48596), 7 -> HashSet(48614, 48615), 3 -> HashSet(48604, 48605, 48598, 48603), 8 -> HashSet(48617, 48618, 48616), 4 -> HashSet(48607, 48608, 48606))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasRestrictedGlobalProperty" (this, N) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (globalObject["GetOwnProperty"] globalObject N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let existingProp = __x0__
    if (= existingProp undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= existingProp["Configurable"] true) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion true)
    return __x3__
  }
  */
}
