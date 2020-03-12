package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetThisEnvironment {
  val length: Int = 0
  val func: Func = Func("""GetThisEnvironment""", List(), None, ISeq(List(ILet(Id("""lex"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(8489), IWhile(EBool(true), ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""EnvironmentRecord""")))).setId(8491), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))).setId(8493), ILet(Id("""exists"""), ERef(RefId(Id("""__x0__""")))).setId(8494), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""envRec"""))))).setId(8496), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8497))).setId(8515), ISeq(List()).setId(8516)).setId(8500), ILet(Id("""outer"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""Outer""")))).setId(8502), IAssign(RefId(Id("""lex""")), ERef(RefId(Id("""outer""")))).setId(8504))).setId(8520)).setId(8507))).setId(8522))
  val instToStepMap: Map[Int, Int] = HashMap(8507 -> 9, 8490 -> 0, 8504 -> 9, 8491 -> 9, 8503 -> 9, 8499 -> 9, 8495 -> 9, 8502 -> 9, 8505 -> 9, 8489 -> 0, 8493 -> 9, 8500 -> 9, 8494 -> 9, 8492 -> 9, 8497 -> 5, 8498 -> 5, 8496 -> 5, 8506 -> 9, 8501 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8490, 8489), 5 -> HashSet(8497, 8498, 8496), 6 -> HashSet(8500, 8501), 9 -> HashSet(8507, 8504, 8491, 8503, 8499, 8495, 8492, 8502, 8505, 8493, 8500, 8494, 8506, 8501), 7 -> HashSet(8503, 8502), 3 -> HashSet(8491, 8492), 8 -> HashSet(8499), 4 -> HashSet(8494, 8495, 8493))
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
