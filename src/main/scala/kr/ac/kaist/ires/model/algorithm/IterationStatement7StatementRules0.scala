package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement7StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7StatementRules0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(45047), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45048), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45049), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45050))).setId(45057))
  val instToStepMap: Map[Int, Int] = HashMap(45048 -> 0, 45051 -> 0, 45049 -> 0, 45047 -> 0, 45050 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45048, 45051, 45049, 45047, 45050))
  /* Beautified form:
  "IterationStatement7StatementRules0" (this, ForDeclaration, Expression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
