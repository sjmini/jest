package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement13VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement13VarScopedDeclarations0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32537), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32538))).setId(32543))
  val instToStepMap: Map[Int, Int] = Map(32537 -> 0, 32538 -> 0, 32539 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32539, 32537, 32538))
  /* Beautified form:
  "IterationStatement13VarScopedDeclarations0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
