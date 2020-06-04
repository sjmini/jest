package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTkeys {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.keys""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(79413), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(79414), IReturn(ERef(RefId(Id("""__x0__""")))).setId(79415)).setId(79416), ISeq(List()).setId(79417)).setId(79418), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(79419), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateArrayIterator"""))), List(ERef(RefId(Id("""O"""))), EStr("""key"""))).setId(79421), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(79422), IReturn(ERef(RefId(Id("""__x2__""")))).setId(79423))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.keys" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (CreateArrayIterator O "key")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
