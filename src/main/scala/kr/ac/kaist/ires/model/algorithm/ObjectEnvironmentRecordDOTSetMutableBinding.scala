package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectEnvironmentRecordDOTSetMutableBinding {
  val length: Int = 3
  val func: Func = Func("""ObjectEnvironmentRecord.SetMutableBinding""", List(Id("""this"""), Id("""N"""), Id("""V"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47627), ILet(Id("""bindings"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindingObject""")))).setId(47629), IApp(Id("""__x0__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""S"""))))).setId(47631), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(47632), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47633)).setId(47634), ISeq(List()).setId(47647)).setId(47636), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(47637), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47638))).setId(47651))
  val instToStepMap: Map[Int, Int] = HashMap(47629 -> 1, 47627 -> 0, 47636 -> 2, 47631 -> 2, 47639 -> 2, 47638 -> 2, 47628 -> 0, 47637 -> 2, 47630 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47627, 47628), 1 -> HashSet(47629, 47630), 2 -> HashSet(47637, 47636, 47631, 47639, 47638))
  /* Beautified form:
  "ObjectEnvironmentRecord.SetMutableBinding" (this, N, V, S) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (Set bindings N V S)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
