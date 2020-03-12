package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""VariableStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""VariableDeclarationList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""BoundNames""")).setId(27491), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27492))).setId(27497))
  val instToStepMap: Map[Int, Int] = Map(27491 -> 0, 27492 -> 0, 27493 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27492, 27493, 27491))
  /* Beautified form:
  "VariableStatement0VarDeclaredNames0" (this, VariableDeclarationList) => {
    access __x0__ = (VariableDeclarationList "BoundNames")
    return __x0__
  }
  */
}
