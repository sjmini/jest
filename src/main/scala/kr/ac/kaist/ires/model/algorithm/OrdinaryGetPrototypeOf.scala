package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""OrdinaryGetPrototypeOf""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""O""")), EStr("""Prototype"""))))).setId(49199), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49200))).setId(-1))
  /* Beautified form:
  "OrdinaryGetPrototypeOf" (O) => {
    app __x0__ = (WrapCompletion O["Prototype"])
    return __x0__
  }
  */
}
