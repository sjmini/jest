package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression1ExpressionRules0""", List(Id("""this"""), Id("""SuperCall""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45758), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45759))).setId(45764))
  val instToStepMap: Map[Int, Int] = Map(45760 -> 0, 45758 -> 0, 45759 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45758, 45760, 45759))
  /* Beautified form:
  "CallExpression1ExpressionRules0" (this, SuperCall) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
