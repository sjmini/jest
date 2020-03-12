package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement8VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement8VarDeclaredNames0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32219), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32220))).setId(32225))
  val instToStepMap: Map[Int, Int] = Map(32219 -> 0, 32220 -> 0, 32221 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32219, 32221, 32220))
  /* Beautified form:
  "IterationStatement8VarDeclaredNames0" (this, LeftHandSideExpression, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
