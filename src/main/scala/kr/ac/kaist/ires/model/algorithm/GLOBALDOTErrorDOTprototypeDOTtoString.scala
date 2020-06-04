package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTErrorDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Error.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(68038), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(68040), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(68041), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68042))).setId(68043), ISeq(List()).setId(68044)).setId(68045), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), EStr("""name"""))).setId(68047), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68048), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68049)).setId(68050), ISeq(List()).setId(68044)).setId(68051), ILet(Id("""name"""), ERef(RefId(Id("""__x2__""")))).setId(68052), IIf(EBOp(OEq, ERef(RefId(Id("""name"""))), EUndef), IAssign(RefId(Id("""name""")), EStr("""Error""")).setId(68054), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""name"""))))).setId(68056), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68057), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68058)).setId(68059), ISeq(List()).setId(68044)).setId(68060), IAssign(RefId(Id("""name""")), ERef(RefId(Id("""__x3__""")))).setId(68061))).setId(68062)).setId(68063), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""))).setId(68065), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(68066), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68067)).setId(68068), ISeq(List()).setId(68044)).setId(68069), ILet(Id("""msg"""), ERef(RefId(Id("""__x4__""")))).setId(68070), IIf(EBOp(OEq, ERef(RefId(Id("""msg"""))), EUndef), IAssign(RefId(Id("""msg""")), EStr("""""")).setId(68072), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""msg"""))))).setId(68074), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(68075), IReturn(ERef(RefId(Id("""__x5__""")))).setId(68076)).setId(68077), ISeq(List()).setId(68044)).setId(68078), IAssign(RefId(Id("""msg""")), ERef(RefId(Id("""__x5__""")))).setId(68079))).setId(68080)).setId(68081), IIf(EBOp(OEq, ERef(RefId(Id("""name"""))), EStr("""""")), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""msg"""))))).setId(68083), IReturn(ERef(RefId(Id("""__x6__""")))).setId(68084))).setId(68085), ISeq(List()).setId(68044)).setId(68086), IIf(EBOp(OEq, ERef(RefId(Id("""msg"""))), EStr("""""")), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""name"""))))).setId(68088), IReturn(ERef(RefId(Id("""__x7__""")))).setId(68089))).setId(68090), ISeq(List()).setId(68044)).setId(68091), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""name"""))), EStr(""":""")), EStr(""" """)), ERef(RefId(Id("""msg""")))))).setId(68093), IReturn(ERef(RefId(Id("""__x8__""")))).setId(68094))).setId(-1))
  /* Beautified form:
  "GLOBAL.Error.prototype.toString" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (Get O "name")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let name = __x2__
    if (= name undefined) name = "Error" else {
      app __x3__ = (ToString name)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      name = __x3__
    }
    app __x4__ = (Get O "message")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let msg = __x4__
    if (= msg undefined) msg = "" else {
      app __x5__ = (ToString msg)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      msg = __x5__
    }
    if (= name "") {
      app __x6__ = (WrapCompletion msg)
      return __x6__
    } else {}
    if (= msg "") {
      app __x7__ = (WrapCompletion name)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion (+ (+ (+ name ":") " ") msg))
    return __x8__
  }
  */
}
