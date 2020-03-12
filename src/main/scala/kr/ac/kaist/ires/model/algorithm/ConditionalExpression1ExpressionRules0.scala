package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConditionalExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ConditionalExpression1ExpressionRules0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""AssignmentExpression0"""), Id("""AssignmentExpression1""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression0"""))), EStr("""HasCallInTailPosition""")).setId(46000), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46001), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(46002), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46004), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46005))).setId(46021), ISeq(List()).setId(46022)).setId(46008), IAccess(Id("""__x3__"""), ERef(RefId(Id("""AssignmentExpression1"""))), EStr("""HasCallInTailPosition""")).setId(46010), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(46011), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(46012), IReturn(ERef(RefId(Id("""__x5__""")))).setId(46013))).setId(46028))
  val instToStepMap: Map[Int, Int] = HashMap(46014 -> 3, 46008 -> 2, 46003 -> 0, 46011 -> 3, 46002 -> 0, 46009 -> 2, 46006 -> 1, 46000 -> 0, 46005 -> 1, 46001 -> 0, 46004 -> 1, 46010 -> 3, 46013 -> 3, 46012 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46003, 46002, 46000, 46001), 1 -> HashSet(46004, 46006, 46005), 2 -> HashSet(46008, 46009), 3 -> HashSet(46014, 46010, 46011, 46013, 46012))
  /* Beautified form:
  "ConditionalExpression1ExpressionRules0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1) => {
    access __x0__ = (AssignmentExpression0 "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (AssignmentExpression1 "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
