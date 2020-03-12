package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement7ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(32048), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(32049), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32050))).setId(32056))
  val instToStepMap: Map[Int, Int] = Map(32048 -> 0, 32049 -> 0, 32050 -> 0, 32051 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32051, 32050, 32048, 32049))
  /* Beautified form:
  "IterationStatement7ContainsUndefinedContinueTarget0" (this, ForDeclaration, Expression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
