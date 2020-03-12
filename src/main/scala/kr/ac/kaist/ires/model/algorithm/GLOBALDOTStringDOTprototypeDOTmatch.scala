package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTmatch {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.match""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71861), ILet(Id("""regexp"""), ERef(RefId(Id("""__x0__""")))).setId(71862), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71864), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(71865), IReturn(ERef(RefId(Id("""__x1__""")))).setId(71866)).setId(71867), ISeq(List()).setId(71922)).setId(71869), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(71870), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""regexp"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""regexp"""))), ENull))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""regexp"""))), ERef(RefId(Id("""SYMBOL_match"""))))).setId(71872), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71873), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71874)).setId(71875), ISeq(List()).setId(71929)).setId(71876), ILet(Id("""matcher"""), ERef(RefId(Id("""__x2__""")))).setId(71877), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""matcher"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""matcher"""))), ERef(RefId(Id("""regexp"""))), EList(List(ERef(RefId(Id("""O"""))))))).setId(71879), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71880), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71881)).setId(71882), ISeq(List()).setId(71936)).setId(71883), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(71884), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71885))).setId(71940), ISeq(List()).setId(71941)).setId(71888))).setId(71943), ISeq(List()).setId(71944)).setId(71891), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71893), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(71894), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71895)).setId(71896), ISeq(List()).setId(71950)).setId(71897), ILet(Id("""S"""), ERef(RefId(Id("""__x5__""")))).setId(71898), IApp(Id("""__x6__"""), ERef(RefId(Id("""RegExpCreate"""))), List(ERef(RefId(Id("""regexp"""))), EUndef)).setId(71900), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(71901), IReturn(ERef(RefId(Id("""__x6__""")))).setId(71902)).setId(71903), ISeq(List()).setId(71957)).setId(71904), ILet(Id("""rx"""), ERef(RefId(Id("""__x6__""")))).setId(71905), IApp(Id("""__x7__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""rx"""))), ERef(RefId(Id("""SYMBOL_match"""))), EList(List(ERef(RefId(Id("""S"""))))))).setId(71907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(71908), IReturn(ERef(RefId(Id("""__x7__""")))).setId(71909)).setId(71910), ISeq(List()).setId(71964)).setId(71911), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(71912), IReturn(ERef(RefId(Id("""__x8__""")))).setId(71913))).setId(71968))
  val instToStepMap: Map[Int, Int] = HashMap(71883 -> 7, 71900 -> 10, 71906 -> 10, 71891 -> 8, 71904 -> 10, 71899 -> 9, 71885 -> 7, 71911 -> 11, 71898 -> 9, 71876 -> 7, 71893 -> 9, 71897 -> 9, 71870 -> 1, 71862 -> 0, 71869 -> 1, 71905 -> 10, 71886 -> 7, 71863 -> 0, 71878 -> 7, 71914 -> 11, 71872 -> 7, 71879 -> 7, 71864 -> 1, 71907 -> 11, 71892 -> 8, 71871 -> 1, 71888 -> 7, 71889 -> 7, 71912 -> 11, 71861 -> 0, 71913 -> 11, 71887 -> 7, 71884 -> 7, 71877 -> 7, 71890 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(71863, 71861, 71862), 10 -> HashSet(71905, 71900, 71906, 71904), 1 -> HashSet(71869, 71864, 71871, 71870), 9 -> HashSet(71899, 71898, 71893, 71897), 7 -> HashSet(71883, 71886, 71878, 71872, 71885, 71879, 71888, 71876, 71889, 71887, 71884, 71877, 71890), 11 -> HashSet(71914, 71911, 71907, 71912, 71913), 8 -> HashSet(71891, 71892), 4 -> HashSet(71878, 71872, 71876, 71877))
  /* Beautified form:
  "GLOBAL.String.prototype.match" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let regexp = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (|| (= regexp undefined) (= regexp null))) {
      app __x2__ = (GetMethod regexp SYMBOL_match)
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
    app __x6__ = (RegExpCreate regexp undefined)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let rx = __x6__
    app __x7__ = (Invoke rx SYMBOL_match (new [S]))
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
