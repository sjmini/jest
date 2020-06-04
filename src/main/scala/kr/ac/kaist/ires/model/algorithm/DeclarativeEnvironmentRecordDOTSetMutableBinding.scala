package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTSetMutableBinding {
  val length: Int = 3
  val func: Func = Func("""DeclarativeEnvironmentRecord.SetMutableBinding""", List(Id("""this"""), Id("""N"""), Id("""V"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47202), IIf(EBOp(OEq, EAbsent, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""S"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47204), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47205))).setId(47206), ISeq(List()).setId(47207)).setId(47208), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""N"""))), EBool(true))).setId(47210), IExpr(ERef(RefId(Id("""__x1__""")))).setId(47211), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))))).setId(47213), IExpr(ERef(RefId(Id("""__x2__""")))).setId(47214), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47216), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(47217), IReturn(ERef(RefId(Id("""__x4__""")))).setId(47218))).setId(47220), ISeq(List()).setId(47207)).setId(47221), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""strict"""))))), ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""strict""")))), IAssign(RefId(Id("""S""")), EBool(true)).setId(47223), ISeq(List()).setId(47207)).setId(47225), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))))), EUOp(ONot, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47227), IReturn(ERef(RefId(Id("""__x5__""")))).setId(47228))).setId(47229), IIf(EBOp(OEq, ETypeOf(ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))))), EStr("""MutableBinding""")), IAssign(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""BoundValue""")), ERef(RefId(Id("""V""")))).setId(47230), IIf(EBOp(OEq, ERef(RefId(Id("""S"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47231), IReturn(ERef(RefId(Id("""__x6__""")))).setId(47232))).setId(47233), ISeq(List()).setId(47207)).setId(47234)).setId(47237)).setId(47239), IApp(Id("""__x7__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47241), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(47242), IReturn(ERef(RefId(Id("""__x8__""")))).setId(47243))).setId(-1))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.SetMutableBinding" (this, N, V, S) => {
    let envRec = this
    if (= absent envRec["SubMap"][N]) {
      if (= S true) {
        app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x0__
      } else {}
      app __x1__ = (envRec["CreateMutableBinding"] envRec N true)
      __x1__
      app __x2__ = (envRec["InitializeBinding"] envRec N V)
      __x2__
      app __x3__ = (NormalCompletion CONST_empty)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    if (&& (! (= absent envRec["SubMap"][N]["strict"])) envRec["SubMap"][N]["strict"]) S = true else {}
    if (&& (! (= absent envRec["SubMap"][N]["initialized"])) (! envRec["SubMap"][N]["initialized"])) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else if (= (typeof envRec["SubMap"][N]) "MutableBinding") envRec["SubMap"][N]["BoundValue"] = V else if (= S true) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (NormalCompletion CONST_empty)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
