package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTFunctionDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Function.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""func"""), ERef(RefId(Id("""this""")))).setId(67172), IIf(EBOp(OOr, EBOp(OEq, ETypeOf(ERef(RefId(Id("""func""")))), EStr("""BoundFunctionExoticObject""")), EBOp(OEq, ETypeOf(ERef(RefId(Id("""func""")))), EStr("""BuiltinFunctionObject"""))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))).setId(67174), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67175))).setId(67230), ISeq(List()).setId(67231)).setId(67178), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""func"""))))).setId(67180), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))).setId(67203), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(ILet(Id("""__x3__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""func""")), EStr("""SourceText"""))), EAbsent))).setId(67197), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""func""")), EStr("""SourceText"""))))).setId(67181), ILet(Id("""__x5__"""), EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""String"""))))).setId(67191), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""HostHasSourceTextAvailable"""))), List(ERef(RefId(Id("""func"""))))).setId(67182), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(67183), IReturn(ERef(RefId(Id("""__x6__""")))).setId(67184)).setId(67185), ISeq(List()).setId(67242)).setId(67186), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))).setId(67189))).setId(67245), ISeq(List()).setId(67246)).setId(67192), IAssign(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x5__""")))).setId(67195))).setId(67249), ISeq(List()).setId(67250)).setId(67198), IAssign(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))).setId(67201))).setId(67253), ISeq(List()).setId(67254)).setId(67204), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""func""")), EStr("""SourceText"""))))).setId(67205), IReturn(ERef(RefId(Id("""__x7__""")))).setId(67206))).setId(67258), ISeq(List()).setId(67259)).setId(67208), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""func"""))))).setId(67210), ILet(Id("""__x9__"""), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))).setId(67216), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))).setId(67211), IAssign(RefId(Id("""__x9__""")), EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true))).setId(67214))).setId(67265), ISeq(List()).setId(67266)).setId(67217), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))).setId(67218), IReturn(ERef(RefId(Id("""__x11__""")))).setId(67219))).setId(67270), ISeq(List()).setId(67271)).setId(67221), IApp(Id("""__x12__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67223), IReturn(ERef(RefId(Id("""__x12__""")))).setId(67224))).setId(67275))
  val instToStepMap: Map[Int, Int] = HashMap(67223 -> 7, 67178 -> 2, 67179 -> 2, 67204 -> 4, 67208 -> 4, 67219 -> 5, 67174 -> 1, 67225 -> 7, 67206 -> 3, 67205 -> 3, 67180 -> 4, 67207 -> 3, 67217 -> 6, 67175 -> 1, 67218 -> 5, 67216 -> 6, 67203 -> 4, 67210 -> 6, 67176 -> 1, 67221 -> 6, 67220 -> 5, 67224 -> 7, 67173 -> 0, 67172 -> 0, 67222 -> 6, 67209 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67173, 67172), 5 -> HashSet(67218, 67219, 67220), 1 -> HashSet(67175, 67174, 67176), 6 -> HashSet(67216, 67210, 67221, 67222, 67217), 2 -> HashSet(67178, 67179), 7 -> HashSet(67223, 67225, 67224), 3 -> HashSet(67206, 67205, 67207), 4 -> HashSet(67203, 67204, 67208, 67180, 67209))
  /* Beautified form:
  "GLOBAL.Function.prototype.toString" (this, argumentsList, NewTarget) => {
    let func = this
    if (|| (= (typeof func) "BoundFunctionExoticObject") (= (typeof func) "BuiltinFunctionObject")) {
      app __x0__ = (WrapCompletion "")
      return __x0__
    } else {}
    app __x1__ = (Type func)
    let __x2__ = (= __x1__ Object)
    if __x2__ {
      let __x3__ = (! (= func["SourceText"] absent))
      if __x3__ {
        app __x4__ = (Type func["SourceText"])
        let __x5__ = (= __x4__ String)
        if __x5__ {
          app __x6__ = (HostHasSourceTextAvailable func)
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          __x5__ = (= __x6__ true)
        } else {}
        __x3__ = __x5__
      } else {}
      __x2__ = __x3__
    } else {}
    if __x2__ {
      app __x7__ = (WrapCompletion func["SourceText"])
      return __x7__
    } else {}
    app __x8__ = (Type func)
    let __x9__ = (= __x8__ Object)
    if __x9__ {
      app __x10__ = (IsCallable func)
      __x9__ = (= __x10__ true)
    } else {}
    if __x9__ {
      app __x11__ = (WrapCompletion "")
      return __x11__
    } else {}
    app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x12__
  }
  */
}
