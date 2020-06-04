package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableDeclarationList1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclarationList1VarScopedDeclarations0""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""VariableDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""VarScopedDeclarations""")).setId(27506), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(27507), IAppend(ERef(RefId(Id("""VariableDeclaration"""))), ERef(RefId(Id("""declarations""")))).setId(27509), IReturn(ERef(RefId(Id("""declarations""")))).setId(27511))).setId(-1))
  /* Beautified form:
  "VariableDeclarationList1VarScopedDeclarations0" (this, VariableDeclarationList, VariableDeclaration) => {
    access __x0__ = (VariableDeclarationList "VarScopedDeclarations")
    let declarations = __x0__
    append VariableDeclaration -> declarations
    return declarations
  }
  */
}
