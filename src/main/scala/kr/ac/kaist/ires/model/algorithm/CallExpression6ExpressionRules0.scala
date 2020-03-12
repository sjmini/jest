package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression6ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""TemplateLiteral""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46126), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46127))).setId(46138), ISeq(List()).setId(46139)).setId(46130), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(46132), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46133))).setId(46143))
  val instToStepMap: Map[Int, Int] = HashMap(46134 -> 2, 46133 -> 2, 46128 -> 0, 46132 -> 2, 46127 -> 0, 46130 -> 1, 46131 -> 1, 46126 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46127, 46128, 46126), 1 -> HashSet(46130, 46131), 2 -> HashSet(46134, 46133, 46132))
  /* Beautified form:
  "CallExpression6ExpressionRules0" (this, CallExpression, TemplateLiteral) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
