package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0ContainsUndefinedContinueTarget1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0ContainsUndefinedContinueTarget1""", List(Id("""this"""), Id("""StatementList"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34781), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34782), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34783))).setId(34794), ISeq(List()).setId(34795)).setId(34786), IReturn(EBool(false)).setId(34788))).setId(34798))
  val instToStepMap: Map[Int, Int] = HashMap(34784 -> 0, 34787 -> 1, 34781 -> 0, 34788 -> 2, 34782 -> 0, 34783 -> 0, 34789 -> 2, 34786 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34784, 34781, 34782, 34783), 1 -> HashSet(34787, 34786), 2 -> HashSet(34789, 34788))
  /* Beautified form:
  "DefaultClause0ContainsUndefinedContinueTarget1" (this, StatementList, iterationSet, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      return __x1__
    } else {}
    return false
  }
  */
}
