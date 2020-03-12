package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(37700), IReturn(ERef(RefId(Id("""__x0__""")))).setId(37701))).setId(37706))
  val instToStepMap: Map[Int, Int] = Map(37700 -> 0, 37701 -> 0, 37702 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37700, 37701, 37702))
  /* Beautified form:
  "FunctionDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
