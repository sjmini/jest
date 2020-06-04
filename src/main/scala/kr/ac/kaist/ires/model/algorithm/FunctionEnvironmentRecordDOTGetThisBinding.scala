package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.GetThisBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47946), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""uninitialized""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47949), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47950))).setId(47951), ISeq(List()).setId(47948)).setId(47952), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisValue"""))))).setId(47954), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47955))).setId(-1))
  /* Beautified form:
  "FunctionEnvironmentRecord.GetThisBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "uninitialized") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["ThisValue"])
    return __x1__
  }
  */
}
