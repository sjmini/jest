package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElementList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingElementList1ContainsExpression0""", List(Id("""this"""), Id("""BindingElementList"""), Id("""BindingElisionElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""ContainsExpression""")).setId(28063), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))).setId(28064), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)).setId(28066), ISeq(List()).setId(28078)).setId(28069), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElisionElement"""))), EStr("""ContainsExpression""")).setId(28071), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28072))).setId(28082))
  val instToStepMap: Map[Int, Int] = HashMap(28064 -> 0, 28069 -> 2, 28065 -> 0, 28070 -> 2, 28066 -> 1, 28067 -> 1, 28071 -> 3, 28072 -> 3, 28063 -> 0, 28073 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28064, 28065, 28063), 1 -> HashSet(28066, 28067), 2 -> HashSet(28069, 28070), 3 -> HashSet(28073, 28071, 28072))
  /* Beautified form:
  "BindingElementList1ContainsExpression0" (this, BindingElementList, BindingElisionElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElisionElement "ContainsExpression")
    return __x1__
  }
  */
}
