package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition3Contains0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition3Contains0""", List(Id("""this"""), Id("""MethodDefinition"""), Id("""symbol""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """MethodDefinition"""), IReturn(EBool(true)).setId(14395), ISeq(List()).setId(14397)).setId(14398), IAccess(Id("""__x0__"""), ERef(RefId(Id("""MethodDefinition"""))), EStr("""ComputedPropertyContains""")).setId(14402), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(14403), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14404))).setId(-1))
  /* Beautified form:
  "PropertyDefinition3Contains0" (this, MethodDefinition, symbol) => {
    if (is-instance-of symbol MethodDefinition) return true else {}
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
