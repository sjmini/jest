package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncIteratorClose {
  val length: Int = 2
  val func: Func = Func("""AsyncIteratorClose""", List(Id("""iteratorRecord"""), Id("""completion""")), None, ISeq(List(ILet(Id("""iterator"""), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator""")))).setId(7598), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""return"""))).setId(7600), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7601), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7602)).setId(7603), ISeq(List()).setId(7597)).setId(7604), ILet(Id("""return"""), ERef(RefId(Id("""__x0__""")))).setId(7605), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))).setId(7607), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(7608), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7609))).setId(7610), ISeq(List()).setId(7597)).setId(7611), IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""iterator"""))))).setId(7613), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x3__""")))).setId(7614), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Value"""))))).setId(7616), IAssign(RefId(Id("""innerResult""")), ERef(RefId(Id("""__x4__""")))).setId(7617))).setId(7618), ISeq(List()).setId(7597)).setId(7619), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))).setId(7621), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(7622), IReturn(ERef(RefId(Id("""__x6__""")))).setId(7623))).setId(7624), ISeq(List()).setId(7597)).setId(7625), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(7627), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(7628), IReturn(ERef(RefId(Id("""__x8__""")))).setId(7629))).setId(7630), ISeq(List()).setId(7597)).setId(7631), IApp(Id("""__x9__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Value"""))))).setId(7633), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(7634), IReturn(ERef(RefId(Id("""__x10__""")))).setId(7635))).setId(7636), ISeq(List()).setId(7597)).setId(7637), IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))).setId(7639), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(7640), IReturn(ERef(RefId(Id("""__x12__""")))).setId(7641))).setId(-1))
  /* Beautified form:
  "AsyncIteratorClose" (iteratorRecord, completion) => {
    let iterator = iteratorRecord["Iterator"]
    app __x0__ = (GetMethod iterator "return")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let return = __x0__
    if (= return undefined) {
      app __x1__ = (Completion completion)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (Call return iterator)
    let innerResult = __x3__
    if (= innerResult["Type"] CONST_normal) {
      app __x4__ = (Await innerResult["Value"])
      innerResult = __x4__
    } else {}
    if (= completion["Type"] CONST_throw) {
      app __x5__ = (Completion completion)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    if (= innerResult["Type"] CONST_throw) {
      app __x7__ = (Completion innerResult)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    } else {}
    app __x9__ = (Type innerResult["Value"])
    if (! (= __x9__ Object)) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    app __x11__ = (Completion completion)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
