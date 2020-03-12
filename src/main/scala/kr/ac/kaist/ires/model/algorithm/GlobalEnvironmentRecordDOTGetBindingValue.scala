package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTGetBindingValue {
  val length: Int = 2
  val func: Func = Func("""GlobalEnvironmentRecord.GetBindingValue""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48289), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48291), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48293), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""S"""))))).setId(48294), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(48295), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48296))).setId(48319), ISeq(List()).setId(48320)).setId(48300), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48302), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""S"""))))).setId(48304), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(48305), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48306)).setId(48307), ISeq(List()).setId(48327)).setId(48308), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(48309), IReturn(ERef(RefId(Id("""__x4__""")))).setId(48310))).setId(48331))
  val instToStepMap: Map[Int, Int] = HashMap(48292 -> 1, 48302 -> 6, 48297 -> 4, 48311 -> 7, 48308 -> 7, 48301 -> 5, 48293 -> 5, 48289 -> 0, 48295 -> 4, 48300 -> 5, 48304 -> 7, 48290 -> 0, 48303 -> 6, 48291 -> 1, 48296 -> 4, 48298 -> 4, 48310 -> 7, 48309 -> 7, 48294 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48289, 48290), 5 -> HashSet(48301, 48293, 48300), 1 -> HashSet(48292, 48291), 6 -> HashSet(48302, 48303), 7 -> HashSet(48311, 48308, 48309, 48304, 48310), 4 -> HashSet(48297, 48295, 48294, 48296, 48298))
  /* Beautified form:
  "GlobalEnvironmentRecord.GetBindingValue" (this, N, S) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["GetBindingValue"] DclRec N S)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    app __x3__ = (ObjRec["GetBindingValue"] ObjRec N S)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
