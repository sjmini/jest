package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")).setId(26594), IAccess(Id("""__x0__"""), ERef(RefId(Id("""HoistableDeclaration"""))), EStr("""BoundNames""")).setId(26590), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26591))).setId(26604), ISeq(List()).setId(26605)).setId(26597), IReturn(EList(List())).setId(26598))).setId(26608))
  val instToStepMap: Map[Int, Int] = HashMap(26598 -> 3, 26599 -> 3, 26592 -> 2, 26591 -> 2, 26593 -> 2, 26597 -> 2, 26590 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(26592, 26591, 26593, 26597, 26590), 3 -> HashSet(26598, 26599))
  /* Beautified form:
  "StatementListItem1TopLevelVarDeclaredNames0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      access __x0__ = (HoistableDeclaration "BoundNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
