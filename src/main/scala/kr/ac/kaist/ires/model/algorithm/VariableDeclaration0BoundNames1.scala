package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclaration0BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclaration0BoundNames1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(27471), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27472))).setId(27477))
  val instToStepMap: Map[Int, Int] = Map(27472 -> 0, 27473 -> 0, 27471 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27473, 27472, 27471))
  /* Beautified form:
  "VariableDeclaration0BoundNames1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
