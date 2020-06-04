package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetGeneratorKind {
  val length: Int = 0
  val func: Func = Func("""GetGeneratorKind""", List(), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10714), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_nongenerator"""))))).setId(10716), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10717))).setId(10718), ISeq(List()).setId(10719)).setId(10720), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(10722), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_async"""))))).setId(10724), IReturn(ERef(RefId(Id("""__x1__""")))).setId(10725))).setId(10726), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""CONST_sync"""))))).setId(10727), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10728))).setId(10729)).setId(10730))).setId(-1))
  /* Beautified form:
  "GetGeneratorKind" () => {
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
