package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsStrictReference {
  val length: Int = 1
  val func: Func = Func("""IsStrictReference""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""StrictReference"""))))).setId(472), IReturn(ERef(RefId(Id("""__x0__""")))).setId(473))).setId(-1))
  /* Beautified form:
  "IsStrictReference" (V) => {
    app __x0__ = (WrapCompletion V["StrictReference"])
    return __x0__
  }
  */
}
