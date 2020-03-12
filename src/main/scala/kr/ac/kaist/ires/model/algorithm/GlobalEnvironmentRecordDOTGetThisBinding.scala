package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val func: Func = Func("""GlobalEnvironmentRecord.GetThisBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48523), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""GlobalThisValue"""))))).setId(48525), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48526))).setId(48532))
  val instToStepMap: Map[Int, Int] = HashMap(48525 -> 1, 48526 -> 1, 48523 -> 0, 48527 -> 1, 48524 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(48523, 48524), 1 -> HashSet(48525, 48526, 48527))
  /* Beautified form:
  "GlobalEnvironmentRecord.GetThisBinding" (this) => {
    let envRec = this
    app __x0__ = (WrapCompletion envRec["GlobalThisValue"])
    return __x0__
  }
  */
}
