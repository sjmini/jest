package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Declaration2DeclarationPart0 {
  val length: Int = 0
  val func: Func = Func("""Declaration2DeclarationPart0""", List(Id("""this"""), Id("""LexicalDeclaration""")), None, IReturn(ERef(RefId(Id("""LexicalDeclaration""")))).setId(25824))
  val instToStepMap: Map[Int, Int] = Map(25824 -> 0, 25825 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25824, 25825))
  /* Beautified form:
  "Declaration2DeclarationPart0" (this, LexicalDeclaration) => return LexicalDeclaration
  */
}
