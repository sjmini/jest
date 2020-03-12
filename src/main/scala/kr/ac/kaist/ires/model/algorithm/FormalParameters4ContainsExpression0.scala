package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters4ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4ContainsExpression0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ContainsExpression""")).setId(37820), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EBool(true)).setId(37821), ISeq(List()).setId(37832)).setId(37824), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FunctionRestParameter"""))), EStr("""ContainsExpression""")).setId(37826), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37827))).setId(37836))
  val instToStepMap: Map[Int, Int] = HashMap(37825 -> 1, 37822 -> 0, 37828 -> 2, 37820 -> 1, 37824 -> 1, 37826 -> 2, 37821 -> 0, 37827 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37822, 37821), 1 -> HashSet(37825, 37820, 37824), 2 -> HashSet(37828, 37826, 37827))
  /* Beautified form:
  "FormalParameters4ContainsExpression0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FunctionRestParameter "ContainsExpression")
    return __x1__
  }
  */
}
