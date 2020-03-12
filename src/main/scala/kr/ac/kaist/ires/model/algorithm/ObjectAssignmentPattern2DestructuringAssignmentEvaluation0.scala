package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectAssignmentPattern2DestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectAssignmentPattern2DestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentPropertyList"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))).setId(23532), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23533), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23534)).setId(23535), ISeq(List()).setId(23557)).setId(23537), IExpr(ERef(RefId(Id("""__x0__""")))).setId(23538), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentPropertyList"""))), EStr("""PropertyDestructuringAssignmentEvaluation""")).setId(23540), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))))).setId(23541), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(23542), IReturn(ERef(RefId(Id("""__x2__""")))).setId(23543)).setId(23544), ISeq(List()).setId(23565)).setId(23545), IExpr(ERef(RefId(Id("""__x2__""")))).setId(23546), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(23548), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(23549), IReturn(ERef(RefId(Id("""__x4__""")))).setId(23550))).setId(23571))
  val instToStepMap: Map[Int, Int] = HashMap(23547 -> 1, 23532 -> 0, 23551 -> 2, 23539 -> 0, 23550 -> 2, 23546 -> 1, 23540 -> 1, 23545 -> 1, 23541 -> 1, 23537 -> 0, 23549 -> 2, 23548 -> 2, 23538 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(23532, 23539, 23537, 23538), 1 -> HashSet(23547, 23546, 23540, 23545, 23541), 2 -> HashSet(23551, 23550, 23549, 23548))
  /* Beautified form:
  "ObjectAssignmentPattern2DestructuringAssignmentEvaluation0" (this, AssignmentPropertyList, value) => {
    app __x0__ = (RequireObjectCoercible value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (AssignmentPropertyList "PropertyDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (NormalCompletion CONST_empty)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
