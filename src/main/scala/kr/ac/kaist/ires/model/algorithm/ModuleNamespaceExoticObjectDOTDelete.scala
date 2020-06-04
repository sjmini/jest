package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTDelete {
  val length: Int = 1
  val func: Func = Func("""ModuleNamespaceExoticObject.Delete""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(58024), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryDelete"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(58025), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(58026), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58027)).setId(58028), ISeq(List()).setId(58023)).setId(58029), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(58030), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58031))).setId(58033), ISeq(List()).setId(58023)).setId(58034), ILet(Id("""exports"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Exports""")))).setId(58036), IIf(EContains(ERef(RefId(Id("""exports"""))), ERef(RefId(Id("""P""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(58038), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58039))).setId(58040), ISeq(List()).setId(58023)).setId(58041), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(58043), IReturn(ERef(RefId(Id("""__x4__""")))).setId(58044))).setId(-1))
  /* Beautified form:
  "ModuleNamespaceExoticObject.Delete" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryDelete O P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (contains exports P) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion true)
    return __x4__
  }
  */
}
