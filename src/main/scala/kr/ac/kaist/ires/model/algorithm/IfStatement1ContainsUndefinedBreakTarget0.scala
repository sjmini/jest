package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement0"""), Id("""Statement1"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement0"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(30232), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30233), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(30234), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(30236), ISeq(List()).setId(30250)).setId(30239), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Statement1"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(30241), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30242), IReturn(ERef(RefId(Id("""__x3__""")))).setId(30243))).setId(30255))
  val instToStepMap: Map[Int, Int] = HashMap(30234 -> 0, 30236 -> 1, 30241 -> 3, 30240 -> 2, 30232 -> 0, 30235 -> 0, 30239 -> 2, 30242 -> 3, 30233 -> 0, 30243 -> 3, 30244 -> 3, 30237 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30234, 30232, 30233, 30235), 1 -> HashSet(30236, 30237), 2 -> HashSet(30240, 30239), 3 -> HashSet(30241, 30242, 30243, 30244))
  /* Beautified form:
  "IfStatement1ContainsUndefinedBreakTarget0" (this, Expression, Statement0, Statement1, labelSet) => {
    access __x0__ = (Statement0 "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Statement1 "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
