package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTsetPrototypeOf {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.setPrototypeOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65386), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65387), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(65389), ILet(Id("""proto"""), ERef(RefId(Id("""__x1__""")))).setId(65390), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""O"""))))).setId(65392), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65393), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65394)).setId(65395), ISeq(List()).setId(65436)).setId(65397), IAssign(RefId(Id("""O""")), ERef(RefId(Id("""__x2__""")))).setId(65398), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""proto"""))))).setId(65400), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(65401), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65402))).setId(65442), ISeq(List()).setId(65443)).setId(65404), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(65406), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(65407), IReturn(ERef(RefId(Id("""__x6__""")))).setId(65408))).setId(65448), ISeq(List()).setId(65449)).setId(65410), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""proto"""))))).setId(65412), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(65413), IReturn(ERef(RefId(Id("""__x7__""")))).setId(65414)).setId(65415), ISeq(List()).setId(65455)).setId(65416), ILet(Id("""status"""), ERef(RefId(Id("""__x7__""")))).setId(65417), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(65419), IReturn(ERef(RefId(Id("""__x8__""")))).setId(65420))).setId(65460), ISeq(List()).setId(65461)).setId(65422), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(65424), IReturn(ERef(RefId(Id("""__x9__""")))).setId(65425))).setId(65465))
  val instToStepMap: Map[Int, Int] = HashMap(65417 -> 7, 65408 -> 5, 65406 -> 6, 65420 -> 8, 65402 -> 3, 65397 -> 2, 65403 -> 3, 65390 -> 1, 65407 -> 5, 65400 -> 4, 65423 -> 9, 65419 -> 8, 65425 -> 10, 65387 -> 0, 65422 -> 9, 65424 -> 10, 65409 -> 5, 65392 -> 2, 65405 -> 4, 65426 -> 10, 65401 -> 3, 65416 -> 7, 65412 -> 7, 65398 -> 2, 65388 -> 0, 65421 -> 8, 65389 -> 1, 65410 -> 6, 65411 -> 6, 65386 -> 0, 65391 -> 1, 65418 -> 7, 65399 -> 2, 65404 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(65388, 65386, 65387), 5 -> HashSet(65409, 65408, 65407), 10 -> HashSet(65424, 65426, 65425), 1 -> HashSet(65389, 65390, 65391), 6 -> HashSet(65410, 65406, 65411), 9 -> HashSet(65423, 65422), 2 -> HashSet(65392, 65398, 65397, 65399), 7 -> HashSet(65416, 65417, 65412, 65418), 3 -> HashSet(65401, 65402, 65403), 8 -> HashSet(65421, 65420, 65419), 4 -> HashSet(65405, 65400, 65404))
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
