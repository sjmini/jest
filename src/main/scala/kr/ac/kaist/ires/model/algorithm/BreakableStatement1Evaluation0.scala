package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakableStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement1Evaluation0""", List(Id("""this"""), Id("""SwitchStatement""")), None, ISeq(List(ILet(Id("""newLabelSet"""), EList(List())).setId(26090), IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""LabelledEvaluation""")).setId(26092), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""newLabelSet"""))))).setId(26093), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(26094), IReturn(ERef(RefId(Id("""__x2__""")))).setId(26095))).setId(26103))
  val instToStepMap: Map[Int, Int] = HashMap(26093 -> 1, 26092 -> 1, 26096 -> 1, 26091 -> 0, 26095 -> 1, 26090 -> 0, 26094 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26091, 26090), 1 -> HashSet(26093, 26092, 26096, 26095, 26094))
  /* Beautified form:
  "BreakableStatement1Evaluation0" (this, SwitchStatement) => {
    let newLabelSet = (new [])
    access __x0__ = (this "LabelledEvaluation")
    app __x1__ = (__x0__ newLabelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
