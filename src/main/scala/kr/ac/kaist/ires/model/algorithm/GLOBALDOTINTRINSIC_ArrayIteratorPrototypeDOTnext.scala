package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_ArrayIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_ArrayIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(83767), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(83769), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83770), IReturn(ERef(RefId(Id("""__x1__""")))).setId(83771))).setId(83772), ISeq(List()).setId(83773)).setId(83774), IIf(EBOp(OOr, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")))), EBOp(OOr, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")))), EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIterationKind""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83776), IReturn(ERef(RefId(Id("""__x2__""")))).setId(83777))).setId(83778), ISeq(List()).setId(83773)).setId(83779), ILet(Id("""a"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")))).setId(83781), IIf(EBOp(OEq, ERef(RefId(Id("""a"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(83783), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(83784), IReturn(ERef(RefId(Id("""__x4__""")))).setId(83785))).setId(83786), ISeq(List()).setId(83773)).setId(83787), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")))).setId(83789), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIterationKind""")))).setId(83791), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""a""")), EStr("""TypedArrayName"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefProp(RefId(Id("""a""")), EStr("""ViewedArrayBuffer"""))))).setId(83793), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83794), IReturn(ERef(RefId(Id("""__x6__""")))).setId(83795))).setId(83796), ISeq(List()).setId(83773)).setId(83797), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""a""")), EStr("""ArrayLength""")))).setId(83799))).setId(83801), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""a"""))))).setId(83802), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(83803), IReturn(ERef(RefId(Id("""__x7__""")))).setId(83804)).setId(83805), ISeq(List()).setId(83773)).setId(83806), ILet(Id("""len"""), ERef(RefId(Id("""__x7__""")))).setId(83807))).setId(83809)).setId(83810), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")), EUndef).setId(83812), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(83814), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(83815), IReturn(ERef(RefId(Id("""__x9__""")))).setId(83816))).setId(83818), ISeq(List()).setId(83773)).setId(83819), IAssign(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(83821), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key""")), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""index"""))), EBool(false))).setId(83823), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(83824), IReturn(ERef(RefId(Id("""__x11__""")))).setId(83825))).setId(83826), ISeq(List()).setId(83773)).setId(83827), IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(83829), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(83830), IReturn(ERef(RefId(Id("""__x12__""")))).setId(83831)).setId(83832), ISeq(List()).setId(83773)).setId(83833), ILet(Id("""elementKey"""), ERef(RefId(Id("""__x12__""")))).setId(83834), IApp(Id("""__x13__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""a"""))), ERef(RefId(Id("""elementKey"""))))).setId(83836), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(83837), IReturn(ERef(RefId(Id("""__x13__""")))).setId(83838)).setId(83839), ISeq(List()).setId(83773)).setId(83840), ILet(Id("""elementValue"""), ERef(RefId(Id("""__x13__""")))).setId(83841), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""value""")), ILet(Id("""result"""), ERef(RefId(Id("""elementValue""")))).setId(83843), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementValue"""))))))).setId(83845), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(83846), IReturn(ERef(RefId(Id("""__x14__""")))).setId(83847)).setId(83848), ISeq(List()).setId(83773)).setId(83849), ILet(Id("""result"""), ERef(RefId(Id("""__x14__""")))).setId(83850))).setId(83852)).setId(83853), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""result"""))), EBool(false))).setId(83855), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(83856), IReturn(ERef(RefId(Id("""__x16__""")))).setId(83857))).setId(-1))
  /* Beautified form:
  "GLOBAL.INTRINSIC_ArrayIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= absent O["IteratedObject"]) (|| (= absent O["ArrayIteratorNextIndex"]) (= absent O["ArrayIterationKind"]))) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let a = O["IteratedObject"]
    if (= a undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let index = O["ArrayIteratorNextIndex"]
    let itemKind = O["ArrayIterationKind"]
    if (! (= a["TypedArrayName"] absent)) {
      app __x5__ = (IsDetachedBuffer a["ViewedArrayBuffer"])
      if (= __x5__ true) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      let len = a["ArrayLength"]
    } else {
      app __x7__ = (LengthOfArrayLike a)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let len = __x7__
    }
    if (! (< index len)) {
      O["IteratedObject"] = undefined
      app __x8__ = (CreateIterResultObject undefined true)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    O["ArrayIteratorNextIndex"] = (+ index 1i)
    if (= itemKind "key") {
      app __x10__ = (CreateIterResultObject index false)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (ToString index)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let elementKey = __x12__
    app __x13__ = (Get a elementKey)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let elementValue = __x13__
    if (= itemKind "value") let result = elementValue else {
      app __x14__ = (CreateArrayFromList (new [index, elementValue]))
      if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let result = __x14__
    }
    app __x15__ = (CreateIterResultObject result false)
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
