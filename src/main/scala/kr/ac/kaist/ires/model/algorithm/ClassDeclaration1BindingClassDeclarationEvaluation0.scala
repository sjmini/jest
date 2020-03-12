package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassDeclaration1BindingClassDeclarationEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration1BindingClassDeclarationEvaluation0""", List(Id("""this"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassTail"""))), EStr("""ClassDefinitionEvaluation""")).setId(43192), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EUndef, EStr("""default"""))).setId(43193), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(43194), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43195)).setId(43196), ISeq(List()).setId(43212)).setId(43198), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(43199), IAssign(RefProp(RefId(Id("""value""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43201), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(43203), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43204))).setId(43218))
  val instToStepMap: Map[Int, Int] = HashMap(43192 -> 0, 43203 -> 2, 43193 -> 0, 43205 -> 2, 43201 -> 1, 43199 -> 0, 43200 -> 0, 43204 -> 2, 43198 -> 0, 43202 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43192, 43193, 43200, 43199, 43198), 1 -> HashSet(43201, 43202), 2 -> HashSet(43203, 43204, 43205))
  /* Beautified form:
  "ClassDeclaration1BindingClassDeclarationEvaluation0" (this, ClassTail) => {
    access __x0__ = (ClassTail "ClassDefinitionEvaluation")
    app __x1__ = (__x0__ undefined "default")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let value = __x1__
    value["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion value)
    return __x2__
  }
  */
}
