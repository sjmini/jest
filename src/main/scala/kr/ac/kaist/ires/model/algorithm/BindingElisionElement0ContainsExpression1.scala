package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElisionElement0ContainsExpression1 {
  val length: Int = 0
  val func: Func = Func("""BindingElisionElement0ContainsExpression1""", List(Id("""this"""), Id("""Elision"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""ContainsExpression""")).setId(28091), IReturn(ERef(RefId(Id("""__x0__""")))).setId(28092))).setId(28097))
  val instToStepMap: Map[Int, Int] = Map(28091 -> 0, 28092 -> 0, 28093 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28092, 28091, 28093))
  /* Beautified form:
  "BindingElisionElement0ContainsExpression1" (this, Elision, BindingElement) => {
    access __x0__ = (BindingElement "ContainsExpression")
    return __x0__
  }
  */
}
