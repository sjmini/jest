package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTHasBinding {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48027), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48029), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48031), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48032), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48033))).setId(48054), ISeq(List()).setId(48055)).setId(48036), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48038), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))))).setId(48040), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(48041), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48042)).setId(48043), ISeq(List()).setId(48062)).setId(48044), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(48045), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48046))).setId(48066))
  val instToStepMap: Map[Int, Int] = HashMap(48030 -> 1, 48037 -> 3, 48031 -> 3, 48045 -> 5, 48036 -> 3, 48039 -> 4, 48047 -> 5, 48044 -> 5, 48027 -> 0, 48028 -> 0, 48040 -> 5, 48046 -> 5, 48029 -> 1, 48038 -> 4, 48033 -> 2, 48034 -> 2, 48032 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48027, 48028), 5 -> HashSet(48044, 48040, 48045, 48047, 48046), 1 -> HashSet(48030, 48029), 2 -> HashSet(48033, 48034, 48032), 3 -> HashSet(48037, 48031, 48036), 4 -> HashSet(48039, 48038))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    app __x2__ = (ObjRec["HasBinding"] ObjRec N)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
