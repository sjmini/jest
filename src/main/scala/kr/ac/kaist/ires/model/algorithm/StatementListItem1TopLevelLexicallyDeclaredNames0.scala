package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1TopLevelLexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelLexicallyDeclaredNames0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")).setId(26447), IReturn(EList(List())).setId(26444))).setId(26457), ISeq(List()).setId(26458)).setId(26450), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Declaration"""))), EStr("""BoundNames""")).setId(26451), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26452))).setId(26462))
  val instToStepMap: Map[Int, Int] = HashMap(26451 -> 3, 26453 -> 3, 26446 -> 2, 26445 -> 2, 26444 -> 2, 26450 -> 2, 26452 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(26446, 26445, 26444, 26450), 3 -> HashSet(26451, 26453, 26452))
  /* Beautified form:
  "StatementListItem1TopLevelLexicallyDeclaredNames0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      return (new [])
    } else {}
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }
  */
}
