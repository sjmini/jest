package kr.ac.kaist.ase.model

import kr.ac.kaist.ase.core.Parser._
import kr.ac.kaist.ase.core._
object ToObject {
  val func: Func = Func("ToObject", List(Id("argument")), None, parseInst(
    s"""{
          let atype = (typeof argument)
          if (= atype "Undefined") {
            return (new Completion (
              "Type" -> CONST_throw,
              "Value" -> (new OrdinaryObject(
                "Prototype" -> INTRINSIC_TypeErrorPrototype,
                "ErrorData" -> undefined,
                "SubMap" -> (new SubMap())
              )),
              "Target" -> CONST_empty
            ))
          } else if (= atype "Null") {
            return (new Completion (
              "Type" -> CONST_throw,
              "Value" -> (new OrdinaryObject(
                "Prototype" -> INTRINSIC_TypeErrorPrototype,
                "ErrorData" -> undefined,
                "SubMap" -> (new SubMap())
              )),
              "Target" -> CONST_empty
            ))
          } else if (= atype "Boolean") {
            let obj = (new OrdinaryObject("Prototype" -> INTRINSIC_BooleanPrototype))
            obj.BooleanData = argument
            obj.SubMap = (new SubMap())
            return obj
          } else if (= atype "Number") {
            let obj = (new OrdinaryObject("Prototype" -> INTRINSIC_NumberPrototype))
            obj.NumberData = argument
            obj.SubMap = (new SubMap())
            return obj
          } else if (= atype "String") {
            let obj = (new OrdinaryObject("Prototype" -> INTRINSIC_StringPrototype))
            obj.StringData = argument
            obj.SubMap = (new SubMap())
            return obj
          } else if (= atype "Symbol") {
            let obj = (new OrdinaryObject("Prototype" -> INTRINSIC_SymbolPrototype))
            obj.SymbolData = argument
            obj.SubMap = (new SubMap())
            return obj
          } else {
            return argument
          }
        }"""
  ))
}
