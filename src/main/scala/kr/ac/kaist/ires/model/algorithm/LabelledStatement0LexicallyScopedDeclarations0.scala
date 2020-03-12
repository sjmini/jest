package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""LexicallyScopedDeclarations""")).setId(36326), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36327))).setId(36332))
  val instToStepMap: Map[Int, Int] = Map(36326 -> 0, 36327 -> 0, 36328 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36327, 36328, 36326))
  /* Beautified form:
  "LabelledStatement0LexicallyScopedDeclarations0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "LexicallyScopedDeclarations")
    return __x0__
  }
  */
}
