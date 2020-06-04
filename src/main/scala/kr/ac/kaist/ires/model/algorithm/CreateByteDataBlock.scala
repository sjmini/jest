package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateByteDataBlock {
  val length: Int = 1
  val func: Func = Func("""CreateByteDataBlock""", List(Id("""size""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(1967), IExpr(ENotSupported("""Etc""")).setId(1967), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""db"""))))).setId(1968), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1969))).setId(-1))
  /* Beautified form:
  "CreateByteDataBlock" (size) => {
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion db)
    return __x0__
  }
  */
}
