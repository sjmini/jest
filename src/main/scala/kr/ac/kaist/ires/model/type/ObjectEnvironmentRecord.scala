package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ObjectEnvironmentRecord {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("InitializeBinding") -> ObjectEnvironmentRecordDOTInitializeBinding.func),
    (Str("GetBindingValue") -> ObjectEnvironmentRecordDOTGetBindingValue.func),
    (Str("CreateMutableBinding") -> ObjectEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("SetMutableBinding") -> ObjectEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasBinding") -> ObjectEnvironmentRecordDOTHasBinding.func)
  ) ++ BaseType.getMap("ObjectEnvironmentRecord")
}
