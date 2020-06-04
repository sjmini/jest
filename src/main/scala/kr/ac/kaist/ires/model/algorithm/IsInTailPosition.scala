package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsInTailPosition {
  val length: Int = 1
  val func: Func = Func("""IsInTailPosition""", List(Id("""call""")), None, ISeq(List(IIf(EBool(true), IReturn(EBool(false)).setId(44659), ISeq(List()).setId(44658)).setId(44661), IExpr(ENotSupported("""Etc""")).setId(44663), ILet(Id("""body"""), ENotSupported("""ParentNode""")).setId(44664), IIf(EBOp(OEq, ERef(RefId(Id("""body"""))), ENotSupported("""ParentNode""")), IReturn(EBool(false)).setId(44666), ISeq(List()).setId(44658)).setId(44668), IExpr(ENotSupported("""Etc""")).setId(44663), IExpr(ENotSupported("""Etc""")).setId(44663), IExpr(ENotSupported("""Etc""")).setId(44663), IAccess(Id("""__x0__"""), ERef(RefId(Id("""body"""))), EStr("""HasCallInTailPosition""")).setId(44672), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44673), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44674))).setId(-1))
  /* Beautified form:
  "IsInTailPosition" (call) => {
    if true return false else {}
    !!! "Etc"
    let body = !!! "ParentNode"
    if (= body !!! "ParentNode") return false else {}
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    access __x0__ = (body "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    return __x1__
  }
  */
}
