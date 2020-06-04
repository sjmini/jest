package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTBoolean {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Boolean""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67364), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(67365), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""value"""))))).setId(67367), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(67368), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67369)).setId(67370), ISeq(List()).setId(67371)).setId(67372), ILet(Id("""b"""), ERef(RefId(Id("""__x1__""")))).setId(67373), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""b"""))))).setId(67375), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67376))).setId(67377), ISeq(List()).setId(67371)).setId(67378), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%BooleanPrototype%"""), EList(List(EStr("""BooleanData"""))))).setId(67380), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(67381), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67382)).setId(67383), ISeq(List()).setId(67371)).setId(67384), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(67385), IAssign(RefProp(RefId(Id("""O""")), EStr("""BooleanData""")), ERef(RefId(Id("""b""")))).setId(67387), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(67389), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67390))).setId(-1))
  /* Beautified form:
  "GLOBAL.Boolean" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    app __x1__ = (ToBoolean value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let b = __x1__
    if (= NewTarget undefined) {
      app __x2__ = (WrapCompletion b)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryCreateFromConstructor NewTarget "%BooleanPrototype%" (new ["BooleanData"]))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["BooleanData"] = b
    app __x4__ = (WrapCompletion O)
    return __x4__
  }
  */
}
