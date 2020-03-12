package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IdentifierReference0AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference0AssignmentTargetType0""", List(Id("""this"""), Id("""Identifier""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(13144), IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(13145))).setId(13150))
  val instToStepMap: Map[Int, Int] = Map(13144 -> 0, 13145 -> 1, 13146 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13144), 1 -> HashSet(13145, 13146))
  /* Beautified form:
  "IdentifierReference0AssignmentTargetType0" (this, Identifier) => {
    !!! "Etc"
    return CONST_simple
  }
  */
}
