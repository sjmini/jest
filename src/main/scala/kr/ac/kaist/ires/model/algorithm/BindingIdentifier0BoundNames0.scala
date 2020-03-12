package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier0BoundNames0""", List(Id("""this"""), Id("""Identifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Identifier"""))), EStr("""StringValue""")).setId(13124), IReturn(EList(List(ERef(RefId(Id("""__x0__""")))))).setId(13125))).setId(13130))
  val instToStepMap: Map[Int, Int] = Map(13124 -> 0, 13125 -> 0, 13126 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13126, 13125, 13124))
  /* Beautified form:
  "BindingIdentifier0BoundNames0" (this, Identifier) => {
    access __x0__ = (Identifier "StringValue")
    return (new [__x0__])
  }
  */
}
