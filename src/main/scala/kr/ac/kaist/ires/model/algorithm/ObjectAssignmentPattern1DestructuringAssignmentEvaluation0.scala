package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectAssignmentPattern1DestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectAssignmentPattern1DestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentRestProperty"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))).setId(24156), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(24157), IReturn(ERef(RefId(Id("""__x0__""")))).setId(24158)).setId(24159), ISeq(List()).setId(24176)).setId(24161), IExpr(ERef(RefId(Id("""__x0__""")))).setId(24162), ILet(Id("""excludedNames"""), EList(List())).setId(24164), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentRestProperty"""))), EStr("""RestDestructuringAssignmentEvaluation""")).setId(24166), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""excludedNames"""))))).setId(24167), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(24168), IReturn(ERef(RefId(Id("""__x3__""")))).setId(24169))).setId(24184))
  val instToStepMap: Map[Int, Int] = HashMap(24156 -> 0, 24166 -> 2, 24163 -> 0, 24169 -> 2, 24162 -> 0, 24165 -> 1, 24170 -> 2, 24161 -> 0, 24168 -> 2, 24164 -> 1, 24167 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(24156, 24163, 24162, 24161), 1 -> HashSet(24165, 24164), 2 -> HashSet(24166, 24169, 24170, 24168, 24167))
  /* Beautified form:
  "ObjectAssignmentPattern1DestructuringAssignmentEvaluation0" (this, AssignmentRestProperty, value) => {
    app __x0__ = (RequireObjectCoercible value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let excludedNames = (new [])
    access __x1__ = (AssignmentRestProperty "RestDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value excludedNames)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
