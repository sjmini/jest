package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(43367), IReturn(ERef(RefId(Id("""__x0__""")))).setId(43368))).setId(43373))
  val instToStepMap: Map[Int, Int] = Map(43367 -> 0, 43368 -> 0, 43369 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43368, 43369, 43367))
  /* Beautified form:
  "AsyncFunctionDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
