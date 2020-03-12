package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SwitchStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0StatementRules0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""HasCallInTailPosition""")).setId(45111), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45112), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45113), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45114))).setId(45121))
  val instToStepMap: Map[Int, Int] = HashMap(45114 -> 0, 45115 -> 0, 45112 -> 0, 45111 -> 0, 45113 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45114, 45115, 45112, 45111, 45113))
  /* Beautified form:
  "SwitchStatement0StatementRules0" (this, Expression, CaseBlock) => {
    access __x0__ = (CaseBlock "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
