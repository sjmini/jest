package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object WithStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(34172), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34173))).setId(34178))
  val instToStepMap: Map[Int, Int] = Map(34172 -> 0, 34173 -> 0, 34174 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34172, 34173, 34174))
  /* Beautified form:
  "WithStatement0VarScopedDeclarations0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
