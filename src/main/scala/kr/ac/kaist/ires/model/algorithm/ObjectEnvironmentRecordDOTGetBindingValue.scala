package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTGetBindingValue {
  val length: Int = 2
  val func: Func = Func("""ObjectEnvironmentRecord.GetBindingValue""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47663), ILet(Id("""bindings"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindingObject""")))).setId(47665), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""N"""))))).setId(47667), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(47668), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47669)).setId(47670), ISeq(List()).setId(47671)).setId(47672), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(47673), IIf(EBOp(OEq, ERef(RefId(Id("""value"""))), EBool(false)), IIf(EBOp(OEq, ERef(RefId(Id("""S"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(47675), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47676))).setId(47677), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47678), IReturn(ERef(RefId(Id("""__x2__""")))).setId(47679))).setId(47680)).setId(47681), ISeq(List()).setId(47671)).setId(47684), IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""N"""))))).setId(47686), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(47687), IReturn(ERef(RefId(Id("""__x3__""")))).setId(47688)).setId(47689), ISeq(List()).setId(47671)).setId(47690), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(47691), IReturn(ERef(RefId(Id("""__x4__""")))).setId(47692))).setId(-1))
  /* Beautified form:
  "ObjectEnvironmentRecord.GetBindingValue" (this, N, S) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (HasProperty bindings N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let value = __x0__
    if (= value false) if (= S false) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (Get bindings N)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
