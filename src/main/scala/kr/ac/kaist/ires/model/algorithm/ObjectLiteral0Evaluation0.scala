package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectLiteral0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectLiteral0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(14601), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(14602), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14603))).setId(-1))
  /* Beautified form:
  "ObjectLiteral0Evaluation0" (this) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
