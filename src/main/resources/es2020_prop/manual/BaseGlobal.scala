package kr.ac.kaist.jiset.model

import kr.ac.kaist.jiset.core._

object BaseGlobal {
  private val map: Map[String, Value] = Map(
    "RequireObjectCoercible" -> RequireObjectCoercible.func,
    "EnumerateObjectPropertiesHelper" -> EnumerateObjectPropertiesHelper.func,
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
    "REALM" -> NamedAddr("REALM")
  )

  lazy val get: Map[Id, Value] = map.map {
    case (s, v) => Id(s) -> v
  }
}
