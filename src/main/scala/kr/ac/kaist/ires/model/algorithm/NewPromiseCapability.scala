package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewPromiseCapability {
  val length: Int = 1
  val func: Func = Func("""NewPromiseCapability""", List(Id("""C""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(12177), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12178), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12179))).setId(12225), ISeq(List()).setId(12226)).setId(12182), ILet(Id("""promiseCapability"""), EMap(Ty("""PromiseCapability"""), List((EStr("""Promise"""), EUndef), (EStr("""Resolve"""), EUndef), (EStr("""Reject"""), EUndef)))).setId(12184), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(2L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTGetCapabilitiesExecutorFunctions"""))))))).setId(12186), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Capability"""))))).setId(12188), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(12189), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12190)).setId(12191), ISeq(List()).setId(12234)).setId(12192), ILet(Id("""executor"""), ERef(RefId(Id("""__x2__""")))).setId(12193), IAssign(RefProp(RefId(Id("""executor""")), EStr("""Capability""")), ERef(RefId(Id("""promiseCapability""")))).setId(12195), IApp(Id("""__x3__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""executor"""))))))).setId(12197), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(12198), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12199)).setId(12200), ISeq(List()).setId(12242)).setId(12201), ILet(Id("""promise"""), ERef(RefId(Id("""__x3__""")))).setId(12202), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))))).setId(12204), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12205), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12206))).setId(12248), ISeq(List()).setId(12249)).setId(12208), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))))).setId(12210), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12211), IReturn(ERef(RefId(Id("""__x7__""")))).setId(12212))).setId(12254), ISeq(List()).setId(12255)).setId(12214), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(12216), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""promiseCapability"""))))).setId(12218), IReturn(ERef(RefId(Id("""__x8__""")))).setId(12219))).setId(12260))
  val instToStepMap: Map[Int, Int] = HashMap(12193 -> 5, 12212 -> 10, 12197 -> 7, 12180 -> 0, 12217 -> 12, 12205 -> 8, 12215 -> 11, 12196 -> 6, 12211 -> 10, 12179 -> 0, 12218 -> 13, 12186 -> 4, 12195 -> 6, 12207 -> 8, 12219 -> 13, 12209 -> 9, 12177 -> 1, 12203 -> 7, 12185 -> 3, 12204 -> 9, 12206 -> 8, 12183 -> 1, 12201 -> 7, 12216 -> 12, 12210 -> 11, 12184 -> 3, 12214 -> 11, 12182 -> 1, 12178 -> 0, 12192 -> 5, 12187 -> 4, 12202 -> 7, 12181 -> 2, 12194 -> 5, 12208 -> 9, 12213 -> 10, 12220 -> 13, 12188 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12180, 12179, 12178), 5 -> HashSet(12193, 12192, 12194, 12188), 10 -> HashSet(12212, 12211, 12213), 1 -> HashSet(12183, 12182, 12177), 6 -> HashSet(12196, 12195), 9 -> HashSet(12204, 12209, 12208), 13 -> HashSet(12218, 12219, 12220), 2 -> HashSet(12181), 12 -> HashSet(12217, 12216), 7 -> HashSet(12197, 12201, 12202, 12203), 3 -> HashSet(12185, 12184), 11 -> HashSet(12215, 12210, 12214), 8 -> HashSet(12205, 12206, 12207), 4 -> HashSet(12186, 12187))
  /* Beautified form:
  "NewPromiseCapability" (C) => {
    app __x0__ = (IsConstructor C)
    if (= __x0__ false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    let promiseCapability = (new PromiseCapability("Promise" -> undefined, "Resolve" -> undefined, "Reject" -> undefined))
    let steps = (new algorithm("name" -> "", "length" -> 2i, "step" -> GLOBALDOTGetCapabilitiesExecutorFunctions))
    app __x2__ = (CreateBuiltinFunction steps (new ["Capability"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let executor = __x2__
    executor["Capability"] = promiseCapability
    app __x3__ = (Construct C (new [executor]))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promise = __x3__
    app __x4__ = (IsCallable promiseCapability["Resolve"])
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (IsCallable promiseCapability["Reject"])
    if (= __x6__ false) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    promiseCapability["Promise"] = promise
    app __x8__ = (WrapCompletion promiseCapability)
    return __x8__
  }
  */
}
