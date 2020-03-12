package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTmatchAll {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.matchAll""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72022), ILet(Id("""regexp"""), ERef(RefId(Id("""__x0__""")))).setId(72023), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72025), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(72026), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72027)).setId(72028), ISeq(List()).setId(72083)).setId(72030), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(72031), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""regexp"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""regexp"""))), ENull))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""regexp"""))), ERef(RefId(Id("""SYMBOL_matchAll"""))))).setId(72033), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72034), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72035)).setId(72036), ISeq(List()).setId(72090)).setId(72037), ILet(Id("""matcher"""), ERef(RefId(Id("""__x2__""")))).setId(72038), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""matcher"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""matcher"""))), ERef(RefId(Id("""regexp"""))), EList(List(ERef(RefId(Id("""O"""))))))).setId(72040), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72041), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72042)).setId(72043), ISeq(List()).setId(72097)).setId(72044), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(72045), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72046))).setId(72101), ISeq(List()).setId(72102)).setId(72049))).setId(72104), ISeq(List()).setId(72105)).setId(72052), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72054), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(72055), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72056)).setId(72057), ISeq(List()).setId(72111)).setId(72058), ILet(Id("""S"""), ERef(RefId(Id("""__x5__""")))).setId(72059), IApp(Id("""__x6__"""), ERef(RefId(Id("""RegExpCreate"""))), List(ERef(RefId(Id("""regexp"""))), EStr("""g"""))).setId(72061), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(72062), IReturn(ERef(RefId(Id("""__x6__""")))).setId(72063)).setId(72064), ISeq(List()).setId(72118)).setId(72065), ILet(Id("""rx"""), ERef(RefId(Id("""__x6__""")))).setId(72066), IApp(Id("""__x7__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""rx"""))), ERef(RefId(Id("""SYMBOL_matchAll"""))), EList(List(ERef(RefId(Id("""S"""))))))).setId(72068), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(72069), IReturn(ERef(RefId(Id("""__x7__""")))).setId(72070)).setId(72071), ISeq(List()).setId(72125)).setId(72072), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(72073), IReturn(ERef(RefId(Id("""__x8__""")))).setId(72074))).setId(72129))
  val instToStepMap: Map[Int, Int] = HashMap(72074 -> 11, 72051 -> 7, 72066 -> 10, 72058 -> 9, 72073 -> 11, 72030 -> 1, 72052 -> 8, 72047 -> 7, 72072 -> 11, 72067 -> 10, 72040 -> 7, 72049 -> 7, 72053 -> 8, 72022 -> 0, 72046 -> 7, 72033 -> 7, 72050 -> 7, 72037 -> 7, 72054 -> 9, 72065 -> 10, 72032 -> 1, 72038 -> 7, 72059 -> 9, 72023 -> 0, 72045 -> 7, 72031 -> 1, 72048 -> 7, 72039 -> 7, 72024 -> 0, 72044 -> 7, 72025 -> 1, 72075 -> 11, 72060 -> 9, 72068 -> 11, 72061 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(72023, 72024, 72022), 10 -> HashSet(72065, 72066, 72067, 72061), 1 -> HashSet(72032, 72031, 72030, 72025), 9 -> HashSet(72054, 72059, 72058, 72060), 7 -> HashSet(72037, 72038, 72045, 72051, 72048, 72039, 72047, 72044, 72040, 72049, 72046, 72033, 72050), 11 -> HashSet(72074, 72073, 72072, 72075, 72068), 8 -> HashSet(72052, 72053), 4 -> HashSet(72033, 72037, 72038, 72039))
  /* Beautified form:
  "GLOBAL.String.prototype.matchAll" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let regexp = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (|| (= regexp undefined) (= regexp null))) {
      app __x2__ = (GetMethod regexp SYMBOL_matchAll)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let matcher = __x2__
      if (! (= matcher undefined)) {
        app __x3__ = (Call matcher regexp (new [O]))
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {}
    app __x5__ = (ToString O)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let S = __x5__
    app __x6__ = (RegExpCreate regexp "g")
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let rx = __x6__
    app __x7__ = (Invoke rx SYMBOL_matchAll (new [S]))
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
