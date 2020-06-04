package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbol {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Symbol""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67570), ILet(Id("""description"""), ERef(RefId(Id("""__x0__""")))).setId(67571), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67573), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67574))).setId(67575), ISeq(List()).setId(67576)).setId(67577), IIf(EBOp(OEq, ERef(RefId(Id("""description"""))), EUndef), ILet(Id("""descString"""), EUndef).setId(67579), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""description"""))))).setId(67581), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(67582), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67583)).setId(67584), ISeq(List()).setId(67576)).setId(67585), ILet(Id("""descString"""), ERef(RefId(Id("""__x2__""")))).setId(67586))).setId(67587)).setId(67588), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ESymbol(ERef(RefId(Id("""descString""")))))).setId(67590), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67591))).setId(-1))
  /* Beautified form:
  "GLOBAL.Symbol" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let description = __x0__
    if (! (= NewTarget undefined)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= description undefined) let descString = undefined else {
      app __x2__ = (ToString description)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let descString = __x2__
    }
    app __x3__ = (WrapCompletion (new 'descString))
    return __x3__
  }
  */
}
