package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclarationList1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclarationList1VarScopedDeclarations0""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""VariableDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""VarScopedDeclarations""")).setId(27506), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(27507), IAppend(ERef(RefId(Id("""VariableDeclaration"""))), ERef(RefId(Id("""declarations""")))).setId(27509), IReturn(ERef(RefId(Id("""declarations""")))).setId(27511))).setId(27518))
  val instToStepMap: Map[Int, Int] = HashMap(27510 -> 1, 27506 -> 0, 27507 -> 0, 27512 -> 2, 27508 -> 0, 27509 -> 1, 27511 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27506, 27507, 27508), 1 -> HashSet(27510, 27509), 2 -> HashSet(27511, 27512))
  /* Beautified form:
  "VariableDeclarationList1VarScopedDeclarations0" (this, VariableDeclarationList, VariableDeclaration) => {
    access __x0__ = (VariableDeclarationList "VarScopedDeclarations")
    let declarations = __x0__
    append VariableDeclaration -> declarations
    return declarations
  }
  */
}
