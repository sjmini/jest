package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTvalues {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.values""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65504), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65505), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(65507), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(65508), IReturn(ERef(RefId(Id("""__x1__""")))).setId(65509)).setId(65510), ISeq(List()).setId(65511)).setId(65512), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))).setId(65513), IApp(Id("""__x2__"""), ERef(RefId(Id("""EnumerableOwnPropertyNames"""))), List(ERef(RefId(Id("""obj"""))), EStr("""value"""))).setId(65515), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65516), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65517)).setId(65518), ISeq(List()).setId(65511)).setId(65519), ILet(Id("""nameList"""), ERef(RefId(Id("""__x2__""")))).setId(65520), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""nameList"""))))).setId(65522), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(65523), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65524))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.values" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (EnumerableOwnPropertyNames obj "value")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let nameList = __x2__
    app __x3__ = (CreateArrayFromList nameList)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
