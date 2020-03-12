package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Literal1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Literal1Evaluation0""", List(Id("""this"""), Id("""BooleanLiteral""")), None, ISeq(List(IIf(EBOp(OEq, EGetSyntax(ERef(RefId(Id("""BooleanLiteral""")))), EStr("""false""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(13709), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13710))).setId(13723), ISeq(List()).setId(13724)).setId(13713), IIf(EBOp(OEq, EGetSyntax(ERef(RefId(Id("""BooleanLiteral""")))), EStr("""true""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(13715), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13716))).setId(13728), ISeq(List()).setId(13729)).setId(13718))).setId(13731))
  val instToStepMap: Map[Int, Int] = HashMap(13715 -> 2, 13719 -> 3, 13709 -> 0, 13718 -> 3, 13714 -> 1, 13710 -> 0, 13717 -> 2, 13713 -> 1, 13716 -> 2, 13711 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13709, 13710, 13711), 1 -> HashSet(13714, 13713), 2 -> HashSet(13715, 13717, 13716), 3 -> HashSet(13719, 13718))
  /* Beautified form:
  "Literal1Evaluation0" (this, BooleanLiteral) => {
    if (= (get-syntax BooleanLiteral) "false") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= (get-syntax BooleanLiteral) "true") {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
  }
  */
}
