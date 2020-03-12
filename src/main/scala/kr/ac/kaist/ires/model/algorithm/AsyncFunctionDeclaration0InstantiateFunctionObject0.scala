package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration0InstantiateFunctionObject0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(43487), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(43488), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncFunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(43490), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(43491), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43492)).setId(43493), ISeq(List()).setId(43517)).setId(43495), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(43496), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""name"""))))).setId(43498), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(43499), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43500)).setId(43501), ISeq(List()).setId(43524)).setId(43502), IExpr(ERef(RefId(Id("""__x2__""")))).setId(43503), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43505), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(43507), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43508))).setId(43530))
  val instToStepMap: Map[Int, Int] = HashMap(43509 -> 4, 43504 -> 2, 43495 -> 1, 43497 -> 1, 43506 -> 3, 43498 -> 2, 43502 -> 2, 43508 -> 4, 43503 -> 2, 43488 -> 0, 43489 -> 0, 43496 -> 1, 43507 -> 4, 43505 -> 3, 43487 -> 0, 43490 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(43487, 43488, 43489), 1 -> HashSet(43496, 43495, 43497, 43490), 2 -> HashSet(43504, 43498, 43502, 43503), 3 -> HashSet(43506, 43505), 4 -> HashSet(43509, 43507, 43508))
  /* Beautified form:
  "AsyncFunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let F = __x1__
    app __x2__ = (SetFunctionName F name)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }
  */
}
