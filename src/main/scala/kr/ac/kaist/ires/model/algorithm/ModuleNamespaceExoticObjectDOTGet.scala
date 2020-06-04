package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceExoticObject.Get""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(57879), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(57880), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(57881), IReturn(ERef(RefId(Id("""__x1__""")))).setId(57882)).setId(57883), ISeq(List()).setId(57878)).setId(57884), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(57885), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57886))).setId(57888), ISeq(List()).setId(57878)).setId(57889), ILet(Id("""exports"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Exports""")))).setId(57891), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""exports"""))), ERef(RefId(Id("""P"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57893), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57894))).setId(57895), ISeq(List()).setId(57878)).setId(57896), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Module""")))).setId(57898), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""m""")), EStr("""ResolveExport"""))), List(ERef(RefId(Id("""m"""))), ERef(RefId(Id("""P"""))))).setId(57900), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(57901), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57902)).setId(57903), ISeq(List()).setId(57878)).setId(57904), ILet(Id("""binding"""), ERef(RefId(Id("""__x4__""")))).setId(57905), ILet(Id("""targetModule"""), ERef(RefProp(RefId(Id("""binding""")), EStr("""Module""")))).setId(57907), ILet(Id("""targetEnv"""), ERef(RefProp(RefId(Id("""targetModule""")), EStr("""Environment""")))).setId(57909), IIf(EBOp(OEq, ERef(RefId(Id("""targetEnv"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(57911), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57912))).setId(57913), ISeq(List()).setId(57878)).setId(57914), ILet(Id("""targetEnvRec"""), ERef(RefProp(RefId(Id("""targetEnv""")), EStr("""EnvironmentRecord""")))).setId(57916), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""targetEnvRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""targetEnvRec"""))), ERef(RefProp(RefId(Id("""binding""")), EStr("""BindingName"""))), EBool(true))).setId(57918), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(57919), IReturn(ERef(RefId(Id("""__x6__""")))).setId(57920)).setId(57921), ISeq(List()).setId(57878)).setId(57922), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(57923), IReturn(ERef(RefId(Id("""__x7__""")))).setId(57924))).setId(-1))
  /* Beautified form:
  "ModuleNamespaceExoticObject.Get" (O, P, Receiver) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryGet O P Receiver)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (! (contains exports P)) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    let m = O["Module"]
    app __x4__ = (m["ResolveExport"] m P)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let binding = __x4__
    let targetModule = binding["Module"]
    let targetEnv = targetModule["Environment"]
    if (= targetEnv undefined) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    let targetEnvRec = targetEnv["EnvironmentRecord"]
    app __x6__ = (targetEnvRec["GetBindingValue"] targetEnvRec binding["BindingName"] true)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
