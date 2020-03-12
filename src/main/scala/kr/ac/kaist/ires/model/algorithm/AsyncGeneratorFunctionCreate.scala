package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorFunctionCreate {
  val length: Int = 4
  val func: Func = Func("""AsyncGeneratorFunctionCreate""", List(Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope""")), None, ISeq(List(ILet(Id("""functionPrototype"""), ERef(RefId(Id("""INTRINSIC_AsyncGenerator""")))).setId(52172), IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""functionPrototype"""))), EStr("""generator"""))).setId(52174), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(52175), IReturn(ERef(RefId(Id("""__x0__""")))).setId(52176)).setId(52177), ISeq(List()).setId(52196)).setId(52179), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(52180), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""ParameterList"""))), ERef(RefId(Id("""Body"""))), ERef(RefId(Id("""Scope"""))))).setId(52182), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52183), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52184)).setId(52185), ISeq(List()).setId(52203)).setId(52186), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52187), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52188))).setId(52207))
  val instToStepMap: Map[Int, Int] = HashMap(52188 -> 2, 52182 -> 2, 52187 -> 2, 52174 -> 1, 52186 -> 2, 52173 -> 0, 52179 -> 1, 52172 -> 0, 52189 -> 2, 52181 -> 1, 52180 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(52172, 52173), 1 -> HashSet(52174, 52179, 52181, 52180), 2 -> HashSet(52189, 52188, 52182, 52187, 52186))
  /* Beautified form:
  "AsyncGeneratorFunctionCreate" (kind, ParameterList, Body, Scope) => {
    let functionPrototype = INTRINSIC_AsyncGenerator
    app __x0__ = (FunctionAllocate functionPrototype "generator")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
