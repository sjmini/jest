package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTsetPrototypeOf {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.setPrototypeOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65386), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65387), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(65389), ILet(Id("""proto"""), ERef(RefId(Id("""__x1__""")))).setId(65390), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""O"""))))).setId(65392), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65393), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65394)).setId(65395), ISeq(List()).setId(65396)).setId(65397), IAssign(RefId(Id("""O""")), ERef(RefId(Id("""__x2__""")))).setId(65398), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""proto"""))))).setId(65400), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(65401), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65402))).setId(65403), ISeq(List()).setId(65396)).setId(65404), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(65406), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(65407), IReturn(ERef(RefId(Id("""__x6__""")))).setId(65408))).setId(65409), ISeq(List()).setId(65396)).setId(65410), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""proto"""))))).setId(65412), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(65413), IReturn(ERef(RefId(Id("""__x7__""")))).setId(65414)).setId(65415), ISeq(List()).setId(65396)).setId(65416), ILet(Id("""status"""), ERef(RefId(Id("""__x7__""")))).setId(65417), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(65419), IReturn(ERef(RefId(Id("""__x8__""")))).setId(65420))).setId(65421), ISeq(List()).setId(65396)).setId(65422), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(65424), IReturn(ERef(RefId(Id("""__x9__""")))).setId(65425))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.setPrototypeOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let proto = __x1__
    app __x2__ = (RequireObjectCoercible O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    O = __x2__
    app __x3__ = (Type proto)
    if (! (|| (= __x3__ Object) (= __x3__ Null))) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (Type O)
    if (! (= __x5__ Object)) {
      app __x6__ = (WrapCompletion O)
      return __x6__
    } else {}
    app __x7__ = (O["SetPrototypeOf"] O proto)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let status = __x7__
    if (= status false) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app __x9__ = (WrapCompletion O)
    return __x9__
  }
  */
}
