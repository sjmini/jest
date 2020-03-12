package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0LexicallyDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0LexicallyDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyDeclaredNames""")).setId(34935), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34936))).setId(34946), ISeq(List()).setId(34947)).setId(34939), IReturn(EList(List())).setId(34941))).setId(34950))
  val instToStepMap: Map[Int, Int] = HashMap(34939 -> 1, 34942 -> 2, 34936 -> 0, 34937 -> 0, 34941 -> 2, 34935 -> 0, 34940 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34936, 34937, 34935), 1 -> HashSet(34939, 34940), 2 -> HashSet(34942, 34941))
  /* Beautified form:
  "DefaultClause0LexicallyDeclaredNames1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
