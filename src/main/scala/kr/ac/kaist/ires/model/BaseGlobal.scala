package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.parser.UnicodeRegex

object BaseGlobal {
  private val map: Map[String, Value] = Map(
    "RequireObjectCoercible" -> RequireObjectCoercible.func,
    "EmptyFunction" -> EmptyFunction.func,
    "EnumerateObjectPropertiesHelper" -> EnumerateObjectPropertiesHelper.func,
    "FalseFunction" -> FalseFunction.func,
    "Type" -> Type.func,
    "ToNumber" -> ToNumber.func,
    "ToBoolean" -> ToBoolean.func,
    "ToObject" -> ToObject.func,
    "ToString" -> ToString.func,
    "Number" -> Str("Number"),
    "Undefined" -> Str("Undefined"),
    "Null" -> Str("Null"),
    "String" -> Str("String"),
    "Boolean" -> Str("Boolean"),
    "Symbol" -> Str("Symbol"),
    "Reference" -> Str("Reference"),
    "Object" -> Str("Object"),
    "max" -> max.func,
    "min" -> min.func,
    "abs" -> abs.func,
    "floor" -> floor.func,
    "MulOperation" -> MulOperation.func,
    "Completion" -> Completion.func,
    "WrapCompletion" -> WrapCompletion.func,
    "NormalCompletion" -> NormalCompletion.func,
    "ThrowCompletion" -> ThrowCompletion.func,
    "IsDuplicate" -> IsDuplicate.func,
    "HostEnsureCanCompileStrings" -> HostEnsureCanCompileStrings.func,
    "HostHasSourceTextAvailable" -> HostHasSourceTextAvailable.func,
    "HostReportErrors" -> HostReportErrors.func,
    "HostPromiseRejectionTracker" -> HostPromiseRejectionTracker.func,
    "RegExpCreate" -> RegExpCreate.func,
    "GetArgument" -> GetArgument.func,
    "GetTypeOf" -> GetTypeOf.func,
    "IsArrayIndex" -> IsArrayIndex.func,
    "IsAbruptCompletion" -> IsAbruptCompletion.func,
    "INTRINSIC_ThrowTypeError" -> NamedAddr("GLOBAL.INTRINSIC_ThrowTypeError"),
    "GLOBAL_executionStack" -> NamedAddr("executionStack"),
    "GLOBAL_jobQueue" -> NamedAddr("jobQueue"),
    "GLOBAL_context" -> Null,
    "GLOBAL" -> NamedAddr("GLOBAL"),
    "REALM" -> NamedAddr("REALM"),
    "PRIMITIVES" -> NamedAddr("PRIMITIVES")
  )

  lazy val get: Map[Id, Value] = map.map {
    case (s, v) => Id(s) -> v
  }
}
