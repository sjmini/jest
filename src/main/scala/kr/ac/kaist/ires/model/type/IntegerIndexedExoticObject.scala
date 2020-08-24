package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object IntegerIndexedExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Delete") -> OrdinaryObjectDOTDelete.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("IntegerIndexedExoticObject")
}
