package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AgentSignifier {
  val length: Int = 0
  val func: Func = Func("""AgentSignifier""", List(), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(8838), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""AR""")), EStr("""Signifier"""))))).setId(8839), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8840))).setId(8846))
  val instToStepMap: Map[Int, Int] = Map(8838 -> 0, 8839 -> 1, 8840 -> 1, 8841 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(8838), 1 -> HashSet(8839, 8841, 8840))
  /* Beautified form:
  "AgentSignifier" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["Signifier"])
    return __x0__
  }
  */
}
