package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTfreeze {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.freeze""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64291), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64292), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(64294), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(64295), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64296))).setId(64297), ISeq(List()).setId(64298)).setId(64299), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetIntegrityLevel"""))), List(ERef(RefId(Id("""O"""))), EStr("""frozen"""))).setId(64301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(64302), IReturn(ERef(RefId(Id("""__x3__""")))).setId(64303)).setId(64304), ISeq(List()).setId(64298)).setId(64305), ILet(Id("""status"""), ERef(RefId(Id("""__x3__""")))).setId(64306), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(64308), IReturn(ERef(RefId(Id("""__x4__""")))).setId(64309))).setId(64310), ISeq(List()).setId(64298)).setId(64311), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(64313), IReturn(ERef(RefId(Id("""__x5__""")))).setId(64314))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.freeze" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (Type O)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion O)
      return __x2__
    } else {}
    app __x3__ = (SetIntegrityLevel O "frozen")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let status = __x3__
    if (= status false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion O)
    return __x5__
  }
  */
}
