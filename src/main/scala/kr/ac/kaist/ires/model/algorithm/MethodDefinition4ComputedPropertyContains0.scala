package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4ComputedPropertyContains0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""ComputedPropertyContains""")).setId(39439), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(39440), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39441))).setId(-1))
  /* Beautified form:
  "MethodDefinition4ComputedPropertyContains0" (this, PropertyName, FunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
