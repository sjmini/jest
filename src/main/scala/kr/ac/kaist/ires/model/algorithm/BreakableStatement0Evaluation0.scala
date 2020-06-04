package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakableStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement0Evaluation0""", List(Id("""this"""), Id("""IterationStatement""")), None, ISeq(List(ILet(Id("""newLabelSet"""), EList(List())).setId(26070), IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""LabelledEvaluation""")).setId(26072), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""newLabelSet"""))))).setId(26073), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(26074), IReturn(ERef(RefId(Id("""__x2__""")))).setId(26075))).setId(-1))
  /* Beautified form:
  "BreakableStatement0Evaluation0" (this, IterationStatement) => {
    let newLabelSet = (new [])
    access __x0__ = (this "LabelledEvaluation")
    app __x1__ = (__x0__ newLabelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
