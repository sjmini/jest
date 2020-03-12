package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0ContainsExpression3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0ContainsExpression3""", List(Id("""this"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""ContainsExpression""")).setId(27987), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27988))).setId(27993))
  val instToStepMap: Map[Int, Int] = Map(27987 -> 0, 27988 -> 0, 27989 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27987, 27988, 27989))
  /* Beautified form:
  "ArrayBindingPattern0ContainsExpression3" (this, Elision, BindingRestElement) => {
    access __x0__ = (BindingRestElement "ContainsExpression")
    return __x0__
  }
  */
}
