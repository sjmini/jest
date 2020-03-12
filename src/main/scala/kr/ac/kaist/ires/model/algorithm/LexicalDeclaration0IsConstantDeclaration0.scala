package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LexicalDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""LexicalDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""BindingList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LetOrConst"""))), EStr("""IsConstantDeclaration""")).setId(27177), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27178))).setId(27183))
  val instToStepMap: Map[Int, Int] = Map(27177 -> 0, 27178 -> 0, 27179 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27179, 27178, 27177))
  /* Beautified form:
  "LexicalDeclaration0IsConstantDeclaration0" (this, LetOrConst, BindingList) => {
    access __x0__ = (LetOrConst "IsConstantDeclaration")
    return __x0__
  }
  */
}
