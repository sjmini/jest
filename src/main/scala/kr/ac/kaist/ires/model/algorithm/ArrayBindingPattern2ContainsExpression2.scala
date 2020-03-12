package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern2ContainsExpression2 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2ContainsExpression2""", List(Id("""this"""), Id("""BindingElementList"""), Id("""Elision""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""ContainsExpression""")).setId(27997), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27998))).setId(28003))
  val instToStepMap: Map[Int, Int] = Map(27997 -> 0, 27998 -> 0, 27999 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27999, 27998, 27997))
  /* Beautified form:
  "ArrayBindingPattern2ContainsExpression2" (this, BindingElementList, Elision) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    return __x0__
  }
  */
}
