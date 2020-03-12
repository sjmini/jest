package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object WithStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34149), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34150), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34151))).setId(34157))
  val instToStepMap: Map[Int, Int] = Map(34149 -> 0, 34150 -> 0, 34151 -> 0, 34152 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34149, 34152, 34151, 34150))
  /* Beautified form:
  "WithStatement0ContainsUndefinedContinueTarget0" (this, Expression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
