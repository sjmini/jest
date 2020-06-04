package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewTarget0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""NewTarget0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetNewTarget"""))), List()).setId(18642), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(18643), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18644))).setId(-1))
  /* Beautified form:
  "NewTarget0Evaluation0" (this) => {
    app __x0__ = (GetNewTarget )
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
