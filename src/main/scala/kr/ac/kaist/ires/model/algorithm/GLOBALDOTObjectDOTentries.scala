package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTentries {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.entries""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64228), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64229), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(64231), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64232), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64233)).setId(64234), ISeq(List()).setId(64235)).setId(64236), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))).setId(64237), IApp(Id("""__x2__"""), ERef(RefId(Id("""EnumerableOwnPropertyNames"""))), List(ERef(RefId(Id("""obj"""))), EStr("""key+value"""))).setId(64239), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(64240), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64241)).setId(64242), ISeq(List()).setId(64235)).setId(64243), ILet(Id("""nameList"""), ERef(RefId(Id("""__x2__""")))).setId(64244), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""nameList"""))))).setId(64246), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(64247), IReturn(ERef(RefId(Id("""__x4__""")))).setId(64248))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.entries" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (EnumerableOwnPropertyNames obj "key+value")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let nameList = __x2__
    app __x3__ = (CreateArrayFromList nameList)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
