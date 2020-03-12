package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTThenFinallyFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.ThenFinallyFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(93135), ILet(Id("""onFinally"""), ERef(RefProp(RefId(Id("""F""")), EStr("""OnFinally""")))).setId(93137), IApp(Id("""__x0__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""onFinally"""))), EUndef)).setId(93140), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(93141), IReturn(ERef(RefId(Id("""__x0__""")))).setId(93142)).setId(93143), ISeq(List()).setId(93172)).setId(93144), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(93145), ILet(Id("""C"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Constructor""")))).setId(93147), IApp(Id("""__x1__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""result"""))))).setId(93149), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(93150), IReturn(ERef(RefId(Id("""__x1__""")))).setId(93151)).setId(93152), ISeq(List()).setId(93180)).setId(93153), ILet(Id("""promise"""), ERef(RefId(Id("""__x1__""")))).setId(93154), IExpr(ENotSupported("""Etc""")).setId(93156), IApp(Id("""__x2__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""promise"""))), EStr("""then"""), EList(List(ERef(RefId(Id("""valueThunk"""))))))).setId(93157), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(93158), IReturn(ERef(RefId(Id("""__x2__""")))).setId(93159)).setId(93160), ISeq(List()).setId(93188)).setId(93161), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(93162), IReturn(ERef(RefId(Id("""__x3__""")))).setId(93163))).setId(93192))
  val instToStepMap: Map[Int, Int] = HashMap(93136 -> 0, 93156 -> 7, 93157 -> 8, 93138 -> 1, 93144 -> 3, 93154 -> 6, 93162 -> 8, 93161 -> 8, 93140 -> 3, 93148 -> 4, 93137 -> 1, 93164 -> 8, 93135 -> 0, 93153 -> 6, 93147 -> 4, 93146 -> 3, 93163 -> 8, 93145 -> 3, 93139 -> 5, 93155 -> 6, 93149 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(93136, 93135), 5 -> HashSet(93139), 1 -> HashSet(93137, 93138), 6 -> HashSet(93153, 93154, 93155, 93149), 2 -> HashSet(93139), 7 -> HashSet(93156), 3 -> HashSet(93144, 93146, 93145, 93140), 8 -> HashSet(93157, 93164, 93163, 93162, 93161), 4 -> HashSet(93148, 93147))
  /* Beautified form:
  "GLOBAL.ThenFinallyFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let onFinally = F["OnFinally"]
    app __x0__ = (Call onFinally undefined)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let result = __x0__
    let C = F["Constructor"]
    app __x1__ = (PromiseResolve C result)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promise = __x1__
    !!! "Etc"
    app __x2__ = (Invoke promise "then" (new [valueThunk]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
