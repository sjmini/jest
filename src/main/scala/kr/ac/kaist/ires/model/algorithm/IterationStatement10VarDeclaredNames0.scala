package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement10VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement10VarDeclaredNames0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32319), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32320))).setId(32325))
  val instToStepMap: Map[Int, Int] = Map(32320 -> 0, 32321 -> 0, 32319 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32319, 32320, 32321))
  /* Beautified form:
  "IterationStatement10VarDeclaredNames0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
