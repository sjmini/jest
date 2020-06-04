package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0IsStrict0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0IsStrict0""", List(Id("""this"""), Id("""StatementList""")), None, IIf(EBool(true), IReturn(EBool(true)).setId(46251), IReturn(EBool(false)).setId(46253)).setId(46255))
  /* Beautified form:
  "ScriptBody0IsStrict0" (this, StatementList) => if true return true else return false
  */
}
