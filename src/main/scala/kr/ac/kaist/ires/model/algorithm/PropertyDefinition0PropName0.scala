package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinition0PropName0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition0PropName0""", List(Id("""this"""), Id("""IdentifierReference""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierReference"""))), EStr("""StringValue""")).setId(14460), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14461))).setId(14466))
  val instToStepMap: Map[Int, Int] = Map(14460 -> 0, 14461 -> 0, 14462 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14462, 14460, 14461))
  /* Beautified form:
  "PropertyDefinition0PropName0" (this, IdentifierReference) => {
    access __x0__ = (IdentifierReference "StringValue")
    return __x0__
  }
  */
}
