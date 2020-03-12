package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingRestElement1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement1ContainsExpression0""", List(Id("""this"""), Id("""BindingPattern""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""ContainsExpression""")).setId(28149), IReturn(ERef(RefId(Id("""__x0__""")))).setId(28150))).setId(28155))
  val instToStepMap: Map[Int, Int] = Map(28149 -> 0, 28150 -> 0, 28151 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28150, 28151, 28149))
  /* Beautified form:
  "BindingRestElement1ContainsExpression0" (this, BindingPattern) => {
    access __x0__ = (BindingPattern "ContainsExpression")
    return __x0__
  }
  */
}
