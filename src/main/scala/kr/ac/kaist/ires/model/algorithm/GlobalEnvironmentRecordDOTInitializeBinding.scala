package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTInitializeBinding {
  val length: Int = 2
  val func: Func = Func("""GlobalEnvironmentRecord.InitializeBinding""", List(Id("""this"""), Id("""N"""), Id("""V""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48165), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48167), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48169), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))))).setId(48170), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(48171), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48172))).setId(48195), ISeq(List()).setId(48196)).setId(48176), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48178), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))))).setId(48180), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(48181), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48182)).setId(48183), ISeq(List()).setId(48203)).setId(48184), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(48185), IReturn(ERef(RefId(Id("""__x4__""")))).setId(48186))).setId(48207))
  val instToStepMap: Map[Int, Int] = HashMap(48178 -> 7, 48170 -> 4, 48185 -> 8, 48175 -> 6, 48177 -> 5, 48166 -> 0, 48176 -> 5, 48180 -> 8, 48184 -> 8, 48187 -> 8, 48172 -> 4, 48165 -> 0, 48179 -> 7, 48169 -> 5, 48167 -> 1, 48174 -> 4, 48171 -> 4, 48186 -> 8, 48173 -> 4, 48168 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48166, 48165), 5 -> HashSet(48177, 48176, 48169), 1 -> HashSet(48167, 48168), 6 -> HashSet(48175), 7 -> HashSet(48178, 48179), 8 -> HashSet(48185, 48186, 48180, 48184, 48187), 4 -> HashSet(48174, 48170, 48171, 48172, 48173))
  /* Beautified form:
  "GlobalEnvironmentRecord.InitializeBinding" (this, N, V) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["InitializeBinding"] DclRec N V)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    app __x3__ = (ObjRec["InitializeBinding"] ObjRec N V)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
