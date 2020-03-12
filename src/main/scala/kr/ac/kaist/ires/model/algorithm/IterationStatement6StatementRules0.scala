package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement6StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6StatementRules0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(45031), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45032), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45033), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45034))).setId(45041))
  val instToStepMap: Map[Int, Int] = HashMap(45031 -> 0, 45034 -> 0, 45035 -> 0, 45032 -> 0, 45033 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45031, 45034, 45035, 45032, 45033))
  /* Beautified form:
  "IterationStatement6StatementRules0" (this, ForBinding, Expression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
