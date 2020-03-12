package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameterList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1ContainsExpression0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ContainsExpression""")).setId(37844), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EBool(true)).setId(37845), ISeq(List()).setId(37856)).setId(37848), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""ContainsExpression""")).setId(37850), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37851))).setId(37860))
  val instToStepMap: Map[Int, Int] = HashMap(37850 -> 2, 37845 -> 0, 37846 -> 0, 37851 -> 2, 37852 -> 2, 37844 -> 1, 37849 -> 1, 37848 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37845, 37846), 1 -> HashSet(37844, 37849, 37848), 2 -> HashSet(37850, 37851, 37852))
  /* Beautified form:
  "FormalParameterList1ContainsExpression0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FormalParameter "ContainsExpression")
    return __x1__
  }
  */
}
