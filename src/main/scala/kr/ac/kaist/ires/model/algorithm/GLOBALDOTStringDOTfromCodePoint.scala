package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCodePoint {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.fromCodePoint""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(70296), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""codePoints""")), EStr("""length""")))).setId(70297), ILet(Id("""elements"""), EList(List())).setId(70299), ILet(Id("""nextIndex"""), EINum(0L)).setId(70301), IWhile(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""length""")))), ISeq(List(ILet(Id("""next"""), ERef(RefProp(RefId(Id("""codePoints""")), ERef(RefId(Id("""nextIndex""")))))).setId(70303), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""next"""))))).setId(70305), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(70306), IReturn(ERef(RefId(Id("""__x0__""")))).setId(70307)).setId(70308), ISeq(List()).setId(70309)).setId(70310), ILet(Id("""nextCP"""), ERef(RefId(Id("""__x0__""")))).setId(70311), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""nextCP"""))))).setId(70313), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(70314), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70315)).setId(70316), ISeq(List()).setId(70309)).setId(70317), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(70318), IReturn(ERef(RefId(Id("""__x2__""")))).setId(70319))).setId(70320), ISeq(List()).setId(70309)).setId(70321), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""nextCP"""))), EINum(0L)), EBOp(OLt, EINum(1114111L), ERef(RefId(Id("""nextCP"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(70323), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70324))).setId(70325), ISeq(List()).setId(70309)).setId(70326), IAccess(Id("""__x4__"""), ERef(RefId(Id("""nextCP"""))), EStr("""UTF16Encoding""")).setId(70328), ILet(Id("""__x5__"""), ERef(RefId(Id("""__x4__""")))).setId(70330), ILet(Id("""__x6__"""), EINum(0L)).setId(70331), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x7__"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))).setId(70332), IAppend(ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""elements""")))).setId(70329), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L))).setId(70333))).setId(70334)).setId(70335), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L))).setId(70338))).setId(70340)).setId(70341), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(70343), IReturn(ERef(RefId(Id("""__x8__""")))).setId(70344))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.fromCodePoint" (this, argumentsList, NewTarget) => {
    !!! "Etc"
    let length = codePoints["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codePoints[nextIndex]
      app __x0__ = (ToNumber next)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCP = __x0__
      app __x1__ = (IsInteger nextCP)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      if (= __x1__ false) {
        app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x2__
      } else {}
      if (|| (< nextCP 0i) (< 1114111i nextCP)) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      access __x4__ = (nextCP "UTF16Encoding")
      let __x5__ = __x4__
      let __x6__ = 0i
      while (< __x6__ __x5__["length"]) {
        let __x7__ = __x5__[__x6__]
        append __x7__ -> elements
        __x6__ = (+ __x6__ 1i)
      }
      nextIndex = (+ nextIndex 1i)
    }
    app __x8__ = (WrapCompletion !!! "StringOp")
    return __x8__
  }
  */
}
