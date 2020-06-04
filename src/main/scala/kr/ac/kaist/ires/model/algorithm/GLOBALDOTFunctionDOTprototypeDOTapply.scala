package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTapply {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Function.prototype.apply""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(66721), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x0__""")))).setId(66722), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(66724), ILet(Id("""argArray"""), ERef(RefId(Id("""__x1__""")))).setId(66725), ILet(Id("""func"""), ERef(RefId(Id("""this""")))).setId(66727), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))).setId(66729), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66730), IReturn(ERef(RefId(Id("""__x3__""")))).setId(66731))).setId(66732), ISeq(List()).setId(66733)).setId(66734), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""argArray"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""argArray"""))), ENull)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""PrepareForTailCall"""))), List()).setId(66736), IExpr(ERef(RefId(Id("""__x4__""")))).setId(66737), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""thisArg"""))))).setId(66739), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(66740), IReturn(ERef(RefId(Id("""__x5__""")))).setId(66741)).setId(66742), ISeq(List()).setId(66733)).setId(66743), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(66744), IReturn(ERef(RefId(Id("""__x6__""")))).setId(66745))).setId(66747), ISeq(List()).setId(66733)).setId(66748), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateListFromArrayLike"""))), List(ERef(RefId(Id("""argArray"""))))).setId(66750), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(66751), IReturn(ERef(RefId(Id("""__x7__""")))).setId(66752)).setId(66753), ISeq(List()).setId(66733)).setId(66754), ILet(Id("""argList"""), ERef(RefId(Id("""__x7__""")))).setId(66755), IApp(Id("""__x8__"""), ERef(RefId(Id("""PrepareForTailCall"""))), List()).setId(66757), IExpr(ERef(RefId(Id("""__x8__""")))).setId(66758), IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""thisArg"""))), ERef(RefId(Id("""argList"""))))).setId(66760), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(66761), IReturn(ERef(RefId(Id("""__x9__""")))).setId(66762)).setId(66763), ISeq(List()).setId(66733)).setId(66764), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(66765), IReturn(ERef(RefId(Id("""__x10__""")))).setId(66766))).setId(-1))
  /* Beautified form:
  "GLOBAL.Function.prototype.apply" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argArray = __x1__
    let func = this
    app __x2__ = (IsCallable func)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (|| (= argArray undefined) (= argArray null)) {
      app __x4__ = (PrepareForTailCall )
      __x4__
      app __x5__ = (Call func thisArg)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (CreateListFromArrayLike argArray)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let argList = __x7__
    app __x8__ = (PrepareForTailCall )
    __x8__
    app __x9__ = (Call func thisArg argList)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
