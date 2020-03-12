package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ReturnStatement1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""ReturnStatement1StatementRules0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""HasCallInTailPosition""")).setId(45095), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45096), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45097), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45098))).setId(45105))
  val instToStepMap: Map[Int, Int] = HashMap(45097 -> 0, 45098 -> 0, 45099 -> 0, 45096 -> 0, 45095 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45097, 45098, 45099, 45096, 45095))
  /* Beautified form:
  "ReturnStatement1StatementRules0" (this, Expression) => {
    access __x0__ = (Expression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
