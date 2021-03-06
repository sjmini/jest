package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BreakableStatement1Evaluation0 extends Algorithm {
  val name: String = "BreakableStatement1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BreakableStatement1Evaluation0" (this, SwitchStatement) => {
    let newLabelSet = (new [])
    access __x0__ = (this "LabelledEvaluation")
    app __x1__ = (__x0__ newLabelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
