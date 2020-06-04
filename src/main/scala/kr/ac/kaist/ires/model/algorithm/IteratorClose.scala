package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorClose {
  val length: Int = 2
  val func: Func = Func("""IteratorClose""", List(Id("""iteratorRecord"""), Id("""completion""")), None, ISeq(List(ILet(Id("""iterator"""), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator""")))).setId(7480), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""return"""))).setId(7482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7483), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7484)).setId(7485), ISeq(List()).setId(7479)).setId(7486), ILet(Id("""return"""), ERef(RefId(Id("""__x0__""")))).setId(7487), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))).setId(7489), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(7490), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7491))).setId(7492), ISeq(List()).setId(7479)).setId(7493), IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""iterator"""))))).setId(7495), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x3__""")))).setId(7496), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))).setId(7498), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(7499), IReturn(ERef(RefId(Id("""__x5__""")))).setId(7500))).setId(7501), ISeq(List()).setId(7479)).setId(7502), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(7504), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(7505), IReturn(ERef(RefId(Id("""__x7__""")))).setId(7506))).setId(7507), ISeq(List()).setId(7479)).setId(7508), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""innerResult""")), EStr("""Value"""))))).setId(7510), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(7511), IReturn(ERef(RefId(Id("""__x9__""")))).setId(7512))).setId(7513), ISeq(List()).setId(7479)).setId(7514), IApp(Id("""__x10__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completion"""))))).setId(7516), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(7517), IReturn(ERef(RefId(Id("""__x11__""")))).setId(7518))).setId(-1))
  /* Beautified form:
  "IteratorClose" (iteratorRecord, completion) => {
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
    if (= completion["Type"] CONST_throw) {
      app __x4__ = (Completion completion)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    if (= innerResult["Type"] CONST_throw) {
      app __x6__ = (Completion innerResult)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (Type innerResult["Value"])
    if (! (= __x8__ Object)) {
      app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x9__
    } else {}
    app __x10__ = (Completion completion)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
