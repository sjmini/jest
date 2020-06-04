package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTisFinite {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.isFinite""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(62760), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(62761), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""number"""))))).setId(62763), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(62764), IReturn(ERef(RefId(Id("""__x1__""")))).setId(62765)).setId(62766), ISeq(List()).setId(62767)).setId(62768), ILet(Id("""num"""), ERef(RefId(Id("""__x1__""")))).setId(62769), IIf(EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""num"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""num"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""num"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(62771), IReturn(ERef(RefId(Id("""__x2__""")))).setId(62772))).setId(62773), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(62774), IReturn(ERef(RefId(Id("""__x3__""")))).setId(62775))).setId(62776)).setId(62777))).setId(-1))
  /* Beautified form:
  "GLOBAL.isFinite" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (ToNumber number)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let num = __x1__
    if (|| (|| (= num NaN) (= num Infinity)) (= num -Infinity)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion true)
      return __x3__
    }
  }
  */
}
