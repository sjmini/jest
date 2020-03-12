package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(26366), IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledStatement"""))), EStr("""LexicallyScopedDeclarations""")).setId(26363), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26364))).setId(26376), ISeq(List()).setId(26377)).setId(26369), IReturn(EList(List())).setId(26370))).setId(26380))
  val instToStepMap: Map[Int, Int] = HashMap(26365 -> 0, 26371 -> 1, 26370 -> 1, 26363 -> 0, 26369 -> 0, 26364 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26365, 26363, 26369, 26364), 1 -> HashSet(26371, 26370))
  /* Beautified form:
  "StatementListItem0LexicallyScopedDeclarations0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (LabelledStatement "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
