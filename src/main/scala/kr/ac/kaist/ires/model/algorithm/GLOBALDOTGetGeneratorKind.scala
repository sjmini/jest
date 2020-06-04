package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGetGeneratorKind {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.GetGeneratorKind""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(89328), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_nongenerator"""))))).setId(89330), IReturn(ERef(RefId(Id("""__x0__""")))).setId(89331))).setId(89332), ISeq(List()).setId(89333)).setId(89334), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(89336), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_async"""))))).setId(89338), IReturn(ERef(RefId(Id("""__x1__""")))).setId(89339))).setId(89340), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_sync"""))))).setId(89341), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89342))).setId(89343)).setId(89344))).setId(-1))
  /* Beautified form:
  "GLOBAL.GetGeneratorKind" (this, argumentsList, NewTarget) => {
    let genContext = GLOBAL_context
    if (= genContext["Generator"] absent) {
      app __x0__ = (WrapCompletion CONST_nongenerator)
      return __x0__
    } else {}
    let generator = genContext["Generator"]
    if (! (= generator["AsyncGeneratorState"] absent)) {
      app __x1__ = (WrapCompletion CONST_async)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion CONST_sync)
      return __x2__
    }
  }
  */
}
