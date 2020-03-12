package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertySetParameterList0ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""PropertySetParameterList0ExpectedArgumentCount0""", List(Id("""this"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""HasInitializer""")).setId(39467), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EINum(0L)).setId(39468), ISeq(List()).setId(39478)).setId(39471), IReturn(EINum(1L)).setId(39473))).setId(39481))
  val instToStepMap: Map[Int, Int] = HashMap(39467 -> 1, 39468 -> 0, 39471 -> 1, 39472 -> 1, 39473 -> 2, 39469 -> 0, 39474 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39468, 39469), 1 -> HashSet(39467, 39471, 39472), 2 -> HashSet(39474, 39473))
  /* Beautified form:
  "PropertySetParameterList0ExpectedArgumentCount0" (this, FormalParameter) => {
    access __x0__ = (FormalParameter "HasInitializer")
    if (= __x0__ true) return 0i else {}
    return 1i
  }
  */
}
