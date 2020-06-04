package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateListFromArrayLike {
  val length: Int = 1
  val func: Func = Func("""CreateListFromArrayLike""", List(Id("""obj"""), Id("""elementTypes""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""elementTypes"""))), EAbsent), IAssign(RefId(Id("""elementTypes""")), EList(List(ERef(RefId(Id("""Undefined"""))), ERef(RefId(Id("""Null"""))), ERef(RefId(Id("""Boolean"""))), ERef(RefId(Id("""String"""))), ERef(RefId(Id("""Symbol"""))), ERef(RefId(Id("""Number"""))), ERef(RefId(Id("""Object""")))))).setId(6052), ISeq(List()).setId(6054)).setId(6055), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""obj"""))))).setId(6057), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6058), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6059))).setId(6060), ISeq(List()).setId(6054)).setId(6061), IApp(Id("""__x2__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""obj"""))))).setId(6063), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(6064), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6065)).setId(6066), ISeq(List()).setId(6054)).setId(6067), ILet(Id("""len"""), ERef(RefId(Id("""__x2__""")))).setId(6068), ILet(Id("""list"""), EList(List())).setId(6070), ILet(Id("""index"""), EINum(0L)).setId(6072), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(6074), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(6075), IReturn(ERef(RefId(Id("""__x3__""")))).setId(6076)).setId(6077), ISeq(List()).setId(6054)).setId(6078), ILet(Id("""indexName"""), ERef(RefId(Id("""__x3__""")))).setId(6079), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""indexName"""))))).setId(6081), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(6082), IReturn(ERef(RefId(Id("""__x4__""")))).setId(6083)).setId(6084), ISeq(List()).setId(6054)).setId(6085), ILet(Id("""next"""), ERef(RefId(Id("""__x4__""")))).setId(6086), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""next"""))))).setId(6088), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""elementTypes"""))), ERef(RefId(Id("""__x5__"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6089), IReturn(ERef(RefId(Id("""__x6__""")))).setId(6090))).setId(6091), ISeq(List()).setId(6054)).setId(6092), IAppend(ERef(RefId(Id("""next"""))), ERef(RefId(Id("""list""")))).setId(6094), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(6096))).setId(6098)).setId(6099), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""list"""))))).setId(6101), IReturn(ERef(RefId(Id("""__x7__""")))).setId(6102))).setId(-1))
  /* Beautified form:
  "CreateListFromArrayLike" (obj, elementTypes) => {
    if (= elementTypes absent) elementTypes = (new [Undefined, Null, Boolean, String, Symbol, Number, Object]) else {}
    app __x0__ = (Type obj)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (LengthOfArrayLike obj)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    let list = (new [])
    let index = 0i
    while (< index len) {
      app __x3__ = (ToString index)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let indexName = __x3__
      app __x4__ = (Get obj indexName)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let next = __x4__
      app __x5__ = (Type next)
      if (! (contains elementTypes __x5__)) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      append next -> list
      index = (+ index 1i)
    }
    app __x7__ = (WrapCompletion list)
    return __x7__
  }
  */
}
