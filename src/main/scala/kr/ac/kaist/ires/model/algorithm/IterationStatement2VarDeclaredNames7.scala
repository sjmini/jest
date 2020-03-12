package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement2VarDeclaredNames7 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement2VarDeclaredNames7""", List(Id("""this"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Expression2"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(31035), IReturn(ERef(RefId(Id("""__x0__""")))).setId(31036))).setId(31041))
  val instToStepMap: Map[Int, Int] = Map(31035 -> 0, 31036 -> 0, 31037 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31036, 31037, 31035))
  /* Beautified form:
  "IterationStatement2VarDeclaredNames7" (this, Expression0, Expression1, Expression2, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
