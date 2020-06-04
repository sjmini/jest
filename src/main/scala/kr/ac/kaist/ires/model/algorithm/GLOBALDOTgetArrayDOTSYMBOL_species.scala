package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetArrayDOTSYMBOL_species {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getArray.SYMBOL_species""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""this"""))))).setId(75868), IReturn(ERef(RefId(Id("""__x0__""")))).setId(75869))).setId(-1))
  /* Beautified form:
  "GLOBAL.getArray.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }
  */
}
