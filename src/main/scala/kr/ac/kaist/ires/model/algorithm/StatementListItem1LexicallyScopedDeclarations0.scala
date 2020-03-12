package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Declaration"""))), EStr("""DeclarationPart""")).setId(26389), IReturn(EList(List(ERef(RefId(Id("""__x0__""")))))).setId(26390))).setId(26395))
  val instToStepMap: Map[Int, Int] = Map(26389 -> 0, 26390 -> 0, 26391 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26389, 26391, 26390))
  /* Beautified form:
  "StatementListItem1LexicallyScopedDeclarations0" (this, Declaration) => {
    access __x0__ = (Declaration "DeclarationPart")
    return (new [__x0__])
  }
  */
}
