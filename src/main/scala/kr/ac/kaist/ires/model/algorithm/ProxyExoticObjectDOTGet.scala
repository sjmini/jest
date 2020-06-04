package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""ProxyExoticObject.Get""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(59907), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59909), IReturn(ERef(RefId(Id("""__x0__""")))).setId(59910))).setId(59911), ISeq(List()).setId(59906)).setId(59912), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(59914), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""get"""))).setId(59916), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(59917), IReturn(ERef(RefId(Id("""__x1__""")))).setId(59918)).setId(59919), ISeq(List()).setId(59906)).setId(59920), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(59921), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""Get"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(59923), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(59924), IReturn(ERef(RefId(Id("""__x2__""")))).setId(59925)).setId(59926), ISeq(List()).setId(59906)).setId(59927), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(59928), IReturn(ERef(RefId(Id("""__x3__""")))).setId(59929))).setId(59931), ISeq(List()).setId(59906)).setId(59932), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))))).setId(59934), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(59935), IReturn(ERef(RefId(Id("""__x4__""")))).setId(59936)).setId(59937), ISeq(List()).setId(59906)).setId(59938), ILet(Id("""trapResult"""), ERef(RefId(Id("""__x4__""")))).setId(59939), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59941), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(59942), IReturn(ERef(RefId(Id("""__x5__""")))).setId(59943)).setId(59944), ISeq(List()).setId(59906)).setId(59945), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x5__""")))).setId(59946), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(false))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""targetDesc"""))))).setId(59948), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""trapResult"""))), ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Value"""))))).setId(59949), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59950), IReturn(ERef(RefId(Id("""__x8__""")))).setId(59951))).setId(59952), ISeq(List()).setId(59906)).setId(59953))).setId(59955), ISeq(List()).setId(59906)).setId(59956), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""targetDesc"""))))).setId(59958), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Get"""))), EUndef)), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""trapResult"""))), EUndef)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59959), IReturn(ERef(RefId(Id("""__x10__""")))).setId(59960))).setId(59961), ISeq(List()).setId(59906)).setId(59962), ISeq(List()).setId(59906)).setId(59965))).setId(59967), ISeq(List()).setId(59906)).setId(59968), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))).setId(59970), IReturn(ERef(RefId(Id("""__x11__""")))).setId(59971))).setId(-1))
  /* Beautified form:
  "ProxyExoticObject.Get" (O, P, Receiver) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "get")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["Get"] target P Receiver)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target, P, Receiver]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let trapResult = __x4__
    app __x5__ = (target["GetOwnProperty"] target P)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let targetDesc = __x5__
    if (&& (! (= targetDesc undefined)) (= targetDesc["Configurable"] false)) {
      app __x6__ = (IsDataDescriptor targetDesc)
      if (&& (= __x6__ true) (= targetDesc["Writable"] false)) {
        app __x7__ = (SameValue trapResult targetDesc["Value"])
        if (= __x7__ false) {
          app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x8__
        } else {}
      } else {}
      app __x9__ = (IsAccessorDescriptor targetDesc)
      if (&& (= __x9__ true) (= targetDesc["Get"] undefined)) if (! (= trapResult undefined)) {
        app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x10__
      } else {} else {}
    } else {}
    app __x11__ = (WrapCompletion trapResult)
    return __x11__
  }
  */
}
