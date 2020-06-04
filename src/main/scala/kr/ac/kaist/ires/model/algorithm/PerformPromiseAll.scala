package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseAll {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseAll""", List(Id("""iteratorRecord"""), Id("""constructor"""), Id("""resultCapability""")), None, ISeq(List(ILet(Id("""values"""), EList(List())).setId(91890), ILet(Id("""remainingElementsCount"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EINum(1L))))).setId(91892), IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""constructor"""))), EStr("""resolve"""))).setId(91894), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(91895), IReturn(ERef(RefId(Id("""__x0__""")))).setId(91896)).setId(91897), ISeq(List()).setId(91889)).setId(91898), ILet(Id("""promiseResolve"""), ERef(RefId(Id("""__x0__""")))).setId(91899), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""promiseResolve"""))))).setId(91901), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(91902), IReturn(ERef(RefId(Id("""__x1__""")))).setId(91903)).setId(91904), ISeq(List()).setId(91889)).setId(91905), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91906), IReturn(ERef(RefId(Id("""__x2__""")))).setId(91907))).setId(91908), ISeq(List()).setId(91889)).setId(91909), ILet(Id("""index"""), EINum(0L)).setId(91911), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(91913), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(91914), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(91916), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(91917), ISeq(List()).setId(91889)).setId(91919), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(91921), IReturn(ERef(RefId(Id("""next""")))).setId(91922)).setId(91923), ISeq(List()).setId(91889)).setId(91924), IExpr(ERef(RefId(Id("""next""")))).setId(91925), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(91927), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OSub, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))).setId(91929), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(0L)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""values"""))))).setId(91931), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(91932), IReturn(ERef(RefId(Id("""__x5__""")))).setId(91933)).setId(91934), ISeq(List()).setId(91889)).setId(91935), ILet(Id("""valuesArray"""), ERef(RefId(Id("""__x5__""")))).setId(91936), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""valuesArray"""))))))).setId(91938), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(91939), IReturn(ERef(RefId(Id("""__x6__""")))).setId(91940)).setId(91941), ISeq(List()).setId(91889)).setId(91942), IExpr(ERef(RefId(Id("""__x6__""")))).setId(91943))).setId(91945), ISeq(List()).setId(91889)).setId(91946), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(91948), IReturn(ERef(RefId(Id("""__x7__""")))).setId(91949))).setId(91951), ISeq(List()).setId(91889)).setId(91952), IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(91954), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x8__""")))).setId(91955), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(91957), IIf(ERef(RefId(Id("""__x9__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(91958), ISeq(List()).setId(91889)).setId(91960), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(91962), IReturn(ERef(RefId(Id("""nextValue""")))).setId(91963)).setId(91964), ISeq(List()).setId(91889)).setId(91965), IExpr(ERef(RefId(Id("""nextValue""")))).setId(91966), IAppend(EUndef, ERef(RefId(Id("""values""")))).setId(91968), IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""promiseResolve"""))), ERef(RefId(Id("""constructor"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(91970), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(91971), IReturn(ERef(RefId(Id("""__x10__""")))).setId(91972)).setId(91973), ISeq(List()).setId(91889)).setId(91974), ILet(Id("""nextPromise"""), ERef(RefId(Id("""__x10__""")))).setId(91975), ILet(Id("""steps"""), ENotSupported("""Algorithms""")).setId(91977), IApp(Id("""__x11__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""AlreadyCalled"""), EStr("""Index"""), EStr("""Values"""), EStr("""Capability"""), EStr("""RemainingElements"""))))).setId(91979), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(91980), IReturn(ERef(RefId(Id("""__x11__""")))).setId(91981)).setId(91982), ISeq(List()).setId(91889)).setId(91983), ILet(Id("""resolveElement"""), ERef(RefId(Id("""__x11__""")))).setId(91984), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""AlreadyCalled""")), EMap(Ty("""Record"""), List((EStr("""Value"""), EBool(false))))).setId(91986), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""Index""")), ERef(RefId(Id("""index""")))).setId(91988), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""Values""")), ERef(RefId(Id("""values""")))).setId(91990), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""Capability""")), ERef(RefId(Id("""resultCapability""")))).setId(91992), IAssign(RefProp(RefId(Id("""resolveElement""")), EStr("""RemainingElements""")), ERef(RefId(Id("""remainingElementsCount""")))).setId(91994), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OPlus, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))).setId(91996), IApp(Id("""__x12__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""nextPromise"""))), EStr("""then"""), EList(List(ERef(RefId(Id("""resolveElement"""))), ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Reject"""))))))).setId(91998), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(91999), IReturn(ERef(RefId(Id("""__x12__""")))).setId(92000)).setId(92001), ISeq(List()).setId(91889)).setId(92002), IExpr(ERef(RefId(Id("""__x12__""")))).setId(92003), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(92005))).setId(92007)).setId(92008))).setId(-1))
  /* Beautified form:
  "PerformPromiseAll" (iteratorRecord, constructor, resultCapability) => {
    let values = (new [])
    let remainingElementsCount = (new Record("Value" -> 1i))
    app __x0__ = (Get constructor "resolve")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseResolve = __x0__
    app __x1__ = (IsCallable promiseResolve)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let index = 0i
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      let next = __x3__
      app __x4__ = (IsAbruptCompletion next)
      if __x4__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
        if (= remainingElementsCount["Value"] 0i) {
          app __x5__ = (CreateArrayFromList values)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let valuesArray = __x5__
          app __x6__ = (Call resultCapability["Resolve"] undefined (new [valuesArray]))
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          __x6__
        } else {}
        app __x7__ = (WrapCompletion resultCapability["Promise"])
        return __x7__
      } else {}
      app __x8__ = (IteratorValue next)
      let nextValue = __x8__
      app __x9__ = (IsAbruptCompletion nextValue)
      if __x9__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      append undefined -> values
      app __x10__ = (Call promiseResolve constructor (new [nextValue]))
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let nextPromise = __x10__
      let steps = !!! "Algorithms"
      app __x11__ = (CreateBuiltinFunction steps (new ["AlreadyCalled", "Index", "Values", "Capability", "RemainingElements"]))
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let resolveElement = __x11__
      resolveElement["AlreadyCalled"] = (new Record("Value" -> false))
      resolveElement["Index"] = index
      resolveElement["Values"] = values
      resolveElement["Capability"] = resultCapability
      resolveElement["RemainingElements"] = remainingElementsCount
      remainingElementsCount["Value"] = (+ remainingElementsCount["Value"] 1i)
      app __x12__ = (Invoke nextPromise "then" (new [resolveElement, resultCapability["Reject"]]))
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      __x12__
      index = (+ index 1i)
    }
  }
  */
}
