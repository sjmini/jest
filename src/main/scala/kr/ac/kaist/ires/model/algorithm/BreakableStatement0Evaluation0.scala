package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakableStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement0Evaluation0""", List(Id("""this"""), Id("""IterationStatement""")), None, ISeq(List(ILet(Id("""newLabelSet"""), EList(List())).setId(26070), IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""LabelledEvaluation""")).setId(26072), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""newLabelSet"""))))).setId(26073), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(26074), IReturn(ERef(RefId(Id("""__x2__""")))).setId(26075))).setId(26083))
  val instToStepMap: Map[Int, Int] = HashMap(26076 -> 1, 26072 -> 1, 26073 -> 1, 26075 -> 1, 26070 -> 0, 26071 -> 0, 26074 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26070, 26071), 1 -> HashSet(26076, 26072, 26073, 26075, 26074))
  /* Beautified form:
  "BreakableStatement0Evaluation0" (this, IterationStatement) => {
    let newLabelSet = (new [])
    access __x0__ = (this "LabelledEvaluation")
    app __x1__ = (__x0__ newLabelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
