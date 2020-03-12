package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern2BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2BoundNames0""", List(Id("""this"""), Id("""BindingElementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""BoundNames""")).setId(27797), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27798))).setId(27803))
  val instToStepMap: Map[Int, Int] = Map(27797 -> 0, 27798 -> 0, 27799 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27799, 27798, 27797))
  /* Beautified form:
  "ArrayBindingPattern2BoundNames0" (this, BindingElementList) => {
    access __x0__ = (BindingElementList "BoundNames")
    return __x0__
  }
  */
}
