package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetNewTarget {
  val length: Int = 0
  val func: Func = Func("""GetNewTarget""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(8572), ILet(Id("""envRec"""), ERef(RefId(Id("""__x0__""")))).setId(8573), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""NewTarget"""))))).setId(8576), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8577))).setId(-1))
  /* Beautified form:
  "GetNewTarget" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    app __x1__ = (WrapCompletion envRec["NewTarget"])
    return __x1__
  }
  */
}
