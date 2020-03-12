package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(42196), IReturn(ERef(RefId(Id("""__x0__""")))).setId(42197))).setId(42202))
  val instToStepMap: Map[Int, Int] = Map(42196 -> 0, 42197 -> 0, 42198 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42198, 42196, 42197))
  /* Beautified form:
  "ClassDeclaration0BoundNames0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
