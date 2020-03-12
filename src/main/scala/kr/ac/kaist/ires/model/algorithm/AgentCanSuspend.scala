package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AgentCanSuspend {
  val length: Int = 0
  val func: Func = Func("""AgentCanSuspend""", List(), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(8851), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""AR""")), EStr("""CanBlock"""))))).setId(8852), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8853))).setId(8859))
  val instToStepMap: Map[Int, Int] = Map(8851 -> 0, 8852 -> 1, 8853 -> 1, 8854 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(8851), 1 -> HashSet(8852, 8853, 8854))
  /* Beautified form:
  "AgentCanSuspend" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["CanBlock"])
    return __x0__
  }
  */
}
