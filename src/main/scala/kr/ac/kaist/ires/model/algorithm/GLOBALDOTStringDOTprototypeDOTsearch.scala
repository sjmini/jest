package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTsearch {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.search""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72994), ILet(Id("""regexp"""), ERef(RefId(Id("""__x0__""")))).setId(72995), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72997), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(72998), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72999)).setId(73000), ISeq(List()).setId(73055)).setId(73002), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(73003), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""regexp"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""regexp"""))), ENull))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""regexp"""))), ERef(RefId(Id("""SYMBOL_search"""))))).setId(73005), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(73006), IReturn(ERef(RefId(Id("""__x2__""")))).setId(73007)).setId(73008), ISeq(List()).setId(73062)).setId(73009), ILet(Id("""searcher"""), ERef(RefId(Id("""__x2__""")))).setId(73010), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""searcher"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""searcher"""))), ERef(RefId(Id("""regexp"""))), EList(List(ERef(RefId(Id("""O"""))))))).setId(73012), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(73013), IReturn(ERef(RefId(Id("""__x3__""")))).setId(73014)).setId(73015), ISeq(List()).setId(73069)).setId(73016), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(73017), IReturn(ERef(RefId(Id("""__x4__""")))).setId(73018))).setId(73073), ISeq(List()).setId(73074)).setId(73021))).setId(73076), ISeq(List()).setId(73077)).setId(73024), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(73026), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(73027), IReturn(ERef(RefId(Id("""__x5__""")))).setId(73028)).setId(73029), ISeq(List()).setId(73083)).setId(73030), ILet(Id("""string"""), ERef(RefId(Id("""__x5__""")))).setId(73031), IApp(Id("""__x6__"""), ERef(RefId(Id("""RegExpCreate"""))), List(ERef(RefId(Id("""regexp"""))), EUndef)).setId(73033), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(73034), IReturn(ERef(RefId(Id("""__x6__""")))).setId(73035)).setId(73036), ISeq(List()).setId(73090)).setId(73037), ILet(Id("""rx"""), ERef(RefId(Id("""__x6__""")))).setId(73038), IApp(Id("""__x7__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""rx"""))), ERef(RefId(Id("""SYMBOL_search"""))), EList(List(ERef(RefId(Id("""string"""))))))).setId(73040), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(73041), IReturn(ERef(RefId(Id("""__x7__""")))).setId(73042)).setId(73043), ISeq(List()).setId(73097)).setId(73044), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(73045), IReturn(ERef(RefId(Id("""__x8__""")))).setId(73046))).setId(73101))
  val instToStepMap: Map[Int, Int] = HashMap(73012 -> 7, 72995 -> 0, 73039 -> 10, 73020 -> 7, 73003 -> 1, 73045 -> 11, 73038 -> 10, 73019 -> 7, 72997 -> 1, 73010 -> 7, 73022 -> 7, 73030 -> 9, 73040 -> 11, 73033 -> 10, 73016 -> 7, 73021 -> 7, 73031 -> 9, 73044 -> 11, 73018 -> 7, 73017 -> 7, 73004 -> 1, 73032 -> 9, 73009 -> 7, 72996 -> 0, 73046 -> 11, 73025 -> 8, 73024 -> 8, 73011 -> 7, 73037 -> 10, 73047 -> 11, 73005 -> 7, 73002 -> 1, 73023 -> 7, 73026 -> 9, 72994 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(72995, 72996, 72994), 10 -> HashSet(73033, 73039, 73038, 73037), 1 -> HashSet(73004, 73003, 72997, 73002), 9 -> HashSet(73031, 73032, 73030, 73026), 7 -> HashSet(73012, 73016, 73017, 73009, 73020, 73019, 73010, 73011, 73022, 73005, 73023, 73021, 73018), 11 -> HashSet(73044, 73045, 73046, 73047, 73040), 8 -> HashSet(73025, 73024), 4 -> HashSet(73009, 73010, 73011, 73005))
  /* Beautified form:
  "GLOBAL.String.prototype.search" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let regexp = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (|| (= regexp undefined) (= regexp null))) {
      app __x2__ = (GetMethod regexp SYMBOL_search)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let searcher = __x2__
      if (! (= searcher undefined)) {
        app __x3__ = (Call searcher regexp (new [O]))
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {}
    app __x5__ = (ToString O)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let string = __x5__
    app __x6__ = (RegExpCreate regexp undefined)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let rx = __x6__
    app __x7__ = (Invoke rx SYMBOL_search (new [string]))
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
