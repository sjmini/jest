package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElement0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement0ComputedPropertyContains0""", List(Id("""this"""), Id("""MethodDefinition"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MethodDefinition"""))), EStr("""ComputedPropertyContains""")).setId(42421), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(42423))).setId(-1))
  /* Beautified form:
  "ClassElement0ComputedPropertyContains0" (this, MethodDefinition, symbol) => {
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
