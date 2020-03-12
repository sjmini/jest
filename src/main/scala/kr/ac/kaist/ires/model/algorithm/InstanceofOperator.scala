package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object InstanceofOperator {
  val length: Int = 2
  val func: Func = Func("""InstanceofOperator""", List(Id("""V"""), Id("""target""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))).setId(21386), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(21387), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21388))).setId(21434), ISeq(List()).setId(21435)).setId(21391), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""SYMBOL_hasInstance"""))))).setId(21393), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(21394), IReturn(ERef(RefId(Id("""__x2__""")))).setId(21395)).setId(21396), ISeq(List()).setId(21441)).setId(21397), ILet(Id("""instOfHandler"""), ERef(RefId(Id("""__x2__""")))).setId(21398), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""instOfHandler"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""instOfHandler"""))), ERef(RefId(Id("""target"""))), EList(List(ERef(RefId(Id("""V"""))))))).setId(21400), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21401), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21402)).setId(21403), ISeq(List()).setId(21448)).setId(21404), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(21405), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(21406), IReturn(ERef(RefId(Id("""__x4__""")))).setId(21407)).setId(21408), ISeq(List()).setId(21454)).setId(21409), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(21410), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21411))).setId(21458), ISeq(List()).setId(21459)).setId(21414), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""target"""))))).setId(21416), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(21417), IReturn(ERef(RefId(Id("""__x7__""")))).setId(21418))).setId(21464), ISeq(List()).setId(21465)).setId(21420), IApp(Id("""__x8__"""), ERef(RefId(Id("""OrdinaryHasInstance"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""V"""))))).setId(21422), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(21423), IReturn(ERef(RefId(Id("""__x8__""")))).setId(21424)).setId(21425), ISeq(List()).setId(21471)).setId(21426), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(21427), IReturn(ERef(RefId(Id("""__x9__""")))).setId(21428))).setId(21475))
  val instToStepMap: Map[Int, Int] = HashMap(21427 -> 9, 21399 -> 2, 21416 -> 8, 21409 -> 5, 21421 -> 8, 21389 -> 0, 21412 -> 5, 21393 -> 2, 21405 -> 5, 21411 -> 5, 21417 -> 7, 21386 -> 1, 21418 -> 7, 21398 -> 2, 21422 -> 9, 21415 -> 6, 21400 -> 5, 21428 -> 9, 21413 -> 5, 21388 -> 0, 21410 -> 5, 21392 -> 1, 21420 -> 8, 21414 -> 6, 21397 -> 2, 21404 -> 5, 21419 -> 7, 21426 -> 9, 21387 -> 0, 21429 -> 9, 21391 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21389, 21388, 21387), 5 -> HashSet(21409, 21412, 21410, 21405, 21411, 21404, 21400, 21413), 1 -> HashSet(21386, 21392, 21391), 6 -> HashSet(21415, 21414), 9 -> HashSet(21422, 21427, 21428, 21426, 21429), 2 -> HashSet(21398, 21399, 21393, 21397), 7 -> HashSet(21418, 21419, 21417), 8 -> HashSet(21416, 21421, 21420))
  /* Beautified form:
  "InstanceofOperator" (V, target) => {
    app __x0__ = (Type target)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetMethod target SYMBOL_hasInstance)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let instOfHandler = __x2__
    if (! (= instOfHandler undefined)) {
      app __x3__ = (Call instOfHandler target (new [V]))
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (ToBoolean __x3__)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (IsCallable target)
    if (= __x6__ false) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (OrdinaryHasInstance target V)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
