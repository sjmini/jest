package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement5VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement5VarScopedDeclarations0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32339), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32340))).setId(32345))
  val instToStepMap: Map[Int, Int] = Map(32339 -> 0, 32340 -> 0, 32341 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32341, 32340, 32339))
  /* Beautified form:
  "IterationStatement5VarScopedDeclarations0" (this, LeftHandSideExpression, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
