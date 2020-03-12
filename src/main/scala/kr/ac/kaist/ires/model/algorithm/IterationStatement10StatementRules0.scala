package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement10StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement10StatementRules0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44905), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44906))).setId(44911))
  val instToStepMap: Map[Int, Int] = Map(44905 -> 0, 44906 -> 0, 44907 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44907, 44905, 44906))
  /* Beautified form:
  "IterationStatement10StatementRules0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
