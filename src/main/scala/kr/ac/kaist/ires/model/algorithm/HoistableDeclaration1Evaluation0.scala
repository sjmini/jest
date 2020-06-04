package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HoistableDeclaration1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration1Evaluation0""", List(Id("""this"""), Id("""GeneratorDeclaration""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(26017), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(26018), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26019))).setId(-1))
  /* Beautified form:
  "HoistableDeclaration1Evaluation0" (this, GeneratorDeclaration) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
