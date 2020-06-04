package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryPreventExtensions {
  val length: Int = 1
  val func: Func = Func("""OrdinaryPreventExtensions""", List(Id("""O""")), None, ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""Extensible""")), EBool(false)).setId(49411), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49413), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49414))).setId(-1))
  /* Beautified form:
  "OrdinaryPreventExtensions" (O) => {
    O["Extensible"] = false
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
