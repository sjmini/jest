package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetNewTarget {
  val length: Int = 0
  val func: Func = Func("""GetNewTarget""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(8572), ILet(Id("""envRec"""), ERef(RefId(Id("""__x0__""")))).setId(8573), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""NewTarget"""))))).setId(8576), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8577))).setId(8584))
  val instToStepMap: Map[Int, Int] = HashMap(8578 -> 2, 8575 -> 1, 8577 -> 2, 8572 -> 0, 8576 -> 2, 8573 -> 0, 8574 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(8572, 8573, 8574), 1 -> HashSet(8575), 2 -> HashSet(8578, 8577, 8576))
  /* Beautified form:
  "GetNewTarget" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    app __x1__ = (WrapCompletion envRec["NewTarget"])
    return __x1__
  }
  */
}
