package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsConcatSpreadable {
  val length: Int = 1
  val func: Func = Func("""IsConcatSpreadable""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(76226), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(76227), IReturn(ERef(RefId(Id("""__x1__""")))).setId(76228))).setId(76262), ISeq(List()).setId(76263)).setId(76231), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""SYMBOL_isConcatSpreadable"""))))).setId(76233), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(76234), IReturn(ERef(RefId(Id("""__x2__""")))).setId(76235)).setId(76236), ISeq(List()).setId(76269)).setId(76237), ILet(Id("""spreadable"""), ERef(RefId(Id("""__x2__""")))).setId(76238), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""spreadable"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""spreadable"""))))).setId(76240), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(76241), IReturn(ERef(RefId(Id("""__x3__""")))).setId(76242)).setId(76243), ISeq(List()).setId(76276)).setId(76244), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(76245), IReturn(ERef(RefId(Id("""__x4__""")))).setId(76246))).setId(76280), ISeq(List()).setId(76281)).setId(76248), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""O"""))))).setId(76250), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(76251), IReturn(ERef(RefId(Id("""__x5__""")))).setId(76252)).setId(76253), ISeq(List()).setId(76287)).setId(76254), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(76255), IReturn(ERef(RefId(Id("""__x6__""")))).setId(76256))).setId(76291))
  val instToStepMap: Map[Int, Int] = HashMap(76233 -> 2, 76231 -> 1, 76250 -> 5, 76248 -> 4, 76226 -> 1, 76255 -> 5, 76238 -> 2, 76247 -> 3, 76257 -> 5, 76239 -> 2, 76244 -> 3, 76256 -> 5, 76246 -> 3, 76229 -> 0, 76240 -> 3, 76232 -> 1, 76249 -> 4, 76254 -> 5, 76237 -> 2, 76227 -> 0, 76228 -> 0, 76245 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(76229, 76228, 76227), 5 -> HashSet(76250, 76255, 76257, 76256, 76254), 1 -> HashSet(76231, 76226, 76232), 2 -> HashSet(76233, 76238, 76239, 76237), 3 -> HashSet(76247, 76244, 76246, 76240, 76245), 4 -> HashSet(76248, 76249))
  /* Beautified form:
  "IsConcatSpreadable" (O) => {
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (Get O SYMBOL_isConcatSpreadable)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let spreadable = __x2__
    if (! (= spreadable undefined)) {
      app __x3__ = (ToBoolean spreadable)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (IsArray O)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
