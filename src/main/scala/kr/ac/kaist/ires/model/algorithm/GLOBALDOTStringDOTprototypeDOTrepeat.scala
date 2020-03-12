package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTrepeat {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.repeat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72548), ILet(Id("""count"""), ERef(RefId(Id("""__x0__""")))).setId(72549), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72551), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(72552), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72553)).setId(72554), ISeq(List()).setId(72598)).setId(72556), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(72557), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72559), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72560), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72561)).setId(72562), ISeq(List()).setId(72605)).setId(72563), ILet(Id("""S"""), ERef(RefId(Id("""__x2__""")))).setId(72564), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""count"""))))).setId(72566), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72567), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72568)).setId(72569), ISeq(List()).setId(72612)).setId(72570), ILet(Id("""n"""), ERef(RefId(Id("""__x3__""")))).setId(72571), IIf(EBOp(OLt, ERef(RefId(Id("""n"""))), EINum(0L)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(72573), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72574))).setId(72617), ISeq(List()).setId(72618)).setId(72576), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(72578), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72579))).setId(72622), ISeq(List()).setId(72623)).setId(72581), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))).setId(72583), IReturn(ERef(RefId(Id("""__x6__""")))).setId(72584))).setId(72627), ISeq(List()).setId(72628)).setId(72586), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(72588), IReturn(ERef(RefId(Id("""__x7__""")))).setId(72589))).setId(72632))
  val instToStepMap: Map[Int, Int] = HashMap(72558 -> 1, 72583 -> 8, 72551 -> 1, 72576 -> 5, 72557 -> 1, 72570 -> 3, 72575 -> 4, 72565 -> 2, 72581 -> 7, 72549 -> 0, 72550 -> 0, 72563 -> 2, 72578 -> 6, 72572 -> 3, 72587 -> 9, 72579 -> 6, 72564 -> 2, 72590 -> 10, 72584 -> 8, 72586 -> 9, 72571 -> 3, 72548 -> 0, 72580 -> 6, 72573 -> 4, 72585 -> 8, 72566 -> 3, 72588 -> 10, 72556 -> 1, 72589 -> 10, 72582 -> 7, 72559 -> 2, 72577 -> 5, 72574 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(72550, 72548, 72549), 5 -> HashSet(72576, 72577), 10 -> HashSet(72590, 72588, 72589), 1 -> HashSet(72558, 72551, 72557, 72556), 6 -> HashSet(72578, 72579, 72580), 9 -> HashSet(72587, 72586), 2 -> HashSet(72563, 72564, 72565, 72559), 7 -> HashSet(72581, 72582), 3 -> HashSet(72572, 72571, 72570, 72566), 8 -> HashSet(72583, 72584, 72585), 4 -> HashSet(72575, 72573, 72574))
  /* Beautified form:
  "GLOBAL.String.prototype.repeat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let count = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    app __x3__ = (ToInteger count)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let n = __x3__
    if (< n 0i) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    if (= n Infinity) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (= n 0i) {
      app __x6__ = (WrapCompletion "")
      return __x6__
    } else {}
    app __x7__ = (WrapCompletion !!! "StringOp")
    return __x7__
  }
  */
}
