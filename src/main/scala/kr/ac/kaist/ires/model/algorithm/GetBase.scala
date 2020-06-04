package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetBase {
  val length: Int = 1
  val func: Func = Func("""GetBase""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))))).setId(450), IReturn(ERef(RefId(Id("""__x0__""")))).setId(451))).setId(-1))
  /* Beautified form:
  "GetBase" (V) => {
    app __x0__ = (WrapCompletion V["BaseValue"])
    return __x0__
  }
  */
}
