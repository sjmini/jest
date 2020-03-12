package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1LexicallyDeclaredNames0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Declaration"""))), EStr("""BoundNames""")).setId(26313), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26314))).setId(26319))
  val instToStepMap: Map[Int, Int] = Map(26313 -> 0, 26314 -> 0, 26315 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26314, 26315, 26313))
  /* Beautified form:
  "StatementListItem1LexicallyDeclaredNames0" (this, Declaration) => {
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }
  */
}
