package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTSetMutableBinding {
  val length: Int = 3
  val func: Func = Func("""DeclarativeEnvironmentRecord.SetMutableBinding""", List(Id("""this"""), Id("""N"""), Id("""V"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47202), IIf(EBOp(OEq, EAbsent, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""S"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47204), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47205))).setId(47249), ISeq(List()).setId(47250)).setId(47208), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""N"""))), EBool(true))).setId(47210), IExpr(ERef(RefId(Id("""__x1__""")))).setId(47211), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))))).setId(47213), IExpr(ERef(RefId(Id("""__x2__""")))).setId(47214), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47216), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(47217), IReturn(ERef(RefId(Id("""__x4__""")))).setId(47218))).setId(47259), ISeq(List()).setId(47260)).setId(47221), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""strict"""))))), ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""strict""")))), IAssign(RefId(Id("""S""")), EBool(true)).setId(47223), ISeq(List()).setId(47263)).setId(47225), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))))), EUOp(ONot, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47227), IReturn(ERef(RefId(Id("""__x5__""")))).setId(47228))).setId(47267), IIf(EBOp(OEq, ETypeOf(ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))))), EStr("""MutableBinding""")), IAssign(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""BoundValue""")), ERef(RefId(Id("""V""")))).setId(47230), IIf(EBOp(OEq, ERef(RefId(Id("""S"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47231), IReturn(ERef(RefId(Id("""__x6__""")))).setId(47232))).setId(47271), ISeq(List()).setId(47272)).setId(47234)).setId(47237)).setId(47239), IApp(Id("""__x7__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47241), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(47242), IReturn(ERef(RefId(Id("""__x8__""")))).setId(47243))).setId(47279))
  val instToStepMap: Map[Int, Int] = HashMap(47229 -> 11, 47211 -> 7, 47221 -> 8, 47235 -> 16, 47218 -> 7, 47239 -> 16, 47231 -> 16, 47237 -> 16, 47228 -> 11, 47223 -> 9, 47225 -> 10, 47233 -> 16, 47227 -> 11, 47241 -> 17, 47216 -> 7, 47234 -> 16, 47217 -> 7, 47202 -> 0, 47206 -> 3, 47244 -> 17, 47232 -> 16, 47215 -> 7, 47222 -> 8, 47207 -> 16, 47243 -> 17, 47203 -> 0, 47226 -> 10, 47214 -> 7, 47236 -> 16, 47204 -> 3, 47208 -> 7, 47242 -> 17, 47210 -> 7, 47240 -> 16, 47219 -> 7, 47213 -> 7, 47230 -> 12, 47212 -> 7, 47238 -> 16, 47224 -> 9, 47205 -> 3, 47220 -> 7, 47209 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47202, 47203), 5 -> HashSet(47211, 47210, 47212), 10 -> HashSet(47226, 47225), 6 -> HashSet(47215, 47214, 47213), 9 -> HashSet(47223, 47224), 17 -> HashSet(47244, 47243, 47242, 47241), 12 -> HashSet(47230), 7 -> HashSet(47216, 47211, 47217, 47215, 47218, 47214, 47208, 47213, 47212, 47210, 47219, 47220, 47209), 3 -> HashSet(47206, 47204, 47205), 16 -> HashSet(47234, 47232, 47235, 47207, 47239, 47236, 47231, 47237, 47240, 47233, 47238), 11 -> HashSet(47229, 47228, 47227), 8 -> HashSet(47221, 47222), 4 -> HashSet(47208, 47209), 15 -> HashSet(47207))
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
