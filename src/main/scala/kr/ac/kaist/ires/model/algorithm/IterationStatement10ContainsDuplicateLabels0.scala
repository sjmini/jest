package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement10ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "IterationStatement10ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement10ContainsDuplicateLabels0" (this, ForDeclaration, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }"""), this)
}
