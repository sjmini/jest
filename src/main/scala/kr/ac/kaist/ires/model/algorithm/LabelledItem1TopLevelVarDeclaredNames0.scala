package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem1TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclaration"""))), EStr("""BoundNames""")).setId(36395), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36396))).setId(-1))
  /* Beautified form:
  "LabelledItem1TopLevelVarDeclaredNames0" (this, FunctionDeclaration) => {
    access __x0__ = (FunctionDeclaration "BoundNames")
    return __x0__
  }
  */
}
