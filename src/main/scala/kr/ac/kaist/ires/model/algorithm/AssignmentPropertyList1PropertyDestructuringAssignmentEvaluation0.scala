package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentPropertyList"""), Id("""AssignmentProperty"""), Id("""value""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentPropertyList"""))), EStr("""PropertyDestructuringAssignmentEvaluation""")).setId(24260), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))))).setId(24261), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(24262), IReturn(ERef(RefId(Id("""__x1__""")))).setId(24263)).setId(24264), ISeq(List()).setId(24295)).setId(24266), ILet(Id("""propertyNames"""), ERef(RefId(Id("""__x1__""")))).setId(24267), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentProperty"""))), EStr("""PropertyDestructuringAssignmentEvaluation""")).setId(24269), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))))).setId(24270), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(24271), IReturn(ERef(RefId(Id("""__x3__""")))).setId(24272)).setId(24273), ISeq(List()).setId(24303)).setId(24274), ILet(Id("""nextNames"""), ERef(RefId(Id("""__x3__""")))).setId(24275), ILet(Id("""__x4__"""), ERef(RefId(Id("""nextNames""")))).setId(24278), ILet(Id("""__x5__"""), EINum(0L)).setId(24279), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x6__"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(24280), IAppend(ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""propertyNames""")))).setId(24277), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(24281))).setId(24311)).setId(24283), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""propertyNames"""))))).setId(24286), IReturn(ERef(RefId(Id("""__x7__""")))).setId(24287))).setId(24315))
  val instToStepMap: Map[Int, Int] = HashMap(24269 -> 1, 24284 -> 2, 24270 -> 1, 24288 -> 3, 24260 -> 0, 24267 -> 0, 24279 -> 2, 24268 -> 0, 24276 -> 1, 24285 -> 2, 24261 -> 0, 24266 -> 0, 24286 -> 3, 24275 -> 1, 24274 -> 1, 24287 -> 3, 24278 -> 2, 24283 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(24260, 24267, 24268, 24261, 24266), 1 -> HashSet(24269, 24270, 24276, 24275, 24274), 2 -> HashSet(24284, 24285, 24279, 24278, 24283), 3 -> HashSet(24288, 24286, 24287))
  /* Beautified form:
  "AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0" (this, AssignmentPropertyList, AssignmentProperty, value) => {
    access __x0__ = (AssignmentPropertyList "PropertyDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let propertyNames = __x1__
    access __x2__ = (AssignmentProperty "PropertyDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ value)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let nextNames = __x3__
    let __x4__ = nextNames
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let __x6__ = __x4__[__x5__]
      append __x6__ -> propertyNames
      __x5__ = (+ __x5__ 1i)
    }
    app __x7__ = (WrapCompletion propertyNames)
    return __x7__
  }
  */
}
