package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTSetMutableBinding {
  val length: Int = 3
  val func: Func = Func("""GlobalEnvironmentRecord.SetMutableBinding""", List(Id("""this"""), Id("""N"""), Id("""V"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48227), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48229), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48231), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""S"""))))).setId(48232), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(48233), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48234))).setId(48257), ISeq(List()).setId(48258)).setId(48238), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48240), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""S"""))))).setId(48242), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(48243), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48244)).setId(48245), ISeq(List()).setId(48265)).setId(48246), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(48247), IReturn(ERef(RefId(Id("""__x4__""")))).setId(48248))).setId(48269))
  val instToStepMap: Map[Int, Int] = HashMap(48228 -> 0, 48240 -> 6, 48236 -> 4, 48249 -> 7, 48239 -> 5, 48242 -> 7, 48235 -> 4, 48238 -> 5, 48233 -> 4, 48232 -> 4, 48247 -> 7, 48229 -> 1, 48248 -> 7, 48241 -> 6, 48230 -> 1, 48234 -> 4, 48227 -> 0, 48246 -> 7, 48231 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48228, 48227), 5 -> HashSet(48238, 48239, 48231), 1 -> HashSet(48229, 48230), 6 -> HashSet(48240, 48241), 7 -> HashSet(48247, 48248, 48249, 48242, 48246), 4 -> HashSet(48233, 48232, 48236, 48234, 48235))
  /* Beautified form:
  "GlobalEnvironmentRecord.SetMutableBinding" (this, N, V, S) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["SetMutableBinding"] DclRec N V S)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    app __x3__ = (ObjRec["SetMutableBinding"] ObjRec N V S)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
