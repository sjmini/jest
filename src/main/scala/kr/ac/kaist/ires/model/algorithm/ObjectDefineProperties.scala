package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectDefineProperties {
  val length: Int = 2
  val func: Func = Func("""ObjectDefineProperties""", List(Id("""O"""), Id("""Properties""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(63893), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63894), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63895))).setId(63896), ISeq(List()).setId(63897)).setId(63898), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""Properties"""))))).setId(63900), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63901), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63902)).setId(63903), ISeq(List()).setId(63897)).setId(63904), ILet(Id("""props"""), ERef(RefId(Id("""__x2__""")))).setId(63905), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""props""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""props"""))))).setId(63907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(63908), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63909)).setId(63910), ISeq(List()).setId(63897)).setId(63911), ILet(Id("""keys"""), ERef(RefId(Id("""__x3__""")))).setId(63912), ILet(Id("""descriptors"""), EList(List())).setId(63914), ILet(Id("""__x4__"""), ERef(RefId(Id("""keys""")))).setId(63943), ILet(Id("""__x5__"""), EINum(0L)).setId(63944), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(63945), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""props""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""props"""))), ERef(RefId(Id("""nextKey"""))))).setId(63916), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(63917), IReturn(ERef(RefId(Id("""__x6__""")))).setId(63918)).setId(63919), ISeq(List()).setId(63897)).setId(63920), ILet(Id("""propDesc"""), ERef(RefId(Id("""__x6__""")))).setId(63921), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""propDesc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""propDesc""")), EStr("""Enumerable"""))), EBool(true))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""props"""))), ERef(RefId(Id("""nextKey"""))))).setId(63923), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(63924), IReturn(ERef(RefId(Id("""__x7__""")))).setId(63925)).setId(63926), ISeq(List()).setId(63897)).setId(63927), ILet(Id("""descObj"""), ERef(RefId(Id("""__x7__""")))).setId(63928), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToPropertyDescriptor"""))), List(ERef(RefId(Id("""descObj"""))))).setId(63930), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(63931), IReturn(ERef(RefId(Id("""__x8__""")))).setId(63932)).setId(63933), ISeq(List()).setId(63897)).setId(63934), ILet(Id("""desc"""), ERef(RefId(Id("""__x8__""")))).setId(63935), IAppend(EList(List(ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""desc"""))))), ERef(RefId(Id("""descriptors""")))).setId(63937))).setId(63939), ISeq(List()).setId(63897)).setId(63940), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(63946))).setId(63947)).setId(63948), ILet(Id("""__x9__"""), ERef(RefId(Id("""descriptors""")))).setId(63963), ILet(Id("""__x10__"""), EINum(0L)).setId(63964), IWhile(EBOp(OLt, ERef(RefId(Id("""__x10__"""))), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""length""")))), ISeq(List(ILet(Id("""pair"""), ERef(RefProp(RefId(Id("""__x9__""")), ERef(RefId(Id("""__x10__""")))))).setId(63965), ILet(Id("""P"""), ERef(RefProp(RefId(Id("""pair""")), EINum(0L)))).setId(63951), ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""pair""")), EINum(1L)))).setId(63953), IApp(Id("""__x11__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""desc"""))))).setId(63955), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(63956), IReturn(ERef(RefId(Id("""__x11__""")))).setId(63957)).setId(63958), ISeq(List()).setId(63897)).setId(63959), IExpr(ERef(RefId(Id("""__x11__""")))).setId(63960), IAssign(RefId(Id("""__x10__""")), EBOp(OPlus, ERef(RefId(Id("""__x10__"""))), EINum(1L))).setId(63966))).setId(63967)).setId(63968), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(63971), IReturn(ERef(RefId(Id("""__x12__""")))).setId(63972))).setId(-1))
  /* Beautified form:
  "ObjectDefineProperties" (O, Properties) => {
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (ToObject Properties)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let props = __x2__
    app __x3__ = (props["OwnPropertyKeys"] props)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let descriptors = (new [])
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let nextKey = __x4__[__x5__]
      app __x6__ = (props["GetOwnProperty"] props nextKey)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let propDesc = __x6__
      if (&& (! (= propDesc undefined)) (= propDesc["Enumerable"] true)) {
        app __x7__ = (Get props nextKey)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let descObj = __x7__
        app __x8__ = (ToPropertyDescriptor descObj)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let desc = __x8__
        append (new [nextKey, desc]) -> descriptors
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    let __x9__ = descriptors
    let __x10__ = 0i
    while (< __x10__ __x9__["length"]) {
      let pair = __x9__[__x10__]
      let P = pair[0i]
      let desc = pair[1i]
      app __x11__ = (DefinePropertyOrThrow O P desc)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      __x10__ = (+ __x10__ 1i)
    }
    app __x12__ = (WrapCompletion O)
    return __x12__
  }
  */
}
