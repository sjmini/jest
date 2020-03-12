package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassDeclaration0BindingClassDeclarationEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration0BindingClassDeclarationEvaluation0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(43121), ILet(Id("""className"""), ERef(RefId(Id("""__x0__""")))).setId(43122), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassTail"""))), EStr("""ClassDefinitionEvaluation""")).setId(43124), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""className"""))), ERef(RefId(Id("""className"""))))).setId(43125), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(43126), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43127)).setId(43128), ISeq(List()).setId(43155)).setId(43130), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(43131), IAssign(RefProp(RefId(Id("""value""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43133), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(43135), IApp(Id("""__x3__"""), ERef(RefId(Id("""InitializeBoundName"""))), List(ERef(RefId(Id("""className"""))), ERef(RefId(Id("""value"""))), ERef(RefId(Id("""env"""))))).setId(43137), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(43138), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43139)).setId(43140), ISeq(List()).setId(43164)).setId(43141), IExpr(ERef(RefId(Id("""__x3__""")))).setId(43142), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(43144), IReturn(ERef(RefId(Id("""__x4__""")))).setId(43145))).setId(43169))
  val instToStepMap: Map[Int, Int] = HashMap(43143 -> 4, 43134 -> 2, 43122 -> 0, 43133 -> 2, 43123 -> 0, 43131 -> 1, 43124 -> 1, 43137 -> 4, 43135 -> 3, 43144 -> 5, 43132 -> 1, 43125 -> 1, 43136 -> 3, 43146 -> 5, 43141 -> 4, 43142 -> 4, 43130 -> 1, 43121 -> 0, 43145 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(43122, 43123, 43121), 5 -> HashSet(43144, 43146, 43145), 1 -> HashSet(43132, 43125, 43131, 43124, 43130), 2 -> HashSet(43134, 43133), 3 -> HashSet(43136, 43135), 4 -> HashSet(43143, 43141, 43137, 43142))
  /* Beautified form:
  "ClassDeclaration0BindingClassDeclarationEvaluation0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let className = __x0__
    access __x1__ = (ClassTail "ClassDefinitionEvaluation")
    app __x2__ = (__x1__ className className)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    value["SourceText"] = (get-syntax this)
    let env = GLOBAL_context["LexicalEnvironment"]
    app __x3__ = (InitializeBoundName className value env)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion value)
    return __x4__
  }
  */
}
