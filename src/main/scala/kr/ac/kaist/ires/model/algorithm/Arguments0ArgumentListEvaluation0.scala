package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Arguments0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Arguments0ArgumentListEvaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List()))).setId(17986), IReturn(ERef(RefId(Id("""__x0__""")))).setId(17987))).setId(-1))
  /* Beautified form:
  "Arguments0ArgumentListEvaluation0" (this) => {
    app __x0__ = (WrapCompletion (new []))
    return __x0__
  }
  */
}
