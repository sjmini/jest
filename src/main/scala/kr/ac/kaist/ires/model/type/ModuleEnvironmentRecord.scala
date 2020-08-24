package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ModuleEnvironmentRecord {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("WithBaseObject") -> DeclarativeEnvironmentRecordDOTWithBaseObject.func),
    (Str("InitializeBinding") -> DeclarativeEnvironmentRecordDOTInitializeBinding.func),
    (Str("CreateMutableBinding") -> DeclarativeEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("CreateImmutableBinding") -> DeclarativeEnvironmentRecordDOTCreateImmutableBinding.func),
    (Str("SetMutableBinding") -> DeclarativeEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasBinding") -> DeclarativeEnvironmentRecordDOTHasBinding.func)
  ) ++ BaseType.getMap("ModuleEnvironmentRecord")
}
