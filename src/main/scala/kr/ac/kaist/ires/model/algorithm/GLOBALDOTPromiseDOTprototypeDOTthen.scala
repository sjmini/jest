package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTprototypeDOTthen {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Promise.prototype.then""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(93305), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x0__""")))).setId(93306), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(93308), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x1__""")))).setId(93309), ILet(Id("""promise"""), ERef(RefId(Id("""this""")))).setId(93311), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsPromise"""))), List(ERef(RefId(Id("""promise"""))))).setId(93313), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(93314), IReturn(ERef(RefId(Id("""__x3__""")))).setId(93315))).setId(93316), ISeq(List()).setId(93317)).setId(93318), IApp(Id("""__x4__"""), ERef(RefId(Id("""SpeciesConstructor"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(93320), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(93321), IReturn(ERef(RefId(Id("""__x4__""")))).setId(93322)).setId(93323), ISeq(List()).setId(93317)).setId(93324), ILet(Id("""C"""), ERef(RefId(Id("""__x4__""")))).setId(93325), IApp(Id("""__x5__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(93327), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(93328), IReturn(ERef(RefId(Id("""__x5__""")))).setId(93329)).setId(93330), ISeq(List()).setId(93317)).setId(93331), ILet(Id("""resultCapability"""), ERef(RefId(Id("""__x5__""")))).setId(93332), IApp(Id("""__x6__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))), ERef(RefId(Id("""resultCapability"""))))).setId(93334), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(93335), IReturn(ERef(RefId(Id("""__x7__""")))).setId(93336))).setId(-1))
  /* Beautified form:
  "GLOBAL.Promise.prototype.then" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let onFulfilled = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let onRejected = __x1__
    let promise = this
    app __x2__ = (IsPromise promise)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (SpeciesConstructor promise INTRINSIC_Promise)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let C = __x4__
    app __x5__ = (NewPromiseCapability C)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let resultCapability = __x5__
    app __x6__ = (PerformPromiseThen promise onFulfilled onRejected resultCapability)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
