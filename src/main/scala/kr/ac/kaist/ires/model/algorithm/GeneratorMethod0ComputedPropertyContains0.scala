package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorMethod0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorMethod0ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""GeneratorBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(39964), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(39965), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39966))).setId(-1))
  /* Beautified form:
  "GeneratorMethod0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, GeneratorBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
