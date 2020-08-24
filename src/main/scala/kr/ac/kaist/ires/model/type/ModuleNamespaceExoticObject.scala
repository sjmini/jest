package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ModuleNamespaceExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("ModuleNamespaceExoticObject")
}
