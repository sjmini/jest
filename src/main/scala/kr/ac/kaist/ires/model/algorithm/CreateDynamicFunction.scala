package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateDynamicFunction {
  val length: Int = 4
  val func: Func = parseFunc(""""CreateDynamicFunction" (constructor, newTarget, kind, args) => {
    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    let calleeRealm = REALM
    app __x0__ = (HostEnsureCanCompileStrings callerRealm calleeRealm)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    if (= newTarget undefined) newTarget = constructor else {}
    if (= kind "normal") {
      let goal = "FunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%FunctionPrototype%"
    } else if (= kind "generator") {
      let goal = "GeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%Generator%"
    } else if (= kind "async") {
      let goal = "AsyncFunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncFunctionPrototype%"
    } else {
      assert (= kind "async generator")
      let goal = "AsyncGeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncGenerator%"
    }
    let argCount = args["length"]
    let P = ""
    if (= argCount 0i) let bodyText = "" else if (= argCount 1i) let bodyText = args[0i] else {
      let firstArg = args[0i]
      app __x1__ = (ToString firstArg)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      P = __x1__
      let k = 1i
      while (< k (- argCount 1i)) {
        let nextArg = args[k]
        app __x2__ = (ToString nextArg)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let nextArgString = __x2__
        P = (+ (+ P ",") nextArgString)
        k = (+ k 1i)
      }
      let bodyText = args[k]
    }
    app __x3__ = (ToString bodyText)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    bodyText = __x3__
    !!! "Etc"
    !!! "Etc"
    access __x4__ = (body "ContainsUseStrict")
    let strict = __x4__
    !!! "Etc"
    let __x5__ = (= strict true)
    if __x5__ {
      access __x6__ = (parameters "IsSimpleParameterList")
      __x5__ = (= __x6__ false)
    } else {}
    if __x5__ {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    !!! "Etc"
    access __x8__ = (body "Contains")
    app __x9__ = (__x8__ "SuperCall")
    if (= __x9__ true) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    access __x11__ = (parameters "Contains")
    app __x12__ = (__x11__ "SuperCall")
    if (= __x12__ true) {
      app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x13__
    } else {}
    access __x14__ = (body "Contains")
    app __x15__ = (__x14__ "SuperProperty")
    if (= __x15__ true) {
      app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x16__
    } else {}
    access __x17__ = (parameters "Contains")
    app __x18__ = (__x17__ "SuperProperty")
    if (= __x18__ true) {
      app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x19__
    } else {}
    if (|| (= kind "generator") (= kind "async generator")) {
      access __x20__ = (parameters "Contains")
      app __x21__ = (__x20__ "YieldExpression")
      if (= __x21__ true) {
        app __x22__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x22__
      } else {}
    } else {}
    if (|| (= kind "async") (= kind "async generator")) {
      access __x23__ = (parameters "Contains")
      app __x24__ = (__x23__ "AwaitExpression")
      if (= __x24__ true) {
        app __x25__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x25__
      } else {}
    } else {}
    if (= strict true) !!! "Etc" else {}
    app __x26__ = (GetPrototypeFromConstructor newTarget fallbackProto)
    if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let proto = __x26__
    app __x27__ = (FunctionAllocate proto strict kind)
    let F = __x27__
    let realmF = F["Realm"]
    let scope = realmF["GlobalEnv"]
    app __x28__ = (FunctionInitialize F CONST_Normal parameters body scope)
    __x28__
    if (= kind "generator") {
      app __x29__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
      let prototype = __x29__
      app __x30__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x30__
    } else if (= kind "async generator") {
      app __x31__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
      let prototype = __x31__
      app __x32__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x32__
    } else if (= kind "normal") {
      app __x33__ = (MakeConstructor F)
      __x33__
    } else {}
    app __x34__ = (SetFunctionName F "anonymous")
    __x34__
    !!! "Let id:{prefix} be the prefix associated with id:{kind} in Table 49 ."
    let sourceText = (+ (+ (+ (+ (+ (+ (+ (+ prefix " anonymous(") P) "\n") ") {") "\n") bodyText) "\n") "}")
    F["SourceText"] = sourceText
    app __x35__ = (WrapCompletion F)
    return __x35__
  }""")
}
