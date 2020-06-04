package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0Evaluation0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(ILet(Id("""newLabelSet"""), EList(List())).setId(36598), IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""LabelledEvaluation""")).setId(36600), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""newLabelSet"""))))).setId(36601), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(36602), IReturn(ERef(RefId(Id("""__x2__""")))).setId(36603))).setId(-1))
  /* Beautified form:
  "LabelledStatement0Evaluation0" (this, LabelIdentifier, LabelledItem) => {
    let newLabelSet = (new [])
    access __x0__ = (this "LabelledEvaluation")
    app __x1__ = (__x0__ newLabelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
