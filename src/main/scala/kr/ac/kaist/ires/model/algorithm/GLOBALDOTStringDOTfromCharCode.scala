package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCharCode {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.fromCharCode""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(70230), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""codeUnits""")), EStr("""length""")))).setId(70231), ILet(Id("""elements"""), EList(List())).setId(70233), ILet(Id("""nextIndex"""), EINum(0L)).setId(70235), IWhile(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""length""")))), ISeq(List(ILet(Id("""next"""), ERef(RefProp(RefId(Id("""codeUnits""")), ERef(RefId(Id("""nextIndex""")))))).setId(70237), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToUint16"""))), List(ERef(RefId(Id("""next"""))))).setId(70239), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(70240), IReturn(ERef(RefId(Id("""__x0__""")))).setId(70241)).setId(70242), ISeq(List()).setId(70243)).setId(70244), ILet(Id("""nextCU"""), ERef(RefId(Id("""__x0__""")))).setId(70245), IAppend(ERef(RefId(Id("""nextCU"""))), ERef(RefId(Id("""elements""")))).setId(70247), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L))).setId(70249))).setId(70251)).setId(70252), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(70254), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70255))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.fromCharCode" (this, argumentsList, NewTarget) => {
    !!! "Etc"
    let length = codeUnits["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codeUnits[nextIndex]
      app __x0__ = (ToUint16 next)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCU = __x0__
      append nextCU -> elements
      nextIndex = (+ nextIndex 1i)
    }
    app __x1__ = (WrapCompletion !!! "StringOp")
    return __x1__
  }
  */
}
