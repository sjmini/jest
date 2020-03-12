package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement7VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7VarScopedDeclarations0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32386), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32387))).setId(32392))
  val instToStepMap: Map[Int, Int] = Map(32386 -> 0, 32387 -> 0, 32388 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32388, 32387, 32386))
  /* Beautified form:
  "IterationStatement7VarScopedDeclarations0" (this, ForDeclaration, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
