package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0StatementRules0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""HasCallInTailPosition""")).setId(45079), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45080), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45081), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45082))).setId(45089))
  val instToStepMap: Map[Int, Int] = HashMap(45082 -> 0, 45083 -> 0, 45080 -> 0, 45079 -> 0, 45081 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45082, 45083, 45080, 45079, 45081))
  /* Beautified form:
  "LabelledStatement0StatementRules0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
