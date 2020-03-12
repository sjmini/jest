package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0Evaluation1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""Evaluation""")).setId(36129), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(36130), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36131))).setId(36137))
  val instToStepMap: Map[Int, Int] = Map(36129 -> 0, 36130 -> 0, 36131 -> 0, 36132 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36129, 36131, 36130, 36132))
  /* Beautified form:
  "DefaultClause0Evaluation1" (this, StatementList) => {
    access __x0__ = (StatementList "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
