package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(26290), IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledStatement"""))), EStr("""LexicallyDeclaredNames""")).setId(26287), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26288))).setId(26300), ISeq(List()).setId(26301)).setId(26293), IReturn(EList(List())).setId(26294))).setId(26304))
  val instToStepMap: Map[Int, Int] = HashMap(26294 -> 1, 26287 -> 0, 26293 -> 0, 26288 -> 0, 26289 -> 0, 26295 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26287, 26293, 26288, 26289), 1 -> HashSet(26294, 26295))
  /* Beautified form:
  "StatementListItem0LexicallyDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (LabelledStatement "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
