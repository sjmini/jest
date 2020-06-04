package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Identifier0StringValue0 {
  val length: Int = 0
  val func: Func = Func("""Identifier0StringValue0""", List(Id("""this"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")).setId(13194), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13195))).setId(-1))
  /* Beautified form:
  "Identifier0StringValue0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    return __x0__
  }
  */
}
