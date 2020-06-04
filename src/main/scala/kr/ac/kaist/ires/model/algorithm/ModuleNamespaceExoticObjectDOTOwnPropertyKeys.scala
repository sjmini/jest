package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""ModuleNamespaceExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""exports"""), ECopy(ERef(RefProp(RefId(Id("""O""")), EStr("""Exports"""))))).setId(58089), IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryOwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))).setId(58091), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(58092), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58093)).setId(58094), ISeq(List()).setId(58095)).setId(58096), ILet(Id("""symbolKeys"""), ERef(RefId(Id("""__x0__""")))).setId(58097), IExpr(ENotSupported("""Etc""")).setId(58099), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""exports"""))))).setId(58100), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58101))).setId(-1))
  /* Beautified form:
  "ModuleNamespaceExoticObject.OwnPropertyKeys" (O) => {
    let exports = (copy-obj O["Exports"])
    app __x0__ = (OrdinaryOwnPropertyKeys O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let symbolKeys = __x0__
    !!! "Etc"
    app __x1__ = (WrapCompletion exports)
    return __x1__
  }
  */
}
