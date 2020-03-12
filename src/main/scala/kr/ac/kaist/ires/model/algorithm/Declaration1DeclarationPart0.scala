package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Declaration1DeclarationPart0 {
  val length: Int = 0
  val func: Func = Func("""Declaration1DeclarationPart0""", List(Id("""this"""), Id("""ClassDeclaration""")), None, IReturn(ERef(RefId(Id("""ClassDeclaration""")))).setId(25819))
  val instToStepMap: Map[Int, Int] = Map(25819 -> 0, 25820 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25820, 25819))
  /* Beautified form:
  "Declaration1DeclarationPart0" (this, ClassDeclaration) => return ClassDeclaration
  */
}
