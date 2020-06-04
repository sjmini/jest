package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTcreate {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.create""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63768), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(63769), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(63771), ILet(Id("""Properties"""), ERef(RefId(Id("""__x1__""")))).setId(63772), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(63774), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63775), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63776))).setId(63777), ISeq(List()).setId(63778)).setId(63779), IApp(Id("""__x4__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""O"""))))).setId(63781), ILet(Id("""obj"""), ERef(RefId(Id("""__x4__""")))).setId(63782), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Properties"""))), EUndef)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ObjectDefineProperties"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""Properties"""))))).setId(63784), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(63785), IReturn(ERef(RefId(Id("""__x5__""")))).setId(63786)).setId(63787), ISeq(List()).setId(63778)).setId(63788), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(63789), IReturn(ERef(RefId(Id("""__x6__""")))).setId(63790))).setId(63792), ISeq(List()).setId(63778)).setId(63793), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(63795), IReturn(ERef(RefId(Id("""__x7__""")))).setId(63796))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.create" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let Properties = __x1__
    app __x2__ = (Type O)
    if (! (|| (= __x2__ Object) (= __x2__ Null))) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (ObjectCreate O)
    let obj = __x4__
    if (! (= Properties undefined)) {
      app __x5__ = (ObjectDefineProperties obj Properties)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (WrapCompletion obj)
    return __x7__
  }
  */
}
