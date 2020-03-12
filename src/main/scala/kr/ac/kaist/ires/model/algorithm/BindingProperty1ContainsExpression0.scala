package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingProperty1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1ContainsExpression0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""IsComputedPropertyKey""")).setId(28101), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))).setId(28102), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)).setId(28104), ISeq(List()).setId(28116)).setId(28107), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""ContainsExpression""")).setId(28109), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28110))).setId(28120))
  val instToStepMap: Map[Int, Int] = HashMap(28101 -> 0, 28109 -> 3, 28102 -> 0, 28105 -> 1, 28107 -> 2, 28103 -> 0, 28104 -> 1, 28110 -> 3, 28108 -> 2, 28111 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28101, 28102, 28103), 1 -> HashSet(28105, 28104), 2 -> HashSet(28107, 28108), 3 -> HashSet(28109, 28111, 28110))
  /* Beautified form:
  "BindingProperty1ContainsExpression0" (this, PropertyName, BindingElement) => {
    access __x0__ = (PropertyName "IsComputedPropertyKey")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElement "ContainsExpression")
    return __x1__
  }
  */
}
