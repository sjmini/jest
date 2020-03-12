package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement10VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement10VarScopedDeclarations0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32527), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32528))).setId(32533))
  val instToStepMap: Map[Int, Int] = Map(32528 -> 0, 32529 -> 0, 32527 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32529, 32527, 32528))
  /* Beautified form:
  "IterationStatement10VarScopedDeclarations0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
