package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SwitchStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""ContainsDuplicateLabels""")).setId(34276), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34277), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34278))).setId(34284))
  val instToStepMap: Map[Int, Int] = Map(34276 -> 0, 34277 -> 0, 34278 -> 0, 34279 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34277, 34276, 34279, 34278))
  /* Beautified form:
  "SwitchStatement0ContainsDuplicateLabels0" (this, Expression, CaseBlock, labelSet) => {
    access __x0__ = (CaseBlock "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
