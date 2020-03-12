package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectLiteral1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectLiteral1Evaluation0""", List(Id("""this"""), Id("""PropertyDefinitionList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(14614), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))).setId(14615), IAccess(Id("""__x1__"""), ERef(RefId(Id("""PropertyDefinitionList"""))), EStr("""PropertyDefinitionEvaluation""")).setId(14617), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""obj"""))), EBool(true))).setId(14618), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14619), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14620)).setId(14621), ISeq(List()).setId(14637)).setId(14623), IExpr(ERef(RefId(Id("""__x2__""")))).setId(14624), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(14626), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14627))).setId(14642))
  val instToStepMap: Map[Int, Int] = HashMap(14625 -> 1, 14617 -> 1, 14616 -> 0, 14623 -> 1, 14627 -> 2, 14624 -> 1, 14626 -> 2, 14618 -> 1, 14615 -> 0, 14614 -> 0, 14628 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14616, 14614, 14615), 1 -> HashSet(14625, 14617, 14623, 14624, 14618), 2 -> HashSet(14627, 14628, 14626))
  /* Beautified form:
  "ObjectLiteral1Evaluation0" (this, PropertyDefinitionList) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x0__
    access __x1__ = (PropertyDefinitionList "PropertyDefinitionEvaluation")
    app __x2__ = (__x1__ obj true)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }
  */
}
