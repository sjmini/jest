package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseFloat {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (ToString string)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let inputString = __x1__
    !!! "Etc"
    !!! "If neither id:{trimmedString} nor any prefix of id:{trimmedString} satisfies the syntax of a nt:{StrDecimalLiteral} ( see 7 . 1 . 4 . 1 ) , return value:{NaN} ."
    !!! "Etc"
    access __x2__ = (numberString "MV")
    let mathFloat = __x2__
    if (== mathFloat 0i) {
      !!! "Etc"
      app __x3__ = (WrapCompletion 0i)
      return __x3__
    } else {}
    !!! "Etc"
  }""")
}
