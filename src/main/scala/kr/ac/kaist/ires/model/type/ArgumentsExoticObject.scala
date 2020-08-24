package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ArgumentsExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> OrdinaryObjectDOTHasProperty.func),
    (Str("OwnPropertyKeys") -> OrdinaryObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("ArgumentsExoticObject")
}
