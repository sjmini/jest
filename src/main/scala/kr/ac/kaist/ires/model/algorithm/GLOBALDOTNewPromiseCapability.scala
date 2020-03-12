package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNewPromiseCapability {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.NewPromiseCapability""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91035), ILet(Id("""C"""), ERef(RefId(Id("""__x0__""")))).setId(91036), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(91038), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91039), IReturn(ERef(RefId(Id("""__x2__""")))).setId(91040))).setId(91088), ISeq(List()).setId(91089)).setId(91043), ILet(Id("""promiseCapability"""), EMap(Ty("""PromiseCapability"""), List((EStr("""Promise"""), EUndef), (EStr("""Resolve"""), EUndef), (EStr("""Reject"""), EUndef)))).setId(91045), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(2L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTGetCapabilitiesExecutorFunctions"""))))))).setId(91047), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Capability"""))))).setId(91049), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(91050), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91051)).setId(91052), ISeq(List()).setId(91097)).setId(91053), ILet(Id("""executor"""), ERef(RefId(Id("""__x3__""")))).setId(91054), IAssign(RefProp(RefId(Id("""executor""")), EStr("""Capability""")), ERef(RefId(Id("""promiseCapability""")))).setId(91056), IApp(Id("""__x4__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""executor"""))))))).setId(91058), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(91059), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91060)).setId(91061), ISeq(List()).setId(91105)).setId(91062), ILet(Id("""promise"""), ERef(RefId(Id("""__x4__""")))).setId(91063), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))))).setId(91065), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91066), IReturn(ERef(RefId(Id("""__x6__""")))).setId(91067))).setId(91111), ISeq(List()).setId(91112)).setId(91069), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))))).setId(91071), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91072), IReturn(ERef(RefId(Id("""__x8__""")))).setId(91073))).setId(91117), ISeq(List()).setId(91118)).setId(91075), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(91077), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""promiseCapability"""))))).setId(91079), IReturn(ERef(RefId(Id("""__x9__""")))).setId(91080))).setId(91123))
  val instToStepMap: Map[Int, Int] = HashMap(91071 -> 12, 91081 -> 14, 91041 -> 1, 91044 -> 2, 91063 -> 8, 91056 -> 7, 91064 -> 8, 91053 -> 6, 91074 -> 11, 91047 -> 5, 91040 -> 1, 91043 -> 2, 91036 -> 0, 91079 -> 14, 91042 -> 3, 91067 -> 9, 91080 -> 14, 91058 -> 8, 91038 -> 2, 91055 -> 6, 91048 -> 5, 91070 -> 10, 91057 -> 7, 91066 -> 9, 91077 -> 13, 91039 -> 1, 91076 -> 12, 91049 -> 6, 91035 -> 0, 91073 -> 11, 91069 -> 10, 91078 -> 13, 91037 -> 0, 91065 -> 10, 91068 -> 9, 91075 -> 12, 91046 -> 4, 91072 -> 11, 91045 -> 4, 91054 -> 6, 91062 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(91035, 91036, 91037), 5 -> HashSet(91048, 91047), 10 -> HashSet(91070, 91069, 91065), 14 -> HashSet(91081, 91080, 91079), 1 -> HashSet(91041, 91039, 91040), 6 -> HashSet(91055, 91049, 91053, 91054), 9 -> HashSet(91067, 91066, 91068), 13 -> HashSet(91077, 91078), 2 -> HashSet(91044, 91038, 91043), 12 -> HashSet(91071, 91076, 91075), 7 -> HashSet(91057, 91056), 3 -> HashSet(91042), 11 -> HashSet(91073, 91074, 91072), 8 -> HashSet(91063, 91058, 91064, 91062), 4 -> HashSet(91046, 91045))
  /* Beautified form:
  "GLOBAL.NewPromiseCapability" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let C = __x0__
    app __x1__ = (IsConstructor C)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let promiseCapability = (new PromiseCapability("Promise" -> undefined, "Resolve" -> undefined, "Reject" -> undefined))
    let steps = (new algorithm("name" -> "", "length" -> 2i, "step" -> GLOBALDOTGetCapabilitiesExecutorFunctions))
    app __x3__ = (CreateBuiltinFunction steps (new ["Capability"]))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let executor = __x3__
    executor["Capability"] = promiseCapability
    app __x4__ = (Construct C (new [executor]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let promise = __x4__
    app __x5__ = (IsCallable promiseCapability["Resolve"])
    if (= __x5__ false) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (IsCallable promiseCapability["Reject"])
    if (= __x7__ false) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    promiseCapability["Promise"] = promise
    app __x9__ = (WrapCompletion promiseCapability)
    return __x9__
  }
  */
}
