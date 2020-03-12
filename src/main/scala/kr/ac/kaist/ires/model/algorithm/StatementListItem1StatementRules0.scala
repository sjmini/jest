package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1StatementRules0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44775), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44776))).setId(44781))
  val instToStepMap: Map[Int, Int] = Map(44775 -> 0, 44776 -> 0, 44777 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44775, 44777, 44776))
  /* Beautified form:
  "StatementListItem1StatementRules0" (this, Declaration) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
