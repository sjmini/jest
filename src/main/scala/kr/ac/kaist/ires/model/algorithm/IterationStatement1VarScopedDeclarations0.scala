package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(30905), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30906))).setId(30911))
  val instToStepMap: Map[Int, Int] = Map(30905 -> 0, 30906 -> 0, 30907 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30905, 30906, 30907))
  /* Beautified form:
  "IterationStatement1VarScopedDeclarations0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
