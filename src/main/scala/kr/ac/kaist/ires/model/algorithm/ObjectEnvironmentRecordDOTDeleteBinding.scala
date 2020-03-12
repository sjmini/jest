package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""ObjectEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47749), ILet(Id("""bindings"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindingObject""")))).setId(47751), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""bindings""")), EStr("""Delete"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""N"""))))).setId(47753), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(47754), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47755)).setId(47756), ISeq(List()).setId(47769)).setId(47758), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(47759), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47760))).setId(47773))
  val instToStepMap: Map[Int, Int] = HashMap(47760 -> 2, 47752 -> 1, 47759 -> 2, 47749 -> 0, 47753 -> 2, 47750 -> 0, 47761 -> 2, 47758 -> 2, 47751 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47749, 47750), 1 -> HashSet(47752, 47751), 2 -> HashSet(47760, 47759, 47758, 47753, 47761))
  /* Beautified form:
  "ObjectEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (bindings["Delete"] bindings N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
