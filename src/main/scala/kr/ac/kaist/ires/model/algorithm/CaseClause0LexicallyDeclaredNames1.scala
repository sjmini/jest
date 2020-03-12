package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0LexicallyDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0LexicallyDeclaredNames1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyDeclaredNames""")).setId(34912), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34913))).setId(34923), ISeq(List()).setId(34924)).setId(34916), IReturn(EList(List())).setId(34918))).setId(34927))
  val instToStepMap: Map[Int, Int] = HashMap(34916 -> 1, 34913 -> 0, 34919 -> 2, 34914 -> 0, 34917 -> 1, 34918 -> 2, 34912 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34913, 34914, 34912), 1 -> HashSet(34916, 34917), 2 -> HashSet(34919, 34918))
  /* Beautified form:
  "CaseClause0LexicallyDeclaredNames1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
