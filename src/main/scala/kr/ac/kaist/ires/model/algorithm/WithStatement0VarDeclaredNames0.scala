package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object WithStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(34162), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34163))).setId(-1))
  /* Beautified form:
  "WithStatement0VarDeclaredNames0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
