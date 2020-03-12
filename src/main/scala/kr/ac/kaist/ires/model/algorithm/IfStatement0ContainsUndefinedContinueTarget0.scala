package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(30313), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(30314), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30315))).setId(30321))
  val instToStepMap: Map[Int, Int] = Map(30313 -> 0, 30314 -> 0, 30315 -> 0, 30316 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30315, 30314, 30313, 30316))
  /* Beautified form:
  "IfStatement0ContainsUndefinedContinueTarget0" (this, Expression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
