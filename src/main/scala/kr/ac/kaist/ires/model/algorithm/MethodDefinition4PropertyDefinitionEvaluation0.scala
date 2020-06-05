package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "MethodDefinition4PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition4PropertyDefinitionEvaluation0" (this, PropertyName, FunctionBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    if true let strict = true else let strict = false
    let scope = GLOBAL_context["LexicalEnvironment"]
    let formalParameterList = (parse-syntax "" "FormalParameters" false false)
    app __x1__ = (FunctionCreate CONST_Method formalParameterList FunctionBody scope strict)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    app __x3__ = (SetFunctionName closure propKey "get")
    __x3__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Get" -> closure, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x4__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
