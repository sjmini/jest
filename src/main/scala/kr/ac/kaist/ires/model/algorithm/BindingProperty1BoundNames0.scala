package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingProperty1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1BoundNames0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""BoundNames""")).setId(27947), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27948))).setId(27953))
  val instToStepMap: Map[Int, Int] = Map(27947 -> 0, 27948 -> 0, 27949 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27948, 27949, 27947))
  /* Beautified form:
  "BindingProperty1BoundNames0" (this, PropertyName, BindingElement) => {
    access __x0__ = (BindingElement "BoundNames")
    return __x0__
  }
  */
}
