package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(39947), IReturn(ERef(RefId(Id("""__x0__""")))).setId(39948))).setId(39953))
  val instToStepMap: Map[Int, Int] = Map(39947 -> 0, 39948 -> 0, 39949 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39948, 39949, 39947))
  /* Beautified form:
  "GeneratorDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, GeneratorBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
