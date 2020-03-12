package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Literal3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Literal3Evaluation0""", List(Id("""this"""), Id("""StringLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StringLiteral"""))), EStr("""StringValue""")).setId(13756), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(13757), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13758))).setId(13765))
  val instToStepMap: Map[Int, Int] = Map(13756 -> 0, 13757 -> 0, 13758 -> 0, 13759 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13757, 13758, 13759, 13756))
  /* Beautified form:
  "Literal3Evaluation0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "StringValue")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
