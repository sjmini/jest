package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbolDOTkeyFor {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Symbol.keyFor""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67682), ILet(Id("""sym"""), ERef(RefId(Id("""__x0__""")))).setId(67683), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""sym"""))))).setId(67685), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Symbol"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67686), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67687))).setId(67688), ISeq(List()).setId(67689)).setId(67690), IExpr(ENotSupported("""Etc""")).setId(67692), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(67693), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67694))).setId(-1))
  /* Beautified form:
  "GLOBAL.Symbol.keyFor" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let sym = __x0__
    app __x1__ = (Type sym)
    if (! (= __x1__ Symbol)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    !!! "Etc"
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
