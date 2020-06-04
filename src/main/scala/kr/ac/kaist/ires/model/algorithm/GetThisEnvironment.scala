package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetThisEnvironment {
  val length: Int = 0
  val func: Func = Func("""GetThisEnvironment""", List(), None, ISeq(List(ILet(Id("""lex"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(8489), IWhile(EBool(true), ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""EnvironmentRecord""")))).setId(8491), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))).setId(8493), ILet(Id("""exists"""), ERef(RefId(Id("""__x0__""")))).setId(8494), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""envRec"""))))).setId(8496), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8497))).setId(8498), ISeq(List()).setId(8499)).setId(8500), ILet(Id("""outer"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""Outer""")))).setId(8502), IAssign(RefId(Id("""lex""")), ERef(RefId(Id("""outer""")))).setId(8504))).setId(8506)).setId(8507))).setId(-1))
  /* Beautified form:
  "GetThisEnvironment" () => {
    let lex = GLOBAL_context["LexicalEnvironment"]
    while true {
      let envRec = lex["EnvironmentRecord"]
      app __x0__ = (envRec["HasThisBinding"] envRec)
      let exists = __x0__
      if (= exists true) {
        app __x1__ = (WrapCompletion envRec)
        return __x1__
      } else {}
      let outer = lex["Outer"]
      lex = outer
    }
  }
  */
}
