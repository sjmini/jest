package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement0"""), Id("""Statement1"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement0"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(30279), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(30280), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(30281), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(30283), ISeq(List()).setId(30297)).setId(30286), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Statement1"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(30288), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(30289), IReturn(ERef(RefId(Id("""__x3__""")))).setId(30290))).setId(30302))
  val instToStepMap: Map[Int, Int] = HashMap(30283 -> 1, 30286 -> 2, 30289 -> 3, 30280 -> 0, 30287 -> 2, 30279 -> 0, 30281 -> 0, 30288 -> 3, 30284 -> 1, 30291 -> 3, 30282 -> 0, 30290 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30280, 30279, 30281, 30282), 1 -> HashSet(30283, 30284), 2 -> HashSet(30286, 30287), 3 -> HashSet(30289, 30288, 30291, 30290))
  /* Beautified form:
  "IfStatement1ContainsUndefinedContinueTarget0" (this, Expression, Statement0, Statement1, iterationSet, labelSet) => {
    access __x0__ = (Statement0 "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Statement1 "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }
  */
}
