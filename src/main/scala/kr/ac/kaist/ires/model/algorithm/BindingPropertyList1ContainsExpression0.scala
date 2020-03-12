package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingPropertyList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingPropertyList1ContainsExpression0""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""BindingProperty""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""ContainsExpression""")).setId(28035), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))).setId(28036), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)).setId(28038), ISeq(List()).setId(28050)).setId(28041), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingProperty"""))), EStr("""ContainsExpression""")).setId(28043), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28044))).setId(28054))
  val instToStepMap: Map[Int, Int] = HashMap(28037 -> 0, 28044 -> 3, 28035 -> 0, 28039 -> 1, 28043 -> 3, 28036 -> 0, 28045 -> 3, 28042 -> 2, 28041 -> 2, 28038 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28037, 28035, 28036), 1 -> HashSet(28038, 28039), 2 -> HashSet(28042, 28041), 3 -> HashSet(28045, 28044, 28043))
  /* Beautified form:
  "BindingPropertyList1ContainsExpression0" (this, BindingPropertyList, BindingProperty) => {
    access __x0__ = (BindingPropertyList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingProperty "ContainsExpression")
    return __x1__
  }
  */
}
