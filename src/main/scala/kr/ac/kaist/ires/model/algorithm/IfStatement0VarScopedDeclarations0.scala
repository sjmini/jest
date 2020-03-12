package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(30416), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30417))).setId(30422))
  val instToStepMap: Map[Int, Int] = Map(30416 -> 0, 30417 -> 0, 30418 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30417, 30416, 30418))
  /* Beautified form:
  "IfStatement0VarScopedDeclarations0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
