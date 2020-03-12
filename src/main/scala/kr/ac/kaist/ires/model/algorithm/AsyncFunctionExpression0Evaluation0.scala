package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression0Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(43885), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(43886), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncFunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(43888), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(43889), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43890)).setId(43891), ISeq(List()).setId(43908)).setId(43893), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(43894), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43896), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(43898), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43899))).setId(43914))
  val instToStepMap: Map[Int, Int] = HashMap(43898 -> 3, 43894 -> 1, 43886 -> 0, 43899 -> 3, 43896 -> 2, 43888 -> 1, 43893 -> 1, 43897 -> 2, 43885 -> 0, 43895 -> 1, 43900 -> 3, 43887 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43885, 43886, 43887), 1 -> HashSet(43895, 43894, 43888, 43893), 2 -> HashSet(43896, 43897), 3 -> HashSet(43898, 43899, 43900))
  /* Beautified form:
  "AsyncFunctionExpression0Evaluation0" (this, FormalParameters, AsyncFunctionBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
