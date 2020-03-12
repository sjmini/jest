package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1TopLevelLexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelLexicallyScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")).setId(26524), IReturn(EList(List())).setId(26521))).setId(26533), ISeq(List()).setId(26534)).setId(26527), IReturn(EList(List(ERef(RefId(Id("""Declaration""")))))).setId(26528))).setId(26537))
  val instToStepMap: Map[Int, Int] = HashMap(26521 -> 2, 26528 -> 3, 26527 -> 2, 26523 -> 2, 26522 -> 2, 26529 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(26521, 26527, 26523, 26522), 3 -> HashSet(26528, 26529))
  /* Beautified form:
  "StatementListItem1TopLevelLexicallyScopedDeclarations0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      return (new [])
    } else {}
    return (new [Declaration])
  }
  */
}
