package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTstartsWith {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.startsWith""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(73838), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(73839), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(73841), ILet(Id("""position"""), ERef(RefId(Id("""__x1__""")))).setId(73842), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(73844), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(73845), IReturn(ERef(RefId(Id("""__x2__""")))).setId(73846)).setId(73847), ISeq(List()).setId(73848)).setId(73849), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(73850), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(73852), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(73853), IReturn(ERef(RefId(Id("""__x3__""")))).setId(73854)).setId(73855), ISeq(List()).setId(73848)).setId(73856), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(73857), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsRegExp"""))), List(ERef(RefId(Id("""searchString"""))))).setId(73859), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(73860), IReturn(ERef(RefId(Id("""__x4__""")))).setId(73861)).setId(73862), ISeq(List()).setId(73848)).setId(73863), ILet(Id("""isRegExp"""), ERef(RefId(Id("""__x4__""")))).setId(73864), IIf(EBOp(OEq, ERef(RefId(Id("""isRegExp"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(73866), IReturn(ERef(RefId(Id("""__x5__""")))).setId(73867))).setId(73868), ISeq(List()).setId(73848)).setId(73869), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(73871), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(73872), IReturn(ERef(RefId(Id("""__x6__""")))).setId(73873)).setId(73874), ISeq(List()).setId(73848)).setId(73875), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x6__""")))).setId(73876), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""position"""))))).setId(73878), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(73879), IReturn(ERef(RefId(Id("""__x7__""")))).setId(73880)).setId(73881), ISeq(List()).setId(73848)).setId(73882), ILet(Id("""pos"""), ERef(RefId(Id("""__x7__""")))).setId(73883), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(73885), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(73887), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""len"""))))).setId(73888), ILet(Id("""start"""), ERef(RefId(Id("""__x9__""")))).setId(73889), ILet(Id("""searchLength"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(73891), IIf(EBOp(OLt, ERef(RefId(Id("""len"""))), EBOp(OPlus, ERef(RefId(Id("""searchLength"""))), ERef(RefId(Id("""start"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(73893), IReturn(ERef(RefId(Id("""__x10__""")))).setId(73894))).setId(73895), ISeq(List()).setId(73848)).setId(73896), IExpr(ENotSupported("""Etc""")).setId(73898), IExpr(ENotSupported("""Etc""")).setId(73898))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.startsWith" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let position = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (IsRegExp searchString)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let isRegExp = __x4__
    if (= isRegExp true) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (ToString searchString)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let searchStr = __x6__
    app __x7__ = (ToInteger position)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let pos = __x7__
    let len = S["length"]
    app __x8__ = (max pos 0i)
    app __x9__ = (min __x8__ len)
    let start = __x9__
    let searchLength = searchStr["length"]
    if (< len (+ searchLength start)) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    !!! "Etc"
    !!! "Etc"
  }
  */
}
