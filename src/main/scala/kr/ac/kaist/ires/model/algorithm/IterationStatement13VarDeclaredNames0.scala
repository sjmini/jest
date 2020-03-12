package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement13VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement13VarDeclaredNames0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32329), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32330))).setId(32335))
  val instToStepMap: Map[Int, Int] = Map(32329 -> 0, 32330 -> 0, 32331 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32331, 32329, 32330))
  /* Beautified form:
  "IterationStatement13VarDeclaredNames0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
