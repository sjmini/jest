package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectBindingPattern0BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern0BindingInitialization0""", List(Id("""this"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(28311), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(28312), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28313))).setId(-1))
  /* Beautified form:
  "ObjectBindingPattern0BindingInitialization0" (this, value, environment) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
