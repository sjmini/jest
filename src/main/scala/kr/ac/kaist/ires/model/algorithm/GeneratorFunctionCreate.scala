package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorFunctionCreate {
  val length: Int = 4
  val func: Func = Func("""GeneratorFunctionCreate""", List(Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope""")), None, ISeq(List(ILet(Id("""functionPrototype"""), ERef(RefId(Id("""INTRINSIC_Generator""")))).setId(52148), IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""functionPrototype"""))), EStr("""generator"""))).setId(52150), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(52151), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""ParameterList"""))), ERef(RefId(Id("""Body"""))), ERef(RefId(Id("""Scope"""))))).setId(52153), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52154), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52155))).setId(-1))
  /* Beautified form:
  "GeneratorFunctionCreate" (kind, ParameterList, Body, Scope) => {
    let functionPrototype = INTRINSIC_Generator
    app __x0__ = (FunctionAllocate functionPrototype "generator")
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
