package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinitionList1PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinitionList1PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyDefinitionList"""), Id("""PropertyDefinition"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyDefinitionList"""))), EStr("""PropertyDefinitionEvaluation""")).setId(14816), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""enumerable"""))))).setId(14817), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14818), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14819)).setId(14820), ISeq(List()).setId(14836)).setId(14822), IExpr(ERef(RefId(Id("""__x1__""")))).setId(14823), IAccess(Id("""__x2__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropertyDefinitionEvaluation""")).setId(14825), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""enumerable"""))))).setId(14826), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(14827), IReturn(ERef(RefId(Id("""__x4__""")))).setId(14828))).setId(14843))
  val instToStepMap: Map[Int, Int] = HashMap(14822 -> 0, 14829 -> 1, 14825 -> 1, 14817 -> 0, 14826 -> 1, 14816 -> 0, 14824 -> 0, 14827 -> 1, 14823 -> 0, 14828 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14822, 14817, 14816, 14824, 14823), 1 -> HashSet(14829, 14825, 14826, 14827, 14828))
  /* Beautified form:
  "PropertyDefinitionList1PropertyDefinitionEvaluation0" (this, PropertyDefinitionList, PropertyDefinition, object, enumerable) => {
    access __x0__ = (PropertyDefinitionList "PropertyDefinitionEvaluation")
    app __x1__ = (__x0__ object enumerable)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (PropertyDefinition "PropertyDefinitionEvaluation")
    app __x3__ = (__x2__ object enumerable)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
