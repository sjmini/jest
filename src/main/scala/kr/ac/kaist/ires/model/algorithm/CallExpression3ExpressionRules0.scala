package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression3ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""Arguments""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46100), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46101))).setId(46112), ISeq(List()).setId(46113)).setId(46104), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(46106), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46107))).setId(46117))
  val instToStepMap: Map[Int, Int] = HashMap(46106 -> 2, 46101 -> 0, 46100 -> 0, 46107 -> 2, 46105 -> 1, 46104 -> 1, 46102 -> 0, 46108 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46102, 46101, 46100), 1 -> HashSet(46105, 46104), 2 -> HashSet(46108, 46106, 46107))
  /* Beautified form:
  "CallExpression3ExpressionRules0" (this, CallExpression, Arguments) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
