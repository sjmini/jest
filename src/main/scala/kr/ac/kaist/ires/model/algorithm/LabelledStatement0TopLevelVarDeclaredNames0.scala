package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""TopLevelVarDeclaredNames""")).setId(36356), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36357))).setId(36362))
  val instToStepMap: Map[Int, Int] = Map(36356 -> 0, 36357 -> 0, 36358 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36358, 36357, 36356))
  /* Beautified form:
  "LabelledStatement0TopLevelVarDeclaredNames0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "TopLevelVarDeclaredNames")
    return __x0__
  }
  */
}
